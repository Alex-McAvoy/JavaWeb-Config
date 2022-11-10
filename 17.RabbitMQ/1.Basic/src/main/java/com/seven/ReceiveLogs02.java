package com.seven;

import com.rabbitmq.client.BuiltinExchangeType;
import com.rabbitmq.client.CancelCallback;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.DeliverCallback;
import com.utils.RabbitMQUtils;


/**
 * 交换机，消费者02，用于扇出模式
 * @author Alex McAvoy
 * @date 2022/10/8 22:08
 * @version 1.0
 **/
public class ReceiveLogs02 {

    public static final String FANOUT_EXCHANGE_NAME = "fanout_logs"; //扇出交换机名称

    public static void main(String[] args) throws Exception {
        Channel channel = RabbitMQUtils.getChannel();

        /** 交换机：通过 routingKey 来绑定队列，从而让一条消息可被多个消费者使用
         *   1.交换机名
         *   2.交换机类型
         * **/
        channel.exchangeDeclare(FANOUT_EXCHANGE_NAME, BuiltinExchangeType.FANOUT);

        /** 临时队列
         *   - 所有未持久化的队列都是临时队列
         *   - 当消费者与队列断开连接后，临时队列会自动删除
         *   - 可以使用如下方式来自动生成临时队列，队列名是随机生成的
         * **/
        String queueName = channel.queueDeclare().getQueue();

        /** 将队列绑定到交换机上
         *   1.队列名
         *   2.交换机名
         *   3.routingKey，可写为空串，生产者通过 basicPublish 发送消息时，其 routingKey 与该参数对应
         * **/
        channel.queueBind(queueName,FANOUT_EXCHANGE_NAME,"123456");

        System.out.println("ReceiveLogs02 队列等待消息接收");

        DeliverCallback deliverCallback = (consumerTag, delivery) -> {
            String message = new String(delivery.getBody());
            System.out.println("ReceiveLogs02 接收到的消息：" + message);
        };

        channel.basicConsume(queueName, false, deliverCallback, consumerTag->{});

    }
}
