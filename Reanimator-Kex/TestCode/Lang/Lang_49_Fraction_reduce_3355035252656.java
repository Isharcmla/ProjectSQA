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

public class Fraction_reduce_3355035252656 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term792494;
     Object term793035;
     Object term793032;

    public Fraction_reduce_3355035252656() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term792494 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term792494, term792494.getClass(), "numerator", 336994514);
        setIntField(term792494, term792494.getClass(), "denominator", 1080238369);
        term793035 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term793035, term793035.getClass(), "numerator", 336994514);
        setIntField(term793035, term793035.getClass(), "denominator", 1080238369);
        setField(term793035, term793035.getClass(), "toString", null);
        setField(term793035, term793035.getClass(), "toProperString", null);
        term793032 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term793032, term793032.getClass(), "numerator", 336994514);
        setIntField(term793032, term793032.getClass(), "denominator", 1080238369);
        setField(term793032, term793032.getClass(), "toString", null);
        setField(term793032, term793032.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term792494, args);
        assertTrue(recursiveEquals(term792494, term793035));
        assertTrue(recursiveEquals(retValue, term793032));
    }

};


