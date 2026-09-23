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

public class Fraction_reduce_5358591311647 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term537315;
     Object term537417;
     Object term537414;

    public Fraction_reduce_5358591311647() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term537315 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term537315, term537315.getClass(), "numerator", 732461090);
        setIntField(term537315, term537315.getClass(), "denominator", 676729737);
        term537417 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term537417, term537417.getClass(), "numerator", 732461090);
        setIntField(term537417, term537417.getClass(), "denominator", 676729737);
        setField(term537417, term537417.getClass(), "toString", null);
        setField(term537417, term537417.getClass(), "toProperString", null);
        term537414 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term537414, term537414.getClass(), "numerator", 732461090);
        setIntField(term537414, term537414.getClass(), "denominator", 676729737);
        setField(term537414, term537414.getClass(), "toString", null);
        setField(term537414, term537414.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term537315, args);
        assertTrue(recursiveEquals(term537315, term537417));
        assertTrue(recursiveEquals(retValue, term537414));
    }

};


