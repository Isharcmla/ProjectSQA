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

public class X5455_ExtendedTimestamp_getAccessJavaTime_116482122751 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term218;
     Object term1382;
     Object term1369;

    public X5455_ExtendedTimestamp_getAccessJavaTime_116482122751() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term218 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term223 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term225 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term227 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term218, term218.getClass(), "flags", (byte) -15);
        setBooleanField(term218, term218.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term218, term218.getClass(), "bit1_accessTimePresent", true);
        setBooleanField(term218, term218.getClass(), "bit2_createTimePresent", false);
        setLongField(term223, term223.getClass(), "value", 2936323121573284007L);
        setField(term218, term218.getClass(), "modifyTime", term223);
        setLongField(term225, term225.getClass(), "value", -1154553077993834885L);
        setField(term218, term218.getClass(), "accessTime", term225);
        setLongField(term227, term227.getClass(), "value", -2850532706972744550L);
        setField(term218, term218.getClass(), "createTime", term227);
        term1382 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term1383 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term1384 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term1385 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term1382, term1382.getClass(), "flags", (byte) -15);
        setBooleanField(term1382, term1382.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term1382, term1382.getClass(), "bit1_accessTimePresent", true);
        setBooleanField(term1382, term1382.getClass(), "bit2_createTimePresent", false);
        setLongField(term1383, term1383.getClass(), "value", 2936323121573284007L);
        setField(term1382, term1382.getClass(), "modifyTime", term1383);
        setLongField(term1384, term1384.getClass(), "value", -1154553077993834885L);
        setField(term1382, term1382.getClass(), "accessTime", term1384);
        setLongField(term1385, term1385.getClass(), "value", -2850532706972744550L);
        setField(term1382, term1382.getClass(), "createTime", term1385);
        term1369 = newInstance(Class.forName("java.util.Date"));
        setLongField(term1369, term1369.getClass(), "fastTime", -1210583429000L);
        setField(term1369, term1369.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getAccessJavaTime", argTypes, term218, args);
        assertTrue(recursiveEquals(term218, term1382));
        assertTrue(recursiveEquals(retValue, term1369));
    }

};


