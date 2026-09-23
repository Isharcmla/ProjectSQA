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

public class Fraction_reduce_5358591312048 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term666929;
     Object term667456;
     Object term667453;

    public Fraction_reduce_5358591312048() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term666929 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term666929, term666929.getClass(), "numerator", -2007687082);
        setIntField(term666929, term666929.getClass(), "denominator", 1277277933);
        term667456 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term667456, term667456.getClass(), "numerator", -2007687082);
        setIntField(term667456, term667456.getClass(), "denominator", 1277277933);
        setField(term667456, term667456.getClass(), "toString", null);
        setField(term667456, term667456.getClass(), "toProperString", null);
        term667453 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term667453, term667453.getClass(), "numerator", -2007687082);
        setIntField(term667453, term667453.getClass(), "denominator", 1277277933);
        setField(term667453, term667453.getClass(), "toString", null);
        setField(term667453, term667453.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term666929, args);
        assertTrue(recursiveEquals(term666929, term667456));
        assertTrue(recursiveEquals(retValue, term667453));
    }

};


