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

public class Fraction_reduce_5358591312560 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term839889;
     Object term840552;
     Object term840549;

    public Fraction_reduce_5358591312560() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term839889 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term839889, term839889.getClass(), "numerator", -284679230);
        setIntField(term839889, term839889.getClass(), "denominator", 304017783);
        term840552 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term840552, term840552.getClass(), "numerator", -284679230);
        setIntField(term840552, term840552.getClass(), "denominator", 304017783);
        setField(term840552, term840552.getClass(), "toString", null);
        setField(term840552, term840552.getClass(), "toProperString", null);
        term840549 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term840549, term840549.getClass(), "numerator", -284679230);
        setIntField(term840549, term840549.getClass(), "denominator", 304017783);
        setField(term840549, term840549.getClass(), "toString", null);
        setField(term840549, term840549.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term839889, args);
        assertTrue(recursiveEquals(term839889, term840552));
        assertTrue(recursiveEquals(retValue, term840549));
    }

};


