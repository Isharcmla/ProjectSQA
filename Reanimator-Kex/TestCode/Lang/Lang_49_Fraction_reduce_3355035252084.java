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

public class Fraction_reduce_3355035252084 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term614656;
     Object term615152;
     Object term615146;

    public Fraction_reduce_3355035252084() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term614656 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term614656, term614656.getClass(), "numerator", -1314563766);
        setIntField(term614656, term614656.getClass(), "denominator", 2009205699);
        term615152 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term615152, term615152.getClass(), "numerator", -1314563766);
        setIntField(term615152, term615152.getClass(), "denominator", 2009205699);
        setField(term615152, term615152.getClass(), "toString", null);
        setField(term615152, term615152.getClass(), "toProperString", null);
        term615146 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term615146, term615146.getClass(), "numerator", -438187922);
        setIntField(term615146, term615146.getClass(), "denominator", 669735233);
        setField(term615146, term615146.getClass(), "toString", null);
        setField(term615146, term615146.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term614656, args);
        assertTrue(recursiveEquals(term614656, term615152));
        assertTrue(recursiveEquals(retValue, term615146));
    }

};


