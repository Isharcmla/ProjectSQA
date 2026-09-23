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

public class Fraction_reduce_3355035251058 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term305480;
     Object term306105;
     Object term306102;

    public Fraction_reduce_3355035251058() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term305480 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term305480, term305480.getClass(), "numerator", -316784638);
        setIntField(term305480, term305480.getClass(), "denominator", 607232391);
        term306105 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term306105, term306105.getClass(), "numerator", -316784638);
        setIntField(term306105, term306105.getClass(), "denominator", 607232391);
        setField(term306105, term306105.getClass(), "toString", null);
        setField(term306105, term306105.getClass(), "toProperString", null);
        term306102 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term306102, term306102.getClass(), "numerator", -316784638);
        setIntField(term306102, term306102.getClass(), "denominator", 607232391);
        setField(term306102, term306102.getClass(), "toString", null);
        setField(term306102, term306102.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term305480, args);
        assertTrue(recursiveEquals(term305480, term306105));
        assertTrue(recursiveEquals(retValue, term306102));
    }

};


