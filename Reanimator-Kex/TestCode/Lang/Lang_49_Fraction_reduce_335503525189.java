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

public class Fraction_reduce_335503525189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44705;
     Object term44799;
     Object term44796;

    public Fraction_reduce_335503525189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44705 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term44705, term44705.getClass(), "numerator", -1560178142);
        setIntField(term44705, term44705.getClass(), "denominator", 39861735);
        term44799 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term44799, term44799.getClass(), "numerator", -1560178142);
        setIntField(term44799, term44799.getClass(), "denominator", 39861735);
        setField(term44799, term44799.getClass(), "toString", null);
        setField(term44799, term44799.getClass(), "toProperString", null);
        term44796 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term44796, term44796.getClass(), "numerator", -1560178142);
        setIntField(term44796, term44796.getClass(), "denominator", 39861735);
        setField(term44796, term44796.getClass(), "toString", null);
        setField(term44796, term44796.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term44705, args);
        assertTrue(recursiveEquals(term44705, term44799));
        assertTrue(recursiveEquals(retValue, term44796));
    }

};


