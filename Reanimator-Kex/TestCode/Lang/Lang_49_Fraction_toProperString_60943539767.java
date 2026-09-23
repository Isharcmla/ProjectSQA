package org.apache.commons.lang.math;

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
import static org.apache.commons.lang.math.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang.math.EqualityUtils.*;

public class Fraction_toProperString_60943539767 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1338;
     Object term7556;

    public Fraction_toProperString_60943539767() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1338 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term1338, term1338.getClass(), "numerator", -1888585309);
        setIntField(term1338, term1338.getClass(), "denominator", 683666002);
        setField(term1338, term1338.getClass(), "toString", "YRHGsAkhxb");
        setField(term1338, term1338.getClass(), "toProperString", "ffYhPOzlUs");
        term7556 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term7556, term7556.getClass(), "numerator", -1888585309);
        setIntField(term7556, term7556.getClass(), "denominator", 683666002);
        setField(term7556, term7556.getClass(), "toString", "YRHGsAkhxb");
        setField(term7556, term7556.getClass(), "toProperString", "ffYhPOzlUs");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toProperString", argTypes, term1338, args);
        assertTrue(recursiveEquals(term1338, term7556));
        assertTrue(recursiveEquals(retValue, "ffYhPOzlUs"));
    }

};


