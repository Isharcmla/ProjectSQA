package org.apache.commons.lang3.math;

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
import static org.apache.commons.lang3.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.math.EqualityUtils.*;

public class NumberUtils_max_184329359779 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term554;
     Object term7019;

    public NumberUtils_max_184329359779() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term554 = (float[]) newFloatArray(5);
        setFloatElement(term554, 0, 0.5254275F);
        setFloatElement(term554, 1, 0.2857073F);
        setFloatElement(term554, 2, 0.6880585F);
        setFloatElement(term554, 3, 0.40176582F);
        setFloatElement(term554, 4, 0.8783184F);
        term7019 = (float[]) newFloatArray(5);
        setFloatElement(term7019, 0, 0.5254275F);
        setFloatElement(term7019, 1, 0.2857073F);
        setFloatElement(term7019, 2, 0.6880585F);
        setFloatElement(term7019, 3, 0.40176582F);
        setFloatElement(term7019, 4, 0.8783184F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.NumberUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(float.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term554;
        Object retValue = callMethod(klass, "max", argTypes, null, args);
        assertTrue(recursiveEquals(term554, term7019));
        assertTrue(recursiveEquals(retValue, 0.8783184F));
    }

};


