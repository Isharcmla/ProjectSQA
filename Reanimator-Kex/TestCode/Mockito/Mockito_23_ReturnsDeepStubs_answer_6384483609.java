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

public class ReturnsDeepStubs_answer_6384483609 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public ReturnsDeepStubs_answer_6384483609() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs"));
        Object term2 = newInstance(Class.forName("org.mockito.internal.MockitoCore"));
        Object term3 = newInstance(Class.forName("org.mockito.exceptions.Reporter"));
        Object term4 = newInstance(Class.forName("org.mockito.internal.util.MockUtil"));
        Object term5 = newInstance(Class.forName("org.mockito.internal.progress.ThreadSafeMockingProgress"));
        Object term6 = newInstance(Class.forName("org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues"));
        Object term7 = newInstance(Class.forName("org.mockito.internal.util.ObjectMethodsGuru"));
        Object term8 = newInstance(Class.forName("org.mockito.internal.util.MockUtil"));
        setField(term2, term2.getClass(), "reporter", term3);
        setField(term2, term2.getClass(), "mockUtil", term4);
        setField(term2, term2.getClass(), "mockingProgress", term5);
        setField(term1, term1.getClass(), "mockitoCore", term2);
        setField(term6, term6.getClass(), "methodsGuru", term7);
        setField(term6, term6.getClass(), "mockUtil", term8);
        setField(term1, term1.getClass(), "delegate", term6);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.mockito.invocation.InvocationOnMock");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "answer", argTypes, term1, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


