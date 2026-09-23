package org.mockito.internal.stubbing.defaultanswers;

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
import static org.mockito.internal.stubbing.defaultanswers.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ReturnsDeepStubs_getMock_208486200610 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9;

    public ReturnsDeepStubs_getMock_208486200610() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term9 = newInstance(Class.forName("org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs"));
        Object term10 = newInstance(Class.forName("org.mockito.internal.MockitoCore"));
        Object term11 = newInstance(Class.forName("org.mockito.exceptions.Reporter"));
        Object term12 = newInstance(Class.forName("org.mockito.internal.util.MockUtil"));
        Object term13 = newInstance(Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress"));
        Object term14 = newInstance(Class.forName("org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues"));
        Object term15 = newInstance(Class.forName("org.mockito.internal.util.ObjectMethodsGuru"));
        Object term16 = newInstance(Class.forName("org.mockito.internal.util.MockUtil"));
        setField(term10, term10.getClass(), "reporter", term11);
        setField(term10, term10.getClass(), "mockUtil", term12);
        setField(term10, term10.getClass(), "mockingProgress", term13);
        setField(term9, term9.getClass(), "mockitoCore", term10);
        setField(term14, term14.getClass(), "methodsGuru", term15);
        setField(term14, term14.getClass(), "mockUtil", term16);
        setField(term9, term9.getClass(), "delegate", term14);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.mockito.invocation.InvocationOnMock");
        argTypes[1] = Class.forName("org.mockito.internal.util.reflection.GenericMetadataSupport");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        try {
            callMethod(klass, "getMock", argTypes, term9, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


