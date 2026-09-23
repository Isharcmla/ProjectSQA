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

public class Fraction_reduce_5358591312476 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term810550;
     Object term810981;
     Object term810975;

    public Fraction_reduce_5358591312476() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term810550 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term810550, term810550.getClass(), "numerator", -376311502);
        setIntField(term810550, term810550.getClass(), "denominator", 799572319);
        term810981 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term810981, term810981.getClass(), "numerator", -376311502);
        setIntField(term810981, term810981.getClass(), "denominator", 799572319);
        setField(term810981, term810981.getClass(), "toString", null);
        setField(term810981, term810981.getClass(), "toProperString", null);
        term810975 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term810975, term810975.getClass(), "numerator", -53758786);
        setIntField(term810975, term810975.getClass(), "denominator", 114224617);
        setField(term810975, term810975.getClass(), "toString", null);
        setField(term810975, term810975.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term810550, args);
        assertTrue(recursiveEquals(term810550, term810981));
        assertTrue(recursiveEquals(retValue, term810975));
    }

};


