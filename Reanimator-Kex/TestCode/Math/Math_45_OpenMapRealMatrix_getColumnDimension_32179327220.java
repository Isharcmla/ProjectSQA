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
import java.lang.Object;
import java.lang.Double;

public class OpenMapRealMatrix_getColumnDimension_32179327220 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term618;
     Object term6094;

    public OpenMapRealMatrix_getColumnDimension_32179327220() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term618 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        Object term621 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term622 = (int[]) newIntArray(32);
        double[] term655 = (double[]) newDoubleArray(32);
        byte[] term688 = (byte[]) newByteArray(32);
        setIntField(term618, term618.getClass(), "rows", -1685132342);
        setIntField(term618, term618.getClass(), "columns", -1456670397);
        setField(term621, term621.getClass(), "keys", term622);
        setField(term621, term621.getClass(), "values", term655);
        setField(term621, term621.getClass(), "states", term688);
        setDoubleField(term621, term621.getClass(), "missingEntries", Double.NaN);
        setIntField(term621, term621.getClass(), "size", 1622346318);
        setIntField(term621, term621.getClass(), "mask", 31);
        setIntField(term621, term621.getClass(), "count", 1048535127);
        setField(term618, term618.getClass(), "entries", term621);
        term6094 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        Object term6095 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        int[] term6096 = (int[]) newIntArray(32);
        double[] term6097 = (double[]) newDoubleArray(32);
        byte[] term6098 = (byte[]) newByteArray(32);
        setIntField(term6094, term6094.getClass(), "rows", -1685132342);
        setIntField(term6094, term6094.getClass(), "columns", -1456670397);
        setField(term6095, term6095.getClass(), "keys", term6096);
        setField(term6095, term6095.getClass(), "values", term6097);
        setField(term6095, term6095.getClass(), "states", term6098);
        setDoubleField(term6095, term6095.getClass(), "missingEntries", Double.NaN);
        setIntField(term6095, term6095.getClass(), "size", 1622346318);
        setIntField(term6095, term6095.getClass(), "mask", 31);
        setIntField(term6095, term6095.getClass(), "count", 1048535127);
        setField(term6094, term6094.getClass(), "entries", term6095);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getColumnDimension", argTypes, term618, args);
        assertTrue(recursiveEquals(term618, term6094));
        assertTrue(recursiveEquals(retValue, -1456670397));
    }

};


