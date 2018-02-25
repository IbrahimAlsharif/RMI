
import java.rmi.RemoteException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Eng.Ibrahim
 */
public class imp extends java.rmi.server.UnicastRemoteObject implements inter {

    public imp() throws RemoteException {
        super();
    }

    public int getLength(String text) throws java.rmi.RemoteException {

        return text.length();
    }
}
