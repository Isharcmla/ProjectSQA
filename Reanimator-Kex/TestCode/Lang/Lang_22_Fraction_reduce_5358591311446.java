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

public class Fraction_reduce_5358591311446 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term471397;
     Object term471686;
     Object term471680;

    public Fraction_reduce_5358591311446() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term471397 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term471397, term471397.getClass(), "numerator", -120846334);
        setIntField(term471397, term471397.getClass(), "denominator", 2133226039);
        term471686 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term471686, term471686.getClass(), "numerator", -120846334);
        setIntField(term471686, term471686.getClass(), "denominator", 2133226039);
        setField(term471686, term471686.getClass(), "toString", null);
        setField(term471686, term471686.getClass(), "toProperString", null);
        term471680 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term471680, term471680.getClass(), "numerator", -17263762);
        setIntField(term471680, term471680.getClass(), "denominator", 304746577);
        setField(term471680, term471680.getClass(), "toString", null);
        setField(term471680, term471680.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term471397, args);
        assertTrue(recursiveEquals(term471397, term471686));
        assertTrue(recursiveEquals(retValue, term471680));
    }

};


