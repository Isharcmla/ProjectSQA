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

public class ArrayRealVector_mapInvToSelf_1615123170146 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term202;
     Object term7053;
     Object term7051;

    public ArrayRealVector_mapInvToSelf_1615123170146() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term202 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term203 = (double[]) newDoubleArray(0);
        setField(term202, term202.getClass(), "data", term203);
        term7053 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term7054 = (double[]) newDoubleArray(0);
        setField(term7053, term7053.getClass(), "data", term7054);
        term7051 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term7052 = (double[]) newDoubleArray(0);
        setField(term7051, term7051.getClass(), "data", term7052);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "mapInvToSelf", argTypes, term202, args);
        assertTrue(recursiveEquals(term202, term7053));
        assertTrue(recursiveEquals(retValue, term7051));
    }

};


