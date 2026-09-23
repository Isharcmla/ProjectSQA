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

public class Fraction_reduce_3355035251314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term384744;
     Object term385083;
     Object term385080;

    public Fraction_reduce_3355035251314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term384744 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term384744, term384744.getClass(), "numerator", -410906622);
        setIntField(term384744, term384744.getClass(), "denominator", 1428140039);
        term385083 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term385083, term385083.getClass(), "numerator", -410906622);
        setIntField(term385083, term385083.getClass(), "denominator", 1428140039);
        setField(term385083, term385083.getClass(), "toString", null);
        setField(term385083, term385083.getClass(), "toProperString", null);
        term385080 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term385080, term385080.getClass(), "numerator", -410906622);
        setIntField(term385080, term385080.getClass(), "denominator", 1428140039);
        setField(term385080, term385080.getClass(), "toString", null);
        setField(term385080, term385080.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term384744, args);
        assertTrue(recursiveEquals(term384744, term385083));
        assertTrue(recursiveEquals(retValue, term385080));
    }

};


