package buttons;

import events.DoorOpenEvent;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import states.MicrowaveContext;

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
 * The door open request is made using an instance of this class
 *
 */
public class DoorOpenButton extends GUIButton implements EventHandler<ActionEvent> {
    /**
     * Create the button with the proper display
     * 
     * @param string
     *            the text to be put
     */
    public DoorOpenButton(String string) {
        super(string);
    }

    @Override
    public void handle(ActionEvent event) {
        MicrowaveContext.instance().handleEvent(DoorOpenEvent.instance());
    }
}