package org.mockito.internal.util;

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
import org.mockito.exceptions.misusing.NotAMockException;
import static org.mockito.internal.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MockUtil_getMockName_115530272219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term129;
     Object term131;

    public MockUtil_getMockName_115530272219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term129 = newInstance(Class.forName("org.mockito.internal.util.MockUtil"));
        Object term130 = newInstance(Class.forName("org.mockito.internal.util.MockCreationValidator"));
        setField(term129, term129.getClass(), "creationValidator", term130);
        term131 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.util.MockUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term131;
        try {
            callMethod(klass, "getMockName", argTypes, term129, args);
            assertTrue(false);
        }
        catch (NotAMockException e) {
        }

    }

};


