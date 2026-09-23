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

public class ToXmlGenerator_startWrappedValue_214069577683 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term151;
     Object term188;

    public ToXmlGenerator_startWrappedValue_214069577683() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term151 = newInstance(Class.forName("javax.xml.namespace.QName"));
        setField(term151, term151.getClass(), "namespaceURI", "SzjVpOQTyS");
        setField(term151, term151.getClass(), "localPart", "MjGYSRKTNF");
        setField(term151, term151.getClass(), "prefix", "hRNSzYYIrc");
        term188 = newInstance(Class.forName("javax.xml.namespace.QName"));
        setField(term188, term188.getClass(), "namespaceURI", "RMFIsYGgne");
        setField(term188, term188.getClass(), "localPart", "NRdvgJlhkX");
        setField(term188, term188.getClass(), "prefix", "uuaPigETmJ");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("javax.xml.namespace.QName");
        argTypes[1] = Class.forName("javax.xml.namespace.QName");
        Object[] args = new Object[2];
        args[0] = term151;
        args[1] = term188;
        try {
            callMethod(klass, "startWrappedValue", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


