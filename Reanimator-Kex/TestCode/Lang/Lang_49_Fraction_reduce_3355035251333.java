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

public class Fraction_reduce_3355035251333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term390112;
     Object term390622;
     Object term390619;

    public Fraction_reduce_3355035251333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term390112 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term390112, term390112.getClass(), "numerator", -1753381314);
        setIntField(term390112, term390112.getClass(), "denominator", 2116968137);
        term390622 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term390622, term390622.getClass(), "numerator", -1753381314);
        setIntField(term390622, term390622.getClass(), "denominator", 2116968137);
        setField(term390622, term390622.getClass(), "toString", null);
        setField(term390622, term390622.getClass(), "toProperString", null);
        term390619 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term390619, term390619.getClass(), "numerator", -1753381314);
        setIntField(term390619, term390619.getClass(), "denominator", 2116968137);
        setField(term390619, term390619.getClass(), "toString", null);
        setField(term390619, term390619.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term390112, args);
        assertTrue(recursiveEquals(term390112, term390622));
        assertTrue(recursiveEquals(retValue, term390619));
    }

};


