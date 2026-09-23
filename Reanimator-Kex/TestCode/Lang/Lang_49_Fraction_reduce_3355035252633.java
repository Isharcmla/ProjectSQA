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

public class Fraction_reduce_3355035252633 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term785565;
     Object term786486;
     Object term786480;

    public Fraction_reduce_3355035252633() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term785565 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term785565, term785565.getClass(), "numerator", -83909370);
        setIntField(term785565, term785565.getClass(), "denominator", 2021389413);
        term786486 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term786486, term786486.getClass(), "numerator", -83909370);
        setIntField(term786486, term786486.getClass(), "denominator", 2021389413);
        setField(term786486, term786486.getClass(), "toString", null);
        setField(term786486, term786486.getClass(), "toProperString", null);
        term786480 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term786480, term786480.getClass(), "numerator", -27969790);
        setIntField(term786480, term786480.getClass(), "denominator", 673796471);
        setField(term786480, term786480.getClass(), "toString", null);
        setField(term786480, term786480.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term785565, args);
        assertTrue(recursiveEquals(term785565, term786486));
        assertTrue(recursiveEquals(retValue, term786480));
    }

};


