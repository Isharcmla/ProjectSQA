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

public class X7875_NewUnix_getCentralDirectoryLength_195994409825 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71;
     Object term453;
     Object term451;

    public X7875_NewUnix_getCentralDirectoryLength_195994409825() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        Object term73 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term75 = (int[]) newIntArray(1);
        setIntField(term71, term71.getClass(), "version", 1);
        setIntField(term73, term73.getClass(), "signum", 1);
        setIntElement(term75, 0, 1000);
        setField(term73, term73.getClass(), "mag", term75);
        setIntField(term73, term73.getClass(), "bitCountPlusOne", 0);
        setIntField(term73, term73.getClass(), "bitLengthPlusOne", 0);
        setIntField(term73, term73.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term73, term73.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term71, term71.getClass(), "uid", term73);
        setField(term71, term71.getClass(), "gid", term73);
        term453 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X7875_NewUnix"));
        Object term454 = newInstance(Class.forName("java.math.BigInteger"));
        int[] term455 = (int[]) newIntArray(1);
        setIntField(term453, term453.getClass(), "version", 1);
        setIntField(term454, term454.getClass(), "signum", 1);
        setIntElement(term455, 0, 1000);
        setField(term454, term454.getClass(), "mag", term455);
        setIntField(term454, term454.getClass(), "bitCountPlusOne", 0);
        setIntField(term454, term454.getClass(), "bitLengthPlusOne", 11);
        setIntField(term454, term454.getClass(), "lowestSetBitPlusTwo", 0);
        setIntField(term454, term454.getClass(), "firstNonzeroIntNumPlusTwo", 0);
        setField(term453, term453.getClass(), "uid", term454);
        setField(term453, term453.getClass(), "gid", term454);
        term451 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipShort"));
        setIntField(term451, term451.getClass(), "value", 7);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X7875_NewUnix");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getCentralDirectoryLength", argTypes, term71, args);
        assertTrue(recursiveEquals(term71, term453));
        assertTrue(recursiveEquals(retValue, term451));
    }

};


