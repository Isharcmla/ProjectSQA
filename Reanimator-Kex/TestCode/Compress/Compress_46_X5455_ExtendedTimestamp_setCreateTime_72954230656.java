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

public class X5455_ExtendedTimestamp_setCreateTime_72954230656 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term268;
     Object term279;
     Object term1465;
     Object term1469;

    public X5455_ExtendedTimestamp_setCreateTime_72954230656() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term268 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term273 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term275 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term277 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term268, term268.getClass(), "flags", (byte) 98);
        setBooleanField(term268, term268.getClass(), "bit0_modifyTimePresent", true);
        setBooleanField(term268, term268.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term268, term268.getClass(), "bit2_createTimePresent", false);
        setLongField(term273, term273.getClass(), "value", 414749984815662075L);
        setField(term268, term268.getClass(), "modifyTime", term273);
        setLongField(term275, term275.getClass(), "value", 463622836963501975L);
        setField(term268, term268.getClass(), "accessTime", term275);
        setLongField(term277, term277.getClass(), "value", 305759998609888272L);
        setField(term268, term268.getClass(), "createTime", term277);
        term279 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setLongField(term279, term279.getClass(), "value", -8654565919063661957L);
        term1465 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term1466 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term1467 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term1468 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term1465, term1465.getClass(), "flags", (byte) 102);
        setBooleanField(term1465, term1465.getClass(), "bit0_modifyTimePresent", true);
        setBooleanField(term1465, term1465.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term1465, term1465.getClass(), "bit2_createTimePresent", true);
        setLongField(term1466, term1466.getClass(), "value", 414749984815662075L);
        setField(term1465, term1465.getClass(), "modifyTime", term1466);
        setLongField(term1467, term1467.getClass(), "value", 463622836963501975L);
        setField(term1465, term1465.getClass(), "accessTime", term1467);
        setLongField(term1468, term1468.getClass(), "value", -8654565919063661957L);
        setField(term1465, term1465.getClass(), "createTime", term1468);
        term1469 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setLongField(term1469, term1469.getClass(), "value", -8654565919063661957L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.zip.ZipLong");
        Object[] args = new Object[1];
        args[0] = term279;
        callMethod(klass, "setCreateTime", argTypes, term268, args);
        assertTrue(recursiveEquals(term268, term1465));
        assertTrue(recursiveEquals(term279, term1469));
    }

};


