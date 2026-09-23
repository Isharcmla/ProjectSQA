package org.apache.commons.lang.math;

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
import static org.apache.commons.lang.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang.math.EqualityUtils.*;

public class Fraction_reduce_335503525757 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term211547;
     Object term211645;
     Object term211642;

    public Fraction_reduce_335503525757() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term211547 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term211547, term211547.getClass(), "numerator", -372932014);
        setIntField(term211547, term211547.getClass(), "denominator", 1638695743);
        term211645 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term211645, term211645.getClass(), "numerator", -372932014);
        setIntField(term211645, term211645.getClass(), "denominator", 1638695743);
        setField(term211645, term211645.getClass(), "toString", null);
        setField(term211645, term211645.getClass(), "toProperString", null);
        term211642 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term211642, term211642.getClass(), "numerator", -372932014);
        setIntField(term211642, term211642.getClass(), "denominator", 1638695743);
        setField(term211642, term211642.getClass(), "toString", null);
        setField(term211642, term211642.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term211547, args);
        assertTrue(recursiveEquals(term211547, term211645));
        assertTrue(recursiveEquals(retValue, term211642));
    }

};


