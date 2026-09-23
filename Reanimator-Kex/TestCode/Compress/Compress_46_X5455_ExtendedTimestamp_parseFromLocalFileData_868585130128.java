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
import java.lang.Object;

public class X5455_ExtendedTimestamp_parseFromLocalFileData_868585130128 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14397;
     Object term14222;

    public X5455_ExtendedTimestamp_parseFromLocalFileData_868585130128() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14397 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term14501 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term14605 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term14397, term14397.getClass(), "flags", (byte) 0);
        setBooleanField(term14397, term14397.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term14397, term14397.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term14397, term14397.getClass(), "bit2_createTimePresent", false);
        setField(term14397, term14397.getClass(), "modifyTime", term14501);
        setField(term14397, term14397.getClass(), "accessTime", term14605);
        setField(term14397, term14397.getClass(), "createTime", null);
        term14222 = (byte[]) newByteArray(0);
        setByteElement(term14222, -1, (byte) 2);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term14222;
        args[1] = -1;
        args[2] = 0;
        callMethod(klass, "parseFromLocalFileData", argTypes, term14397, args);
    }

};


