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

public class Fraction_reduce_335503525433 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term118112;
     Object term118586;
     Object term118583;

    public Fraction_reduce_335503525433() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term118112 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term118112, term118112.getClass(), "numerator", -1825801210);
        setIntField(term118112, term118112.getClass(), "denominator", 169327649);
        term118586 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term118586, term118586.getClass(), "numerator", -1825801210);
        setIntField(term118586, term118586.getClass(), "denominator", 169327649);
        setField(term118586, term118586.getClass(), "toString", null);
        setField(term118586, term118586.getClass(), "toProperString", null);
        term118583 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term118583, term118583.getClass(), "numerator", -1825801210);
        setIntField(term118583, term118583.getClass(), "denominator", 169327649);
        setField(term118583, term118583.getClass(), "toString", null);
        setField(term118583, term118583.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term118112, args);
        assertTrue(recursiveEquals(term118112, term118586));
        assertTrue(recursiveEquals(retValue, term118583));
    }

};


