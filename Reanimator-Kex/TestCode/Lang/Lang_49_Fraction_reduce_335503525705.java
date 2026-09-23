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

public class Fraction_reduce_335503525705 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term195388;
     Object term195592;
     Object term195589;

    public Fraction_reduce_335503525705() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term195388 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term195388, term195388.getClass(), "numerator", 85915414);
        setIntField(term195388, term195388.getClass(), "denominator", 657534181);
        term195592 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term195592, term195592.getClass(), "numerator", 85915414);
        setIntField(term195592, term195592.getClass(), "denominator", 657534181);
        setField(term195592, term195592.getClass(), "toString", null);
        setField(term195592, term195592.getClass(), "toProperString", null);
        term195589 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term195589, term195589.getClass(), "numerator", 85915414);
        setIntField(term195589, term195589.getClass(), "denominator", 657534181);
        setField(term195589, term195589.getClass(), "toString", null);
        setField(term195589, term195589.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term195388, args);
        assertTrue(recursiveEquals(term195388, term195592));
        assertTrue(recursiveEquals(retValue, term195589));
    }

};


