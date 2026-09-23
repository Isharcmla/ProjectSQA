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

public class Fraction_reduce_5358591312230 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term726008;
     Object term726890;
     Object term726887;

    public Fraction_reduce_5358591312230() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term726008 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term726008, term726008.getClass(), "numerator", -2146426410);
        setIntField(term726008, term726008.getClass(), "denominator", 1610100989);
        term726890 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term726890, term726890.getClass(), "numerator", -2146426410);
        setIntField(term726890, term726890.getClass(), "denominator", 1610100989);
        setField(term726890, term726890.getClass(), "toString", null);
        setField(term726890, term726890.getClass(), "toProperString", null);
        term726887 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term726887, term726887.getClass(), "numerator", -2146426410);
        setIntField(term726887, term726887.getClass(), "denominator", 1610100989);
        setField(term726887, term726887.getClass(), "toString", null);
        setField(term726887, term726887.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term726008, args);
        assertTrue(recursiveEquals(term726008, term726890));
        assertTrue(recursiveEquals(retValue, term726887));
    }

};


