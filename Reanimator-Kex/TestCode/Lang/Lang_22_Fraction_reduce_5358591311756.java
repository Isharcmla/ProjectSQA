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

public class Fraction_reduce_5358591311756 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term570896;
     Object term571447;
     Object term571444;

    public Fraction_reduce_5358591311756() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term570896 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term570896, term570896.getClass(), "numerator", 638031734);
        setIntField(term570896, term570896.getClass(), "denominator", 1089887939);
        term571447 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term571447, term571447.getClass(), "numerator", 638031734);
        setIntField(term571447, term571447.getClass(), "denominator", 1089887939);
        setField(term571447, term571447.getClass(), "toString", null);
        setField(term571447, term571447.getClass(), "toProperString", null);
        term571444 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term571444, term571444.getClass(), "numerator", 638031734);
        setIntField(term571444, term571444.getClass(), "denominator", 1089887939);
        setField(term571444, term571444.getClass(), "toString", null);
        setField(term571444, term571444.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term570896, args);
        assertTrue(recursiveEquals(term570896, term571447));
        assertTrue(recursiveEquals(retValue, term571444));
    }

};


