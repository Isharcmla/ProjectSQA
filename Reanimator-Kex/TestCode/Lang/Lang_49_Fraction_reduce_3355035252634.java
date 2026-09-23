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

public class Fraction_reduce_3355035252634 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term785949;
     Object term786595;
     Object term786589;

    public Fraction_reduce_3355035252634() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term785949 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term785949, term785949.getClass(), "numerator", 2101750626);
        setIntField(term785949, term785949.getClass(), "denominator", 1154386185);
        term786595 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term786595, term786595.getClass(), "numerator", 2101750626);
        setIntField(term786595, term786595.getClass(), "denominator", 1154386185);
        setField(term786595, term786595.getClass(), "toString", null);
        setField(term786595, term786595.getClass(), "toProperString", null);
        term786589 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term786589, term786589.getClass(), "numerator", 700583542);
        setIntField(term786589, term786589.getClass(), "denominator", 384795395);
        setField(term786589, term786589.getClass(), "toString", null);
        setField(term786589, term786589.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term785949, args);
        assertTrue(recursiveEquals(term785949, term786595));
        assertTrue(recursiveEquals(retValue, term786589));
    }

};


