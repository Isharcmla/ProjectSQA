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

public class Fraction_reduce_535859131399 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term115897;
     Object term116003;
     Object term116000;

    public Fraction_reduce_535859131399() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term115897 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term115897, term115897.getClass(), "numerator", -1476395510);
        setIntField(term115897, term115897.getClass(), "denominator", 1807744867);
        term116003 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term116003, term116003.getClass(), "numerator", -1476395510);
        setIntField(term116003, term116003.getClass(), "denominator", 1807744867);
        setField(term116003, term116003.getClass(), "toString", null);
        setField(term116003, term116003.getClass(), "toProperString", null);
        term116000 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term116000, term116000.getClass(), "numerator", -1476395510);
        setIntField(term116000, term116000.getClass(), "denominator", 1807744867);
        setField(term116000, term116000.getClass(), "toString", null);
        setField(term116000, term116000.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term115897, args);
        assertTrue(recursiveEquals(term115897, term116003));
        assertTrue(recursiveEquals(retValue, term116000));
    }

};


