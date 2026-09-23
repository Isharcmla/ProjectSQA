package com.fasterxml.jackson.dataformat.xml.ser;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.lang.NullPointerException;
import static com.fasterxml.jackson.dataformat.xml.ser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.LinkedList;

public class ToXmlGenerator_init_753387879139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22500;
     Object term22594;

    public ToXmlGenerator_init_753387879139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term22408 = new LinkedList();
        Object term22262 = newInstance(Class.forName("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator"));
        Object term22354 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        setIntField(term22262, term22262.getClass(), "_features", 0);
        setField(term22262, term22262.getClass(), "_objectCodec", term22354);
        setField(term22262, term22262.getClass(), "_writeContext", null);
        setBooleanField(term22262, term22262.getClass(), "_cfgNumbersAsStrings", false);
        setField(term22262, term22262.getClass(), "_nextName", null);
        setBooleanField(term22262, term22262.getClass(), "_nextIsAttribute", false);
        setBooleanField(term22262, term22262.getClass(), "_nextIsUnwrapped", false);
        setBooleanField(term22262, term22262.getClass(), "_nextIsCData", false);
        setField(term22262, term22262.getClass(), "_elementNameStack", term22408);
        setIntField(term22262, term22262.getClass(), "_formatFeatures", 0);
        setField(term22262, term22262.getClass(), "_ioContext", null);
        setField(term22262, term22262.getClass(), "_originalXmlWriter", null);
        term22500 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        term22594 = newInstance(Class.forName("org.codehaus.stax2.util.StreamWriterDelegate"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.io.IOContext");
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("com.fasterxml.jackson.core.ObjectCodec");
        argTypes[4] = Class.forName("javax.xml.stream.XMLStreamWriter");
        Object[] args = new Object[5];
        args[0] = null;
        args[1] = -1;
        args[2] = 0;
        args[3] = term22500;
        args[4] = term22594;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


