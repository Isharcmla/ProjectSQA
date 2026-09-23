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

public class Fraction_reduce_535859131678 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term214344;
     Object term215301;
     Object term215298;

    public Fraction_reduce_535859131678() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term214344 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term214344, term214344.getClass(), "numerator", -503872110);
        setIntField(term214344, term214344.getClass(), "denominator", 536870959);
        term215301 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term215301, term215301.getClass(), "numerator", -503872110);
        setIntField(term215301, term215301.getClass(), "denominator", 536870959);
        setField(term215301, term215301.getClass(), "toString", null);
        setField(term215301, term215301.getClass(), "toProperString", null);
        term215298 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term215298, term215298.getClass(), "numerator", -503872110);
        setIntField(term215298, term215298.getClass(), "denominator", 536870959);
        setField(term215298, term215298.getClass(), "toString", null);
        setField(term215298, term215298.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term214344, args);
        assertTrue(recursiveEquals(term214344, term215301));
        assertTrue(recursiveEquals(retValue, term215298));
    }

};


