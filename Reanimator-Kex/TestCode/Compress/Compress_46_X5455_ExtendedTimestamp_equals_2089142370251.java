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

public class X5455_ExtendedTimestamp_equals_2089142370251 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47469;
     Object term47917;
     Object term48164;
     Object term48168;

    public X5455_ExtendedTimestamp_equals_2089142370251() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47469 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term47969 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term48021 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term47781 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term47469, term47469.getClass(), "flags", (byte) 0);
        setField(term47469, term47469.getClass(), "modifyTime", term47969);
        setField(term47469, term47469.getClass(), "accessTime", term48021);
        setLongField(term47781, term47781.getClass(), "value", -9160575678517616254L);
        setField(term47469, term47469.getClass(), "createTime", term47781);
        term47917 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term48125 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term47917, term47917.getClass(), "flags", (byte) 0);
        setField(term47917, term47917.getClass(), "modifyTime", term47969);
        setField(term47917, term47917.getClass(), "accessTime", term48021);
        setLongField(term48125, term48125.getClass(), "value", 9151566235274583805L);
        setField(term47917, term47917.getClass(), "createTime", term48125);
        term48164 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term48165 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term48166 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term48167 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term48164, term48164.getClass(), "flags", (byte) 0);
        setBooleanField(term48164, term48164.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term48164, term48164.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term48164, term48164.getClass(), "bit2_createTimePresent", false);
        setLongField(term48165, term48165.getClass(), "value", 0L);
        setField(term48164, term48164.getClass(), "modifyTime", term48165);
        setLongField(term48166, term48166.getClass(), "value", 0L);
        setField(term48164, term48164.getClass(), "accessTime", term48166);
        setLongField(term48167, term48167.getClass(), "value", -9160575678517616254L);
        setField(term48164, term48164.getClass(), "createTime", term48167);
        term48168 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term48169 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term48170 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term48171 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term48168, term48168.getClass(), "flags", (byte) 0);
        setBooleanField(term48168, term48168.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term48168, term48168.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term48168, term48168.getClass(), "bit2_createTimePresent", false);
        setLongField(term48169, term48169.getClass(), "value", 0L);
        setField(term48168, term48168.getClass(), "modifyTime", term48169);
        setLongField(term48170, term48170.getClass(), "value", 0L);
        setField(term48168, term48168.getClass(), "accessTime", term48170);
        setLongField(term48171, term48171.getClass(), "value", 9151566235274583805L);
        setField(term48168, term48168.getClass(), "createTime", term48171);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term47917;
        Object retValue = callMethod(klass, "equals", argTypes, term47469, args);
        assertTrue(recursiveEquals(term47469, term48164));
        assertTrue(recursiveEquals(term47917, term48168));
        assertTrue(recursiveEquals(retValue, false));
    }

};


