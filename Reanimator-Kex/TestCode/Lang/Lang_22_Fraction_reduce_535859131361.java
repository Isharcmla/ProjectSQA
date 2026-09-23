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

public class Fraction_reduce_535859131361 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103597;
     Object term103699;
     Object term103696;

    public Fraction_reduce_535859131361() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term103597 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term103597, term103597.getClass(), "numerator", -870004210);
        setIntField(term103597, term103597.getClass(), "denominator", 1124423121);
        term103699 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term103699, term103699.getClass(), "numerator", -870004210);
        setIntField(term103699, term103699.getClass(), "denominator", 1124423121);
        setField(term103699, term103699.getClass(), "toString", null);
        setField(term103699, term103699.getClass(), "toProperString", null);
        term103696 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term103696, term103696.getClass(), "numerator", -870004210);
        setIntField(term103696, term103696.getClass(), "denominator", 1124423121);
        setField(term103696, term103696.getClass(), "toString", null);
        setField(term103696, term103696.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term103597, args);
        assertTrue(recursiveEquals(term103597, term103699));
        assertTrue(recursiveEquals(retValue, term103696));
    }

};


