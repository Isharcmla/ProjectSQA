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

public class Fraction_reduce_5358591311778 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term578078;
     Object term578920;
     Object term578917;

    public Fraction_reduce_5358591311778() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term578078 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term578078, term578078.getClass(), "numerator", 173196802);
        setIntField(term578078, term578078.getClass(), "denominator", 1250296873);
        term578920 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term578920, term578920.getClass(), "numerator", 173196802);
        setIntField(term578920, term578920.getClass(), "denominator", 1250296873);
        setField(term578920, term578920.getClass(), "toString", null);
        setField(term578920, term578920.getClass(), "toProperString", null);
        term578917 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term578917, term578917.getClass(), "numerator", 173196802);
        setIntField(term578917, term578917.getClass(), "denominator", 1250296873);
        setField(term578917, term578917.getClass(), "toString", null);
        setField(term578917, term578917.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term578078, args);
        assertTrue(recursiveEquals(term578078, term578920));
        assertTrue(recursiveEquals(retValue, term578917));
    }

};


