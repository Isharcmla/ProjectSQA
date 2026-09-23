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

public class Fraction_reduce_5358591312432 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term794891;
     Object term795862;
     Object term795859;

    public Fraction_reduce_5358591312432() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term794891 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term794891, term794891.getClass(), "numerator", 604777122);
        setIntField(term794891, term794891.getClass(), "denominator", 1663136105);
        term795862 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term795862, term795862.getClass(), "numerator", 604777122);
        setIntField(term795862, term795862.getClass(), "denominator", 1663136105);
        setField(term795862, term795862.getClass(), "toString", null);
        setField(term795862, term795862.getClass(), "toProperString", null);
        term795859 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term795859, term795859.getClass(), "numerator", 604777122);
        setIntField(term795859, term795859.getClass(), "denominator", 1663136105);
        setField(term795859, term795859.getClass(), "toString", null);
        setField(term795859, term795859.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term794891, args);
        assertTrue(recursiveEquals(term794891, term795862));
        assertTrue(recursiveEquals(retValue, term795859));
    }

};


