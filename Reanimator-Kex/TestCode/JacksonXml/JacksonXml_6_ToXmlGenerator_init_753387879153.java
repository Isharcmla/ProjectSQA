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
import java.lang.StackOverflowError;
import static com.fasterxml.jackson.dataformat.xml.ser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ToXmlGenerator_init_753387879153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32828;

    public ToXmlGenerator_init_753387879153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term32505 = newInstance(Class.forName("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator"));
        term32828 = newInstance(Class.forName("org.codehaus.stax2.util.StreamWriterDelegate"));
        Object term32871 = newInstance(Class.forName("org.codehaus.stax2.ri.Stax2WriterAdapter"));
        Object term32919 = newInstance(Class.forName("org.codehaus.stax2.util.StreamWriter2Delegate"));
        setIntField(term32505, term32505.getClass(), "_features", 0);
        setField(term32505, term32505.getClass(), "_objectCodec", null);
        setField(term32505, term32505.getClass(), "_writeContext", null);
        setBooleanField(term32505, term32505.getClass(), "_cfgNumbersAsStrings", false);
        setField(term32505, term32505.getClass(), "_nextName", null);
        setBooleanField(term32505, term32505.getClass(), "_nextIsAttribute", false);
        setBooleanField(term32505, term32505.getClass(), "_nextIsUnwrapped", false);
        setBooleanField(term32505, term32505.getClass(), "_nextIsCData", false);
        setField(term32505, term32505.getClass(), "_elementNameStack", null);
        setIntField(term32505, term32505.getClass(), "_formatFeatures", 0);
        setField(term32505, term32505.getClass(), "_ioContext", null);
        setField(term32919, term32919.getClass(), "mDelegate", term32919);
        setField(term32871, term32871.getClass(), "mDelegate", term32919);
        setField(term32828, term32828.getClass(), "mDelegate", term32871);
        setField(term32505, term32505.getClass(), "_originalXmlWriter", term32828);
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
        args[3] = null;
        args[4] = term32828;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (StackOverflowError e) {
        }

    }

};


