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

public class Fraction_reduce_5358591311743 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term565851;
     Object term566751;
     Object term566748;

    public Fraction_reduce_5358591311743() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term565851 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term565851, term565851.getClass(), "numerator", -863368722);
        setIntField(term565851, term565851.getClass(), "denominator", 1774394497);
        term566751 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term566751, term566751.getClass(), "numerator", -863368722);
        setIntField(term566751, term566751.getClass(), "denominator", 1774394497);
        setField(term566751, term566751.getClass(), "toString", null);
        setField(term566751, term566751.getClass(), "toProperString", null);
        term566748 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term566748, term566748.getClass(), "numerator", -863368722);
        setIntField(term566748, term566748.getClass(), "denominator", 1774394497);
        setField(term566748, term566748.getClass(), "toString", null);
        setField(term566748, term566748.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term565851, args);
        assertTrue(recursiveEquals(term565851, term566751));
        assertTrue(recursiveEquals(retValue, term566748));
    }

};


