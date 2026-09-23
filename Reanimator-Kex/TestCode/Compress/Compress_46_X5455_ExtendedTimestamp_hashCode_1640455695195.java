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

public class X5455_ExtendedTimestamp_hashCode_1640455695195 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34316;
     Object term34438;

    public X5455_ExtendedTimestamp_hashCode_1640455695195() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term34316 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term34420 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term34316, term34316.getClass(), "flags", (byte) 0);
        setLongField(term34420, term34420.getClass(), "value", 0L);
        setField(term34316, term34316.getClass(), "modifyTime", term34420);
        setField(term34316, term34316.getClass(), "accessTime", term34420);
        setField(term34316, term34316.getClass(), "createTime", null);
        term34438 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term34439 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term34438, term34438.getClass(), "flags", (byte) 0);
        setBooleanField(term34438, term34438.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term34438, term34438.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term34438, term34438.getClass(), "bit2_createTimePresent", false);
        setLongField(term34439, term34439.getClass(), "value", 0L);
        setField(term34438, term34438.getClass(), "modifyTime", term34439);
        setField(term34438, term34438.getClass(), "accessTime", term34439);
        setField(term34438, term34438.getClass(), "createTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term34316, args);
        assertTrue(recursiveEquals(term34316, term34438));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


