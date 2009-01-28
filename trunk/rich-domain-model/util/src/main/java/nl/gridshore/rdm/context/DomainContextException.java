/*
 * Copyright (c) 2008 JTeam B.V.
 * www.jteam.nl
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of
 * JTeam B.V. ("Confidential Information").
 * You shall not disclose such Confidential Information and shall use
 * it only in accordance with the terms of the license agreement you
 * entered into with JTeam.
 */
package nl.gridshore.rdm.context;

public class DomainContextException extends RuntimeException {

    public DomainContextException(final String message) {
        super(message);
    }

    public DomainContextException(final String message, final Throwable cause) {
        super(message, cause);
    }

}