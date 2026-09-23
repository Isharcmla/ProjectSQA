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

public class Fraction_subtract_2650031231290 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term418127;
     Object term418209;
     Object term418713;
     Object term418714;
     Object term418710;

    public Fraction_subtract_2650031231290() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term418127 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term418127, term418127.getClass(), "numerator", 16);
        setIntField(term418127, term418127.getClass(), "denominator", -589832);
        term418209 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term418209, term418209.getClass(), "numerator", 64);
        setIntField(term418209, term418209.getClass(), "denominator", 491484);
        term418713 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term418713, term418713.getClass(), "numerator", 16);
        setIntField(term418713, term418713.getClass(), "denominator", -589832);
        setField(term418713, term418713.getClass(), "toString", null);
        setField(term418713, term418713.getClass(), "toProperString", null);
        term418714 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term418714, term418714.getClass(), "numerator", 64);
        setIntField(term418714, term418714.getClass(), "denominator", 491484);
        setField(term418714, term418714.getClass(), "toString", null);
        setField(term418714, term418714.getClass(), "toProperString", null);
        term418710 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term418710, term418710.getClass(), "numerator", 2850812);
        setIntField(term418710, term418710.getClass(), "denominator", -938442734);
        setField(term418710, term418710.getClass(), "toString", null);
        setField(term418710, term418710.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang3.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term418209;
        Object retValue = callMethod(klass, "subtract", argTypes, term418127, args);
        assertTrue(recursiveEquals(term418127, term418713));
        assertTrue(recursiveEquals(term418209, term418714));
        assertTrue(recursiveEquals(retValue, term418710));
    }

};


