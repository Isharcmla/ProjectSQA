package org.apache.commons.lang3.math;

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
import static org.apache.commons.lang3.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.math.EqualityUtils.*;

public class Fraction_reduce_535859131457 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term136652;
     Object term137139;
     Object term137133;

    public Fraction_reduce_535859131457() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term136652 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term136652, term136652.getClass(), "numerator", -1540716690);
        setIntField(term136652, term136652.getClass(), "denominator", 1816331169);
        term137139 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term137139, term137139.getClass(), "numerator", -1540716690);
        setIntField(term137139, term137139.getClass(), "denominator", 1816331169);
        setField(term137139, term137139.getClass(), "toString", null);
        setField(term137139, term137139.getClass(), "toProperString", null);
        term137133 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term137133, term137133.getClass(), "numerator", -513572230);
        setIntField(term137133, term137133.getClass(), "denominator", 605443723);
        setField(term137133, term137133.getClass(), "toString", null);
        setField(term137133, term137133.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term136652, args);
        assertTrue(recursiveEquals(term136652, term137139));
        assertTrue(recursiveEquals(retValue, term137133));
    }

};


