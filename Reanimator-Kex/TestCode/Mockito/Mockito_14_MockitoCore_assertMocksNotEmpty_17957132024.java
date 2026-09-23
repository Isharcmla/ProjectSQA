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
import org.mockito.exceptions.base.MockitoException;
import static org.mockito.internal.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MockitoCore_assertMocksNotEmpty_17957132024 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65;
     Object term70;

    public MockitoCore_assertMocksNotEmpty_17957132024() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65 = newInstance(Class.forName("org.mockito.internal.MockitoCore"));
        Object term66 = newInstance(Class.forName("org.mockito.exceptions.Reporter"));
        Object term67 = newInstance(Class.forName("org.mockito.internal.util.MockUtil"));
        Object term68 = newInstance(Class.forName("org.mockito.internal.util.MockCreationValidator"));
        Object term69 = newInstance(Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress"));
        setField(term65, term65.getClass(), "reporter", term66);
        setField(term67, term67.getClass(), "creationValidator", term68);
        setField(term65, term65.getClass(), "mockUtil", term67);
        setField(term65, term65.getClass(), "mockingProgress", term69);
        term70 = (Object[]) newArray("java.lang.Object", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.MockitoCore");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term70;
        try {
            callMethod(klass, "assertMocksNotEmpty", argTypes, term65, args);
            assertTrue(false);
        }
        catch (MockitoException e) {
        }

    }

};


