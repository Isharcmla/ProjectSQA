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

public class X7875_NewUnix_getCentralDirectoryData_41919493527 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93;
     Object term542;
     Object term531;

    public X7875_NewUnix_getCentralDirectoryData_41919493527() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term93 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        Object term95 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term97 = (int[]) newIntArray(1);
        setIntField(term93, term93.getClass(), "version", 1);
        setIntField(term95, term95.getClass(), "signum", 1);
        setIntElement(term97, 0, 1000);
        setField(term95, term95.getClass(), "mag", term97);
        setIntField(term95, term95.getClass(), "bitCountPlusOne", 0);
        setIntField(term95, term95.getClass(), "bitLengthPlusOne", 0);
        setIntField(term95, term95.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term95, term95.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term93, term93.getClass(), "uid", term95);
        setField(term93, term93.getClass(), "gid", term95);
        term542 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        Object term543 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term544 = (int[]) newIntArray(1);
        setIntField(term542, term542.getClass(), "version", 1);
        setIntField(term543, term543.getClass(), "signum", 1);
        setIntElement(term544, 0, 1000);
        setField(term543, term543.getClass(), "mag", term544);
        setIntField(term543, term543.getClass(), "bitCountPlusOne", 0);
        setIntField(term543, term543.getClass(), "bitLengthPlusOne", 0);
        setIntField(term543, term543.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term543, term543.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term542, term542.getClass(), "uid", term543);
        setField(term542, term542.getClass(), "gid", term543);
        term531 = (byte[]) newByteArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X7875_NewUnix");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getCentralDirectoryData", argTypes, term93, args);
        assertTrue(recursiveEquals(term93, term542));
        assertTrue(recursiveEquals(retValue, term531));
    }

};


