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
import org.mockito.exceptions.misusing.NotAMockException;
import static org.mockito.internal.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class MockitoCore_reset_127958922621 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29;
     Object term34;

    public MockitoCore_reset_127958922621() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29 = newInstance(Class.forName("org.mockito.internal.MockitoCore"));
        Object term30 = newInstance(Class.forName("org.mockito.exceptions.Reporter"));
        Object term31 = newInstance(Class.forName("org.mockito.internal.util.MockUtil"));
        Object term32 = newInstance(Class.forName("org.mockito.internal.util.MockCreationValidator"));
        Object term33 = newInstance(Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress"));
        setField(term29, term29.getClass(), "reporter", term30);
        setField(term31, term31.getClass(), "creationValidator", term32);
        setField(term29, term29.getClass(), "mockUtil", term31);
        setField(term29, term29.getClass(), "mockingProgress", term33);
        term34 = (Object[]) newArray("java.lang.Object", 9);
        Object term35 = newInstance(Class.forName("java.lang.Object"));
        Object term36 = newInstance(Class.forName("java.lang.Object"));
        Object term37 = newInstance(Class.forName("java.lang.Object"));
        Object term38 = newInstance(Class.forName("java.lang.Object"));
        Object term39 = newInstance(Class.forName("java.lang.Object"));
        Object term40 = newInstance(Class.forName("java.lang.Object"));
        Object term41 = newInstance(Class.forName("java.lang.Object"));
        Object term42 = newInstance(Class.forName("java.lang.Object"));
        Object term43 = newInstance(Class.forName("java.lang.Object"));
        setElement(term34, 0, term35);
        setElement(term34, 1, term36);
        setElement(term34, 2, term37);
        setElement(term34, 3, term38);
        setElement(term34, 4, term39);
        setElement(term34, 5, term40);
        setElement(term34, 6, term41);
        setElement(term34, 7, term42);
        setElement(term34, 8, term43);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.MockitoCore");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term34;
        try {
            callMethod(klass, "reset", argTypes, term29, args);
            assertTrue(false);
        }
        catch (NotAMockException e) {
        }

    }

};


