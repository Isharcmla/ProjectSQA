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

public class Fraction_reduce_3355035252036 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term597959;
     Object term598605;
     Object term598602;

    public Fraction_reduce_3355035252036() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term597959 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term597959, term597959.getClass(), "numerator", -1275797178);
        setIntField(term597959, term597959.getClass(), "denominator", 1475842261);
        term598605 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term598605, term598605.getClass(), "numerator", -1275797178);
        setIntField(term598605, term598605.getClass(), "denominator", 1475842261);
        setField(term598605, term598605.getClass(), "toString", null);
        setField(term598605, term598605.getClass(), "toProperString", null);
        term598602 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term598602, term598602.getClass(), "numerator", -1275797178);
        setIntField(term598602, term598602.getClass(), "denominator", 1475842261);
        setField(term598602, term598602.getClass(), "toString", null);
        setField(term598602, term598602.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term597959, args);
        assertTrue(recursiveEquals(term597959, term598605));
        assertTrue(recursiveEquals(retValue, term598602));
    }

};


