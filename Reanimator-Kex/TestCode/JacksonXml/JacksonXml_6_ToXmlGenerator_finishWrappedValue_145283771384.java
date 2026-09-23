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

public class ToXmlGenerator_finishWrappedValue_145283771384 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term285;
     Object term322;

    public ToXmlGenerator_finishWrappedValue_145283771384() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term285 = newInstance(Class.forName("javax.xml.namespace.QName"));
        setField(term285, term285.getClass(), "namespaceURI", "MxlszYVzRf");
        setField(term285, term285.getClass(), "localPart", "LQFpaHEwXR");
        setField(term285, term285.getClass(), "prefix", "oVcInYnLWB");
        term322 = newInstance(Class.forName("javax.xml.namespace.QName"));
        setField(term322, term322.getClass(), "namespaceURI", "aJlieCFVtF");
        setField(term322, term322.getClass(), "localPart", "ZiaGIbnzTs");
        setField(term322, term322.getClass(), "prefix", "tbcdzjIfER");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("javax.xml.namespace.QName");
        argTypes[1] = Class.forName("javax.xml.namespace.QName");
        Object[] args = new Object[2];
        args[0] = term285;
        args[1] = term322;
        try {
            callMethod(klass, "finishWrappedValue", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


