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

public class Fraction_reduce_3355035251994 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term586286;
     Object term587102;
     Object term587099;

    public Fraction_reduce_3355035251994() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term586286 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term586286, term586286.getClass(), "numerator", 30);
        setIntField(term586286, term586286.getClass(), "denominator", 1073741831);
        term587102 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term587102, term587102.getClass(), "numerator", 30);
        setIntField(term587102, term587102.getClass(), "denominator", 1073741831);
        setField(term587102, term587102.getClass(), "toString", null);
        setField(term587102, term587102.getClass(), "toProperString", null);
        term587099 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term587099, term587099.getClass(), "numerator", 30);
        setIntField(term587099, term587099.getClass(), "denominator", 1073741831);
        setField(term587099, term587099.getClass(), "toString", null);
        setField(term587099, term587099.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term586286, args);
        assertTrue(recursiveEquals(term586286, term587102));
        assertTrue(recursiveEquals(retValue, term587099));
    }

};


