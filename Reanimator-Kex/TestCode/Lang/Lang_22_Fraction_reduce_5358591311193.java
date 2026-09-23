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

public class Fraction_reduce_5358591311193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term385605;
     Object term386845;
     Object term386842;

    public Fraction_reduce_5358591311193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term385605 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term385605, term385605.getClass(), "numerator", -1879048190);
        setIntField(term385605, term385605.getClass(), "denominator", 1205527991);
        term386845 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term386845, term386845.getClass(), "numerator", -1879048190);
        setIntField(term386845, term386845.getClass(), "denominator", 1205527991);
        setField(term386845, term386845.getClass(), "toString", null);
        setField(term386845, term386845.getClass(), "toProperString", null);
        term386842 = newInstance(Class.forName("org.apache.commons.lang3.math.Fraction"));
        setIntField(term386842, term386842.getClass(), "numerator", -1879048190);
        setIntField(term386842, term386842.getClass(), "denominator", 1205527991);
        setField(term386842, term386842.getClass(), "toString", null);
        setField(term386842, term386842.getClass(), "toProperString", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.math.Fraction");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "reduce", argTypes, term385605, args);
        assertTrue(recursiveEquals(term385605, term386845));
        assertTrue(recursiveEquals(retValue, term386842));
    }

};


