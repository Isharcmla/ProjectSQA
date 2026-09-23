package org.mockito.internal;

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
import static org.mockito.internal.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.mockito.internal.EqualityUtils.*;
import java.lang.Object;

public class MockitoCore_doAnswer_107439600426 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81;

    public MockitoCore_doAnswer_107439600426() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81 = newInstance(Class.forName("org.mockito.internal.MockitoCore"));
        Object term82 = newInstance(Class.forName("org.mockito.exceptions.Reporter"));
        Object term83 = newInstance(Class.forName("org.mockito.internal.util.MockUtil"));
        Object term84 = newInstance(Class.forName("org.mockito.internal.util.MockCreationValidator"));
        Object term85 = newInstance(Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress"));
        setField(term81, term81.getClass(), "reporter", term82);
        setField(term83, term83.getClass(), "creationValidator", term84);
        setField(term81, term81.getClass(), "mockUtil", term83);
        setField(term81, term81.getClass(), "mockingProgress", term85);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.MockitoCore");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.mockito.stubbing.Answer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "doAnswer", argTypes, term81, args);
    }

};


