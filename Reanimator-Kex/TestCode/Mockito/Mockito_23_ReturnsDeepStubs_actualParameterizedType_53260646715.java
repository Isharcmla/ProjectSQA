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
import org.mockito.exceptions.misusing.NotAMockException;
import static org.mockito.internal.stubbing.defaultanswers.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class ReturnsDeepStubs_actualParameterizedType_53260646715 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72;
     Object term80;

    public ReturnsDeepStubs_actualParameterizedType_53260646715() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72 = newInstance(Class.forName("org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs"));
        Object term73 = newInstance(Class.forName("org.mockito.internal.MockitoCore"));
        Object term74 = newInstance(Class.forName("org.mockito.exceptions.Reporter"));
        Object term75 = newInstance(Class.forName("org.mockito.internal.util.MockUtil"));
        Object term76 = newInstance(Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress"));
        Object term77 = newInstance(Class.forName("org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues"));
        Object term78 = newInstance(Class.forName("org.mockito.internal.util.ObjectMethodsGuru"));
        Object term79 = newInstance(Class.forName("org.mockito.internal.util.MockUtil"));
        setField(term73, term73.getClass(), "reporter", term74);
        setField(term73, term73.getClass(), "mockUtil", term75);
        setField(term73, term73.getClass(), "mockingProgress", term76);
        setField(term72, term72.getClass(), "mockitoCore", term73);
        setField(term77, term77.getClass(), "methodsGuru", term78);
        setField(term77, term77.getClass(), "mockUtil", term79);
        setField(term72, term72.getClass(), "delegate", term77);
        term80 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term80;
        try {
            callMethod(klass, "actualParameterizedType", argTypes, term72, args);
            assertTrue(false);
        }
        catch (NotAMockException e) {
        }

    }

};


