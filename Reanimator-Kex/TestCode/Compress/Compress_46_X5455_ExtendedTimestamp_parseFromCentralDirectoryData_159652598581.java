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

public class X5455_ExtendedTimestamp_parseFromCentralDirectoryData_159652598581 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5160;
     Object term4970;
     Object term5415;
     Object term5416;

    public X5455_ExtendedTimestamp_parseFromCentralDirectoryData_159652598581() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5160 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term5264 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term5368 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term5160, term5160.getClass(), "flags", (byte) 0);
        setBooleanField(term5160, term5160.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term5160, term5160.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term5160, term5160.getClass(), "bit2_createTimePresent", false);
        setField(term5160, term5160.getClass(), "modifyTime", term5264);
        setField(term5160, term5160.getClass(), "accessTime", term5368);
        setField(term5160, term5160.getClass(), "createTime", null);
        term4970 = (byte[]) newByteArray(12);
        term5415 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setByteField(term5415, term5415.getClass(), "flags", (byte) 0);
        setBooleanField(term5415, term5415.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term5415, term5415.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term5415, term5415.getClass(), "bit2_createTimePresent", false);
        setField(term5415, term5415.getClass(), "modifyTime", null);
        setField(term5415, term5415.getClass(), "accessTime", null);
        setField(term5415, term5415.getClass(), "createTime", null);
        term5416 = (byte[]) newByteArray(12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term4970;
        args[1] = 11;
        args[2] = 0;
        callMethod(klass, "parseFromCentralDirectoryData", argTypes, term5160, args);
        assertTrue(recursiveEquals(term5160, term5415));
        assertTrue(recursiveEquals(term4970, term5416));
    }

};


