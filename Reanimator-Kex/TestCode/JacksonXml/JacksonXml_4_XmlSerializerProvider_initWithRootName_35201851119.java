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

public class XmlSerializerProvider_initWithRootName_35201851119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71;

    public XmlSerializerProvider_initWithRootName_35201851119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71 = newInstance(Class.forName("javax.xml.namespace.QName"));
        setField(term71, term71.getClass(), "namespaceURI", "xxtlPwDYFs");
        setField(term71, term71.getClass(), "localPart", "jJCZpVmanW");
        setField(term71, term71.getClass(), "prefix", "EGtDIRbSSb");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("com.fasterxml.jackson.dataformat.xml.ser.ToXmlGenerator");
        argTypes[1] = Class.forName("javax.xml.namespace.QName");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term71;
        try {
            callMethod(klass, "_initWithRootName", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


