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
import java.lang.Object;

public class MockitoCore_assertMocksNotEmpty_1795713209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56;
     Object term61;

    public MockitoCore_assertMocksNotEmpty_1795713209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56 = newInstance(Class.forName("org.mockito.internal.MockitoCore"));
        Object term57 = newInstance(Class.forName("org.mockito.exceptions.Reporter"));
        Object term58 = newInstance(Class.forName("org.mockito.internal.util.MockUtil"));
        Object term59 = newInstance(Class.forName("org.mockito.internal.util.CreationValidator"));
        Object term60 = newInstance(Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress"));
        setField(term56, term56.getClass(), "reporter", term57);
        setField(term58, term58.getClass(), "creationValidator", term59);
        setField(term56, term56.getClass(), "mockUtil", term58);
        setField(term56, term56.getClass(), "mockingProgress", term60);
        term61 = (Object[]) newArray("java.lang.Object", 4);
        Object term62 = newInstance(Class.forName("java.lang.Object"));
        Object term63 = newInstance(Class.forName("java.lang.Object"));
        Object term64 = newInstance(Class.forName("java.lang.Object"));
        Object term65 = newInstance(Class.forName("java.lang.Object"));
        setElement(term61, 0, term62);
        setElement(term61, 1, term63);
        setElement(term61, 2, term64);
        setElement(term61, 3, term65);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.MockitoCore");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term61;
        callMethod(klass, "assertMocksNotEmpty", argTypes, term56, args);
    }

};


