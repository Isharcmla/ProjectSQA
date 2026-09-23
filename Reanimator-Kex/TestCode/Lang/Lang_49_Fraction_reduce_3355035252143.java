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

public class Fraction_reduce_3355035252143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term631679;
     Object term632553;
     Object term632550;

    public Fraction_reduce_3355035252143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term631679 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term631679, term631679.getClass(), "numerator", 169008422);
        setIntField(term631679, term631679.getClass(), "denominator", 1619462235);
        term632553 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term632553, term632553.getClass(), "numerator", 169008422);
        setIntField(term632553, term632553.getClass(), "denominator", 1619462235);
        setField(term632553, term632553.getClass(), "toString", null);
        setField(term632553, term632553.getClass(), "toProperString", null);
        term632550 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term632550, term632550.getClass(), "numerator", 169008422);
        setIntField(term632550, term632550.getClass(), "denominator", 1619462235);
        setField(term632550, term632550.getClass(), "toString", null);
        setField(term632550, term632550.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term631679, args);
        assertTrue(recursiveEquals(term631679, term632553));
        assertTrue(recursiveEquals(retValue, term632550));
    }

};


