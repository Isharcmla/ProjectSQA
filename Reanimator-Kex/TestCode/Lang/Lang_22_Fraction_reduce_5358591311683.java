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

public class Fraction_reduce_5358591311683 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term546592;
     Object term546804;
     Object term546801;

    public Fraction_reduce_5358591311683() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term546592 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term546592, term546592.getClass(), "numerator", 1666327514);
        setIntField(term546592, term546592.getClass(), "denominator", 1762706501);
        term546804 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term546804, term546804.getClass(), "numerator", 1666327514);
        setIntField(term546804, term546804.getClass(), "denominator", 1762706501);
        setField(term546804, term546804.getClass(), "toString", null);
        setField(term546804, term546804.getClass(), "toProperString", null);
        term546801 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term546801, term546801.getClass(), "numerator", 1666327514);
        setIntField(term546801, term546801.getClass(), "denominator", 1762706501);
        setField(term546801, term546801.getClass(), "toString", null);
        setField(term546801, term546801.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term546592, args);
        assertTrue(recursiveEquals(term546592, term546804));
        assertTrue(recursiveEquals(retValue, term546801));
    }

};


