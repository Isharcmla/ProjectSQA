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

public class ArrayRealVector_ebeMultiply_332506931256 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57486;
     Object term57584;

    public ArrayRealVector_ebeMultiply_332506931256() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57486 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        double[] term57371 = (double[]) newDoubleArray(0);
        setField(term57486, term57486.getClass(), "data", term57371);
        term57584 = newInstance(Class.forName("org.apache.commons.math.linear.ArrayRealVector"));
        setField(term57584, term57584.getClass(), "data", term57371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.ArrayRealVector");
        Object[] args = new Object[1];
        args[0] = term57584;
        callMethod(klass, "ebeMultiply", argTypes, term57486, args);
    }

};


