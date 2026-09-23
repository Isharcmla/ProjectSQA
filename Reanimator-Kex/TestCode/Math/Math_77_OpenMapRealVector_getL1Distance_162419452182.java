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

public class OpenMapRealVector_getL1Distance_162419452182 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term184926;

    public OpenMapRealVector_getL1Distance_162419452182() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term184926 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term185034 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] term184109 = (byte[]) newByteArray(31);
        setIntField(term185034, term185034.getClass(), "count", 0);
        setByteElement(term184109, 17, (byte) 1);
        setByteElement(term184109, 18, (byte) 1);
        setByteElement(term184109, 19, (byte) 1);
        setByteElement(term184109, 20, (byte) 1);
        setByteElement(term184109, 21, (byte) 1);
        setByteElement(term184109, 22, (byte) 1);
        setByteElement(term184109, 23, (byte) 1);
        setByteElement(term184109, 24, (byte) 1);
        setByteElement(term184109, 25, (byte) 1);
        setByteElement(term184109, 26, (byte) 1);
        setByteElement(term184109, 27, (byte) 1);
        setByteElement(term184109, 28, (byte) 1);
        setByteElement(term184109, 29, (byte) 1);
        setByteElement(term184109, 30, (byte) 1);
        setField(term185034, term185034.getClass(), "states", term184109);
        setField(term184926, term184926.getClass(), "entries", term185034);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getL1Distance", argTypes, term184926, args);
    }

};


