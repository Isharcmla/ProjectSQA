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

public class Fraction_reduce_335503525978 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term281182;
     Object term281625;
     Object term281622;

    public Fraction_reduce_335503525978() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term281182 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term281182, term281182.getClass(), "numerator", 30);
        setIntField(term281182, term281182.getClass(), "denominator", 1610612743);
        term281625 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term281625, term281625.getClass(), "numerator", 30);
        setIntField(term281625, term281625.getClass(), "denominator", 1610612743);
        setField(term281625, term281625.getClass(), "toString", null);
        setField(term281625, term281625.getClass(), "toProperString", null);
        term281622 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term281622, term281622.getClass(), "numerator", 30);
        setIntField(term281622, term281622.getClass(), "denominator", 1610612743);
        setField(term281622, term281622.getClass(), "toString", null);
        setField(term281622, term281622.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term281182, args);
        assertTrue(recursiveEquals(term281182, term281625));
        assertTrue(recursiveEquals(retValue, term281622));
    }

};


