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

public class X5455_ExtendedTimestamp_equals_2089142370210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37160;
     Object term37400;
     Object term37695;
     Object term37697;

    public X5455_ExtendedTimestamp_equals_2089142370210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37160 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term37264 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term37160, term37160.getClass(), "flags", (byte) 0);
        setLongField(term37264, term37264.getClass(), "value", 0L);
        setField(term37160, term37160.getClass(), "modifyTime", term37264);
        setField(term37160, term37160.getClass(), "accessTime", term37264);
        term37400 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term37504 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term37400, term37400.getClass(), "flags", (byte) 0);
        setLongField(term37504, term37504.getClass(), "value", 0L);
        setField(term37400, term37400.getClass(), "modifyTime", term37504);
        setField(term37400, term37400.getClass(), "accessTime", null);
        term37695 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term37696 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term37695, term37695.getClass(), "flags", (byte) 0);
        setBooleanField(term37695, term37695.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term37695, term37695.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term37695, term37695.getClass(), "bit2_createTimePresent", false);
        setLongField(term37696, term37696.getClass(), "value", 0L);
        setField(term37695, term37695.getClass(), "modifyTime", term37696);
        setField(term37695, term37695.getClass(), "accessTime", term37696);
        setField(term37695, term37695.getClass(), "createTime", null);
        term37697 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term37698 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term37697, term37697.getClass(), "flags", (byte) 0);
        setBooleanField(term37697, term37697.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term37697, term37697.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term37697, term37697.getClass(), "bit2_createTimePresent", false);
        setLongField(term37698, term37698.getClass(), "value", 0L);
        setField(term37697, term37697.getClass(), "modifyTime", term37698);
        setField(term37697, term37697.getClass(), "accessTime", null);
        setField(term37697, term37697.getClass(), "createTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term37400;
        Object retValue = callMethod(klass, "equals", argTypes, term37160, args);
        assertTrue(recursiveEquals(term37160, term37695));
        assertTrue(recursiveEquals(term37400, term37697));
        assertTrue(recursiveEquals(retValue, false));
    }

};


