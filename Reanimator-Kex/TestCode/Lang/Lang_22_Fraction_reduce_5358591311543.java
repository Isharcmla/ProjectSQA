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

public class Fraction_reduce_5358591311543 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term501853;
     Object term502697;
     Object term502694;

    public Fraction_reduce_5358591311543() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term501853 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term501853, term501853.getClass(), "numerator", -303813038);
        setIntField(term501853, term501853.getClass(), "denominator", 1954619327);
        term502697 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term502697, term502697.getClass(), "numerator", -303813038);
        setIntField(term502697, term502697.getClass(), "denominator", 1954619327);
        setField(term502697, term502697.getClass(), "toString", null);
        setField(term502697, term502697.getClass(), "toProperString", null);
        term502694 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term502694, term502694.getClass(), "numerator", -303813038);
        setIntField(term502694, term502694.getClass(), "denominator", 1954619327);
        setField(term502694, term502694.getClass(), "toString", null);
        setField(term502694, term502694.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term501853, args);
        assertTrue(recursiveEquals(term501853, term502697));
        assertTrue(recursiveEquals(retValue, term502694));
    }

};


