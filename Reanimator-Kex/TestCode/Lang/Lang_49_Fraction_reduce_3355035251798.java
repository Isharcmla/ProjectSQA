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

public class Fraction_reduce_3355035251798 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term525600;
     Object term526201;
     Object term526198;

    public Fraction_reduce_3355035251798() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term525600 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term525600, term525600.getClass(), "numerator", 1939212338);
        setIntField(term525600, term525600.getClass(), "denominator", 339797361);
        term526201 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term526201, term526201.getClass(), "numerator", 1939212338);
        setIntField(term526201, term526201.getClass(), "denominator", 339797361);
        setField(term526201, term526201.getClass(), "toString", null);
        setField(term526201, term526201.getClass(), "toProperString", null);
        term526198 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term526198, term526198.getClass(), "numerator", 1939212338);
        setIntField(term526198, term526198.getClass(), "denominator", 339797361);
        setField(term526198, term526198.getClass(), "toString", null);
        setField(term526198, term526198.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term525600, args);
        assertTrue(recursiveEquals(term525600, term526201));
        assertTrue(recursiveEquals(retValue, term526198));
    }

};


