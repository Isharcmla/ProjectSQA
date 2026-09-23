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

public class Fraction_reduce_5358591311941 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term633134;
     Object term634035;
     Object term634032;

    public Fraction_reduce_5358591311941() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term633134 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term633134, term633134.getClass(), "numerator", 1107148786);
        setIntField(term633134, term633134.getClass(), "denominator", 1811941633);
        term634035 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term634035, term634035.getClass(), "numerator", 1107148786);
        setIntField(term634035, term634035.getClass(), "denominator", 1811941633);
        setField(term634035, term634035.getClass(), "toString", null);
        setField(term634035, term634035.getClass(), "toProperString", null);
        term634032 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term634032, term634032.getClass(), "numerator", 1107148786);
        setIntField(term634032, term634032.getClass(), "denominator", 1811941633);
        setField(term634032, term634032.getClass(), "toString", null);
        setField(term634032, term634032.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term633134, args);
        assertTrue(recursiveEquals(term633134, term634035));
        assertTrue(recursiveEquals(retValue, term634032));
    }

};


