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

public class Fraction_reduce_3355035252824 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term843545;
     Object term844339;
     Object term844333;

    public Fraction_reduce_3355035252824() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term843545 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term843545, term843545.getClass(), "numerator", 616567086);
        setIntField(term843545, term843545.getClass(), "denominator", 64);
        term844339 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term844339, term844339.getClass(), "numerator", 616567086);
        setIntField(term844339, term844339.getClass(), "denominator", 64);
        setField(term844339, term844339.getClass(), "toString", null);
        setField(term844339, term844339.getClass(), "toProperString", null);
        term844333 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term844333, term844333.getClass(), "numerator", 308283543);
        setIntField(term844333, term844333.getClass(), "denominator", 32);
        setField(term844333, term844333.getClass(), "toString", null);
        setField(term844333, term844333.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term843545, args);
        assertTrue(recursiveEquals(term843545, term844339));
        assertTrue(recursiveEquals(retValue, term844333));
    }

};


