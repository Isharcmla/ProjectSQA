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

public class MockitoCore_inOrder_95224400725 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71;
     Object term76;

    public MockitoCore_inOrder_95224400725() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71 = newInstance(Class.forName("org.mockito.internal.MockitoCore"));
        Object term72 = newInstance(Class.forName("org.mockito.exceptions.Reporter"));
        Object term73 = newInstance(Class.forName("org.mockito.internal.util.MockUtil"));
        Object term74 = newInstance(Class.forName("org.mockito.internal.util.MockCreationValidator"));
        Object term75 = newInstance(Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress"));
        setField(term71, term71.getClass(), "reporter", term72);
        setField(term73, term73.getClass(), "creationValidator", term74);
        setField(term71, term71.getClass(), "mockUtil", term73);
        setField(term71, term71.getClass(), "mockingProgress", term75);
        term76 = (Object[]) newArray("java.lang.Object", 4);
        Object term77 = newInstance(Class.forName("java.lang.Object"));
        Object term78 = newInstance(Class.forName("java.lang.Object"));
        Object term79 = newInstance(Class.forName("java.lang.Object"));
        Object term80 = newInstance(Class.forName("java.lang.Object"));
        setElement(term76, 0, term77);
        setElement(term76, 1, term78);
        setElement(term76, 2, term79);
        setElement(term76, 3, term80);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.MockitoCore");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term76;
        try {
            callMethod(klass, "inOrder", argTypes, term71, args);
            assertTrue(false);
        }
        catch (NotAMockException e) {
        }

    }

};


