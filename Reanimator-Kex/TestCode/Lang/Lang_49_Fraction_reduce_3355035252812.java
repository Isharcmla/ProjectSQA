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

public class Fraction_reduce_3355035252812 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term840546;
     Object term841038;
     Object term841035;

    public Fraction_reduce_3355035252812() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term840546 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term840546, term840546.getClass(), "numerator", -1303149562);
        setIntField(term840546, term840546.getClass(), "denominator", 382518077);
        term841038 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term841038, term841038.getClass(), "numerator", -1303149562);
        setIntField(term841038, term841038.getClass(), "denominator", 382518077);
        setField(term841038, term841038.getClass(), "toString", null);
        setField(term841038, term841038.getClass(), "toProperString", null);
        term841035 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term841035, term841035.getClass(), "numerator", -1303149562);
        setIntField(term841035, term841035.getClass(), "denominator", 382518077);
        setField(term841035, term841035.getClass(), "toString", null);
        setField(term841035, term841035.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term840546, args);
        assertTrue(recursiveEquals(term840546, term841038));
        assertTrue(recursiveEquals(retValue, term841035));
    }

};


