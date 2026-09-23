package com.fasterxml.jackson.dataformat.xml.deser;

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
import static com.fasterxml.jackson.dataformat.xml.deser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class XmlTokenStream_init_105907526555 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8494;
     Object term8666;

    public XmlTokenStream_init_105907526555() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term8370 = newInstance(Class.forName("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Object term8408 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term8370, term8370.getClass(), "_nextAttributeIndex", 0);
        setField(term8370, term8370.getClass(), "_sourceReference", term8408);
        term8494 = newInstance(Class.forName("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        Object term8580 = newInstance(Class.forName("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        setField(term8494, term8494.getClass(), "reader", term8580);
        term8666 = newInstance(Class.forName("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("javax.xml.stream.XMLStreamReader");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term8494;
        args[1] = term8666;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


