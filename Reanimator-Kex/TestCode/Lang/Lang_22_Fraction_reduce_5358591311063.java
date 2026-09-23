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

public class Fraction_reduce_5358591311063 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term341762;
     Object term342300;
     Object term342294;

    public Fraction_reduce_5358591311063() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term341762 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term341762, term341762.getClass(), "numerator", -939523250);
        setIntField(term341762, term341762.getClass(), "denominator", 916785185);
        term342300 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term342300, term342300.getClass(), "numerator", -939523250);
        setIntField(term342300, term342300.getClass(), "denominator", 916785185);
        setField(term342300, term342300.getClass(), "toString", null);
        setField(term342300, term342300.getClass(), "toProperString", null);
        term342294 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term342294, term342294.getClass(), "numerator", -187904650);
        setIntField(term342294, term342294.getClass(), "denominator", 183357037);
        setField(term342294, term342294.getClass(), "toString", null);
        setField(term342294, term342294.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term341762, args);
        assertTrue(recursiveEquals(term341762, term342300));
        assertTrue(recursiveEquals(retValue, term342294));
    }

};


