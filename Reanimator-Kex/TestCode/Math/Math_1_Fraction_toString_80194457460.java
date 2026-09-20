package org.apache.commons.math3.fraction;

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
import static org.apache.commons.math3.fraction.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math3.fraction.EqualityUtils.*;

public class Fraction_toString_80194457460 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term126;
     Object term6475;

    public Fraction_toString_80194457460() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term126 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term126, term126.getClass(), "denominator", 933028652);
        setIntField(term126, term126.getClass(), "numerator", 287287233);
        term6475 = newInstance(Class.forName("org.apache.commons.math3.fraction.Fraction"));
        setIntField(term6475, term6475.getClass(), "denominator", 933028652);
        setIntField(term6475, term6475.getClass(), "numerator", 287287233);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.fraction.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term126, args);
        assertTrue(recursiveEquals(term126, term6475));
        assertTrue(recursiveEquals(retValue, "287287233 / 933028652"));
    }

};
