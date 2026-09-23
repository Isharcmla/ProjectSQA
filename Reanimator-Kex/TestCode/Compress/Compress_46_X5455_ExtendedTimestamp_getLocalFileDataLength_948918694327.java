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

public class X5455_ExtendedTimestamp_getLocalFileDataLength_948918694327 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67491;
     Object term67611;
     Object term67601;

    public X5455_ExtendedTimestamp_getLocalFileDataLength_948918694327() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67491 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term67595 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setBooleanField(term67491, term67491.getClass(), "bit0_modifyTimePresent", true);
        setBooleanField(term67491, term67491.getClass(), "bit1_accessTimePresent", true);
        setField(term67491, term67491.getClass(), "accessTime", null);
        setBooleanField(term67491, term67491.getClass(), "bit2_createTimePresent", true);
        setField(term67491, term67491.getClass(), "createTime", term67595);
        term67611 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term67612 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term67611, term67611.getClass(), "flags", (byte) 0);
        setBooleanField(term67611, term67611.getClass(), "bit0_modifyTimePresent", true);
        setBooleanField(term67611, term67611.getClass(), "bit1_accessTimePresent", true);
        setBooleanField(term67611, term67611.getClass(), "bit2_createTimePresent", true);
        setField(term67611, term67611.getClass(), "modifyTime", null);
        setField(term67611, term67611.getClass(), "accessTime", null);
        setLongField(term67612, term67612.getClass(), "value", 0L);
        setField(term67611, term67611.getClass(), "createTime", term67612);
        term67601 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipShort"));
        setIntField(term67601, term67601.getClass(), "value", 9);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLocalFileDataLength", argTypes, term67491, args);
        assertTrue(recursiveEquals(term67491, term67611));
        assertTrue(recursiveEquals(retValue, term67601));
    }

};


