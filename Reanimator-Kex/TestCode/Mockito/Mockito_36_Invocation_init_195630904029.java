package org.mockito.internal.invocation;

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
import static org.mockito.internal.invocation.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class Invocation_init_195630904029 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term2;
     Object term8;

    public Invocation_init_195630904029() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("java.lang.Object"));
        term2 = (Object[]) newArray("java.lang.Object", 5);
        Object term3 = newInstance(Class.forName("java.lang.Object"));
        Object term4 = newInstance(Class.forName("java.lang.Object"));
        Object term5 = newInstance(Class.forName("java.lang.Object"));
        Object term6 = newInstance(Class.forName("java.lang.Object"));
        Object term7 = newInstance(Class.forName("java.lang.Object"));
        setElement(term2, 0, term3);
        setElement(term2, 1, term4);
        setElement(term2, 2, term5);
        setElement(term2, 3, term6);
        setElement(term2, 4, term7);
        term8 = new Integer(568599855);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.invocation.Invocation");
        Class<?>[] argTypes = new Class<?>[5];
        argTypes[0] = Class.forName("java.lang.Object");
        argTypes[1] = Class.forName("org.mockito.internal.invocation.MockitoMethod");
        argTypes[2] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        argTypes[3] = int.class;
        argTypes[4] = Class.forName("org.mockito.internal.invocation.realmethod.RealMethod");
        Object[] args = new Object[5];
        args[0] = term1;
        args[1] = null;
        args[2] = term2;
        args[3] = term8;
        args[4] = null;
        try {
            Object instance = callConstructor(klass, argTypes, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


