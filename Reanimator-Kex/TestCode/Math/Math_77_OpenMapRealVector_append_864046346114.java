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

public class OpenMapRealVector_append_864046346114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term99043;
     Object term97881;

    public OpenMapRealVector_append_864046346114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term99043 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term99151 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term98881 = (int[]) newIntArray(0);
        setIntField(term99043, term99043.getClass(), "virtualSize", 2147482664);
        setField(term99151, term99151.getClass(), "keys", term98881);
        setField(term99151, term99151.getClass(), "values", null);
        setField(term99151, term99151.getClass(), "states", null);
        setDoubleField(term99151, term99151.getClass(), "missingEntries", 0.0);
        setIntField(term99151, term99151.getClass(), "size", 0);
        setIntField(term99151, term99151.getClass(), "mask", 0);
        setIntField(term99151, term99151.getClass(), "count", 0);
        setField(term99043, term99043.getClass(), "entries", term99151);
        setDoubleField(term99043, term99043.getClass(), "epsilon", 0.0);
        term97881 = (double[]) newDoubleArray(989);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term97881;
        callMethod(klass, "append", argTypes, term99043, args);
    }

};


