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

public class Fraction_reduce_3355035252720 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term810775;
     Object term811211;
     Object term811205;

    public Fraction_reduce_3355035252720() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term810775 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term810775, term810775.getClass(), "numerator", -2117323674);
        setIntField(term810775, term810775.getClass(), "denominator", 1161750597);
        term811211 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term811211, term811211.getClass(), "numerator", -2117323674);
        setIntField(term811211, term811211.getClass(), "denominator", 1161750597);
        setField(term811211, term811211.getClass(), "toString", null);
        setField(term811211, term811211.getClass(), "toProperString", null);
        term811205 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term811205, term811205.getClass(), "numerator", -705774558);
        setIntField(term811205, term811205.getClass(), "denominator", 387250199);
        setField(term811205, term811205.getClass(), "toString", null);
        setField(term811205, term811205.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term810775, args);
        assertTrue(recursiveEquals(term810775, term811211));
        assertTrue(recursiveEquals(retValue, term811205));
    }

};


