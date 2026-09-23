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

public class Fraction_reduce_5358591312124 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term691816;
     Object term692398;
     Object term692395;

    public Fraction_reduce_5358591312124() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term691816 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term691816, term691816.getClass(), "numerator", -1560264702);
        setIntField(term691816, term691816.getClass(), "denominator", 1363276999);
        term692398 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term692398, term692398.getClass(), "numerator", -1560264702);
        setIntField(term692398, term692398.getClass(), "denominator", 1363276999);
        setField(term692398, term692398.getClass(), "toString", null);
        setField(term692398, term692398.getClass(), "toProperString", null);
        term692395 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term692395, term692395.getClass(), "numerator", -1560264702);
        setIntField(term692395, term692395.getClass(), "denominator", 1363276999);
        setField(term692395, term692395.getClass(), "toString", null);
        setField(term692395, term692395.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term691816, args);
        assertTrue(recursiveEquals(term691816, term692398));
        assertTrue(recursiveEquals(retValue, term692395));
    }

};


