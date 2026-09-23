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

public class Fraction_reduce_535859131729 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term230649;
     Object term231457;
     Object term231454;

    public Fraction_reduce_535859131729() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term230649 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term230649, term230649.getClass(), "numerator", -523607026);
        setIntField(term230649, term230649.getClass(), "denominator", 1884721281);
        term231457 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term231457, term231457.getClass(), "numerator", -523607026);
        setIntField(term231457, term231457.getClass(), "denominator", 1884721281);
        setField(term231457, term231457.getClass(), "toString", null);
        setField(term231457, term231457.getClass(), "toProperString", null);
        term231454 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term231454, term231454.getClass(), "numerator", -523607026);
        setIntField(term231454, term231454.getClass(), "denominator", 1884721281);
        setField(term231454, term231454.getClass(), "toString", null);
        setField(term231454, term231454.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term230649, args);
        assertTrue(recursiveEquals(term230649, term231457));
        assertTrue(recursiveEquals(retValue, term231454));
    }

};


