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

public class Fraction_reduce_3355035252618 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term780991;
     Object term781911;
     Object term781908;

    public Fraction_reduce_3355035252618() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term780991 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term780991, term780991.getClass(), "numerator", -166461442);
        setIntField(term780991, term780991.getClass(), "denominator", 1862685641);
        term781911 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term781911, term781911.getClass(), "numerator", -166461442);
        setIntField(term781911, term781911.getClass(), "denominator", 1862685641);
        setField(term781911, term781911.getClass(), "toString", null);
        setField(term781911, term781911.getClass(), "toProperString", null);
        term781908 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term781908, term781908.getClass(), "numerator", -166461442);
        setIntField(term781908, term781908.getClass(), "denominator", 1862685641);
        setField(term781908, term781908.getClass(), "toString", null);
        setField(term781908, term781908.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term780991, args);
        assertTrue(recursiveEquals(term780991, term781911));
        assertTrue(recursiveEquals(retValue, term781908));
    }

};


