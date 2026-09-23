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

public class X5455_ExtendedTimestamp_getCentralDirectoryData_957298860341 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71320;
     Object term71487;
     Object term71485;

    public X5455_ExtendedTimestamp_getCentralDirectoryData_957298860341() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71320 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term71424 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setBooleanField(term71320, term71320.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term71320, term71320.getClass(), "bit1_accessTimePresent", true);
        setField(term71320, term71320.getClass(), "accessTime", null);
        setBooleanField(term71320, term71320.getClass(), "bit2_createTimePresent", true);
        setField(term71320, term71320.getClass(), "createTime", term71424);
        term71487 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term71488 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term71487, term71487.getClass(), "flags", (byte) 0);
        setBooleanField(term71487, term71487.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term71487, term71487.getClass(), "bit1_accessTimePresent", true);
        setBooleanField(term71487, term71487.getClass(), "bit2_createTimePresent", true);
        setField(term71487, term71487.getClass(), "modifyTime", null);
        setField(term71487, term71487.getClass(), "accessTime", null);
        setLongField(term71488, term71488.getClass(), "value", 0L);
        setField(term71487, term71487.getClass(), "createTime", term71488);
        term71485 = (byte[]) newByteArray(1);
        setByteElement(term71485, 0, (byte) 4);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getCentralDirectoryData", argTypes, term71320, args);
        assertTrue(recursiveEquals(term71320, term71487));
        assertTrue(recursiveEquals(retValue, term71485));
    }

};


