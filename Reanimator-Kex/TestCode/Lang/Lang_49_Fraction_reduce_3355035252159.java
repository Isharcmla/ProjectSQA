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

public class Fraction_reduce_3355035252159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term637845;
     Object term638080;
     Object term638077;

    public Fraction_reduce_3355035252159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term637845 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term637845, term637845.getClass(), "numerator", -536870911);
        setIntField(term637845, term637845.getClass(), "denominator", 1073741824);
        term638080 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term638080, term638080.getClass(), "numerator", -536870911);
        setIntField(term638080, term638080.getClass(), "denominator", 1073741824);
        setField(term638080, term638080.getClass(), "toString", null);
        setField(term638080, term638080.getClass(), "toProperString", null);
        term638077 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term638077, term638077.getClass(), "numerator", -536870911);
        setIntField(term638077, term638077.getClass(), "denominator", 1073741824);
        setField(term638077, term638077.getClass(), "toString", null);
        setField(term638077, term638077.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term637845, args);
        assertTrue(recursiveEquals(term637845, term638080));
        assertTrue(recursiveEquals(retValue, term638077));
    }

};


