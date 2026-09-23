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

public class Fraction_reduce_3355035252492 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term741881;
     Object term742775;
     Object term742772;

    public Fraction_reduce_3355035252492() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term741881 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term741881, term741881.getClass(), "numerator", 44298706);
        setIntField(term741881, term741881.getClass(), "denominator", 798218273);
        term742775 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term742775, term742775.getClass(), "numerator", 44298706);
        setIntField(term742775, term742775.getClass(), "denominator", 798218273);
        setField(term742775, term742775.getClass(), "toString", null);
        setField(term742775, term742775.getClass(), "toProperString", null);
        term742772 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term742772, term742772.getClass(), "numerator", 44298706);
        setIntField(term742772, term742772.getClass(), "denominator", 798218273);
        setField(term742772, term742772.getClass(), "toString", null);
        setField(term742772, term742772.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term741881, args);
        assertTrue(recursiveEquals(term741881, term742775));
        assertTrue(recursiveEquals(retValue, term742772));
    }

};


