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

public class Fraction_reduce_3355035252700 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term805365;
     Object term806306;
     Object term806303;

    public Fraction_reduce_3355035252700() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term805365 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term805365, term805365.getClass(), "numerator", 790558466);
        setIntField(term805365, term805365.getClass(), "denominator", 209324353);
        term806306 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term806306, term806306.getClass(), "numerator", 790558466);
        setIntField(term806306, term806306.getClass(), "denominator", 209324353);
        setField(term806306, term806306.getClass(), "toString", null);
        setField(term806306, term806306.getClass(), "toProperString", null);
        term806303 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term806303, term806303.getClass(), "numerator", 790558466);
        setIntField(term806303, term806303.getClass(), "denominator", 209324353);
        setField(term806303, term806303.getClass(), "toString", null);
        setField(term806303, term806303.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term805365, args);
        assertTrue(recursiveEquals(term805365, term806306));
        assertTrue(recursiveEquals(retValue, term806303));
    }

};


