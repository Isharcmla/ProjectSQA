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

public class Fraction_reduce_535859131990 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term317309;
     Object term317882;
     Object term317876;

    public Fraction_reduce_535859131990() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term317309 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term317309, term317309.getClass(), "numerator", 1309994418);
        setIntField(term317309, term317309.getClass(), "denominator", 1880498817);
        term317882 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term317882, term317882.getClass(), "numerator", 1309994418);
        setIntField(term317882, term317882.getClass(), "denominator", 1880498817);
        setField(term317882, term317882.getClass(), "toString", null);
        setField(term317882, term317882.getClass(), "toProperString", null);
        term317876 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term317876, term317876.getClass(), "numerator", 436664806);
        setIntField(term317876, term317876.getClass(), "denominator", 626832939);
        setField(term317876, term317876.getClass(), "toString", null);
        setField(term317876, term317876.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term317309, args);
        assertTrue(recursiveEquals(term317309, term317882));
        assertTrue(recursiveEquals(retValue, term317876));
    }

};


