/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modus.edeliveryclient;

import com.modus.edeliveryclient.consumer.SmpParticipantConsumer;
import com.modus.edeliveryclient.models.Authorization;
import com.modus.edeliveryclient.models.ResponseMessage;
import com.modus.edeliveryclient.serialize.Serializer;
import java.util.concurrent.CompletableFuture;
import org.asynchttpclient.AsyncHttpClient;

/**
 *
 * @author Pantelispanka
 */
public class EDeliveryClientImplementation implements EDeliveryClient{
 
    private final Serializer serializer;
    private final AsyncHttpClient httpClient;
    
    private final SmpParticipantConsumer participantConsumer;
    
    
    private String username;
    private String password;
    
    
    public EDeliveryClientImplementation(
            AsyncHttpClient client,
            Serializer serializer,
            SmpParticipantConsumer participantConsumer){
        this.httpClient = client;
        this.serializer = serializer;
        this.participantConsumer = participantConsumer;
    } 
    
    
    @Override
    public CompletableFuture<ResponseMessage> createParticipant(String participantIdentifierScheme, String participantIdentifierValue, Authorization auth){
        return participantConsumer.createParticipant(participantIdentifierScheme, participantIdentifierValue, auth);
    }
    
    @Override
    public CompletableFuture<ResponseMessage> deleteParticipantId(String participantIdentifierScheme, String participantIdentifierValue, Authorization auth){
        return participantConsumer.deleteParticipantId(participantIdentifierScheme, participantIdentifierValue, auth);
    }

    
}
