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

public class Fraction_reduce_5358591312574 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term844999;
     Object term845373;
     Object term845370;

    public Fraction_reduce_5358591312574() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term844999 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term844999, term844999.getClass(), "numerator", 537340306);
        setIntField(term844999, term844999.getClass(), "denominator", 1182390545);
        term845373 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term845373, term845373.getClass(), "numerator", 537340306);
        setIntField(term845373, term845373.getClass(), "denominator", 1182390545);
        setField(term845373, term845373.getClass(), "toString", null);
        setField(term845373, term845373.getClass(), "toProperString", null);
        term845370 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term845370, term845370.getClass(), "numerator", 537340306);
        setIntField(term845370, term845370.getClass(), "denominator", 1182390545);
        setField(term845370, term845370.getClass(), "toString", null);
        setField(term845370, term845370.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term844999, args);
        assertTrue(recursiveEquals(term844999, term845373));
        assertTrue(recursiveEquals(retValue, term845370));
    }

};


