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

public class Fraction_reduce_5358591311671 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term542171;
     Object term543006;
     Object term543000;

    public Fraction_reduce_5358591311671() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term542171 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term542171, term542171.getClass(), "numerator", -469446010);
        setIntField(term542171, term542171.getClass(), "denominator", 1661082165);
        term543006 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term543006, term543006.getClass(), "numerator", -469446010);
        setIntField(term543006, term543006.getClass(), "denominator", 1661082165);
        setField(term543006, term543006.getClass(), "toString", null);
        setField(term543006, term543006.getClass(), "toProperString", null);
        term543000 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term543000, term543000.getClass(), "numerator", -93889202);
        setIntField(term543000, term543000.getClass(), "denominator", 332216433);
        setField(term543000, term543000.getClass(), "toString", null);
        setField(term543000, term543000.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term542171, args);
        assertTrue(recursiveEquals(term542171, term543006));
        assertTrue(recursiveEquals(retValue, term543000));
    }

};


