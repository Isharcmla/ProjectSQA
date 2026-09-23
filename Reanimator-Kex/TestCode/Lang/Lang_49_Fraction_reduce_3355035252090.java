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

public class Fraction_reduce_3355035252090 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term615742;
     Object term616450;
     Object term616444;

    public Fraction_reduce_3355035252090() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term615742 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term615742, term615742.getClass(), "numerator", 156662766);
        setIntField(term615742, term615742.getClass(), "denominator", 1130112015);
        term616450 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term616450, term616450.getClass(), "numerator", 156662766);
        setIntField(term616450, term616450.getClass(), "denominator", 1130112015);
        setField(term616450, term616450.getClass(), "toString", null);
        setField(term616450, term616450.getClass(), "toProperString", null);
        term616444 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term616444, term616444.getClass(), "numerator", 52220922);
        setIntField(term616444, term616444.getClass(), "denominator", 376704005);
        setField(term616444, term616444.getClass(), "toString", null);
        setField(term616444, term616444.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term615742, args);
        assertTrue(recursiveEquals(term615742, term616450));
        assertTrue(recursiveEquals(retValue, term616444));
    }

};


