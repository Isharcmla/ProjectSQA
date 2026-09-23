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

public class OpenMapRealVector_append_864046346125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term103508;
     Object term102994;

    public OpenMapRealVector_append_864046346125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term103508 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term103616 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term103256 = (int[]) newIntArray(1);
        setIntField(term103508, term103508.getClass(), "virtualSize", 1155866406);
        setField(term103616, term103616.getClass(), "keys", term103256);
        setField(term103616, term103616.getClass(), "values", null);
        setField(term103616, term103616.getClass(), "states", null);
        setDoubleField(term103616, term103616.getClass(), "missingEntries", 0.0);
        setIntField(term103616, term103616.getClass(), "size", -1);
        setIntField(term103616, term103616.getClass(), "mask", 802694207);
        setIntField(term103616, term103616.getClass(), "count", 0);
        setField(term103508, term103508.getClass(), "entries", term103616);
        setDoubleField(term103508, term103508.getClass(), "epsilon", 0.0);
        term102994 = (double[]) newDoubleArray(251);
        setDoubleElement(term102994, 0, 2.3149909459567903E18);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term102994;
        callMethod(klass, "append", argTypes, term103508, args);
    }

};


