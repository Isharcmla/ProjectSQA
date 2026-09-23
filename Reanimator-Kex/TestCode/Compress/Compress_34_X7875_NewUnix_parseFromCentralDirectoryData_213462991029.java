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
import static org.apache.commons.compress.archivers.zip.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.compress.archivers.zip.EqualityUtils.*;
import java.lang.Object;
import java.lang.Integer;

public class X7875_NewUnix_parseFromCentralDirectoryData_213462991029 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term130;
     Object term140;
     Object term145;
     Object term147;
     Object term876;
     Object term879;

    public X7875_NewUnix_parseFromCentralDirectoryData_213462991029() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term130 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        Object term132 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term134 = (int[]) newIntArray(1);
        setIntField(term130, term130.getClass(), "version", 1);
        setIntField(term132, term132.getClass(), "signum", 1);
        setIntElement(term134, 0, 1000);
        setField(term132, term132.getClass(), "mag", term134);
        setIntField(term132, term132.getClass(), "bitCountPlusOne", 0);
        setIntField(term132, term132.getClass(), "bitLengthPlusOne", 0);
        setIntField(term132, term132.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term132, term132.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term130, term130.getClass(), "uid", term132);
        setField(term130, term130.getClass(), "gid", term132);
        term140 = (byte[]) newByteArray(4);
        setByteElement(term140, 0, (byte) -58);
        setByteElement(term140, 1, (byte) -29);
        setByteElement(term140, 2, (byte) -54);
        setByteElement(term140, 3, (byte) -10);
        term145 = new Integer(1484323161);
        term147 = new Integer(391863371);
        term876 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        Object term877 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term878 = (int[]) newIntArray(1);
        setIntField(term876, term876.getClass(), "version", 1);
        setIntField(term877, term877.getClass(), "signum", 1);
        setIntElement(term878, 0, 1000);
        setField(term877, term877.getClass(), "mag", term878);
        setIntField(term877, term877.getClass(), "bitCountPlusOne", 0);
        setIntField(term877, term877.getClass(), "bitLengthPlusOne", 0);
        setIntField(term877, term877.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term877, term877.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term876, term876.getClass(), "uid", term877);
        setField(term876, term876.getClass(), "gid", term877);
        term879 = (byte[]) newByteArray(4);
        setByteElement(term879, 0, (byte) -58);
        setByteElement(term879, 1, (byte) -29);
        setByteElement(term879, 2, (byte) -54);
        setByteElement(term879, 3, (byte) -10);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X7875_NewUnix");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term140;
        args[1] = term145;
        args[2] = term147;
        callMethod(klass, "parseFromCentralDirectoryData", argTypes, term130, args);
        assertTrue(recursiveEquals(term130, term876));
        assertTrue(recursiveEquals(term140, term879));
        assertTrue(recursiveEquals(term145, 1484323161));
        assertTrue(recursiveEquals(term147, 391863371));
    }

};


