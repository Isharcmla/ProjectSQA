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

public class X5455_ExtendedTimestamp_getLocalFileDataLength_948918694289 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term57795;
     Object term57915;
     Object term57905;

    public X5455_ExtendedTimestamp_getLocalFileDataLength_948918694289() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term57795 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term57899 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setBooleanField(term57795, term57795.getClass(), "bit0_modifyTimePresent", true);
        setBooleanField(term57795, term57795.getClass(), "bit1_accessTimePresent", true);
        setField(term57795, term57795.getClass(), "accessTime", term57899);
        setBooleanField(term57795, term57795.getClass(), "bit2_createTimePresent", true);
        term57915 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term57916 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term57915, term57915.getClass(), "flags", (byte) 0);
        setBooleanField(term57915, term57915.getClass(), "bit0_modifyTimePresent", true);
        setBooleanField(term57915, term57915.getClass(), "bit1_accessTimePresent", true);
        setBooleanField(term57915, term57915.getClass(), "bit2_createTimePresent", true);
        setField(term57915, term57915.getClass(), "modifyTime", null);
        setLongField(term57916, term57916.getClass(), "value", 0L);
        setField(term57915, term57915.getClass(), "accessTime", term57916);
        setField(term57915, term57915.getClass(), "createTime", null);
        term57905 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipShort"));
        setIntField(term57905, term57905.getClass(), "value", 9);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLocalFileDataLength", argTypes, term57795, args);
        assertTrue(recursiveEquals(term57795, term57915));
        assertTrue(recursiveEquals(retValue, term57905));
    }

};


