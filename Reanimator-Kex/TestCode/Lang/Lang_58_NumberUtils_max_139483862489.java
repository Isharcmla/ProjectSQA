package org.apache.commons.lang.math;

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
import static org.apache.commons.lang.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang.math.EqualityUtils.*;

public class NumberUtils_max_139483862489 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term608;
     Object term6319;

    public NumberUtils_max_139483862489() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term608 = (float[]) newFloatArray(3);
        setFloatElement(term608, 0, 0.8783184F);
        setFloatElement(term608, 1, 0.26413453F);
        setFloatElement(term608, 2, 0.7944024F);
        term6319 = (float[]) newFloatArray(3);
        setFloatElement(term6319, 0, 0.8783184F);
        setFloatElement(term6319, 1, 0.26413453F);
        setFloatElement(term6319, 2, 0.7944024F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.NumberUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(float.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term608;
        callMethod(klass, "max", argTypes, null, args);
        assertTrue(recursiveEquals(term608, term6319));
    }

};


