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
import static org.mockito.internal.invocation.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Boolean;
import java.lang.Object;

public class Invocation_expandVarArgs_10923969081 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term10;
     Object term12;

    public Invocation_expandVarArgs_10923969081() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term10 = new Boolean(false);
        term12 = (Object[]) newArray("java.lang.Object", 4);
        Object term13 = newInstance(Class.forName("java.lang.Object"));
        Object term14 = newInstance(Class.forName("java.lang.Object"));
        Object term15 = newInstance(Class.forName("java.lang.Object"));
        Object term16 = newInstance(Class.forName("java.lang.Object"));
        setElement(term12, 0, term13);
        setElement(term12, 1, term14);
        setElement(term12, 2, term15);
        setElement(term12, 3, term16);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.mockito.internal.invocation.Invocation");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = boolean.class;
        argTypes[1] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term10;
        args[1] = term12;
        callMethod(klass, "expandVarArgs", argTypes, null, args);
    }

};


