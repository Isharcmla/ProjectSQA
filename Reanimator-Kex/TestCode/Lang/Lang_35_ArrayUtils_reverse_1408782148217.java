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

public class ArrayUtils_reverse_1408782148217 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term457;
     Object term12326;

    public ArrayUtils_reverse_1408782148217() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term457 = (float[]) newFloatArray(6);
        setFloatElement(term457, 0, 0.13906479F);
        setFloatElement(term457, 1, 0.6076495F);
        setFloatElement(term457, 2, 0.6608425F);
        setFloatElement(term457, 3, 0.37773192F);
        setFloatElement(term457, 4, 0.24413109F);
        setFloatElement(term457, 5, 0.8474802F);
        term12326 = (float[]) newFloatArray(6);
        setFloatElement(term12326, 0, 0.8474802F);
        setFloatElement(term12326, 1, 0.24413109F);
        setFloatElement(term12326, 2, 0.37773192F);
        setFloatElement(term12326, 3, 0.6608425F);
        setFloatElement(term12326, 4, 0.6076495F);
        setFloatElement(term12326, 5, 0.13906479F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(float.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term457;
        callMethod(klass, "reverse", argTypes, null, args);
        assertTrue(recursiveEquals(term457, term12326));
    }

};


