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

public class Fraction_reduce_3355035252622 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term782262;
     Object term782676;
     Object term782670;

    public Fraction_reduce_3355035252622() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term782262 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term782262, term782262.getClass(), "numerator", -577814202);
        setIntField(term782262, term782262.getClass(), "denominator", 154687641);
        term782676 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term782676, term782676.getClass(), "numerator", -577814202);
        setIntField(term782676, term782676.getClass(), "denominator", 154687641);
        setField(term782676, term782676.getClass(), "toString", null);
        setField(term782676, term782676.getClass(), "toProperString", null);
        term782670 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term782670, term782670.getClass(), "numerator", -192604734);
        setIntField(term782670, term782670.getClass(), "denominator", 51562547);
        setField(term782670, term782670.getClass(), "toString", null);
        setField(term782670, term782670.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term782262, args);
        assertTrue(recursiveEquals(term782262, term782676));
        assertTrue(recursiveEquals(retValue, term782670));
    }

};


