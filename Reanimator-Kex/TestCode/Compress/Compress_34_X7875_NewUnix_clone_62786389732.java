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

public class X7875_NewUnix_clone_62786389732 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176;
     Object term1029;
     Object term1004;

    public X7875_NewUnix_clone_62786389732() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term176 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        Object term178 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term180 = (int[]) newIntArray(1);
        setIntField(term176, term176.getClass(), "version", 1);
        setIntField(term178, term178.getClass(), "signum", 1);
        setIntElement(term180, 0, 1000);
        setField(term178, term178.getClass(), "mag", term180);
        setIntField(term178, term178.getClass(), "bitCountPlusOne", 0);
        setIntField(term178, term178.getClass(), "bitLengthPlusOne", 0);
        setIntField(term178, term178.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term178, term178.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term176, term176.getClass(), "uid", term178);
        setField(term176, term176.getClass(), "gid", term178);
        term1029 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        Object term1030 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1031 = (int[]) newIntArray(1);
        setIntField(term1029, term1029.getClass(), "version", 1);
        setIntField(term1030, term1030.getClass(), "signum", 1);
        setIntElement(term1031, 0, 1000);
        setField(term1030, term1030.getClass(), "mag", term1031);
        setIntField(term1030, term1030.getClass(), "bitCountPlusOne", 0);
        setIntField(term1030, term1030.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1030, term1030.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1030, term1030.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1029, term1029.getClass(), "uid", term1030);
        setField(term1029, term1029.getClass(), "gid", term1030);
        term1004 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        Object term1006 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term1008 = (int[]) newIntArray(1);
        setIntField(term1004, term1004.getClass(), "version", 1);
        setIntField(term1006, term1006.getClass(), "signum", 1);
        setIntElement(term1008, 0, 1000);
        setField(term1006, term1006.getClass(), "mag", term1008);
        setIntField(term1006, term1006.getClass(), "bitCountPlusOne", 0);
        setIntField(term1006, term1006.getClass(), "bitLengthPlusOne", 0);
        setIntField(term1006, term1006.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term1006, term1006.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1004, term1004.getClass(), "uid", term1006);
        setField(term1004, term1004.getClass(), "gid", term1006);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X7875_NewUnix");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "clone", argTypes, term176, args);
        assertTrue(recursiveEquals(term176, term1029));
        assertTrue(recursiveEquals(retValue, term1004));
    }

};


