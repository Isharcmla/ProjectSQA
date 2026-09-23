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

public class Fraction_reduce_5358591311256 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term407223;
     Object term407794;
     Object term407791;

    public Fraction_reduce_5358591311256() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term407223 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term407223, term407223.getClass(), "numerator", -2130706374);
        setIntField(term407223, term407223.getClass(), "denominator", 2139201643);
        term407794 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term407794, term407794.getClass(), "numerator", -2130706374);
        setIntField(term407794, term407794.getClass(), "denominator", 2139201643);
        setField(term407794, term407794.getClass(), "toString", null);
        setField(term407794, term407794.getClass(), "toProperString", null);
        term407791 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term407791, term407791.getClass(), "numerator", -2130706374);
        setIntField(term407791, term407791.getClass(), "denominator", 2139201643);
        setField(term407791, term407791.getClass(), "toString", null);
        setField(term407791, term407791.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term407223, args);
        assertTrue(recursiveEquals(term407223, term407794));
        assertTrue(recursiveEquals(retValue, term407791));
    }

};


