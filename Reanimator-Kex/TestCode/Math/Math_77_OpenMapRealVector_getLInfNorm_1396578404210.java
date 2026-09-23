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

public class OpenMapRealVector_getLInfNorm_1396578404210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term252189;

    public OpenMapRealVector_getLInfNorm_1396578404210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term252189 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealVector"));
        Object term252297 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] term250850 = (byte[]) newByteArray(128);
        setIntField(term252297, term252297.getClass(), "count", 0);
        setByteElement(term250850, 8, (byte) 1);
        setByteElement(term250850, 9, (byte) 1);
        setByteElement(term250850, 10, (byte) 1);
        setByteElement(term250850, 11, (byte) 1);
        setByteElement(term250850, 12, (byte) 1);
        setByteElement(term250850, 13, (byte) 1);
        setByteElement(term250850, 14, (byte) 1);
        setByteElement(term250850, 15, (byte) 1);
        setByteElement(term250850, 16, (byte) 1);
        setByteElement(term250850, 17, (byte) 1);
        setByteElement(term250850, 18, (byte) 1);
        setByteElement(term250850, 19, (byte) 1);
        setByteElement(term250850, 20, (byte) 1);
        setByteElement(term250850, 21, (byte) 1);
        setByteElement(term250850, 22, (byte) 1);
        setByteElement(term250850, 23, (byte) 1);
        setByteElement(term250850, 24, (byte) 1);
        setByteElement(term250850, 25, (byte) 1);
        setByteElement(term250850, 26, (byte) 1);
        setByteElement(term250850, 27, (byte) 1);
        setByteElement(term250850, 28, (byte) 1);
        setByteElement(term250850, 29, (byte) 1);
        setByteElement(term250850, 30, (byte) 1);
        setByteElement(term250850, 31, (byte) 1);
        setByteElement(term250850, 32, (byte) 1);
        setByteElement(term250850, 33, (byte) 1);
        setByteElement(term250850, 34, (byte) 1);
        setByteElement(term250850, 35, (byte) 1);
        setByteElement(term250850, 36, (byte) 1);
        setByteElement(term250850, 37, (byte) 1);
        setByteElement(term250850, 38, (byte) 1);
        setByteElement(term250850, 39, (byte) 1);
        setByteElement(term250850, 40, (byte) 1);
        setByteElement(term250850, 41, (byte) 1);
        setByteElement(term250850, 42, (byte) 1);
        setByteElement(term250850, 43, (byte) 1);
        setByteElement(term250850, 44, (byte) 1);
        setByteElement(term250850, 45, (byte) 1);
        setByteElement(term250850, 46, (byte) 1);
        setByteElement(term250850, 47, (byte) 1);
        setByteElement(term250850, 48, (byte) 1);
        setByteElement(term250850, 49, (byte) 1);
        setByteElement(term250850, 50, (byte) 1);
        setByteElement(term250850, 51, (byte) 1);
        setByteElement(term250850, 52, (byte) 1);
        setByteElement(term250850, 53, (byte) 1);
        setByteElement(term250850, 54, (byte) 1);
        setByteElement(term250850, 55, (byte) 1);
        setByteElement(term250850, 56, (byte) 1);
        setByteElement(term250850, 57, (byte) 1);
        setByteElement(term250850, 58, (byte) 1);
        setByteElement(term250850, 59, (byte) 1);
        setByteElement(term250850, 60, (byte) 1);
        setByteElement(term250850, 61, (byte) 1);
        setByteElement(term250850, 62, (byte) 1);
        setByteElement(term250850, 63, (byte) 1);
        setByteElement(term250850, 64, (byte) 1);
        setByteElement(term250850, 65, (byte) 1);
        setByteElement(term250850, 66, (byte) 1);
        setByteElement(term250850, 67, (byte) 1);
        setByteElement(term250850, 68, (byte) 1);
        setByteElement(term250850, 69, (byte) 1);
        setByteElement(term250850, 70, (byte) 1);
        setByteElement(term250850, 71, (byte) 1);
        setByteElement(term250850, 72, (byte) 1);
        setByteElement(term250850, 73, (byte) 1);
        setByteElement(term250850, 74, (byte) 1);
        setByteElement(term250850, 75, (byte) 1);
        setByteElement(term250850, 76, (byte) 1);
        setByteElement(term250850, 77, (byte) 1);
        setByteElement(term250850, 78, (byte) 1);
        setByteElement(term250850, 79, (byte) 1);
        setByteElement(term250850, 80, (byte) 1);
        setByteElement(term250850, 81, (byte) 1);
        setByteElement(term250850, 82, (byte) 1);
        setByteElement(term250850, 83, (byte) 1);
        setByteElement(term250850, 84, (byte) 1);
        setByteElement(term250850, 85, (byte) 1);
        setByteElement(term250850, 86, (byte) 1);
        setByteElement(term250850, 87, (byte) 1);
        setByteElement(term250850, 88, (byte) 1);
        setByteElement(term250850, 89, (byte) 1);
        setByteElement(term250850, 90, (byte) 1);
        setByteElement(term250850, 91, (byte) 1);
        setByteElement(term250850, 92, (byte) 1);
        setByteElement(term250850, 93, (byte) 1);
        setByteElement(term250850, 94, (byte) 1);
        setByteElement(term250850, 95, (byte) 1);
        setByteElement(term250850, 96, (byte) 1);
        setByteElement(term250850, 97, (byte) 1);
        setByteElement(term250850, 98, (byte) 1);
        setByteElement(term250850, 99, (byte) 1);
        setByteElement(term250850, 100, (byte) 1);
        setByteElement(term250850, 101, (byte) 1);
        setByteElement(term250850, 102, (byte) 1);
        setByteElement(term250850, 103, (byte) 1);
        setByteElement(term250850, 104, (byte) 1);
        setByteElement(term250850, 105, (byte) 1);
        setByteElement(term250850, 106, (byte) 1);
        setByteElement(term250850, 107, (byte) 1);
        setByteElement(term250850, 108, (byte) 1);
        setByteElement(term250850, 109, (byte) 1);
        setByteElement(term250850, 110, (byte) 1);
        setByteElement(term250850, 111, (byte) 1);
        setByteElement(term250850, 112, (byte) 1);
        setByteElement(term250850, 113, (byte) 1);
        setByteElement(term250850, 114, (byte) 1);
        setByteElement(term250850, 115, (byte) 1);
        setByteElement(term250850, 116, (byte) 1);
        setByteElement(term250850, 117, (byte) 1);
        setByteElement(term250850, 118, (byte) 1);
        setByteElement(term250850, 119, (byte) 1);
        setByteElement(term250850, 120, (byte) 1);
        setByteElement(term250850, 121, (byte) 1);
        setByteElement(term250850, 122, (byte) 1);
        setByteElement(term250850, 123, (byte) 1);
        setByteElement(term250850, 124, (byte) 1);
        setByteElement(term250850, 125, (byte) 1);
        setByteElement(term250850, 126, (byte) 1);
        setByteElement(term250850, 127, (byte) 1);
        setField(term252297, term252297.getClass(), "states", term250850);
        setField(term252189, term252189.getClass(), "entries", term252297);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealVector");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getLInfNorm", argTypes, term252189, args);
    }

};


