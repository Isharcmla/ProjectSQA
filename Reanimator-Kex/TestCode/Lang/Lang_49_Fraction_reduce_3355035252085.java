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

public class Fraction_reduce_3355035252085 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term615037;
     Object term615257;
     Object term615254;

    public Fraction_reduce_3355035252085() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term615037 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term615037, term615037.getClass(), "numerator", -1476395070);
        setIntField(term615037, term615037.getClass(), "denominator", 1073741863);
        term615257 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term615257, term615257.getClass(), "numerator", -1476395070);
        setIntField(term615257, term615257.getClass(), "denominator", 1073741863);
        setField(term615257, term615257.getClass(), "toString", null);
        setField(term615257, term615257.getClass(), "toProperString", null);
        term615254 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term615254, term615254.getClass(), "numerator", -1476395070);
        setIntField(term615254, term615254.getClass(), "denominator", 1073741863);
        setField(term615254, term615254.getClass(), "toString", null);
        setField(term615254, term615254.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term615037, args);
        assertTrue(recursiveEquals(term615037, term615257));
        assertTrue(recursiveEquals(retValue, term615254));
    }

};


