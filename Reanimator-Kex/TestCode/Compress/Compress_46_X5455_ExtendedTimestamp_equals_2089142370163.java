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

public class X5455_ExtendedTimestamp_equals_2089142370163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23418;
     Object term23762;
     Object term23840;
     Object term23843;

    public X5455_ExtendedTimestamp_equals_2089142370163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23418 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term23814 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term23626 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term23418, term23418.getClass(), "flags", (byte) 0);
        setField(term23418, term23418.getClass(), "modifyTime", term23814);
        setField(term23418, term23418.getClass(), "accessTime", term23626);
        term23762 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setByteField(term23762, term23762.getClass(), "flags", (byte) 0);
        setField(term23762, term23762.getClass(), "modifyTime", term23814);
        setField(term23762, term23762.getClass(), "accessTime", null);
        term23840 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term23841 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term23842 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term23840, term23840.getClass(), "flags", (byte) 0);
        setBooleanField(term23840, term23840.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term23840, term23840.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term23840, term23840.getClass(), "bit2_createTimePresent", false);
        setLongField(term23841, term23841.getClass(), "value", 0L);
        setField(term23840, term23840.getClass(), "modifyTime", term23841);
        setLongField(term23842, term23842.getClass(), "value", 0L);
        setField(term23840, term23840.getClass(), "accessTime", term23842);
        setField(term23840, term23840.getClass(), "createTime", null);
        term23843 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term23844 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term23843, term23843.getClass(), "flags", (byte) 0);
        setBooleanField(term23843, term23843.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term23843, term23843.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term23843, term23843.getClass(), "bit2_createTimePresent", false);
        setLongField(term23844, term23844.getClass(), "value", 0L);
        setField(term23843, term23843.getClass(), "modifyTime", term23844);
        setField(term23843, term23843.getClass(), "accessTime", null);
        setField(term23843, term23843.getClass(), "createTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term23762;
        Object retValue = callMethod(klass, "equals", argTypes, term23418, args);
        assertTrue(recursiveEquals(term23418, term23840));
        assertTrue(recursiveEquals(term23762, term23843));
        assertTrue(recursiveEquals(retValue, false));
    }

};


