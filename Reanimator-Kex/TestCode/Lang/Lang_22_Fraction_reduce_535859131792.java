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

public class Fraction_reduce_535859131792 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term250539;
     Object term251022;
     Object term251019;

    public Fraction_reduce_535859131792() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term250539 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term250539, term250539.getClass(), "numerator", -939249554);
        setIntField(term250539, term250539.getClass(), "denominator", 1277047761);
        term251022 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term251022, term251022.getClass(), "numerator", -939249554);
        setIntField(term251022, term251022.getClass(), "denominator", 1277047761);
        setField(term251022, term251022.getClass(), "toString", null);
        setField(term251022, term251022.getClass(), "toProperString", null);
        term251019 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term251019, term251019.getClass(), "numerator", -939249554);
        setIntField(term251019, term251019.getClass(), "denominator", 1277047761);
        setField(term251019, term251019.getClass(), "toString", null);
        setField(term251019, term251019.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term250539, args);
        assertTrue(recursiveEquals(term250539, term251022));
        assertTrue(recursiveEquals(retValue, term251019));
    }

};


