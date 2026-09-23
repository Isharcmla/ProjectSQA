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
import java.lang.Long;

public class X7875_NewUnix_setGID_92327987323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47;
     Object term57;
     Object term375;

    public X7875_NewUnix_setGID_92327987323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        Object term49 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term51 = (int[]) newIntArray(1);
        setIntField(term47, term47.getClass(), "version", 1);
        setIntField(term49, term49.getClass(), "signum", 1);
        setIntElement(term51, 0, 1000);
        setField(term49, term49.getClass(), "mag", term51);
        setIntField(term49, term49.getClass(), "bitCountPlusOne", 0);
        setIntField(term49, term49.getClass(), "bitLengthPlusOne", 0);
        setIntField(term49, term49.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term49, term49.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term47, term47.getClass(), "uid", term49);
        setField(term47, term47.getClass(), "gid", term49);
        term57 = new Long(6375119433582206027L);
        term375 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        Object term376 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term377 = (int[]) newIntArray(1);
        Object term378 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term379 = (int[]) newIntArray(2);
        setIntField(term375, term375.getClass(), "version", 1);
        setIntField(term376, term376.getClass(), "signum", 1);
        setIntElement(term377, 0, 1000);
        setField(term376, term376.getClass(), "mag", term377);
        setIntField(term376, term376.getClass(), "bitCountPlusOne", 0);
        setIntField(term376, term376.getClass(), "bitLengthPlusOne", 0);
        setIntField(term376, term376.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term376, term376.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term375, term375.getClass(), "uid", term376);
        setIntField(term378, term378.getClass(), "signum", 1);
        setIntElement(term379, 0, 1484323161);
        setIntElement(term379, 1, 391863371);
        setField(term378, term378.getClass(), "mag", term379);
        setIntField(term378, term378.getClass(), "bitCountPlusOne", 0);
        setIntField(term378, term378.getClass(), "bitLengthPlusOne", 0);
        setIntField(term378, term378.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term378, term378.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term375, term375.getClass(), "gid", term378);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X7875_NewUnix");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term57;
        callMethod(klass, "setGID", argTypes, term47, args);
        assertTrue(recursiveEquals(term47, term375));
        assertTrue(recursiveEquals(term57, 6375119433582206027L));
    }

};


