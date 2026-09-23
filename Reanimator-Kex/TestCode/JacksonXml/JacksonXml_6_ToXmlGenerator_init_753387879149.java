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

public class ToXmlGenerator_init_753387879149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30033;

    public ToXmlGenerator_init_753387879149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term29847 = newInstance(Class.forName("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator"));
        Object term29939 = newInstance(Class.forName("com.fasterxml.jackson.databind.ObjectReader"));
        setIntField(term29847, term29847.getClass(), "_features", 0);
        setField(term29847, term29847.getClass(), "_objectCodec", term29939);
        setField(term29847, term29847.getClass(), "_writeContext", null);
        setBooleanField(term29847, term29847.getClass(), "_cfgNumbersAsStrings", false);
        setField(term29847, term29847.getClass(), "_nextName", null);
        setBooleanField(term29847, term29847.getClass(), "_nextIsAttribute", false);
        setBooleanField(term29847, term29847.getClass(), "_nextIsUnwrapped", false);
        setBooleanField(term29847, term29847.getClass(), "_nextIsCData", false);
        setField(term29847, term29847.getClass(), "_elementNameStack", null);
        setIntField(term29847, term29847.getClass(), "_formatFeatures", 0);
        setField(term29847, term29847.getClass(), "_ioContext", null);
        setField(term29847, term29847.getClass(), "_originalXmlWriter", null);
        term30033 = newInstance(Class.forName("org.codehaus.stax2.util.StreamWriterDelegate"));
        Object term30119 = newInstance(Class.forName("org.codehaus.stax2.ri.Stax2WriterAdapter"));
        Object term30215 = newInstance(Class.forName("org.codehaus.stax2.util.StreamWriter2Delegate"));
        setField(term30119, term30119.getClass(), "mDelegate", term30215);
        setField(term30033, term30033.getClass(), "mDelegate", term30119);
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
        args[4] = term30033;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


