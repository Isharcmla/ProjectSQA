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

public class ToXmlGenerator_init_753387879145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term27450;
     Object term27544;

    public ToXmlGenerator_init_753387879145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term27264 = newInstance(Class.forName("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator"));
        Object term27366 = newInstance(Class.forName("com.fasterxml.jackson.core.json.JsonWriteContext"));
        setIntField(term27264, term27264.getClass(), "_features", 0);
        setField(term27264, term27264.getClass(), "_objectCodec", null);
        setIntField(term27366, term27366.getClass(), "_type", 0);
        setField(term27366, term27366.getClass(), "_parent", null);
        setField(term27366, term27366.getClass(), "_dups", null);
        setIntField(term27366, term27366.getClass(), "_index", 0);
        setField(term27264, term27264.getClass(), "_writeContext", term27366);
        setBooleanField(term27264, term27264.getClass(), "_cfgNumbersAsStrings", false);
        setField(term27264, term27264.getClass(), "_nextName", null);
        setBooleanField(term27264, term27264.getClass(), "_nextIsAttribute", false);
        setBooleanField(term27264, term27264.getClass(), "_nextIsUnwrapped", false);
        setBooleanField(term27264, term27264.getClass(), "_nextIsCData", false);
        setField(term27264, term27264.getClass(), "_elementNameStack", null);
        setIntField(term27264, term27264.getClass(), "_formatFeatures", 0);
        setField(term27264, term27264.getClass(), "_ioContext", null);
        setField(term27264, term27264.getClass(), "_originalXmlWriter", null);
        term27450 = newInstance(Class.forName("com.fasterxml.jackson.core.io.IOContext"));
        term27544 = newInstance(Class.forName("org.codehaus.stax2.util.StreamWriterDelegate"));
        Object term27640 = newInstance(Class.forName("org.codehaus.stax2.util.StreamWriter2Delegate"));
        setField(term27544, term27544.getClass(), "mDelegate", term27640);
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
        args[0] = term27450;
        args[1] = -1;
        args[2] = 0;
        args[3] = null;
        args[4] = term27544;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


