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
     Object term75;

    public MockitoCore_doAnswer_107439600426() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75 = newInstance(Class.forName("org.mockito.internal.MockitoCore"));
        Object term76 = newInstance(Class.forName("org.mockito.exceptions.Reporter"));
        Object term77 = newInstance(Class.forName("org.mockito.internal.util.MockUtil"));
        Object term78 = newInstance(Class.forName("org.mockito.internal.util.CreationValidator"));
        Object term79 = newInstance(Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress"));
        setField(term75, term75.getClass(), "reporter", term76);
        setField(term77, term77.getClass(), "creationValidator", term78);
        setField(term75, term75.getClass(), "mockUtil", term77);
        setField(term75, term75.getClass(), "mockingProgress", term79);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.MockitoCore");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.mockito.stubbing.Answer");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "doAnswer", argTypes, term75, args);
    }

};


