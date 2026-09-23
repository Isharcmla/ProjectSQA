package org.apache.commons.math.linear;

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
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.math.linear.EqualityUtils.*;

public class ArrayRealVector_getNorm_927517992328 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74658;
     Object term97230;

    public ArrayRealVector_getNorm_927517992328() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74658 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term74058 = (double[]) newDoubleArray(489);
        setField(term74658, term74658.getClass(), "data", term74058);
        term97230 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term97231 = (double[]) newDoubleArray(489);
        setField(term97230, term97230.getClass(), "data", term97231);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getNorm", argTypes, term74658, args);
        assertTrue(recursiveEquals(term74658, term97230));
        assertTrue(recursiveEquals(retValue, 0.0));
    }

};


