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

public class Fraction_reduce_5358591311442 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term470037;
     Object term470756;
     Object term470753;

    public Fraction_reduce_5358591311442() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term470037 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term470037, term470037.getClass(), "numerator", -846899194);
        setIntField(term470037, term470037.getClass(), "denominator", 1821783045);
        term470756 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term470756, term470756.getClass(), "numerator", -846899194);
        setIntField(term470756, term470756.getClass(), "denominator", 1821783045);
        setField(term470756, term470756.getClass(), "toString", null);
        setField(term470756, term470756.getClass(), "toProperString", null);
        term470753 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term470753, term470753.getClass(), "numerator", -846899194);
        setIntField(term470753, term470753.getClass(), "denominator", 1821783045);
        setField(term470753, term470753.getClass(), "toString", null);
        setField(term470753, term470753.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term470037, args);
        assertTrue(recursiveEquals(term470037, term470756));
        assertTrue(recursiveEquals(retValue, term470753));
    }

};


