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

public class Fraction_reduce_5358591311946 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term634745;
     Object term635668;
     Object term635665;

    public Fraction_reduce_5358591311946() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term634745 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term634745, term634745.getClass(), "numerator", -864406074);
        setIntField(term634745, term634745.getClass(), "denominator", 1633954885);
        term635668 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term635668, term635668.getClass(), "numerator", -864406074);
        setIntField(term635668, term635668.getClass(), "denominator", 1633954885);
        setField(term635668, term635668.getClass(), "toString", null);
        setField(term635668, term635668.getClass(), "toProperString", null);
        term635665 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term635665, term635665.getClass(), "numerator", -864406074);
        setIntField(term635665, term635665.getClass(), "denominator", 1633954885);
        setField(term635665, term635665.getClass(), "toString", null);
        setField(term635665, term635665.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term634745, args);
        assertTrue(recursiveEquals(term634745, term635668));
        assertTrue(recursiveEquals(retValue, term635665));
    }

};


