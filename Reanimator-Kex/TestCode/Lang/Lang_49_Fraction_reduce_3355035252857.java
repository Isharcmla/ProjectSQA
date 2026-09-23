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

public class Fraction_reduce_3355035252857 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term855703;
     Object term855906;
     Object term855903;

    public Fraction_reduce_3355035252857() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term855703 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term855703, term855703.getClass(), "numerator", -501413886);
        setIntField(term855703, term855703.getClass(), "denominator", 1358954615);
        term855906 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term855906, term855906.getClass(), "numerator", -501413886);
        setIntField(term855906, term855906.getClass(), "denominator", 1358954615);
        setField(term855906, term855906.getClass(), "toString", null);
        setField(term855906, term855906.getClass(), "toProperString", null);
        term855903 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term855903, term855903.getClass(), "numerator", -501413886);
        setIntField(term855903, term855903.getClass(), "denominator", 1358954615);
        setField(term855903, term855903.getClass(), "toString", null);
        setField(term855903, term855903.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term855703, args);
        assertTrue(recursiveEquals(term855703, term855906));
        assertTrue(recursiveEquals(retValue, term855903));
    }

};


