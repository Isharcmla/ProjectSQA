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

public class Fraction_reduce_5358591311822 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term594047;
     Object term595020;
     Object term595017;

    public Fraction_reduce_5358591311822() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term594047 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term594047, term594047.getClass(), "numerator", -1004132030);
        setIntField(term594047, term594047.getClass(), "denominator", 654185863);
        term595020 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term595020, term595020.getClass(), "numerator", -1004132030);
        setIntField(term595020, term595020.getClass(), "denominator", 654185863);
        setField(term595020, term595020.getClass(), "toString", null);
        setField(term595020, term595020.getClass(), "toProperString", null);
        term595017 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term595017, term595017.getClass(), "numerator", -1004132030);
        setIntField(term595017, term595017.getClass(), "denominator", 654185863);
        setField(term595017, term595017.getClass(), "toString", null);
        setField(term595017, term595017.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term594047, args);
        assertTrue(recursiveEquals(term594047, term595020));
        assertTrue(recursiveEquals(retValue, term595017));
    }

};


