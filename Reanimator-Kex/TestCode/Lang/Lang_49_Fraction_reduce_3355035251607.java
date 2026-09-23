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

public class Fraction_reduce_3355035251607 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term472297;
     Object term472779;
     Object term472776;

    public Fraction_reduce_3355035251607() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term472297 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term472297, term472297.getClass(), "numerator", -302715762);
        setIntField(term472297, term472297.getClass(), "denominator", 151349113);
        term472779 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term472779, term472779.getClass(), "numerator", -302715762);
        setIntField(term472779, term472779.getClass(), "denominator", 151349113);
        setField(term472779, term472779.getClass(), "toString", null);
        setField(term472779, term472779.getClass(), "toProperString", null);
        term472776 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term472776, term472776.getClass(), "numerator", -302715762);
        setIntField(term472776, term472776.getClass(), "denominator", 151349113);
        setField(term472776, term472776.getClass(), "toString", null);
        setField(term472776, term472776.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term472297, args);
        assertTrue(recursiveEquals(term472297, term472779));
        assertTrue(recursiveEquals(retValue, term472776));
    }

};


