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

public class Fraction_reduce_3355035251209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term353153;
     Object term353648;
     Object term353645;

    public Fraction_reduce_3355035251209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term353153 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term353153, term353153.getClass(), "numerator", 14);
        setIntField(term353153, term353153.getClass(), "denominator", 1927281135);
        term353648 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term353648, term353648.getClass(), "numerator", 14);
        setIntField(term353648, term353648.getClass(), "denominator", 1927281135);
        setField(term353648, term353648.getClass(), "toString", null);
        setField(term353648, term353648.getClass(), "toProperString", null);
        term353645 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term353645, term353645.getClass(), "numerator", 14);
        setIntField(term353645, term353645.getClass(), "denominator", 1927281135);
        setField(term353645, term353645.getClass(), "toString", null);
        setField(term353645, term353645.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term353153, args);
        assertTrue(recursiveEquals(term353153, term353648));
        assertTrue(recursiveEquals(retValue, term353645));
    }

};


