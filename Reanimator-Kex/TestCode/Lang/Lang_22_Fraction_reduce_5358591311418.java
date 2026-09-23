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

public class Fraction_reduce_5358591311418 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term462499;
     Object term463014;
     Object term463008;

    public Fraction_reduce_5358591311418() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term462499 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term462499, term462499.getClass(), "numerator", -843012510);
        setIntField(term462499, term462499.getClass(), "denominator", 1628700935);
        term463014 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term463014, term463014.getClass(), "numerator", -843012510);
        setIntField(term463014, term463014.getClass(), "denominator", 1628700935);
        setField(term463014, term463014.getClass(), "toString", null);
        setField(term463014, term463014.getClass(), "toProperString", null);
        term463008 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term463008, term463008.getClass(), "numerator", -168602502);
        setIntField(term463008, term463008.getClass(), "denominator", 325740187);
        setField(term463008, term463008.getClass(), "toString", null);
        setField(term463008, term463008.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term462499, args);
        assertTrue(recursiveEquals(term462499, term463014));
        assertTrue(recursiveEquals(retValue, term463008));
    }

};


