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

public class Fraction_reduce_535859131818 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term258677;
     Object term259575;
     Object term259572;

    public Fraction_reduce_535859131818() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term258677 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term258677, term258677.getClass(), "numerator", -33478558);
        setIntField(term258677, term258677.getClass(), "denominator", 1887688887);
        term259575 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term259575, term259575.getClass(), "numerator", -33478558);
        setIntField(term259575, term259575.getClass(), "denominator", 1887688887);
        setField(term259575, term259575.getClass(), "toString", null);
        setField(term259575, term259575.getClass(), "toProperString", null);
        term259572 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term259572, term259572.getClass(), "numerator", -33478558);
        setIntField(term259572, term259572.getClass(), "denominator", 1887688887);
        setField(term259572, term259572.getClass(), "toString", null);
        setField(term259572, term259572.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term258677, args);
        assertTrue(recursiveEquals(term258677, term259575));
        assertTrue(recursiveEquals(retValue, term259572));
    }

};


