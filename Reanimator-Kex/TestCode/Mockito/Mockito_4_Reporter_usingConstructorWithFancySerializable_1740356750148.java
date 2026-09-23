package org.mockito.exceptions;

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
import org.mockito.exceptions.base.MockitoException;
import static org.mockito.exceptions.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class Reporter_usingConstructorWithFancySerializable_1740356750148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24245;
     Object enum1;

    public Reporter_usingConstructorWithFancySerializable_1740356750148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24245 = newInstance(Class.forName("org.mockito.exceptions.Reporter"));
        Class<? extends Object> term79854 = Class.forName((String) "org.mockito.mock.SerializableMode");
        Field term79853 = ((Class) term79854).getDeclaredField((String) "BASIC");
        ((Field) term79853).setAccessible(true);
        enum1 = ((Field) term79853).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.exceptions.Reporter");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.mockito.mock.SerializableMode");
        Object[] args = new Object[1];
        args[0] = enum1;
        try {
            callMethod(klass, "usingConstructorWithFancySerializable", argTypes, term24245, args);
            assertTrue(false);
        }
        catch (MockitoException e) {
        }

    }

};


