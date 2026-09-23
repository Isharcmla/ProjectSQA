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
import java.lang.NullPointerException;
import static org.mockito.internal.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MockitoCore_getLastInvocation_122429764729 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term97;

    public MockitoCore_getLastInvocation_122429764729() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term97 = newInstance(Class.forName("org.mockito.internal.MockitoCore"));
        Object term98 = newInstance(Class.forName("org.mockito.exceptions.Reporter"));
        Object term99 = newInstance(Class.forName("org.mockito.internal.util.MockUtil"));
        Object term100 = newInstance(Class.forName("org.mockito.internal.util.MockCreationValidator"));
        Object term101 = newInstance(Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress"));
        setField(term97, term97.getClass(), "reporter", term98);
        setField(term99, term99.getClass(), "creationValidator", term100);
        setField(term97, term97.getClass(), "mockUtil", term99);
        setField(term97, term97.getClass(), "mockingProgress", term101);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.MockitoCore");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "getLastInvocation", argTypes, term97, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


