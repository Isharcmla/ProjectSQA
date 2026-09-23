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

public class ArrayRealVector_mapLog10ToSelf_927096916135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180;
     Object term6998;
     Object term6996;

    public ArrayRealVector_mapLog10ToSelf_927096916135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term180 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term181 = (double[]) newDoubleArray(0);
        setField(term180, term180.getClass(), "data", term181);
        term6998 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term6999 = (double[]) newDoubleArray(0);
        setField(term6998, term6998.getClass(), "data", term6999);
        term6996 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term6997 = (double[]) newDoubleArray(0);
        setField(term6996, term6996.getClass(), "data", term6997);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "mapLog10ToSelf", argTypes, term180, args);
        assertTrue(recursiveEquals(term180, term6998));
        assertTrue(recursiveEquals(retValue, term6996));
    }

};


