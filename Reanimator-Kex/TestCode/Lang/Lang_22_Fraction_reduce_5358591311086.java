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

public class Fraction_reduce_5358591311086 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term348788;
     Object term349360;
     Object term349357;

    public Fraction_reduce_5358591311086() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term348788 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term348788, term348788.getClass(), "numerator", 1540751102);
        setIntField(term348788, term348788.getClass(), "denominator", 1780498567);
        term349360 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term349360, term349360.getClass(), "numerator", 1540751102);
        setIntField(term349360, term349360.getClass(), "denominator", 1780498567);
        setField(term349360, term349360.getClass(), "toString", null);
        setField(term349360, term349360.getClass(), "toProperString", null);
        term349357 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term349357, term349357.getClass(), "numerator", 1540751102);
        setIntField(term349357, term349357.getClass(), "denominator", 1780498567);
        setField(term349357, term349357.getClass(), "toString", null);
        setField(term349357, term349357.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term348788, args);
        assertTrue(recursiveEquals(term348788, term349360));
        assertTrue(recursiveEquals(retValue, term349357));
    }

};


