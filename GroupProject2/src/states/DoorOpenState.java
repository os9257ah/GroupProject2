package states;

import events.DoorCloseEvent;

/**
 * 
 * @author Brahma Dathan and Sarnath Ramnath
 * @Copyright (c) 2010
 
 * Redistribution and use with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - the use is for academic purpose only
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *   - Neither the name of Brahma Dathan or Sarnath Ramnath
 *     may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 * The authors do not make any claims regarding the correctness of the code in this module
 * and are not responsible for any loss or damage resulting from its use.  
 */

/**
 * Represents the door opened state
 *
 */
public class DoorOpenState extends MicrowaveState {
    private static DoorOpenState instance;

    /**
     * Private constructor for the singleton pattern
     */
    private DoorOpenState() {
        instance = this;
    }

    /**
     * For the singleton pattern
     * 
     * @return the object
     */
    public static DoorOpenState instance() {
        if (instance == null) {
            instance = new DoorOpenState();
        }
        return instance;
    }

    @Override
    public void handleEvent(DoorCloseEvent event) {
        MicrowaveContext.instance().changeState(DoorClosedState.instance());
    }

    /**
     * initialize the state
     * 
     */
    @Override
    public void enter() {
        MicrowaveContext.instance().showDoorOpened();
    }

    @Override
    public void leave() {
        MicrowaveContext.instance().showDoorClosed();
    }

}