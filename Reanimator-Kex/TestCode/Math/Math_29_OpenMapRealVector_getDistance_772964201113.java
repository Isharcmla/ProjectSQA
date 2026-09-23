package org.apache.commons.math3.linear;

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
import static org.apache.commons.math3.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class OpenMapRealVector_getDistance_772964201113 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term194819;

    public OpenMapRealVector_getDistance_772964201113() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term194819 = newInstance(Class.forName("org.apache.commons.math3.linear.OpenMapRealVector"));
        Object term194929 = newInstance(Class.forName("org.apache.commons.math3.util.OpenIntToDoubleHashMap"));
        byte[] term194015 = (byte[]) newByteArray(22);
        setIntField(term194929, term194929.getClass(), "count", 0);
        setField(term194929, term194929.getClass(), "states", term194015);
        setField(term194819, term194819.getClass(), "entries", term194929);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math3.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math3.linear.OpenMapRealVector");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "getDistance", argTypes, term194819, args);
    }

};


