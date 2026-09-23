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

public class X7875_NewUnix_toString_166779993031 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term165;
     Object term958;

    public X7875_NewUnix_toString_166779993031() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term165 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        Object term167 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term169 = (int[]) newIntArray(1);
        setIntField(term165, term165.getClass(), "version", 1);
        setIntField(term167, term167.getClass(), "signum", 1);
        setIntElement(term169, 0, 1000);
        setField(term167, term167.getClass(), "mag", term169);
        setIntField(term167, term167.getClass(), "bitCountPlusOne", 0);
        setIntField(term167, term167.getClass(), "bitLengthPlusOne", 0);
        setIntField(term167, term167.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term167, term167.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term165, term165.getClass(), "uid", term167);
        setField(term165, term165.getClass(), "gid", term167);
        term958 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        Object term959 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term960 = (int[]) newIntArray(1);
        setIntField(term958, term958.getClass(), "version", 1);
        setIntField(term959, term959.getClass(), "signum", 1);
        setIntElement(term960, 0, 1000);
        setField(term959, term959.getClass(), "mag", term960);
        setIntField(term959, term959.getClass(), "bitCountPlusOne", 0);
        setIntField(term959, term959.getClass(), "bitLengthPlusOne", 0);
        setIntField(term959, term959.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term959, term959.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term958, term958.getClass(), "uid", term959);
        setField(term958, term958.getClass(), "gid", term959);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X7875_NewUnix");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term165, args);
        assertTrue(recursiveEquals(term165, term958));
        assertTrue(recursiveEquals(retValue, "0x7875 Zip Extra Field: UID=1000 GID=1000"));
    }

};


