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

public class OpenMapRealVector_isInfinite_1550398858130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term127606;

    public OpenMapRealVector_isInfinite_1550398858130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term127606 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term127714 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] term126399 = (byte[]) newByteArray(31);
        setIntField(term127714, term127714.getClass(), "count", 0);
        setByteElement(term126399, 27, (byte) 1);
        setByteElement(term126399, 28, (byte) 1);
        setByteElement(term126399, 29, (byte) 1);
        setByteElement(term126399, 30, (byte) 1);
        setField(term127714, term127714.getClass(), "states", term126399);
        setField(term127606, term127606.getClass(), "entries", term127714);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isInfinite", argTypes, term127606, args);
    }

};


