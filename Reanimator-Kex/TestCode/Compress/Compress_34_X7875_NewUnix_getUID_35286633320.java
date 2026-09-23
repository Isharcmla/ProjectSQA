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

public class X7875_NewUnix_getUID_35286633320 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12;
     Object term269;

    public X7875_NewUnix_getUID_35286633320() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        Object term14 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term16 = (int[]) newIntArray(1);
        setIntField(term12, term12.getClass(), "version", 1);
        setIntField(term14, term14.getClass(), "signum", 1);
        setIntElement(term16, 0, 1000);
        setField(term14, term14.getClass(), "mag", term16);
        setIntField(term14, term14.getClass(), "bitCountPlusOne", 0);
        setIntField(term14, term14.getClass(), "bitLengthPlusOne", 0);
        setIntField(term14, term14.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term14, term14.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term12, term12.getClass(), "uid", term14);
        setField(term12, term12.getClass(), "gid", term14);
        term269 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        Object term270 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term271 = (int[]) newIntArray(1);
        setIntField(term269, term269.getClass(), "version", 1);
        setIntField(term270, term270.getClass(), "signum", 1);
        setIntElement(term271, 0, 1000);
        setField(term270, term270.getClass(), "mag", term271);
        setIntField(term270, term270.getClass(), "bitCountPlusOne", 0);
        setIntField(term270, term270.getClass(), "bitLengthPlusOne", 11);
        setIntField(term270, term270.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term270, term270.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term269, term269.getClass(), "uid", term270);
        setField(term269, term269.getClass(), "gid", term270);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X7875_NewUnix");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getUID", argTypes, term12, args);
        assertTrue(recursiveEquals(term12, term269));
        assertTrue(recursiveEquals(retValue, 1000L));
    }

};


