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

public class X7875_NewUnix_setUID_91035057922 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34;
     Object term44;
     Object term333;

    public X7875_NewUnix_setUID_91035057922() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        Object term36 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term38 = (int[]) newIntArray(1);
        setIntField(term34, term34.getClass(), "version", 1);
        setIntField(term36, term36.getClass(), "signum", 1);
        setIntElement(term38, 0, 1000);
        setField(term36, term36.getClass(), "mag", term38);
        setIntField(term36, term36.getClass(), "bitCountPlusOne", 0);
        setIntField(term36, term36.getClass(), "bitLengthPlusOne", 0);
        setIntField(term36, term36.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term36, term36.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term34, term34.getClass(), "uid", term36);
        setField(term34, term34.getClass(), "gid", term36);
        term44 = new Long(2442117782898005296L);
        term333 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        Object term334 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term335 = (int[]) newIntArray(2);
        Object term336 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term337 = (int[]) newIntArray(1);
        setIntField(term333, term333.getClass(), "version", 1);
        setIntField(term334, term334.getClass(), "signum", 1);
        setIntElement(term335, 0, 568599855);
        setIntElement(term335, 1, 1162663216);
        setField(term334, term334.getClass(), "mag", term335);
        setIntField(term334, term334.getClass(), "bitCountPlusOne", 0);
        setIntField(term334, term334.getClass(), "bitLengthPlusOne", 0);
        setIntField(term334, term334.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term334, term334.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term333, term333.getClass(), "uid", term334);
        setIntField(term336, term336.getClass(), "signum", 1);
        setIntElement(term337, 0, 1000);
        setField(term336, term336.getClass(), "mag", term337);
        setIntField(term336, term336.getClass(), "bitCountPlusOne", 0);
        setIntField(term336, term336.getClass(), "bitLengthPlusOne", 0);
        setIntField(term336, term336.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term336, term336.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term333, term333.getClass(), "gid", term336);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X7875_NewUnix");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = long.class;
        Object[] args = new Object[1];
        args[0] = term44;
        callMethod(klass, "setUID", argTypes, term34, args);
        assertTrue(recursiveEquals(term34, term333));
        assertTrue(recursiveEquals(term44, 2442117782898005296L));
    }

};


