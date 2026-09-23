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

public class Fraction_reduce_5358591312411 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term787162;
     Object term788490;
     Object term788487;

    public Fraction_reduce_5358591312411() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term787162 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term787162, term787162.getClass(), "numerator", -1811529726);
        setIntField(term787162, term787162.getClass(), "denominator", 1097777351);
        term788490 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term788490, term788490.getClass(), "numerator", -1811529726);
        setIntField(term788490, term788490.getClass(), "denominator", 1097777351);
        setField(term788490, term788490.getClass(), "toString", null);
        setField(term788490, term788490.getClass(), "toProperString", null);
        term788487 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term788487, term788487.getClass(), "numerator", -1811529726);
        setIntField(term788487, term788487.getClass(), "denominator", 1097777351);
        setField(term788487, term788487.getClass(), "toString", null);
        setField(term788487, term788487.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term787162, args);
        assertTrue(recursiveEquals(term787162, term788490));
        assertTrue(recursiveEquals(retValue, term788487));
    }

};


