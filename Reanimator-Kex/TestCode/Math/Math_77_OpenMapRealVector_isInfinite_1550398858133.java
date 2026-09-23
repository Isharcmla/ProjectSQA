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

public class OpenMapRealVector_isInfinite_1550398858133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107349;

    public OpenMapRealVector_isInfinite_1550398858133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107349 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term107457 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] term106981 = (byte[]) newByteArray(15);
        setIntField(term107457, term107457.getClass(), "count", 0);
        setByteElement(term106981, 10, (byte) 1);
        setByteElement(term106981, 11, (byte) 1);
        setByteElement(term106981, 12, (byte) 1);
        setByteElement(term106981, 13, (byte) 1);
        setByteElement(term106981, 14, (byte) 1);
        setField(term107457, term107457.getClass(), "states", term106981);
        setField(term107349, term107349.getClass(), "entries", term107457);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isInfinite", argTypes, term107349, args);
    }

};


