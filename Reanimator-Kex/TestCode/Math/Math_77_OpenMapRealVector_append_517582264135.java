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

public class OpenMapRealVector_append_517582264135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term112884;
     Object term113094;

    public OpenMapRealVector_append_517582264135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term112884 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term112992 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term110509 = (int[]) newIntArray(152);
        setIntField(term112884, term112884.getClass(), "virtualSize", 0);
        setField(term112992, term112992.getClass(), "keys", term110509);
        setField(term112992, term112992.getClass(), "values", null);
        setField(term112992, term112992.getClass(), "states", null);
        setDoubleField(term112992, term112992.getClass(), "missingEntries", 0.0);
        setIntField(term112992, term112992.getClass(), "size", 0);
        setIntField(term112992, term112992.getClass(), "mask", 0);
        setIntField(term112992, term112992.getClass(), "count", 0);
        setField(term112884, term112884.getClass(), "entries", term112992);
        setDoubleField(term112884, term112884.getClass(), "epsilon", 0.0);
        term113094 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term113202 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] term111741 = (byte[]) newByteArray(490);
        setIntField(term113094, term113094.getClass(), "virtualSize", 0);
        setIntField(term113202, term113202.getClass(), "count", 0);
        setByteElement(term111741, 0, (byte) -128);
        setByteElement(term111741, 1, (byte) 1);
        setField(term113202, term113202.getClass(), "states", term111741);
        setField(term113094, term113094.getClass(), "entries", term113202);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Object[] args = new Object[1];
        args[0] = term113094;
        callMethod(klass, "append", argTypes, term112884, args);
    }

};


