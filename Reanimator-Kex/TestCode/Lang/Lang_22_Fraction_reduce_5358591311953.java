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

public class Fraction_reduce_5358591311953 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term637681;
     Object term638161;
     Object term638158;

    public Fraction_reduce_5358591311953() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term637681 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term637681, term637681.getClass(), "numerator", 503205970);
        setIntField(term637681, term637681.getClass(), "denominator", 1437632401);
        term638161 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term638161, term638161.getClass(), "numerator", 503205970);
        setIntField(term638161, term638161.getClass(), "denominator", 1437632401);
        setField(term638161, term638161.getClass(), "toString", null);
        setField(term638161, term638161.getClass(), "toProperString", null);
        term638158 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term638158, term638158.getClass(), "numerator", 503205970);
        setIntField(term638158, term638158.getClass(), "denominator", 1437632401);
        setField(term638158, term638158.getClass(), "toString", null);
        setField(term638158, term638158.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term637681, args);
        assertTrue(recursiveEquals(term637681, term638161));
        assertTrue(recursiveEquals(retValue, term638158));
    }

};


