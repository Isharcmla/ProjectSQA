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
import java.lang.reflect.InaccessibleObjectException;
import static org.apache.commons.lang3.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Float;

public class ArrayUtils_add_1915920253316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1614;
     Object term1621;

    public ArrayUtils_add_1915920253316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1614 = (float[]) newFloatArray(6);
        setFloatElement(term1614, 0, 0.21723765F);
        setFloatElement(term1614, 1, 0.06688923F);
        setFloatElement(term1614, 2, 0.22417867F);
        setFloatElement(term1614, 3, 0.35872674F);
        setFloatElement(term1614, 4, 0.2946385F);
        setFloatElement(term1614, 5, 0.07802445F);
        term1621 = new Float(0.36114347F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.ArrayUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(float.class, 0).getClass();
        argTypes[1] = float.class;
        Object[] args = new Object[2];
        args[0] = term1614;
        args[1] = term1621;
        try {
            callMethod(klass, "add", argTypes, null, args);
            assertTrue(false);
        }
        catch (InaccessibleObjectException e) {
        }

    }

};


