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

public class Fraction_reduce_3355035251132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term327821;
     Object term328349;
     Object term328346;

    public Fraction_reduce_3355035251132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term327821 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term327821, term327821.getClass(), "numerator", -778906406);
        setIntField(term327821, term327821.getClass(), "denominator", 389450027);
        term328349 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term328349, term328349.getClass(), "numerator", -778906406);
        setIntField(term328349, term328349.getClass(), "denominator", 389450027);
        setField(term328349, term328349.getClass(), "toString", null);
        setField(term328349, term328349.getClass(), "toProperString", null);
        term328346 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term328346, term328346.getClass(), "numerator", -778906406);
        setIntField(term328346, term328346.getClass(), "denominator", 389450027);
        setField(term328346, term328346.getClass(), "toString", null);
        setField(term328346, term328346.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term327821, args);
        assertTrue(recursiveEquals(term327821, term328349));
        assertTrue(recursiveEquals(retValue, term328346));
    }

};


