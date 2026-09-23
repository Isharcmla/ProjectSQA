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

public class Fraction_reduce_3355035251943 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term570571;
     Object term570780;
     Object term570777;

    public Fraction_reduce_3355035251943() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term570571 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term570571, term570571.getClass(), "numerator", 1476395058);
        setIntField(term570571, term570571.getClass(), "denominator", 1073741857);
        term570780 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term570780, term570780.getClass(), "numerator", 1476395058);
        setIntField(term570780, term570780.getClass(), "denominator", 1073741857);
        setField(term570780, term570780.getClass(), "toString", null);
        setField(term570780, term570780.getClass(), "toProperString", null);
        term570777 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term570777, term570777.getClass(), "numerator", 1476395058);
        setIntField(term570777, term570777.getClass(), "denominator", 1073741857);
        setField(term570777, term570777.getClass(), "toString", null);
        setField(term570777, term570777.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term570571, args);
        assertTrue(recursiveEquals(term570571, term570780));
        assertTrue(recursiveEquals(retValue, term570777));
    }

};


