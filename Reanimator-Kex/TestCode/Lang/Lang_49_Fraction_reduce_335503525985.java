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

public class Fraction_reduce_335503525985 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term282982;
     Object term283086;
     Object term283083;

    public Fraction_reduce_335503525985() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term282982 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term282982, term282982.getClass(), "numerator", 1342345226);
        setIntField(term282982, term282982.getClass(), "denominator", 520177633);
        term283086 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term283086, term283086.getClass(), "numerator", 1342345226);
        setIntField(term283086, term283086.getClass(), "denominator", 520177633);
        setField(term283086, term283086.getClass(), "toString", null);
        setField(term283086, term283086.getClass(), "toProperString", null);
        term283083 = newInstance(Class.forName("org.apache.commons.lang.math.Fraction"));
        setIntField(term283083, term283083.getClass(), "numerator", 1342345226);
        setIntField(term283083, term283083.getClass(), "denominator", 520177633);
        setField(term283083, term283083.getClass(), "toString", null);
        setField(term283083, term283083.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term282982, args);
        assertTrue(recursiveEquals(term282982, term283086));
        assertTrue(recursiveEquals(retValue, term283083));
    }

};


