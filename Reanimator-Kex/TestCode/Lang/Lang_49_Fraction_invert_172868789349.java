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

public class Fraction_invert_172868789349 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term466;
     Object term3275;
     Object term3245;

    public Fraction_invert_172868789349() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term466 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term466, term466.getClass(), "numerator", -1530420153);
        setIntField(term466, term466.getClass(), "denominator", -469968304);
        setField(term466, term466.getClass(), "toString", "pCTimMblYc");
        setField(term466, term466.getClass(), "toProperString", "hNxWaHcfhY");
        term3275 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term3275, term3275.getClass(), "numerator", -1530420153);
        setIntField(term3275, term3275.getClass(), "denominator", -469968304);
        setField(term3275, term3275.getClass(), "toString", "pCTimMblYc");
        setField(term3275, term3275.getClass(), "toProperString", "hNxWaHcfhY");
        term3245 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term3245, term3245.getClass(), "numerator", 469968304);
        setIntField(term3245, term3245.getClass(), "denominator", 1530420153);
        setField(term3245, term3245.getClass(), "toString", null);
        setField(term3245, term3245.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "invert", argTypes, term466, args);
        assertTrue(recursiveEquals(term466, term3275));
        assertTrue(recursiveEquals(retValue, term3245));
    }

};


