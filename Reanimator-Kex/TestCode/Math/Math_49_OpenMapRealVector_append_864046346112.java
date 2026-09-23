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
import java.lang.Object;

public class OpenMapRealVector_append_864046346112 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96443;
     Object term91590;

    public OpenMapRealVector_append_864046346112() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96443 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term96551 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term92094 = (int[]) newIntArray(522);
        setIntField(term96443, term96443.getClass(), "virtualSize", 9232);
        setField(term96551, term96551.getClass(), "keys", term92094);
        setField(term96551, term96551.getClass(), "values", null);
        setField(term96551, term96551.getClass(), "states", null);
        setDoubleField(term96551, term96551.getClass(), "missingEntries", 0.0);
        setIntField(term96551, term96551.getClass(), "size", 0);
        setIntField(term96551, term96551.getClass(), "mask", 0);
        setIntField(term96551, term96551.getClass(), "count", 0);
        setField(term96443, term96443.getClass(), "entries", term96551);
        setDoubleField(term96443, term96443.getClass(), "epsilon", 0.0);
        term91590 = (double[]) newDoubleArray(493);
        setDoubleElement(term91590, 0, 1.0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term91590;
        callMethod(klass, "append", argTypes, term96443, args);
    }

};


