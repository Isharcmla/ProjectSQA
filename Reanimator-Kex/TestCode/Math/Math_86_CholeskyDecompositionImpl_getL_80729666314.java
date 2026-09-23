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

public class CholeskyDecompositionImpl_getL_80729666314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3824;
     Object term4157;
     Object term4153;

    public CholeskyDecompositionImpl_getL_80729666314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3824 = newInstance(Class.forName("org.apache.commons.math.linear.CholeskyDecompositionImpl"));
        Object term3926 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(term3824, term3824.getClass(), "cachedL", term3926);
        term4157 = newInstance(Class.forName("org.apache.commons.math.linear.CholeskyDecompositionImpl"));
        Object term4158 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setField(term4157, term4157.getClass(), "lTData", null);
        setIntField(term4158, term4158.getClass(), "rowDimension", 0);
        setIntField(term4158, term4158.getClass(), "columnDimension", 0);
        setField(term4158, term4158.getClass(), "entries", null);
        setField(term4158, term4158.getClass(), "lu", null);
        setField(term4157, term4157.getClass(), "cachedL", term4158);
        setField(term4157, term4157.getClass(), "cachedLT", null);
        term4153 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        setIntField(term4153, term4153.getClass(), "rowDimension", 0);
        setIntField(term4153, term4153.getClass(), "columnDimension", 0);
        setField(term4153, term4153.getClass(), "entries", null);
        setField(term4153, term4153.getClass(), "lu", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.CholeskyDecompositionImpl");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getL", argTypes, term3824, args);
        assertTrue(recursiveEquals(term3824, term4157));
        assertTrue(recursiveEquals(retValue, term4153));
    }

};


