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

public class X5455_ExtendedTimestamp_getCentralDirectoryData_957298860333 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69091;
     Object term69384;
     Object term69378;

    public X5455_ExtendedTimestamp_getCentralDirectoryData_957298860333() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69091 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term69195 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term69299 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setBooleanField(term69091, term69091.getClass(), "bit0_modifyTimePresent", true);
        setBooleanField(term69091, term69091.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term69091, term69091.getClass(), "bit2_createTimePresent", true);
        setField(term69091, term69091.getClass(), "createTime", term69195);
        setField(term69091, term69091.getClass(), "modifyTime", term69299);
        term69384 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term69385 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term69386 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term69384, term69384.getClass(), "flags", (byte) 0);
        setBooleanField(term69384, term69384.getClass(), "bit0_modifyTimePresent", true);
        setBooleanField(term69384, term69384.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term69384, term69384.getClass(), "bit2_createTimePresent", true);
        setLongField(term69385, term69385.getClass(), "value", 0L);
        setField(term69384, term69384.getClass(), "modifyTime", term69385);
        setField(term69384, term69384.getClass(), "accessTime", null);
        setLongField(term69386, term69386.getClass(), "value", 0L);
        setField(term69384, term69384.getClass(), "createTime", term69386);
        term69378 = (byte[]) newByteArray(5);
        setByteElement(term69378, 0, (byte) 5);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getCentralDirectoryData", argTypes, term69091, args);
        assertTrue(recursiveEquals(term69091, term69384));
        assertTrue(recursiveEquals(retValue, term69378));
    }

};


