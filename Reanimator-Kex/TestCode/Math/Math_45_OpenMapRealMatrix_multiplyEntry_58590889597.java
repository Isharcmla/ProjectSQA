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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.math.linear.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class OpenMapRealMatrix_multiplyEntry_58590889597 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44630;

    public OpenMapRealMatrix_multiplyEntry_58590889597() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44630 = newInstance(Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix"));
        Object term44738 = newInstance(Class.forName("org.apache.commons.math.util.OpenIntToDoubleHashMap"));
        byte[] term44489 = (byte[]) newByteArray(0);
        setIntField(term44630, term44630.getClass(), "rows", 787158651);
        setIntField(term44630, term44630.getClass(), "columns", 1917286123);
        setIntField(term44738, term44738.getClass(), "mask", 0);
        setField(term44738, term44738.getClass(), "states", term44489);
        setField(term44630, term44630.getClass(), "entries", term44738);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.math.linear.OpenMapRealMatrix");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = int.class;
        argTypes[1] = int.class;
        argTypes[2] = double.class;
        Object[] args = new Object[3];
        args[0] = 787158650;
        args[1] = 33563138;
        args[2] = 0.0;
        try {
            callMethod(klass, "multiplyEntry", argTypes, term44630, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


