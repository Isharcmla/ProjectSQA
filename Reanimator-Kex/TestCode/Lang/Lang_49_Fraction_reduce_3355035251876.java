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

public class Fraction_reduce_3355035251876 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term550105;
     Object term550709;
     Object term550706;

    public Fraction_reduce_3355035251876() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term550105 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term550105, term550105.getClass(), "numerator", 64913698);
        setIntField(term550105, term550105.getClass(), "denominator", 475015017);
        term550709 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term550709, term550709.getClass(), "numerator", 64913698);
        setIntField(term550709, term550709.getClass(), "denominator", 475015017);
        setField(term550709, term550709.getClass(), "toString", null);
        setField(term550709, term550709.getClass(), "toProperString", null);
        term550706 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term550706, term550706.getClass(), "numerator", 64913698);
        setIntField(term550706, term550706.getClass(), "denominator", 475015017);
        setField(term550706, term550706.getClass(), "toString", null);
        setField(term550706, term550706.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term550105, args);
        assertTrue(recursiveEquals(term550105, term550709));
        assertTrue(recursiveEquals(retValue, term550706));
    }

};


