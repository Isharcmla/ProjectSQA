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

public class OpenMapRealVector_getLInfDistance_956447732189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term195936;

    public OpenMapRealVector_getLInfDistance_956447732189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term195936 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term196044 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] term195002 = (byte[]) newByteArray(31);
        setIntField(term196044, term196044.getClass(), "count", 0);
        setByteElement(term195002, 20, (byte) 1);
        setByteElement(term195002, 21, (byte) 1);
        setByteElement(term195002, 22, (byte) 1);
        setByteElement(term195002, 23, (byte) 1);
        setByteElement(term195002, 24, (byte) 1);
        setByteElement(term195002, 25, (byte) 1);
        setByteElement(term195002, 26, (byte) 1);
        setByteElement(term195002, 27, (byte) 1);
        setByteElement(term195002, 28, (byte) 1);
        setByteElement(term195002, 29, (byte) 1);
        setByteElement(term195002, 30, (byte) 1);
        setField(term196044, term196044.getClass(), "states", term195002);
        setField(term195936, term195936.getClass(), "entries", term196044);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getLInfDistance", argTypes, term195936, args);
    }

};


