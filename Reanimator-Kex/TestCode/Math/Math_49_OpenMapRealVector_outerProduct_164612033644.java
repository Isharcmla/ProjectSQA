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

public class OpenMapRealVector_outerProduct_164612033644 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8245;
     Object term8352;

    public OpenMapRealVector_outerProduct_164612033644() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8245 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term8246 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term8247 = (int[]) newIntArray(32);
        double[] term8280 = (double[]) newDoubleArray(32);
        byte[] term8313 = (byte[]) newByteArray(32);
        setField(term8246, term8246.getClass(), "keys", term8247);
        setField(term8246, term8246.getClass(), "values", term8280);
        setField(term8246, term8246.getClass(), "states", term8313);
        setDoubleField(term8246, term8246.getClass(), "missingEntries", 0.0);
        setIntField(term8246, term8246.getClass(), "size", 0);
        setIntField(term8246, term8246.getClass(), "mask", 31);
        setIntField(term8246, term8246.getClass(), "count", 0);
        setField(term8245, term8245.getClass(), "entries", term8246);
        setIntField(term8245, term8245.getClass(), "virtualSize", 1632125673);
        setDoubleField(term8245, term8245.getClass(), "epsilon", 1.0E-12);
        term8352 = (double[]) newDoubleArray(6);
        setDoubleElement(term8352, 0, 0.22651340641904605);
        setDoubleElement(term8352, 1, 0.8878841294187743);
        setDoubleElement(term8352, 2, 0.6588948704887806);
        setDoubleElement(term8352, 3, 0.6397214730945112);
        setDoubleElement(term8352, 4, 0.25937345430928016);
        setDoubleElement(term8352, 5, 0.5873228247510078);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(double.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term8352;
        callMethod(klass, "outerProduct", argTypes, term8245, args);
    }

};


