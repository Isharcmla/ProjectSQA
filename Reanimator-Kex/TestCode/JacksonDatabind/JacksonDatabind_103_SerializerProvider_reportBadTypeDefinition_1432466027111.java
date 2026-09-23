package com.fasterxml.jackson.databind;

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
import static com.fasterxml.jackson.databind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class SerializerProvider_reportBadTypeDefinition_1432466027111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82;

    public SerializerProvider_reportBadTypeDefinition_1432466027111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82 = (Object[]) newArray("java.lang.Object", 4);
        Object term83 = newInstance(Class.forName("java.lang.Object"));
        Object term84 = newInstance(Class.forName("java.lang.Object"));
        Object term85 = newInstance(Class.forName("java.lang.Object"));
        Object term86 = newInstance(Class.forName("java.lang.Object"));
        setElement(term82, 0, term83);
        setElement(term82, 1, term84);
        setElement(term82, 2, term85);
        setElement(term82, 3, term86);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.SerializerProvider");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("com.fasterxml.jackson.databind.BeanDescription");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = "MuLcgQHgqz";
        args[2] = term82;
        try {
            callMethod(klass, "reportBadTypeDefinition", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


