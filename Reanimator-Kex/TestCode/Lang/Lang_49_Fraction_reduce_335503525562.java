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

public class Fraction_reduce_335503525562 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term154804;
     Object term155358;
     Object term155355;

    public Fraction_reduce_335503525562() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term154804 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term154804, term154804.getClass(), "numerator", 319258226);
        setIntField(term154804, term154804.getClass(), "denominator", 1617977681);
        term155358 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term155358, term155358.getClass(), "numerator", 319258226);
        setIntField(term155358, term155358.getClass(), "denominator", 1617977681);
        setField(term155358, term155358.getClass(), "toString", null);
        setField(term155358, term155358.getClass(), "toProperString", null);
        term155355 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term155355, term155355.getClass(), "numerator", 319258226);
        setIntField(term155355, term155355.getClass(), "denominator", 1617977681);
        setField(term155355, term155355.getClass(), "toString", null);
        setField(term155355, term155355.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term154804, args);
        assertTrue(recursiveEquals(term154804, term155358));
        assertTrue(recursiveEquals(retValue, term155355));
    }

};


