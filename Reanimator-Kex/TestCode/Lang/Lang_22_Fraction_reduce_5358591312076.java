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

public class Fraction_reduce_5358591312076 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term676144;
     Object term676999;
     Object term676993;

    public Fraction_reduce_5358591312076() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term676144 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term676144, term676144.getClass(), "numerator", -499029462);
        setIntField(term676144, term676144.getClass(), "denominator", 1932833811);
        term676999 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term676999, term676999.getClass(), "numerator", -499029462);
        setIntField(term676999, term676999.getClass(), "denominator", 1932833811);
        setField(term676999, term676999.getClass(), "toString", null);
        setField(term676999, term676999.getClass(), "toProperString", null);
        term676993 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term676993, term676993.getClass(), "numerator", -166343154);
        setIntField(term676993, term676993.getClass(), "denominator", 644277937);
        setField(term676993, term676993.getClass(), "toString", null);
        setField(term676993, term676993.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term676144, args);
        assertTrue(recursiveEquals(term676144, term676999));
        assertTrue(recursiveEquals(retValue, term676993));
    }

};


