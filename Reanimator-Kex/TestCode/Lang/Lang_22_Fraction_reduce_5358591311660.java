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

public class Fraction_reduce_5358591311660 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term539875;
     Object term540475;
     Object term540472;

    public Fraction_reduce_5358591311660() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term539875 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term539875, term539875.getClass(), "numerator", -456421982);
        setIntField(term539875, term539875.getClass(), "denominator", 269500807);
        term540475 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term540475, term540475.getClass(), "numerator", -456421982);
        setIntField(term540475, term540475.getClass(), "denominator", 269500807);
        setField(term540475, term540475.getClass(), "toString", null);
        setField(term540475, term540475.getClass(), "toProperString", null);
        term540472 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term540472, term540472.getClass(), "numerator", -456421982);
        setIntField(term540472, term540472.getClass(), "denominator", 269500807);
        setField(term540472, term540472.getClass(), "toString", null);
        setField(term540472, term540472.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term539875, args);
        assertTrue(recursiveEquals(term539875, term540475));
        assertTrue(recursiveEquals(retValue, term540472));
    }

};


