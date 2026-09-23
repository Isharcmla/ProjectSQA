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

public class Fraction_add_145497702197 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15694;
     Object term15774;
     Object term15797;
     Object term15798;
     Object term15790;

    public Fraction_add_145497702197() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15694 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term15694, term15694.getClass(), "numerator", -1);
        term15774 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term15774, term15774.getClass(), "numerator", 0);
        term15797 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term15797, term15797.getClass(), "numerator", -1);
        setIntField(term15797, term15797.getClass(), "denominator", 0);
        setField(term15797, term15797.getClass(), "toString", null);
        setField(term15797, term15797.getClass(), "toProperString", null);
        term15798 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term15798, term15798.getClass(), "numerator", 0);
        setIntField(term15798, term15798.getClass(), "denominator", 0);
        setField(term15798, term15798.getClass(), "toString", null);
        setField(term15798, term15798.getClass(), "toProperString", null);
        term15790 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term15790, term15790.getClass(), "numerator", -1);
        setIntField(term15790, term15790.getClass(), "denominator", 0);
        setField(term15790, term15790.getClass(), "toString", null);
        setField(term15790, term15790.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.math.Fraction");
        Object[] args = new Object[1];
        args[0] = term15774;
        Object retValue = callMethod(klass, "add", argTypes, term15694, args);
        assertTrue(recursiveEquals(term15694, term15797));
        assertTrue(recursiveEquals(term15774, term15798));
        assertTrue(recursiveEquals(retValue, term15790));
    }

};


