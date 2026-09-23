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

public class X5455_ExtendedTimestamp_equals_2089142370329 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67817;
     Object term68265;
     Object term68534;
     Object term68538;

    public X5455_ExtendedTimestamp_equals_2089142370329() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67817 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term67921 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term68025 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term68129 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term67817, term67817.getClass(), "flags", (byte) 0);
        setLongField(term67921, term67921.getClass(), "value", 0L);
        setField(term67817, term67817.getClass(), "modifyTime", term67921);
        setLongField(term68025, term68025.getClass(), "value", -1L);
        setField(term67817, term67817.getClass(), "accessTime", term68025);
        setField(term67817, term67817.getClass(), "createTime", term68129);
        term68265 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term68369 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term68473 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term68265, term68265.getClass(), "flags", (byte) 0);
        setLongField(term68369, term68369.getClass(), "value", 0L);
        setField(term68265, term68265.getClass(), "modifyTime", term68369);
        setLongField(term68473, term68473.getClass(), "value", -1L);
        setField(term68265, term68265.getClass(), "accessTime", term68473);
        setField(term68265, term68265.getClass(), "createTime", null);
        term68534 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term68535 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term68536 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term68537 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term68534, term68534.getClass(), "flags", (byte) 0);
        setBooleanField(term68534, term68534.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term68534, term68534.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term68534, term68534.getClass(), "bit2_createTimePresent", false);
        setLongField(term68535, term68535.getClass(), "value", 0L);
        setField(term68534, term68534.getClass(), "modifyTime", term68535);
        setLongField(term68536, term68536.getClass(), "value", -1L);
        setField(term68534, term68534.getClass(), "accessTime", term68536);
        setLongField(term68537, term68537.getClass(), "value", 0L);
        setField(term68534, term68534.getClass(), "createTime", term68537);
        term68538 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term68539 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term68540 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term68538, term68538.getClass(), "flags", (byte) 0);
        setBooleanField(term68538, term68538.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term68538, term68538.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term68538, term68538.getClass(), "bit2_createTimePresent", false);
        setLongField(term68539, term68539.getClass(), "value", 0L);
        setField(term68538, term68538.getClass(), "modifyTime", term68539);
        setLongField(term68540, term68540.getClass(), "value", -1L);
        setField(term68538, term68538.getClass(), "accessTime", term68540);
        setField(term68538, term68538.getClass(), "createTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term68265;
        Object retValue = callMethod(klass, "equals", argTypes, term67817, args);
        assertTrue(recursiveEquals(term67817, term68534));
        assertTrue(recursiveEquals(term68265, term68538));
        assertTrue(recursiveEquals(retValue, false));
    }

};


