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

public class Fraction_reduce_3355035251995 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term587031;
     Object term587173;
     Object term587170;

    public Fraction_reduce_3355035251995() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term587031 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term587031, term587031.getClass(), "numerator", 30);
        setIntField(term587031, term587031.getClass(), "denominator", 1073741831);
        term587173 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term587173, term587173.getClass(), "numerator", 30);
        setIntField(term587173, term587173.getClass(), "denominator", 1073741831);
        setField(term587173, term587173.getClass(), "toString", null);
        setField(term587173, term587173.getClass(), "toProperString", null);
        term587170 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term587170, term587170.getClass(), "numerator", 30);
        setIntField(term587170, term587170.getClass(), "denominator", 1073741831);
        setField(term587170, term587170.getClass(), "toString", null);
        setField(term587170, term587170.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term587031, args);
        assertTrue(recursiveEquals(term587031, term587173));
        assertTrue(recursiveEquals(retValue, term587170));
    }

};


