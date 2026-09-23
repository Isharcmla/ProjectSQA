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

public class X7875_NewUnix_getLocalFileDataData_168646497026 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82;
     Object term519;
     Object term501;

    public X7875_NewUnix_getLocalFileDataData_168646497026() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        Object term84 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term86 = (int[]) newIntArray(1);
        setIntField(term82, term82.getClass(), "version", 1);
        setIntField(term84, term84.getClass(), "signum", 1);
        setIntElement(term86, 0, 1000);
        setField(term84, term84.getClass(), "mag", term86);
        setIntField(term84, term84.getClass(), "bitCountPlusOne", 0);
        setIntField(term84, term84.getClass(), "bitLengthPlusOne", 0);
        setIntField(term84, term84.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term84, term84.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term82, term82.getClass(), "uid", term84);
        setField(term82, term82.getClass(), "gid", term84);
        term519 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        Object term520 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term521 = (int[]) newIntArray(1);
        setIntField(term519, term519.getClass(), "version", 1);
        setIntField(term520, term520.getClass(), "signum", 1);
        setIntElement(term521, 0, 1000);
        setField(term520, term520.getClass(), "mag", term521);
        setIntField(term520, term520.getClass(), "bitCountPlusOne", 0);
        setIntField(term520, term520.getClass(), "bitLengthPlusOne", 11);
        setIntField(term520, term520.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term520, term520.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term519, term519.getClass(), "uid", term520);
        setField(term519, term519.getClass(), "gid", term520);
        term501 = (byte[]) newByteArray(7);
        setByteElement(term501, 0, (byte) 1);
        setByteElement(term501, 1, (byte) 2);
        setByteElement(term501, 2, (byte) -24);
        setByteElement(term501, 3, (byte) 3);
        setByteElement(term501, 4, (byte) 2);
        setByteElement(term501, 5, (byte) -24);
        setByteElement(term501, 6, (byte) 3);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X7875_NewUnix");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLocalFileDataData", argTypes, term82, args);
        assertTrue(recursiveEquals(term82, term519));
        assertTrue(recursiveEquals(retValue, term501));
    }

};


