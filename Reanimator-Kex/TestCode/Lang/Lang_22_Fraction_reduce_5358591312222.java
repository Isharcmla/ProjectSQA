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

public class Fraction_reduce_5358591312222 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term723790;
     Object term724251;
     Object term724248;

    public Fraction_reduce_5358591312222() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term723790 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term723790, term723790.getClass(), "numerator", -1436283770);
        setIntField(term723790, term723790.getClass(), "denominator", 1891113477);
        term724251 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term724251, term724251.getClass(), "numerator", -1436283770);
        setIntField(term724251, term724251.getClass(), "denominator", 1891113477);
        setField(term724251, term724251.getClass(), "toString", null);
        setField(term724251, term724251.getClass(), "toProperString", null);
        term724248 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term724248, term724248.getClass(), "numerator", -1436283770);
        setIntField(term724248, term724248.getClass(), "denominator", 1891113477);
        setField(term724248, term724248.getClass(), "toString", null);
        setField(term724248, term724248.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term723790, args);
        assertTrue(recursiveEquals(term723790, term724251));
        assertTrue(recursiveEquals(retValue, term724248));
    }

};


