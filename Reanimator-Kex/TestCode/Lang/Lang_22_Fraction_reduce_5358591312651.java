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

public class Fraction_reduce_5358591312651 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term867465;
     Object term868518;
     Object term868515;

    public Fraction_reduce_5358591312651() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term867465 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term867465, term867465.getClass(), "numerator", 1172179714);
        setIntField(term867465, term867465.getClass(), "denominator", 1722829177);
        term868518 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term868518, term868518.getClass(), "numerator", 1172179714);
        setIntField(term868518, term868518.getClass(), "denominator", 1722829177);
        setField(term868518, term868518.getClass(), "toString", null);
        setField(term868518, term868518.getClass(), "toProperString", null);
        term868515 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term868515, term868515.getClass(), "numerator", 1172179714);
        setIntField(term868515, term868515.getClass(), "denominator", 1722829177);
        setField(term868515, term868515.getClass(), "toString", null);
        setField(term868515, term868515.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term867465, args);
        assertTrue(recursiveEquals(term867465, term868518));
        assertTrue(recursiveEquals(retValue, term868515));
    }

};


