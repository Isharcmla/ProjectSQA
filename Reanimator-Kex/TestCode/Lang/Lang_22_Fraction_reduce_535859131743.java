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

public class Fraction_reduce_535859131743 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term234930;
     Object term235930;
     Object term235927;

    public Fraction_reduce_535859131743() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term234930 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term234930, term234930.getClass(), "numerator", -2012708306);
        setIntField(term234930, term234930.getClass(), "denominator", 1870591953);
        term235930 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term235930, term235930.getClass(), "numerator", -2012708306);
        setIntField(term235930, term235930.getClass(), "denominator", 1870591953);
        setField(term235930, term235930.getClass(), "toString", null);
        setField(term235930, term235930.getClass(), "toProperString", null);
        term235927 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term235927, term235927.getClass(), "numerator", -2012708306);
        setIntField(term235927, term235927.getClass(), "denominator", 1870591953);
        setField(term235927, term235927.getClass(), "toString", null);
        setField(term235927, term235927.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term234930, args);
        assertTrue(recursiveEquals(term234930, term235930));
        assertTrue(recursiveEquals(retValue, term235927));
    }

};


