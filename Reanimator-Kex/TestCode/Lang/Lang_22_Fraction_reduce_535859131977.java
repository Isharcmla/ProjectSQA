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

public class Fraction_reduce_535859131977 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term313569;
     Object term313680;
     Object term313677;

    public Fraction_reduce_535859131977() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term313569 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term313569, term313569.getClass(), "numerator", -1475859758);
        setIntField(term313569, term313569.getClass(), "denominator", 1962999903);
        term313680 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term313680, term313680.getClass(), "numerator", -1475859758);
        setIntField(term313680, term313680.getClass(), "denominator", 1962999903);
        setField(term313680, term313680.getClass(), "toString", null);
        setField(term313680, term313680.getClass(), "toProperString", null);
        term313677 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term313677, term313677.getClass(), "numerator", -1475859758);
        setIntField(term313677, term313677.getClass(), "denominator", 1962999903);
        setField(term313677, term313677.getClass(), "toString", null);
        setField(term313677, term313677.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term313569, args);
        assertTrue(recursiveEquals(term313569, term313680));
        assertTrue(recursiveEquals(retValue, term313677));
    }

};


