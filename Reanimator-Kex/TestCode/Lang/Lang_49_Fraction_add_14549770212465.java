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

public class Fraction_add_14549770212465 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term733481;
     Object term733561;
     Object term734123;
     Object term734124;
     Object term734120;

    public Fraction_add_14549770212465() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term733481 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term733481, term733481.getClass(), "numerator", 524288);
        setIntField(term733481, term733481.getClass(), "denominator", 218103808);
        term733561 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term733561, term733561.getClass(), "numerator", 524288);
        setIntField(term733561, term733561.getClass(), "denominator", 1073741824);
        term734123 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term734123, term734123.getClass(), "numerator", 524288);
        setIntField(term734123, term734123.getClass(), "denominator", 218103808);
        setField(term734123, term734123.getClass(), "toString", null);
        setField(term734123, term734123.getClass(), "toProperString", null);
        term734124 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term734124, term734124.getClass(), "numerator", 524288);
        setIntField(term734124, term734124.getClass(), "denominator", 1073741824);
        setField(term734124, term734124.getClass(), "toString", null);
        setField(term734124, term734124.getClass(), "toProperString", null);
        term734120 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term734120, term734120.getClass(), "numerator", 77);
        setIntField(term734120, term734120.getClass(), "denominator", 26624);
        setField(term734120, term734120.getClass(), "toString", null);
        setField(term734120, term734120.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term733561;
        Object retValue = callMethod(klass, "add", argTypes, term733481, args);
        assertTrue(recursiveEquals(term733481, term734123));
        assertTrue(recursiveEquals(term733561, term734124));
        assertTrue(recursiveEquals(retValue, term734120));
    }

};


