package org.apache.commons.lang3.math;

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
import static org.apache.commons.lang3.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.math.EqualityUtils.*;

public class Fraction_invert_85732523749 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term466;
     Object term3322;
     Object term3292;

    public Fraction_invert_85732523749() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term466 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term466, term466.getClass(), "numerator", -1530420153);
        setIntField(term466, term466.getClass(), "denominator", -469968304);
        setField(term466, term466.getClass(), "toString", "pCTimMblYc");
        setField(term466, term466.getClass(), "toProperString", "hNxWaHcfhY");
        term3322 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term3322, term3322.getClass(), "numerator", -1530420153);
        setIntField(term3322, term3322.getClass(), "denominator", -469968304);
        setField(term3322, term3322.getClass(), "toString", "pCTimMblYc");
        setField(term3322, term3322.getClass(), "toProperString", "hNxWaHcfhY");
        term3292 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term3292, term3292.getClass(), "numerator", 469968304);
        setIntField(term3292, term3292.getClass(), "denominator", 1530420153);
        setField(term3292, term3292.getClass(), "toString", null);
        setField(term3292, term3292.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "invert", argTypes, term466, args);
        assertTrue(recursiveEquals(term466, term3322));
        assertTrue(recursiveEquals(retValue, term3292));
    }

};


