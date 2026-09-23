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

public class Fraction_reduce_3355035251427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term417117;
     Object term417598;
     Object term417595;

    public Fraction_reduce_3355035251427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term417117 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term417117, term417117.getClass(), "numerator", 30);
        setIntField(term417117, term417117.getClass(), "denominator", 1073741831);
        term417598 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term417598, term417598.getClass(), "numerator", 30);
        setIntField(term417598, term417598.getClass(), "denominator", 1073741831);
        setField(term417598, term417598.getClass(), "toString", null);
        setField(term417598, term417598.getClass(), "toProperString", null);
        term417595 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term417595, term417595.getClass(), "numerator", 30);
        setIntField(term417595, term417595.getClass(), "denominator", 1073741831);
        setField(term417595, term417595.getClass(), "toString", null);
        setField(term417595, term417595.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term417117, args);
        assertTrue(recursiveEquals(term417117, term417598));
        assertTrue(recursiveEquals(retValue, term417595));
    }

};


