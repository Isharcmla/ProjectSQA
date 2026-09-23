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

public class Fraction_reduce_3355035251440 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term421261;
     Object term421772;
     Object term421766;

    public Fraction_reduce_3355035251440() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term421261 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term421261, term421261.getClass(), "numerator", 23090386);
        setIntField(term421261, term421261.getClass(), "denominator", 2016356417);
        term421772 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term421772, term421772.getClass(), "numerator", 23090386);
        setIntField(term421772, term421772.getClass(), "denominator", 2016356417);
        setField(term421772, term421772.getClass(), "toString", null);
        setField(term421772, term421772.getClass(), "toProperString", null);
        term421766 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term421766, term421766.getClass(), "numerator", 1358258);
        setIntField(term421766, term421766.getClass(), "denominator", 118609201);
        setField(term421766, term421766.getClass(), "toString", null);
        setField(term421766, term421766.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term421261, args);
        assertTrue(recursiveEquals(term421261, term421772));
        assertTrue(recursiveEquals(retValue, term421766));
    }

};


