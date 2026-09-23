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

public class X5455_ExtendedTimestamp_parseFromLocalFileData_868585130283 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56453;

    public X5455_ExtendedTimestamp_parseFromLocalFileData_868585130283() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56453 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term56557 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term56661 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term56453, term56453.getClass(), "flags", (byte) 0);
        setBooleanField(term56453, term56453.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term56453, term56453.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term56453, term56453.getClass(), "bit2_createTimePresent", false);
        setField(term56453, term56453.getClass(), "modifyTime", term56557);
        setField(term56453, term56453.getClass(), "accessTime", term56661);
        setField(term56453, term56453.getClass(), "createTime", term56661);
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
            callMethod(klass, "parseFromLocalFileData", argTypes, term56453, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


