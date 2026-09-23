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

public class Fraction_reduce_5358591311225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term397203;
     Object term397942;
     Object term397939;

    public Fraction_reduce_5358591311225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term397203 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term397203, term397203.getClass(), "numerator", -1050095186);
        setIntField(term397203, term397203.getClass(), "denominator", 1668602177);
        term397942 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term397942, term397942.getClass(), "numerator", -1050095186);
        setIntField(term397942, term397942.getClass(), "denominator", 1668602177);
        setField(term397942, term397942.getClass(), "toString", null);
        setField(term397942, term397942.getClass(), "toProperString", null);
        term397939 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term397939, term397939.getClass(), "numerator", -1050095186);
        setIntField(term397939, term397939.getClass(), "denominator", 1668602177);
        setField(term397939, term397939.getClass(), "toString", null);
        setField(term397939, term397939.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term397203, args);
        assertTrue(recursiveEquals(term397203, term397942));
        assertTrue(recursiveEquals(retValue, term397939));
    }

};


