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

public class Fraction_getNumerator_82970376040 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43;
     Object term2541;

    public Fraction_getNumerator_82970376040() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term43, term43.getClass(), "numerator", -1339778481);
        setIntField(term43, term43.getClass(), "denominator", 1725571209);
        setField(term43, term43.getClass(), "toString", "sjlJAEtRrb");
        setField(term43, term43.getClass(), "toProperString", "MuLcgQHgqz");
        term2541 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term2541, term2541.getClass(), "numerator", -1339778481);
        setIntField(term2541, term2541.getClass(), "denominator", 1725571209);
        setField(term2541, term2541.getClass(), "toString", "sjlJAEtRrb");
        setField(term2541, term2541.getClass(), "toProperString", "MuLcgQHgqz");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNumerator", argTypes, term43, args);
        assertTrue(recursiveEquals(term43, term2541));
        assertTrue(recursiveEquals(retValue, -1339778481));
    }

};


