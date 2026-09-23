package org.mockito;

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
import org.mockito.exceptions.misusing.MissingMethodInvocationException;
import static org.mockito.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class Mockito_stub_197507079337 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24;

    public Mockito_stub_197507079337() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.Mockito");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term24;
        try {
            callMethod(klass, "stub", argTypes, null, args);
            assertTrue(false);
        }
        catch (MissingMethodInvocationException e) {
        }

    }

};


