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

public class Fraction_reduce_535859131857 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term273421;
     Object term274293;
     Object term274290;

    public Fraction_reduce_535859131857() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term273421 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term273421, term273421.getClass(), "numerator", -555460446);
        setIntField(term273421, term273421.getClass(), "denominator", 1769372759);
        term274293 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term274293, term274293.getClass(), "numerator", -555460446);
        setIntField(term274293, term274293.getClass(), "denominator", 1769372759);
        setField(term274293, term274293.getClass(), "toString", null);
        setField(term274293, term274293.getClass(), "toProperString", null);
        term274290 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term274290, term274290.getClass(), "numerator", -555460446);
        setIntField(term274290, term274290.getClass(), "denominator", 1769372759);
        setField(term274290, term274290.getClass(), "toString", null);
        setField(term274290, term274290.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term273421, args);
        assertTrue(recursiveEquals(term273421, term274293));
        assertTrue(recursiveEquals(retValue, term274290));
    }

};


