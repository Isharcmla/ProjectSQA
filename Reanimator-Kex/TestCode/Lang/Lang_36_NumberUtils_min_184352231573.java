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

public class NumberUtils_min_184352231573 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term492;
     Object term6839;

    public NumberUtils_min_184352231573() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term492 = (float[]) newFloatArray(6);
        setFloatElement(term492, 0, 0.2707036F);
        setFloatElement(term492, 1, 0.3455959F);
        setFloatElement(term492, 2, 0.09123778F);
        setFloatElement(term492, 3, 0.5523636F);
        setFloatElement(term492, 4, 0.8564069F);
        setFloatElement(term492, 5, 0.5446086F);
        term6839 = (float[]) newFloatArray(6);
        setFloatElement(term6839, 0, 0.2707036F);
        setFloatElement(term6839, 1, 0.3455959F);
        setFloatElement(term6839, 2, 0.09123778F);
        setFloatElement(term6839, 3, 0.5523636F);
        setFloatElement(term6839, 4, 0.8564069F);
        setFloatElement(term6839, 5, 0.5446086F);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.NumberUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(float.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term492;
        Object retValue = callMethod(klass, "min", argTypes, null, args);
        assertTrue(recursiveEquals(term492, term6839));
        assertTrue(recursiveEquals(retValue, 0.09123778F));
    }

};


