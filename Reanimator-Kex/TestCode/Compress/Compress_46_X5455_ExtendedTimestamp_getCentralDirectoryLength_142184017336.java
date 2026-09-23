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

public class X5455_ExtendedTimestamp_getCentralDirectoryLength_142184017336 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23;
     Object term430;
     Object term416;

    public X5455_ExtendedTimestamp_getCentralDirectoryLength_142184017336() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term28 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term30 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term32 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term23, term23.getClass(), "flags", (byte) 89);
        setBooleanField(term23, term23.getClass(), "bit0_modifyTimePresent", true);
        setBooleanField(term23, term23.getClass(), "bit1_accessTimePresent", true);
        setBooleanField(term23, term23.getClass(), "bit2_createTimePresent", false);
        setLongField(term28, term28.getClass(), "value", 4872422362414183754L);
        setField(term23, term23.getClass(), "modifyTime", term28);
        setLongField(term30, term30.getClass(), "value", 6811161968424632369L);
        setField(term23, term23.getClass(), "accessTime", term30);
        setLongField(term32, term32.getClass(), "value", -7237588299778557629L);
        setField(term23, term23.getClass(), "createTime", term32);
        term430 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term431 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term432 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term433 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term430, term430.getClass(), "flags", (byte) 89);
        setBooleanField(term430, term430.getClass(), "bit0_modifyTimePresent", true);
        setBooleanField(term430, term430.getClass(), "bit1_accessTimePresent", true);
        setBooleanField(term430, term430.getClass(), "bit2_createTimePresent", false);
        setLongField(term431, term431.getClass(), "value", 4872422362414183754L);
        setField(term430, term430.getClass(), "modifyTime", term431);
        setLongField(term432, term432.getClass(), "value", 6811161968424632369L);
        setField(term430, term430.getClass(), "accessTime", term432);
        setLongField(term433, term433.getClass(), "value", -7237588299778557629L);
        setField(term430, term430.getClass(), "createTime", term433);
        term416 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipShort"));
        setIntField(term416, term416.getClass(), "value", 5);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getCentralDirectoryLength", argTypes, term23, args);
        assertTrue(recursiveEquals(term23, term430));
        assertTrue(recursiveEquals(retValue, term416));
    }

};


