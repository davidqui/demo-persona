/**
 * Author:  jgarcia
 * Created: 8/02/2018
 */

--------------------------------------------------------
--  DDL for Table PRUEBA_PERSONA
--------------------------------------------------------

CREATE TABLE PRUEBA_PERSONA (	
    DOCID       VARCHAR2(254 BYTE)  NOT NULL, 
    NOMBRE      VARCHAR2(254 BYTE)  NOT NULL, 
    APELLIDO    VARCHAR2(254 BYTE)  NOT NULL, 
    EDAD        NUMBER(38,0)        NOT NULL,
    PRIMARY KEY (DOCID)
 ) ;