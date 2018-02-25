/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eng.Ibrahim
 */
public interface inter extends java.rmi.Remote {

    public int getLength(String text) throws java.rmi.RemoteException;
}
