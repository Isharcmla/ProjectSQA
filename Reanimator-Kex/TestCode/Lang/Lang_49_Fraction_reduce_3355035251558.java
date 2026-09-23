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

public class Fraction_reduce_3355035251558 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term458110;
     Object term458554;
     Object term458551;

    public Fraction_reduce_3355035251558() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term458110 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term458110, term458110.getClass(), "numerator", -242414614);
        setIntField(term458110, term458110.getClass(), "denominator", 1460129783);
        term458554 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term458554, term458554.getClass(), "numerator", -242414614);
        setIntField(term458554, term458554.getClass(), "denominator", 1460129783);
        setField(term458554, term458554.getClass(), "toString", null);
        setField(term458554, term458554.getClass(), "toProperString", null);
        term458551 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term458551, term458551.getClass(), "numerator", -242414614);
        setIntField(term458551, term458551.getClass(), "denominator", 1460129783);
        setField(term458551, term458551.getClass(), "toString", null);
        setField(term458551, term458551.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term458110, args);
        assertTrue(recursiveEquals(term458110, term458554));
        assertTrue(recursiveEquals(retValue, term458551));
    }

};


