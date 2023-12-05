package br.inatel.labs.padrao_mom.client;

import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.IMqttClient;


public class SensorSubscriber {
	
	public static void main(String[] args) throws Exception{
		//Crinado Subscriber
		String subscriberId = "Subscriber_77";
		MqttClient subscriber = new MqttClient( MyConstants.URI_BROKER, subscriberId );
		
		//Conectando o BROKER
		MqttConnectOptions opts = new MqttConnectOptions();
		opts.setAutomaticReconnect( true );
		opts.setCleanSession( true );
		opts.setConnectionTimeout( 10 );
		subscriber.connect(opts);
		
		//Assinar e esperar por mensagens:
		subscriber.subscribe(MyConstants.TOPIC_SENSOR, (topic, msg) -> {
		System.out.println("Mensagem recebida: [" + msg + "] do tópico: " + topic);
		});

		
	}

}
