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

public class Fraction_reduce_535859131700 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term221400;
     Object term222345;
     Object term222339;

    public Fraction_reduce_535859131700() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term221400 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term221400, term221400.getClass(), "numerator", 16075410);
        setIntField(term221400, term221400.getClass(), "denominator", 990193697);
        term222345 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term222345, term222345.getClass(), "numerator", 16075410);
        setIntField(term222345, term222345.getClass(), "denominator", 990193697);
        setField(term222345, term222345.getClass(), "toString", null);
        setField(term222345, term222345.getClass(), "toProperString", null);
        term222339 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term222339, term222339.getClass(), "numerator", 342030);
        setIntField(term222339, term222339.getClass(), "denominator", 21067951);
        setField(term222339, term222339.getClass(), "toString", null);
        setField(term222339, term222339.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term221400, args);
        assertTrue(recursiveEquals(term221400, term222345));
        assertTrue(recursiveEquals(retValue, term222339));
    }

};


