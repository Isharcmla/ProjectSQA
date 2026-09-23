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

public class Fraction_reduce_3355035252566 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term765163;
     Object term765682;
     Object term765679;

    public Fraction_reduce_3355035252566() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term765163 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term765163, term765163.getClass(), "numerator", -161124206);
        setIntField(term765163, term765163.getClass(), "denominator", 1459906095);
        term765682 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term765682, term765682.getClass(), "numerator", -161124206);
        setIntField(term765682, term765682.getClass(), "denominator", 1459906095);
        setField(term765682, term765682.getClass(), "toString", null);
        setField(term765682, term765682.getClass(), "toProperString", null);
        term765679 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term765679, term765679.getClass(), "numerator", -161124206);
        setIntField(term765679, term765679.getClass(), "denominator", 1459906095);
        setField(term765679, term765679.getClass(), "toString", null);
        setField(term765679, term765679.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term765163, args);
        assertTrue(recursiveEquals(term765163, term765682));
        assertTrue(recursiveEquals(retValue, term765679));
    }

};


