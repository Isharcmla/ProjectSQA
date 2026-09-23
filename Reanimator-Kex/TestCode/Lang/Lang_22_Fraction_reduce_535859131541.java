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

public class Fraction_reduce_535859131541 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term166119;
     Object term166884;
     Object term166881;

    public Fraction_reduce_535859131541() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term166119 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term166119, term166119.getClass(), "numerator", -1073741822);
        setIntField(term166119, term166119.getClass(), "denominator", 1758987287);
        term166884 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term166884, term166884.getClass(), "numerator", -1073741822);
        setIntField(term166884, term166884.getClass(), "denominator", 1758987287);
        setField(term166884, term166884.getClass(), "toString", null);
        setField(term166884, term166884.getClass(), "toProperString", null);
        term166881 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term166881, term166881.getClass(), "numerator", -1073741822);
        setIntField(term166881, term166881.getClass(), "denominator", 1758987287);
        setField(term166881, term166881.getClass(), "toString", null);
        setField(term166881, term166881.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term166119, args);
        assertTrue(recursiveEquals(term166119, term166884));
        assertTrue(recursiveEquals(retValue, term166881));
    }

};


