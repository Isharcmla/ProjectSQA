package org.apache.commons.lang3;

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
import static org.apache.commons.lang3.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.EqualityUtils.*;
import java.lang.Float;

public class ArrayUtils_indexOf_918061289259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term966;
     Object term973;
     Object term13716;

    public ArrayUtils_indexOf_918061289259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term966 = (float[]) newFloatArray(6);
        setFloatElement(term966, 0, 0.9985961F);
        setFloatElement(term966, 1, 0.51832694F);
        setFloatElement(term966, 2, 0.97262454F);
        setFloatElement(term966, 3, 0.76550204F);
        setFloatElement(term966, 4, 0.26441735F);
        setFloatElement(term966, 5, 0.13745493F);
        term973 = new Float(0.20144695F);
        term13716 = (float[]) newFloatArray(6);
        setFloatElement(term13716, 0, 0.9985961F);
        setFloatElement(term13716, 1, 0.51832694F);
        setFloatElement(term13716, 2, 0.97262454F);
        setFloatElement(term13716, 3, 0.76550204F);
        setFloatElement(term13716, 4, 0.26441735F);
        setFloatElement(term13716, 5, 0.13745493F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(float.class, 0).getClass();
        argTypes[1] = float.class;
        Object[] args = new Object[2];
        args[0] = term966;
        args[1] = term973;
        Object retValue = callMethod(klass, "indexOf", argTypes, null, args);
        assertTrue(recursiveEquals(term966, term13716));
        assertTrue(recursiveEquals(term973, 0.20144695F));
        assertTrue(recursiveEquals(retValue, -1));
    }

};


