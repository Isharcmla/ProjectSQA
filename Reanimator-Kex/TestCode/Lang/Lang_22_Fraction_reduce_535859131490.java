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

public class Fraction_reduce_535859131490 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term149025;
     Object term149869;
     Object term149863;

    public Fraction_reduce_535859131490() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term149025 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term149025, term149025.getClass(), "numerator", -729006058);
        setIntField(term149025, term149025.getClass(), "denominator", 1111902253);
        term149869 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term149869, term149869.getClass(), "numerator", -729006058);
        setIntField(term149869, term149869.getClass(), "denominator", 1111902253);
        setField(term149869, term149869.getClass(), "toString", null);
        setField(term149869, term149869.getClass(), "toProperString", null);
        term149863 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term149863, term149863.getClass(), "numerator", -66273278);
        setIntField(term149863, term149863.getClass(), "denominator", 101082023);
        setField(term149863, term149863.getClass(), "toString", null);
        setField(term149863, term149863.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term149025, args);
        assertTrue(recursiveEquals(term149025, term149869));
        assertTrue(recursiveEquals(retValue, term149863));
    }

};


