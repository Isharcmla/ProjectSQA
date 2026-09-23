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

public class Fraction_reduce_3355035252371 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term701908;
     Object term702784;
     Object term702781;

    public Fraction_reduce_3355035252371() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term701908 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term701908, term701908.getClass(), "numerator", 1879048206);
        setIntField(term701908, term701908.getClass(), "denominator", 133158895);
        term702784 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term702784, term702784.getClass(), "numerator", 1879048206);
        setIntField(term702784, term702784.getClass(), "denominator", 133158895);
        setField(term702784, term702784.getClass(), "toString", null);
        setField(term702784, term702784.getClass(), "toProperString", null);
        term702781 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term702781, term702781.getClass(), "numerator", 1879048206);
        setIntField(term702781, term702781.getClass(), "denominator", 133158895);
        setField(term702781, term702781.getClass(), "toString", null);
        setField(term702781, term702781.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term701908, args);
        assertTrue(recursiveEquals(term701908, term702784));
        assertTrue(recursiveEquals(retValue, term702781));
    }

};


