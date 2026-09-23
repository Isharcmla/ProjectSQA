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

public class Fraction_reduce_5358591312081 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term677451;
     Object term678476;
     Object term678473;

    public Fraction_reduce_5358591312081() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term677451 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term677451, term677451.getClass(), "numerator", -414568830);
        setIntField(term677451, term677451.getClass(), "denominator", 1835037319);
        term678476 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term678476, term678476.getClass(), "numerator", -414568830);
        setIntField(term678476, term678476.getClass(), "denominator", 1835037319);
        setField(term678476, term678476.getClass(), "toString", null);
        setField(term678476, term678476.getClass(), "toProperString", null);
        term678473 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term678473, term678473.getClass(), "numerator", -414568830);
        setIntField(term678473, term678473.getClass(), "denominator", 1835037319);
        setField(term678473, term678473.getClass(), "toString", null);
        setField(term678473, term678473.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term677451, args);
        assertTrue(recursiveEquals(term677451, term678476));
        assertTrue(recursiveEquals(retValue, term678473));
    }

};


