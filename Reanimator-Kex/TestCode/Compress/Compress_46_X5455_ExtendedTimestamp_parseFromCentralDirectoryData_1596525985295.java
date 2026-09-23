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
import java.lang.NullPointerException;
import static org.apache.commons.compress.archivers.zip.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class X5455_ExtendedTimestamp_parseFromCentralDirectoryData_1596525985295 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59029;

    public X5455_ExtendedTimestamp_parseFromCentralDirectoryData_1596525985295() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59029 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term59133 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term59237 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term59029, term59029.getClass(), "flags", (byte) 0);
        setBooleanField(term59029, term59029.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term59029, term59029.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term59029, term59029.getClass(), "bit2_createTimePresent", false);
        setField(term59029, term59029.getClass(), "modifyTime", term59133);
        setField(term59029, term59029.getClass(), "accessTime", term59237);
        setField(term59029, term59029.getClass(), "createTime", term59237);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = 0;
        args[2] = 0;
        try {
            callMethod(klass, "parseFromCentralDirectoryData", argTypes, term59029, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


