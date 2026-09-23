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

public class Fraction_reduce_3355035252629 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term784816;
     Object term785366;
     Object term785363;

    public Fraction_reduce_3355035252629() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term784816 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term784816, term784816.getClass(), "numerator", -536870911);
        setIntField(term784816, term784816.getClass(), "denominator", 1073741824);
        term785366 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term785366, term785366.getClass(), "numerator", -536870911);
        setIntField(term785366, term785366.getClass(), "denominator", 1073741824);
        setField(term785366, term785366.getClass(), "toString", null);
        setField(term785366, term785366.getClass(), "toProperString", null);
        term785363 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term785363, term785363.getClass(), "numerator", -536870911);
        setIntField(term785363, term785363.getClass(), "denominator", 1073741824);
        setField(term785363, term785363.getClass(), "toString", null);
        setField(term785363, term785363.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term784816, args);
        assertTrue(recursiveEquals(term784816, term785366));
        assertTrue(recursiveEquals(retValue, term785363));
    }

};


