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

public class Fraction_reduce_535859131618 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term192828;
     Object term193293;
     Object term193290;

    public Fraction_reduce_535859131618() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term192828 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term192828, term192828.getClass(), "numerator", 609680642);
        setIntField(term192828, term192828.getClass(), "denominator", 1636213065);
        term193293 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term193293, term193293.getClass(), "numerator", 609680642);
        setIntField(term193293, term193293.getClass(), "denominator", 1636213065);
        setField(term193293, term193293.getClass(), "toString", null);
        setField(term193293, term193293.getClass(), "toProperString", null);
        term193290 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term193290, term193290.getClass(), "numerator", 609680642);
        setIntField(term193290, term193290.getClass(), "denominator", 1636213065);
        setField(term193290, term193290.getClass(), "toString", null);
        setField(term193290, term193290.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term192828, args);
        assertTrue(recursiveEquals(term192828, term193293));
        assertTrue(recursiveEquals(retValue, term193290));
    }

};


