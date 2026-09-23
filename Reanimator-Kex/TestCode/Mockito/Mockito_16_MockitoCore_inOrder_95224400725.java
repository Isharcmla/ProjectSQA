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
     Object term66;
     Object term71;

    public MockitoCore_inOrder_95224400725() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66 = newInstance(Class.forName("org.mockito.internal.MockitoCore"));
        Object term67 = newInstance(Class.forName("org.mockito.exceptions.Reporter"));
        Object term68 = newInstance(Class.forName("org.mockito.internal.util.MockUtil"));
        Object term69 = newInstance(Class.forName("org.mockito.internal.util.CreationValidator"));
        Object term70 = newInstance(Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress"));
        setField(term66, term66.getClass(), "reporter", term67);
        setField(term68, term68.getClass(), "creationValidator", term69);
        setField(term66, term66.getClass(), "mockUtil", term68);
        setField(term66, term66.getClass(), "mockingProgress", term70);
        term71 = (Object[]) newArray("java.lang.Object", 3);
        Object term72 = newInstance(Class.forName("java.lang.Object"));
        Object term73 = newInstance(Class.forName("java.lang.Object"));
        Object term74 = newInstance(Class.forName("java.lang.Object"));
        setElement(term71, 0, term72);
        setElement(term71, 1, term73);
        setElement(term71, 2, term74);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.MockitoCore");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term71;
        try {
            callMethod(klass, "inOrder", argTypes, term66, args);
            assertTrue(false);
        }
        catch (NotAMockException e) {
        }

    }

};


