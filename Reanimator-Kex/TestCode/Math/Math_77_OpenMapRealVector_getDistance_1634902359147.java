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

public class OpenMapRealVector_getDistance_1634902359147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term163488;
     Object term163698;

    public OpenMapRealVector_getDistance_1634902359147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term163488 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term163596 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] term161944 = (byte[]) newByteArray(32);
        setIntField(term163596, term163596.getClass(), "count", 0);
        setByteElement(term161944, 0, (byte) -128);
        setByteElement(term161944, 4, (byte) -128);
        setByteElement(term161944, 5, (byte) -128);
        setByteElement(term161944, 7, (byte) -128);
        setByteElement(term161944, 9, (byte) -128);
        setByteElement(term161944, 14, (byte) -128);
        setByteElement(term161944, 15, (byte) -128);
        setByteElement(term161944, 21, (byte) -128);
        setByteElement(term161944, 22, (byte) -128);
        setByteElement(term161944, 25, (byte) -128);
        setByteElement(term161944, 26, (byte) -128);
        setField(term163596, term163596.getClass(), "states", term161944);
        setField(term163488, term163488.getClass(), "entries", term163596);
        term163698 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term163806 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] term163045 = (byte[]) newByteArray(5);
        setIntField(term163806, term163806.getClass(), "count", 0);
        setByteElement(term163045, 4, (byte) -128);
        setField(term163806, term163806.getClass(), "states", term163045);
        setField(term163698, term163698.getClass(), "entries", term163806);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Object[] args = new Object[1];
        args[0] = term163698;
        callMethod(klass, "getDistance", argTypes, term163488, args);
    }

};


