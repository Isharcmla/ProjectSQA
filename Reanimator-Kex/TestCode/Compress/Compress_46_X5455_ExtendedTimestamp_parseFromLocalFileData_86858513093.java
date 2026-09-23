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

public class X5455_ExtendedTimestamp_parseFromLocalFileData_86858513093 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6085;
     Object term5904;
     Object term6339;
     Object term6340;

    public X5455_ExtendedTimestamp_parseFromLocalFileData_86858513093() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6085 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term6189 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term6293 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term6085, term6085.getClass(), "flags", (byte) 0);
        setBooleanField(term6085, term6085.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term6085, term6085.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term6085, term6085.getClass(), "bit2_createTimePresent", false);
        setField(term6085, term6085.getClass(), "modifyTime", term6189);
        setField(term6085, term6085.getClass(), "accessTime", term6293);
        setField(term6085, term6085.getClass(), "createTime", null);
        term5904 = (byte[]) newByteArray(12);
        term6339 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setByteField(term6339, term6339.getClass(), "flags", (byte) 0);
        setBooleanField(term6339, term6339.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term6339, term6339.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term6339, term6339.getClass(), "bit2_createTimePresent", false);
        setField(term6339, term6339.getClass(), "modifyTime", null);
        setField(term6339, term6339.getClass(), "accessTime", null);
        setField(term6339, term6339.getClass(), "createTime", null);
        term6340 = (byte[]) newByteArray(12);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term5904;
        args[1] = 11;
        args[2] = 0;
        callMethod(klass, "parseFromLocalFileData", argTypes, term6085, args);
        assertTrue(recursiveEquals(term6085, term6339));
        assertTrue(recursiveEquals(term5904, term6340));
    }

};


