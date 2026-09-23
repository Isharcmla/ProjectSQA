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

public class Fraction_reduce_535859131593 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term183755;
     Object term184633;
     Object term184630;

    public Fraction_reduce_535859131593() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term183755 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term183755, term183755.getClass(), "numerator", 589100482);
        setIntField(term183755, term183755.getClass(), "denominator", 1760699737);
        term184633 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term184633, term184633.getClass(), "numerator", 589100482);
        setIntField(term184633, term184633.getClass(), "denominator", 1760699737);
        setField(term184633, term184633.getClass(), "toString", null);
        setField(term184633, term184633.getClass(), "toProperString", null);
        term184630 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term184630, term184630.getClass(), "numerator", 589100482);
        setIntField(term184630, term184630.getClass(), "denominator", 1760699737);
        setField(term184630, term184630.getClass(), "toString", null);
        setField(term184630, term184630.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term183755, args);
        assertTrue(recursiveEquals(term183755, term184633));
        assertTrue(recursiveEquals(retValue, term184630));
    }

};


