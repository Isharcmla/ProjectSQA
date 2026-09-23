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

public class Fraction_reduce_3355035251316 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term384976;
     Object term385540;
     Object term385537;

    public Fraction_reduce_3355035251316() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term384976 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term384976, term384976.getClass(), "numerator", -1799402190);
        setIntField(term384976, term384976.getClass(), "denominator", 339754127);
        term385540 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term385540, term385540.getClass(), "numerator", -1799402190);
        setIntField(term385540, term385540.getClass(), "denominator", 339754127);
        setField(term385540, term385540.getClass(), "toString", null);
        setField(term385540, term385540.getClass(), "toProperString", null);
        term385537 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term385537, term385537.getClass(), "numerator", -1799402190);
        setIntField(term385537, term385537.getClass(), "denominator", 339754127);
        setField(term385537, term385537.getClass(), "toString", null);
        setField(term385537, term385537.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term384976, args);
        assertTrue(recursiveEquals(term384976, term385540));
        assertTrue(recursiveEquals(retValue, term385537));
    }

};


