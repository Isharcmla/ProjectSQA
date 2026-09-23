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

public class Fraction_reduce_3355035251780 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term520723;
     Object term521335;
     Object term521332;

    public Fraction_reduce_3355035251780() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term520723 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term520723, term520723.getClass(), "numerator", 30);
        setIntField(term520723, term520723.getClass(), "denominator", 1610612743);
        term521335 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term521335, term521335.getClass(), "numerator", 30);
        setIntField(term521335, term521335.getClass(), "denominator", 1610612743);
        setField(term521335, term521335.getClass(), "toString", null);
        setField(term521335, term521335.getClass(), "toProperString", null);
        term521332 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term521332, term521332.getClass(), "numerator", 30);
        setIntField(term521332, term521332.getClass(), "denominator", 1610612743);
        setField(term521332, term521332.getClass(), "toString", null);
        setField(term521332, term521332.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term520723, args);
        assertTrue(recursiveEquals(term520723, term521335));
        assertTrue(recursiveEquals(retValue, term521332));
    }

};


