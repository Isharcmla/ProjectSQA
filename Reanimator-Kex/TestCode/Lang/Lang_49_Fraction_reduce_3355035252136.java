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

public class Fraction_reduce_3355035252136 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term629208;
     Object term630061;
     Object term630058;

    public Fraction_reduce_3355035252136() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term629208 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term629208, term629208.getClass(), "numerator", 4254834);
        setIntField(term629208, term629208.getClass(), "denominator", 1075852433);
        term630061 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term630061, term630061.getClass(), "numerator", 4254834);
        setIntField(term630061, term630061.getClass(), "denominator", 1075852433);
        setField(term630061, term630061.getClass(), "toString", null);
        setField(term630061, term630061.getClass(), "toProperString", null);
        term630058 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term630058, term630058.getClass(), "numerator", 4254834);
        setIntField(term630058, term630058.getClass(), "denominator", 1075852433);
        setField(term630058, term630058.getClass(), "toString", null);
        setField(term630058, term630058.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term629208, args);
        assertTrue(recursiveEquals(term629208, term630061));
        assertTrue(recursiveEquals(retValue, term630058));
    }

};


