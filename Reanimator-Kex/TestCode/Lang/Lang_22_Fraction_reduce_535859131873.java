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

public class Fraction_reduce_535859131873 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term279014;
     Object term279118;
     Object term279112;

    public Fraction_reduce_535859131873() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term279014 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term279014, term279014.getClass(), "numerator", -805219294);
        setIntField(term279014, term279014.getClass(), "denominator", 537387015);
        term279118 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term279118, term279118.getClass(), "numerator", -805219294);
        setIntField(term279118, term279118.getClass(), "denominator", 537387015);
        setField(term279118, term279118.getClass(), "toString", null);
        setField(term279118, term279118.getClass(), "toProperString", null);
        term279112 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term279112, term279112.getClass(), "numerator", -73201754);
        setIntField(term279112, term279112.getClass(), "denominator", 48853365);
        setField(term279112, term279112.getClass(), "toString", null);
        setField(term279112, term279112.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term279014, args);
        assertTrue(recursiveEquals(term279014, term279118));
        assertTrue(recursiveEquals(retValue, term279112));
    }

};


