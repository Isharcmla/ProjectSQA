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

public class Fraction_reduce_5358591311730 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term561241;
     Object term562371;
     Object term562368;

    public Fraction_reduce_5358591311730() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term561241 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term561241, term561241.getClass(), "numerator", 177668530);
        setIntField(term561241, term561241.getClass(), "denominator", 316192033);
        term562371 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term562371, term562371.getClass(), "numerator", 177668530);
        setIntField(term562371, term562371.getClass(), "denominator", 316192033);
        setField(term562371, term562371.getClass(), "toString", null);
        setField(term562371, term562371.getClass(), "toProperString", null);
        term562368 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term562368, term562368.getClass(), "numerator", 177668530);
        setIntField(term562368, term562368.getClass(), "denominator", 316192033);
        setField(term562368, term562368.getClass(), "toString", null);
        setField(term562368, term562368.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term561241, args);
        assertTrue(recursiveEquals(term561241, term562371));
        assertTrue(recursiveEquals(retValue, term562368));
    }

};


