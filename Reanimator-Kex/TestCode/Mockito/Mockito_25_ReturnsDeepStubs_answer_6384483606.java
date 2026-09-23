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

public class ReturnsDeepStubs_answer_6384483606 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;

    public ReturnsDeepStubs_answer_6384483606() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("org.mockito.internal.stubbing.defaultanswers.ReturnsDeepStubs"));
        Object term2 = newInstance(Class.forName("org.mockito.internal.stubbing.defaultanswers.ReturnsEmptyValues"));
        Object term3 = newInstance(Class.forName("org.mockito.internal.util.ObjectMethodsGuru"));
        setField(term2, term2.getClass(), "methodsGuru", term3);
        setField(term1, term1.getClass(), "delegate", term2);
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


