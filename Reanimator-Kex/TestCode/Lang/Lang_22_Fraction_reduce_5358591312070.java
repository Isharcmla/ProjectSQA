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

public class Fraction_reduce_5358591312070 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term674417;
     Object term675347;
     Object term675344;

    public Fraction_reduce_5358591312070() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term674417 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term674417, term674417.getClass(), "numerator", -922530926);
        setIntField(term674417, term674417.getClass(), "denominator", 1754567023);
        term675347 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term675347, term675347.getClass(), "numerator", -922530926);
        setIntField(term675347, term675347.getClass(), "denominator", 1754567023);
        setField(term675347, term675347.getClass(), "toString", null);
        setField(term675347, term675347.getClass(), "toProperString", null);
        term675344 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term675344, term675344.getClass(), "numerator", -922530926);
        setIntField(term675344, term675344.getClass(), "denominator", 1754567023);
        setField(term675344, term675344.getClass(), "toString", null);
        setField(term675344, term675344.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term674417, args);
        assertTrue(recursiveEquals(term674417, term675347));
        assertTrue(recursiveEquals(retValue, term675344));
    }

};


