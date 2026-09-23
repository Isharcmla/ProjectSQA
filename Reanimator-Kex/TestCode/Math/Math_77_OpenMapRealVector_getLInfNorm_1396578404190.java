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

public class OpenMapRealVector_getLInfNorm_1396578404190 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term196903;

    public OpenMapRealVector_getLInfNorm_1396578404190() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term196903 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term197011 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] term196086 = (byte[]) newByteArray(31);
        setIntField(term197011, term197011.getClass(), "count", 0);
        setByteElement(term196086, 17, (byte) 1);
        setByteElement(term196086, 18, (byte) 1);
        setByteElement(term196086, 19, (byte) 1);
        setByteElement(term196086, 20, (byte) 1);
        setByteElement(term196086, 21, (byte) 1);
        setByteElement(term196086, 22, (byte) 1);
        setByteElement(term196086, 23, (byte) 1);
        setByteElement(term196086, 24, (byte) 1);
        setByteElement(term196086, 25, (byte) 1);
        setByteElement(term196086, 26, (byte) 1);
        setByteElement(term196086, 27, (byte) 1);
        setByteElement(term196086, 28, (byte) 1);
        setByteElement(term196086, 29, (byte) 1);
        setByteElement(term196086, 30, (byte) 1);
        setField(term197011, term197011.getClass(), "states", term196086);
        setField(term196903, term196903.getClass(), "entries", term197011);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLInfNorm", argTypes, term196903, args);
    }

};


