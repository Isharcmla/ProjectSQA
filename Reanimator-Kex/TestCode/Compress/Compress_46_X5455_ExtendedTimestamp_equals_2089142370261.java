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

public class X5455_ExtendedTimestamp_equals_2089142370261 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51233;
     Object term51681;
     Object term52064;
     Object term52068;

    public X5455_ExtendedTimestamp_equals_2089142370261() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term51233 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term51337 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term51441 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term51545 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term51233, term51233.getClass(), "flags", (byte) 0);
        setLongField(term51337, term51337.getClass(), "value", 0L);
        setField(term51233, term51233.getClass(), "modifyTime", term51337);
        setLongField(term51441, term51441.getClass(), "value", -1L);
        setField(term51233, term51233.getClass(), "accessTime", term51441);
        setField(term51233, term51233.getClass(), "createTime", term51545);
        term51681 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term51785 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term51889 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term51993 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term51681, term51681.getClass(), "flags", (byte) 0);
        setLongField(term51785, term51785.getClass(), "value", 0L);
        setField(term51681, term51681.getClass(), "modifyTime", term51785);
        setLongField(term51889, term51889.getClass(), "value", -1L);
        setField(term51681, term51681.getClass(), "accessTime", term51889);
        setField(term51681, term51681.getClass(), "createTime", term51993);
        term52064 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term52065 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term52066 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term52067 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term52064, term52064.getClass(), "flags", (byte) 0);
        setBooleanField(term52064, term52064.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term52064, term52064.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term52064, term52064.getClass(), "bit2_createTimePresent", false);
        setLongField(term52065, term52065.getClass(), "value", 0L);
        setField(term52064, term52064.getClass(), "modifyTime", term52065);
        setLongField(term52066, term52066.getClass(), "value", -1L);
        setField(term52064, term52064.getClass(), "accessTime", term52066);
        setLongField(term52067, term52067.getClass(), "value", 0L);
        setField(term52064, term52064.getClass(), "createTime", term52067);
        term52068 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term52069 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term52070 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term52071 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term52068, term52068.getClass(), "flags", (byte) 0);
        setBooleanField(term52068, term52068.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term52068, term52068.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term52068, term52068.getClass(), "bit2_createTimePresent", false);
        setLongField(term52069, term52069.getClass(), "value", 0L);
        setField(term52068, term52068.getClass(), "modifyTime", term52069);
        setLongField(term52070, term52070.getClass(), "value", -1L);
        setField(term52068, term52068.getClass(), "accessTime", term52070);
        setLongField(term52071, term52071.getClass(), "value", 0L);
        setField(term52068, term52068.getClass(), "createTime", term52071);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term51681;
        Object retValue = callMethod(klass, "equals", argTypes, term51233, args);
        assertTrue(recursiveEquals(term51233, term52064));
        assertTrue(recursiveEquals(term51681, term52068));
        assertTrue(recursiveEquals(retValue, true));
    }

};


