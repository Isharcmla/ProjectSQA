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

public class X7875_NewUnix_getHeaderId_114164770019 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term243;
     Object term231;

    public X7875_NewUnix_getHeaderId_114164770019() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        Object term3 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term5 = (int[]) newIntArray(1);
        setIntField(term1, term1.getClass(), "version", 1);
        setIntField(term3, term3.getClass(), "signum", 1);
        setIntElement(term5, 0, 1000);
        setField(term3, term3.getClass(), "mag", term5);
        setIntField(term3, term3.getClass(), "bitCountPlusOne", 0);
        setIntField(term3, term3.getClass(), "bitLengthPlusOne", 0);
        setIntField(term3, term3.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term3, term3.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term1, term1.getClass(), "uid", term3);
        setField(term1, term1.getClass(), "gid", term3);
        term243 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        Object term244 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term245 = (int[]) newIntArray(1);
        setIntField(term243, term243.getClass(), "version", 1);
        setIntField(term244, term244.getClass(), "signum", 1);
        setIntElement(term245, 0, 1000);
        setField(term244, term244.getClass(), "mag", term245);
        setIntField(term244, term244.getClass(), "bitCountPlusOne", 0);
        setIntField(term244, term244.getClass(), "bitLengthPlusOne", 0);
        setIntField(term244, term244.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term244, term244.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term243, term243.getClass(), "uid", term244);
        setField(term243, term243.getClass(), "gid", term244);
        term231 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipShort"));
        setIntField(term231, term231.getClass(), "value", 30837);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X7875_NewUnix");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getHeaderId", argTypes, term1, args);
        assertTrue(recursiveEquals(term1, term243));
        assertTrue(recursiveEquals(retValue, term231));
    }

};


