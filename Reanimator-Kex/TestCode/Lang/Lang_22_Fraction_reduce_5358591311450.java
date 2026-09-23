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

public class Fraction_reduce_5358591311450 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term472015;
     Object term472442;
     Object term472439;

    public Fraction_reduce_5358591311450() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term472015 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term472015, term472015.getClass(), "numerator", -2146402046);
        setIntField(term472015, term472015.getClass(), "denominator", 1307606967);
        term472442 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term472442, term472442.getClass(), "numerator", -2146402046);
        setIntField(term472442, term472442.getClass(), "denominator", 1307606967);
        setField(term472442, term472442.getClass(), "toString", null);
        setField(term472442, term472442.getClass(), "toProperString", null);
        term472439 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term472439, term472439.getClass(), "numerator", -2146402046);
        setIntField(term472439, term472439.getClass(), "denominator", 1307606967);
        setField(term472439, term472439.getClass(), "toString", null);
        setField(term472439, term472439.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term472015, args);
        assertTrue(recursiveEquals(term472015, term472442));
        assertTrue(recursiveEquals(retValue, term472439));
    }

};


