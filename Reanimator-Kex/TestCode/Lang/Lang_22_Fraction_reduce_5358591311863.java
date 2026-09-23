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

public class Fraction_reduce_5358591311863 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term609068;
     Object term609561;
     Object term609555;

    public Fraction_reduce_5358591311863() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term609068 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term609068, term609068.getClass(), "numerator", 117763938);
        setIntField(term609068, term609068.getClass(), "denominator", 2085134697);
        term609561 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term609561, term609561.getClass(), "numerator", 117763938);
        setIntField(term609561, term609561.getClass(), "denominator", 2085134697);
        setField(term609561, term609561.getClass(), "toString", null);
        setField(term609561, term609561.getClass(), "toProperString", null);
        term609555 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term609555, term609555.getClass(), "numerator", 13084882);
        setIntField(term609555, term609555.getClass(), "denominator", 231681633);
        setField(term609555, term609555.getClass(), "toString", null);
        setField(term609555, term609555.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term609068, args);
        assertTrue(recursiveEquals(term609068, term609561));
        assertTrue(recursiveEquals(retValue, term609555));
    }

};


