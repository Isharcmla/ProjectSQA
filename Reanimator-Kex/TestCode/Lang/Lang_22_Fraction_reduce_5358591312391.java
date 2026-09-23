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

public class Fraction_reduce_5358591312391 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term781991;
     Object term782200;
     Object term782194;

    public Fraction_reduce_5358591312391() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term781991 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term781991, term781991.getClass(), "numerator", 4326546);
        setIntField(term781991, term781991.getClass(), "denominator", 2030048577);
        term782200 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term782200, term782200.getClass(), "numerator", 4326546);
        setIntField(term782200, term782200.getClass(), "denominator", 2030048577);
        setField(term782200, term782200.getClass(), "toString", null);
        setField(term782200, term782200.getClass(), "toProperString", null);
        term782194 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term782194, term782194.getClass(), "numerator", 1442182);
        setIntField(term782194, term782194.getClass(), "denominator", 676682859);
        setField(term782194, term782194.getClass(), "toString", null);
        setField(term782194, term782194.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term781991, args);
        assertTrue(recursiveEquals(term781991, term782200));
        assertTrue(recursiveEquals(retValue, term782194));
    }

};


