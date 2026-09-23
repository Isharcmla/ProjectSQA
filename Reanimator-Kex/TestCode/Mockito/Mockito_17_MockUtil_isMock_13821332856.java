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
import static org.mockito.internal.util.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MockUtil_isMock_13821332856 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62;
     Object term64;

    public MockUtil_isMock_13821332856() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62 = newInstance(Class.forName("org.mockito.internal.util.MockUtil"));
        Object term63 = newInstance(Class.forName("org.mockito.internal.util.CreationValidator"));
        setField(term62, term62.getClass(), "creationValidator", term63);
        term64 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.util.MockUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term64;
        callMethod(klass, "isMock", argTypes, term62, args);
    }

};


