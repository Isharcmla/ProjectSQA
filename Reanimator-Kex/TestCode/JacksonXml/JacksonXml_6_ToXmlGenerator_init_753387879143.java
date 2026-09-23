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

public class ToXmlGenerator_init_753387879143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25976;
     Object term26068;
     Object term26162;

    public ToXmlGenerator_init_753387879143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term25892 = newInstance(Class.forName("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator"));
        setIntField(term25892, term25892.getClass(), "_features", 0);
        setField(term25892, term25892.getClass(), "_objectCodec", null);
        setField(term25892, term25892.getClass(), "_writeContext", null);
        setBooleanField(term25892, term25892.getClass(), "_cfgNumbersAsStrings", false);
        setField(term25892, term25892.getClass(), "_nextName", null);
        setBooleanField(term25892, term25892.getClass(), "_nextIsAttribute", false);
        setBooleanField(term25892, term25892.getClass(), "_nextIsUnwrapped", false);
        setBooleanField(term25892, term25892.getClass(), "_nextIsCData", false);
        setField(term25892, term25892.getClass(), "_elementNameStack", null);
        setIntField(term25892, term25892.getClass(), "_formatFeatures", 0);
        setField(term25892, term25892.getClass(), "_ioContext", null);
        setField(term25892, term25892.getClass(), "_originalXmlWriter", null);
        term25976 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        term26068 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        term26162 = newInstance(Class.forName("org.codehaus.stax2.util.StreamWriterDelegate"));
        Object term26248 = newInstance(Class.forName("org.codehaus.stax2.ri.Stax2WriterAdapter"));
        setField(term26162, term26162.getClass(), "mDelegate", term26248);
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
        args[0] = term25976;
        args[1] = -1;
        args[2] = 0;
        args[3] = term26068;
        args[4] = term26162;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


