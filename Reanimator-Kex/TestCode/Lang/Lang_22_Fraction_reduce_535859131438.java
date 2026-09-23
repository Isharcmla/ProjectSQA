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

public class Fraction_reduce_535859131438 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term130004;
     Object term130460;
     Object term130457;

    public Fraction_reduce_535859131438() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term130004 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term130004, term130004.getClass(), "numerator", 700719026);
        setIntField(term130004, term130004.getClass(), "denominator", 1963802625);
        term130460 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term130460, term130460.getClass(), "numerator", 700719026);
        setIntField(term130460, term130460.getClass(), "denominator", 1963802625);
        setField(term130460, term130460.getClass(), "toString", null);
        setField(term130460, term130460.getClass(), "toProperString", null);
        term130457 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term130457, term130457.getClass(), "numerator", 700719026);
        setIntField(term130457, term130457.getClass(), "denominator", 1963802625);
        setField(term130457, term130457.getClass(), "toString", null);
        setField(term130457, term130457.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term130004, args);
        assertTrue(recursiveEquals(term130004, term130460));
        assertTrue(recursiveEquals(retValue, term130457));
    }

};


