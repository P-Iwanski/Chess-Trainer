package pl.coderslab.chesstrainer.repository;

import chariot.Client;
import chariot.ClientAuth;


public interface Account {
    String token = "lip_THtEx4mgz31Dr3En3HaC";
    ClientAuth authClient = Client.auth(token);

    Object result = authClient.games();

}
