package org.apache.commons.compress.archivers.zip;

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
import static org.apache.commons.compress.archivers.zip.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class X7875_NewUnix_parseFromLocalFileData_33048120528 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term104;
     Object term114;
     Object term120;
     Object term122;

    public X7875_NewUnix_parseFromLocalFileData_33048120528() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term104 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        Object term106 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term108 = (int[]) newIntArray(1);
        setIntField(term104, term104.getClass(), "version", 1);
        setIntField(term106, term106.getClass(), "signum", 1);
        setIntElement(term108, 0, 1000);
        setField(term106, term106.getClass(), "mag", term108);
        setIntField(term106, term106.getClass(), "bitCountPlusOne", 0);
        setIntField(term106, term106.getClass(), "bitLengthPlusOne", 0);
        setIntField(term106, term106.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term106, term106.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term104, term104.getClass(), "uid", term106);
        setField(term104, term104.getClass(), "gid", term106);
        term114 = (byte[]) newByteArray(5);
        setByteElement(term114, 0, (byte) 47);
        setByteElement(term114, 1, (byte) 48);
        setByteElement(term114, 2, (byte) 89);
        setByteElement(term114, 3, (byte) 75);
        setByteElement(term114, 4, (byte) 18);
        term120 = new Integer(568599855);
        term122 = new Integer(1162663216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X7875_NewUnix");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term114;
        args[1] = term120;
        args[2] = term122;
        try {
            callMethod(klass, "parseFromLocalFileData", argTypes, term104, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


