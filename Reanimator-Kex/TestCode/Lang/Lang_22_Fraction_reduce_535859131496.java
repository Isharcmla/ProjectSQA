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

public class Fraction_reduce_535859131496 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term151156;
     Object term152096;
     Object term152093;

    public Fraction_reduce_535859131496() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term151156 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term151156, term151156.getClass(), "numerator", -1868279494);
        setIntField(term151156, term151156.getClass(), "denominator", 1103243707);
        term152096 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term152096, term152096.getClass(), "numerator", -1868279494);
        setIntField(term152096, term152096.getClass(), "denominator", 1103243707);
        setField(term152096, term152096.getClass(), "toString", null);
        setField(term152096, term152096.getClass(), "toProperString", null);
        term152093 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term152093, term152093.getClass(), "numerator", -1868279494);
        setIntField(term152093, term152093.getClass(), "denominator", 1103243707);
        setField(term152093, term152093.getClass(), "toString", null);
        setField(term152093, term152093.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term151156, args);
        assertTrue(recursiveEquals(term151156, term152096));
        assertTrue(recursiveEquals(retValue, term152093));
    }

};


