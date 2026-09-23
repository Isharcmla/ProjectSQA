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

public class XmlTokenStream_init_105907526563 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11637;
     Object term11929;

    public XmlTokenStream_init_105907526563() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term11513 = newInstance(Class.forName("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
        Object term11551 = newInstance(Class.forName("java.lang.Object"));
        setIntField(term11513, term11513.getClass(), "_nextAttributeIndex", 0);
        setField(term11513, term11513.getClass(), "_sourceReference", term11551);
        term11637 = newInstance(Class.forName("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        Object term11723 = newInstance(Class.forName("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        Object term11809 = newInstance(Class.forName("org.codehaus.stax2.ri.Stax2ReaderAdapter"));
        setField(term11723, term11723.getClass(), "reader", term11809);
        setField(term11637, term11637.getClass(), "reader", term11723);
        term11929 = newInstance(Class.forName("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.dataformat.xml.deser.XmlTokenStream");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("javax.xml.stream.XMLStreamReader");
        argTypes[1] = Class.forName("java.lang.Object");
        Object[] args = new Object[2];
        args[0] = term11637;
        args[1] = term11929;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


