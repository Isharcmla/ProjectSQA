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

public class OpenMapRealVector_getLInfDistance_956447732191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term198974;
     Object term199184;

    public OpenMapRealVector_getLInfDistance_956447732191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term198974 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term199082 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] term197074 = (byte[]) newByteArray(32);
        setIntField(term199082, term199082.getClass(), "count", 0);
        setByteElement(term197074, 0, (byte) -128);
        setByteElement(term197074, 2, (byte) -128);
        setByteElement(term197074, 3, (byte) -128);
        setByteElement(term197074, 6, (byte) -128);
        setByteElement(term197074, 8, (byte) -128);
        setByteElement(term197074, 14, (byte) -128);
        setByteElement(term197074, 17, (byte) -128);
        setByteElement(term197074, 20, (byte) -128);
        setByteElement(term197074, 29, (byte) -128);
        setField(term199082, term199082.getClass(), "states", term197074);
        setField(term198974, term198974.getClass(), "entries", term199082);
        term199184 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term199292 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] term198174 = (byte[]) newByteArray(17);
        setIntField(term199292, term199292.getClass(), "count", 0);
        setByteElement(term198174, 0, (byte) -128);
        setByteElement(term198174, 5, (byte) -128);
        setByteElement(term198174, 16, (byte) -128);
        setField(term199292, term199292.getClass(), "states", term198174);
        setField(term199184, term199184.getClass(), "entries", term199292);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Object[] args = new Object[1];
        args[0] = term199184;
        callMethod(klass, "getLInfDistance", argTypes, term198974, args);
    }

};


