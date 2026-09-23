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

public class Fraction_reduce_3355035251475 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term431820;
     Object term432702;
     Object term432696;

    public Fraction_reduce_3355035251475() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term431820 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term431820, term431820.getClass(), "numerator", 16777230);
        setIntField(term431820, term431820.getClass(), "denominator", 1457497855);
        term432702 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term432702, term432702.getClass(), "numerator", 16777230);
        setIntField(term432702, term432702.getClass(), "denominator", 1457497855);
        setField(term432702, term432702.getClass(), "toString", null);
        setField(term432702, term432702.getClass(), "toProperString", null);
        term432696 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term432696, term432696.getClass(), "numerator", 3355446);
        setIntField(term432696, term432696.getClass(), "denominator", 291499571);
        setField(term432696, term432696.getClass(), "toString", null);
        setField(term432696, term432696.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term431820, args);
        assertTrue(recursiveEquals(term431820, term432702));
        assertTrue(recursiveEquals(retValue, term432696));
    }

};


