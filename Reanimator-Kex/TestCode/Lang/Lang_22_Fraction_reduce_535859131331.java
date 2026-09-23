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

public class Fraction_reduce_535859131331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92986;
     Object term93496;
     Object term93493;

    public Fraction_reduce_535859131331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term92986 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term92986, term92986.getClass(), "numerator", -1073733514);
        setIntField(term92986, term92986.getClass(), "denominator", 973080621);
        term93496 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term93496, term93496.getClass(), "numerator", -1073733514);
        setIntField(term93496, term93496.getClass(), "denominator", 973080621);
        setField(term93496, term93496.getClass(), "toString", null);
        setField(term93496, term93496.getClass(), "toProperString", null);
        term93493 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term93493, term93493.getClass(), "numerator", -1073733514);
        setIntField(term93493, term93493.getClass(), "denominator", 973080621);
        setField(term93493, term93493.getClass(), "toString", null);
        setField(term93493, term93493.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term92986, args);
        assertTrue(recursiveEquals(term92986, term93496));
        assertTrue(recursiveEquals(retValue, term93493));
    }

};


