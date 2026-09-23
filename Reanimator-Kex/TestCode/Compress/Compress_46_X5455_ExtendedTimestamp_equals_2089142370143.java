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

public class X5455_ExtendedTimestamp_equals_2089142370143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17623;
     Object term17863;
     Object term18000;
     Object term18002;

    public X5455_ExtendedTimestamp_equals_2089142370143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17623 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term17727 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term17623, term17623.getClass(), "flags", (byte) 0);
        setLongField(term17727, term17727.getClass(), "value", -125960193L);
        setField(term17623, term17623.getClass(), "modifyTime", term17727);
        term17863 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term17967 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term17863, term17863.getClass(), "flags", (byte) 0);
        setLongField(term17967, term17967.getClass(), "value", 125960192L);
        setField(term17863, term17863.getClass(), "modifyTime", term17967);
        term18000 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term18001 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term18000, term18000.getClass(), "flags", (byte) 0);
        setBooleanField(term18000, term18000.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term18000, term18000.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term18000, term18000.getClass(), "bit2_createTimePresent", false);
        setLongField(term18001, term18001.getClass(), "value", -125960193L);
        setField(term18000, term18000.getClass(), "modifyTime", term18001);
        setField(term18000, term18000.getClass(), "accessTime", null);
        setField(term18000, term18000.getClass(), "createTime", null);
        term18002 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term18003 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term18002, term18002.getClass(), "flags", (byte) 0);
        setBooleanField(term18002, term18002.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term18002, term18002.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term18002, term18002.getClass(), "bit2_createTimePresent", false);
        setLongField(term18003, term18003.getClass(), "value", 125960192L);
        setField(term18002, term18002.getClass(), "modifyTime", term18003);
        setField(term18002, term18002.getClass(), "accessTime", null);
        setField(term18002, term18002.getClass(), "createTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term17863;
        Object retValue = callMethod(klass, "equals", argTypes, term17623, args);
        assertTrue(recursiveEquals(term17623, term18000));
        assertTrue(recursiveEquals(term17863, term18002));
        assertTrue(recursiveEquals(retValue, false));
    }

};


