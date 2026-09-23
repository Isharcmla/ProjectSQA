package com.fasterxml.jackson.databind.deser.impl;

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
import static com.fasterxml.jackson.databind.deser.impl.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class ExternalTypeHandler_handleTypePropertyValue_1559638716 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61;
     Object term74;

    public ExternalTypeHandler_handleTypePropertyValue_1559638716() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61 = newInstance(Class.forName("java.lang.Object"));
        term74 = new Integer(568599855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler");
        Class<?>[] argTypes = new Class<?>[6];
        argTypes[0] = Class.forName("com.fasterxml.jackson.core.JsonParser");
        argTypes[1] = Class.forName("com.fasterxml.jackson.databind.DeserializationContext");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("java.lang.Object");
        argTypes[4] = Class.forName("java.lang.String");
        argTypes[5] = int.class;
        Object[] args = new Object[6];
        args[0] = null;
        args[1] = null;
        args[2] = "MuLcgQHgqz";
        args[3] = term61;
        args[4] = "xxtlPwDYFs";
        args[5] = term74;
        try {
            callMethod(klass, "_handleTypePropertyValue", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


