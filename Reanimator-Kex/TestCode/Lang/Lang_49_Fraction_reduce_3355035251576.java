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

public class Fraction_reduce_3355035251576 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term461847;
     Object term463119;
     Object term463113;

    public Fraction_reduce_3355035251576() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term461847 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term461847, term461847.getClass(), "numerator", -855790130);
        setIntField(term461847, term461847.getClass(), "denominator", 847165505);
        term463119 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term463119, term463119.getClass(), "numerator", -855790130);
        setIntField(term463119, term463119.getClass(), "denominator", 847165505);
        setField(term463119, term463119.getClass(), "toString", null);
        setField(term463119, term463119.getClass(), "toProperString", null);
        term463113 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term463113, term463113.getClass(), "numerator", -171158026);
        setIntField(term463113, term463113.getClass(), "denominator", 169433101);
        setField(term463113, term463113.getClass(), "toString", null);
        setField(term463113, term463113.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term461847, args);
        assertTrue(recursiveEquals(term461847, term463119));
        assertTrue(recursiveEquals(retValue, term463113));
    }

};


