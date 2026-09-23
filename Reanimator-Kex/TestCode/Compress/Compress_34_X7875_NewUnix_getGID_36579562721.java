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

public class X7875_NewUnix_getGID_36579562721 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23;
     Object term295;

    public X7875_NewUnix_getGID_36579562721() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        Object term25 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term27 = (int[]) newIntArray(1);
        setIntField(term23, term23.getClass(), "version", 1);
        setIntField(term25, term25.getClass(), "signum", 1);
        setIntElement(term27, 0, 1000);
        setField(term25, term25.getClass(), "mag", term27);
        setIntField(term25, term25.getClass(), "bitCountPlusOne", 0);
        setIntField(term25, term25.getClass(), "bitLengthPlusOne", 0);
        setIntField(term25, term25.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term25, term25.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term23, term23.getClass(), "uid", term25);
        setField(term23, term23.getClass(), "gid", term25);
        term295 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        Object term296 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term297 = (int[]) newIntArray(1);
        setIntField(term295, term295.getClass(), "version", 1);
        setIntField(term296, term296.getClass(), "signum", 1);
        setIntElement(term297, 0, 1000);
        setField(term296, term296.getClass(), "mag", term297);
        setIntField(term296, term296.getClass(), "bitCountPlusOne", 0);
        setIntField(term296, term296.getClass(), "bitLengthPlusOne", 11);
        setIntField(term296, term296.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term296, term296.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term295, term295.getClass(), "uid", term296);
        setField(term295, term295.getClass(), "gid", term296);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X7875_NewUnix");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getGID", argTypes, term23, args);
        assertTrue(recursiveEquals(term23, term295));
        assertTrue(recursiveEquals(retValue, 1000L));
    }

};


