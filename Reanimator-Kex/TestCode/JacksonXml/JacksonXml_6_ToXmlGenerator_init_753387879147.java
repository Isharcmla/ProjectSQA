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

public class ToXmlGenerator_init_753387879147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28741;

    public ToXmlGenerator_init_753387879147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term28647 = newInstance(Class.forName("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator"));
        setIntField(term28647, term28647.getClass(), "_features", 0);
        setField(term28647, term28647.getClass(), "_objectCodec", null);
        setField(term28647, term28647.getClass(), "_writeContext", null);
        setBooleanField(term28647, term28647.getClass(), "_cfgNumbersAsStrings", false);
        setField(term28647, term28647.getClass(), "_nextName", null);
        setBooleanField(term28647, term28647.getClass(), "_nextIsAttribute", false);
        setBooleanField(term28647, term28647.getClass(), "_nextIsUnwrapped", false);
        setBooleanField(term28647, term28647.getClass(), "_nextIsCData", false);
        setField(term28647, term28647.getClass(), "_elementNameStack", null);
        setIntField(term28647, term28647.getClass(), "_formatFeatures", 0);
        setField(term28647, term28647.getClass(), "_ioContext", null);
        setField(term28647, term28647.getClass(), "_originalXmlWriter", null);
        term28741 = newInstance(Class.forName("org.codehaus.stax2.util.StreamWriterDelegate"));
        Object term28837 = newInstance(Class.forName("org.codehaus.stax2.util.StreamWriter2Delegate"));
        setField(term28741, term28741.getClass(), "mDelegate", term28837);
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
        args[4] = term28741;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


