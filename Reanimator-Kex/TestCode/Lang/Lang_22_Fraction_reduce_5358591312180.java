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

public class Fraction_reduce_5358591312180 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term709706;
     Object term710513;
     Object term710510;

    public Fraction_reduce_5358591312180() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term709706 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term709706, term709706.getClass(), "numerator", -2145947646);
        setIntField(term709706, term709706.getClass(), "denominator", 2134159687);
        term710513 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term710513, term710513.getClass(), "numerator", -2145947646);
        setIntField(term710513, term710513.getClass(), "denominator", 2134159687);
        setField(term710513, term710513.getClass(), "toString", null);
        setField(term710513, term710513.getClass(), "toProperString", null);
        term710510 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term710510, term710510.getClass(), "numerator", -2145947646);
        setIntField(term710510, term710510.getClass(), "denominator", 2134159687);
        setField(term710510, term710510.getClass(), "toString", null);
        setField(term710510, term710510.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term709706, args);
        assertTrue(recursiveEquals(term709706, term710513));
        assertTrue(recursiveEquals(retValue, term710510));
    }

};


