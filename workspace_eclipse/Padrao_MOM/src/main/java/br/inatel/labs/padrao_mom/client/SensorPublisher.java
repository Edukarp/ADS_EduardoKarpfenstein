package br.inatel.labs.padrao_mom.client;

import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.IMqttClient;

public class SensorPublisher {
	
	public static void main(String[] args) throws Exception{
		
		//Criando o Publisher
		String publisherId = "Publicador_77";
		IMqttClient publisher = new MqttClient(MyConstants.URI_BROKER, publisherId);
		
		//Conectando com o BROKER
		MqttConnectOptions opts  = new MqttConnectOptions();
		opts.setAutomaticReconnect(true);
		opts.setCleanSession(true);
		opts.setConnectionTimeout(10);
		publisher.connect(opts);
		
		//Criando mssg de leitura do sensor
		Sensor sensor = new Sensor();
		
		for (int i = 0; i < 100; i++) {
			double temperatura = sensor.readTemp();
			MqttMessage message = createMessage(temperatura);
			
			//Publicando topic
			publisher.publish(MyConstants.TOPIC_SENSOR, message);
			Thread.sleep(2000);
			
		}

		
		//Desconectar
		publisher.disconnect();
		
		
	}
	
	private static MqttMessage createMessage(double value) {
		byte[] payload = String.format("T: %0.4f", value).getBytes();
		return new MqttMessage(payload);
	}

}
