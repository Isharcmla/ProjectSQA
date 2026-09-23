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

public class Fraction_reduce_5358591312198 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term715518;
     Object term716203;
     Object term716200;

    public Fraction_reduce_5358591312198() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term715518 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term715518, term715518.getClass(), "numerator", -1457684350);
        setIntField(term715518, term715518.getClass(), "denominator", 2125471943);
        term716203 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term716203, term716203.getClass(), "numerator", -1457684350);
        setIntField(term716203, term716203.getClass(), "denominator", 2125471943);
        setField(term716203, term716203.getClass(), "toString", null);
        setField(term716203, term716203.getClass(), "toProperString", null);
        term716200 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term716200, term716200.getClass(), "numerator", -1457684350);
        setIntField(term716200, term716200.getClass(), "denominator", 2125471943);
        setField(term716200, term716200.getClass(), "toString", null);
        setField(term716200, term716200.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term715518, args);
        assertTrue(recursiveEquals(term715518, term716203));
        assertTrue(recursiveEquals(retValue, term716200));
    }

};


