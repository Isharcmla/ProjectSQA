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

public class ArrayRealVector_toString_1289026582199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term426;
     Object term19948;
     Object term19950;
     Object term19952;
     Object term19954;
     Object term19955;

    public ArrayRealVector_toString_1289026582199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term426 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term427 = (double[]) newDoubleArray(0);
        setField(term426, term426.getClass(), "data", term427);
        term19948 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term19949 = (double[]) newDoubleArray(0);
        setField(term19948, term19948.getClass(), "data", term19949);
        term19950 = newInstance(Class.forName("java.lang.StringBuffer"));
        byte[] term19951 = (byte[]) newByteArray(16);
        setField(term19950, term19950.getClass(), "toStringCache", null);
        setByteElement(term19951, 0, (byte) 123);
        setByteElement(term19951, 1, (byte) 125);
        setField(term19950, term19950.getClass(), "value", term19951);
        setByteField(term19950, term19950.getClass(), "coder", (byte) 0);
        setIntField(term19950, term19950.getClass(), "count", 2);
        term19952 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term19953 = (double[]) newDoubleArray(0);
        setField(term19952, term19952.getClass(), "data", term19953);
        term19954 = newInstance(Class.forName("java.text.FieldPosition"));
        setIntField(term19954, term19954.getClass(), "field", 0);
        setIntField(term19954, term19954.getClass(), "endIndex", 0);
        setIntField(term19954, term19954.getClass(), "beginIndex", 0);
        setField(term19954, term19954.getClass(), "attribute", null);
        term19955 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term19956 = (double[]) newDoubleArray(0);
        setField(term19955, term19955.getClass(), "data", term19956);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term426, args);
        assertTrue(recursiveEquals(term426, term19948));
        assertTrue(recursiveEquals(retValue, "{}"));
    }

};


