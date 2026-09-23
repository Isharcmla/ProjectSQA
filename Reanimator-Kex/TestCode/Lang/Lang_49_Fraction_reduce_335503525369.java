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

public class Fraction_reduce_335503525369 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term98505;
     Object term99025;
     Object term99022;

    public Fraction_reduce_335503525369() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term98505 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term98505, term98505.getClass(), "numerator", 112732322);
        setIntField(term98505, term98505.getClass(), "denominator", 291588889);
        term99025 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term99025, term99025.getClass(), "numerator", 112732322);
        setIntField(term99025, term99025.getClass(), "denominator", 291588889);
        setField(term99025, term99025.getClass(), "toString", null);
        setField(term99025, term99025.getClass(), "toProperString", null);
        term99022 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term99022, term99022.getClass(), "numerator", 112732322);
        setIntField(term99022, term99022.getClass(), "denominator", 291588889);
        setField(term99022, term99022.getClass(), "toString", null);
        setField(term99022, term99022.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term98505, args);
        assertTrue(recursiveEquals(term98505, term99025));
        assertTrue(recursiveEquals(retValue, term99022));
    }

};


