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

public class Fraction_reduce_535859131402 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term116410;
     Object term116953;
     Object term116950;

    public Fraction_reduce_535859131402() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term116410 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term116410, term116410.getClass(), "numerator", 157175570);
        setIntField(term116410, term116410.getClass(), "denominator", 554624849);
        term116953 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term116953, term116953.getClass(), "numerator", 157175570);
        setIntField(term116953, term116953.getClass(), "denominator", 554624849);
        setField(term116953, term116953.getClass(), "toString", null);
        setField(term116953, term116953.getClass(), "toProperString", null);
        term116950 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term116950, term116950.getClass(), "numerator", 157175570);
        setIntField(term116950, term116950.getClass(), "denominator", 554624849);
        setField(term116950, term116950.getClass(), "toString", null);
        setField(term116950, term116950.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term116410, args);
        assertTrue(recursiveEquals(term116410, term116953));
        assertTrue(recursiveEquals(retValue, term116950));
    }

};


