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

public class Fraction_reduce_535859131310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term87322;
     Object term87658;
     Object term87652;

    public Fraction_reduce_535859131310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term87322 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term87322, term87322.getClass(), "numerator", -2139029502);
        setIntField(term87322, term87322.getClass(), "denominator", 2069868231);
        term87658 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term87658, term87658.getClass(), "numerator", -2139029502);
        setIntField(term87658, term87658.getClass(), "denominator", 2069868231);
        setField(term87658, term87658.getClass(), "toString", null);
        setField(term87658, term87658.getClass(), "toProperString", null);
        term87652 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term87652, term87652.getClass(), "numerator", -713009834);
        setIntField(term87652, term87652.getClass(), "denominator", 689956077);
        setField(term87652, term87652.getClass(), "toString", null);
        setField(term87652, term87652.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term87322, args);
        assertTrue(recursiveEquals(term87322, term87658));
        assertTrue(recursiveEquals(retValue, term87652));
    }

};


