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

public class Fraction_reduce_3355035251982 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term582290;
     Object term583220;
     Object term583214;

    public Fraction_reduce_3355035251982() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term582290 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term582290, term582290.getClass(), "numerator", -1385121290);
        setIntField(term582290, term582290.getClass(), "denominator", 1791140605);
        term583220 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term583220, term583220.getClass(), "numerator", -1385121290);
        setIntField(term583220, term583220.getClass(), "denominator", 1791140605);
        setField(term583220, term583220.getClass(), "toString", null);
        setField(term583220, term583220.getClass(), "toProperString", null);
        term583214 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term583214, term583214.getClass(), "numerator", -277024258);
        setIntField(term583214, term583214.getClass(), "denominator", 358228121);
        setField(term583214, term583214.getClass(), "toString", null);
        setField(term583214, term583214.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term582290, args);
        assertTrue(recursiveEquals(term582290, term583220));
        assertTrue(recursiveEquals(retValue, term583214));
    }

};


