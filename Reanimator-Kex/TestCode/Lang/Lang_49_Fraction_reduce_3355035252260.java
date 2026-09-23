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

public class Fraction_reduce_3355035252260 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term668299;
     Object term668932;
     Object term668929;

    public Fraction_reduce_3355035252260() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term668299 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term668299, term668299.getClass(), "numerator", -99993478);
        setIntField(term668299, term668299.getClass(), "denominator", 1619742765);
        term668932 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term668932, term668932.getClass(), "numerator", -99993478);
        setIntField(term668932, term668932.getClass(), "denominator", 1619742765);
        setField(term668932, term668932.getClass(), "toString", null);
        setField(term668932, term668932.getClass(), "toProperString", null);
        term668929 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term668929, term668929.getClass(), "numerator", -99993478);
        setIntField(term668929, term668929.getClass(), "denominator", 1619742765);
        setField(term668929, term668929.getClass(), "toString", null);
        setField(term668929, term668929.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term668299, args);
        assertTrue(recursiveEquals(term668299, term668932));
        assertTrue(recursiveEquals(retValue, term668929));
    }

};


