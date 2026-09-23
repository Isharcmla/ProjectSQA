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

public class XmlSerializerProvider_serializeValue_47830756116 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3;

    public XmlSerializerProvider_serializeValue_47830756116() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.dataformat.xml.ser.XmlSerializerProvider");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonGenerator");
        argTypes[1] = Class.forName("java.lang.Object");
        argTypes[2] = Class.forName("com.fasterxml.jackson.databind.JavaType");
        argTypes[3] = Class.forName("com.fasterxml.jackson.databind.JsonSerializer");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = term3;
        args[2] = null;
        args[3] = null;
        try {
            callMethod(klass, "serializeValue", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


