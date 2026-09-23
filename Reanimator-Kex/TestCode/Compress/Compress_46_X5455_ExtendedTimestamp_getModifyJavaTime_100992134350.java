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

public class X5455_ExtendedTimestamp_getModifyJavaTime_100992134350 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term207;
     Object term1359;
     Object term1346;

    public X5455_ExtendedTimestamp_getModifyJavaTime_100992134350() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term207 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term212 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term214 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term216 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term207, term207.getClass(), "flags", (byte) 23);
        setBooleanField(term207, term207.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term207, term207.getClass(), "bit1_accessTimePresent", true);
        setBooleanField(term207, term207.getClass(), "bit2_createTimePresent", false);
        setLongField(term212, term212.getClass(), "value", -4443169559037975007L);
        setField(term207, term207.getClass(), "modifyTime", term212);
        setLongField(term214, term214.getClass(), "value", -3842548265506930260L);
        setField(term207, term207.getClass(), "accessTime", term214);
        setLongField(term216, term216.getClass(), "value", -5788180182343976541L);
        setField(term207, term207.getClass(), "createTime", term216);
        term1359 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term1360 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term1361 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term1362 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term1359, term1359.getClass(), "flags", (byte) 23);
        setBooleanField(term1359, term1359.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term1359, term1359.getClass(), "bit1_accessTimePresent", true);
        setBooleanField(term1359, term1359.getClass(), "bit2_createTimePresent", false);
        setLongField(term1360, term1360.getClass(), "value", -4443169559037975007L);
        setField(term1359, term1359.getClass(), "modifyTime", term1360);
        setLongField(term1361, term1361.getClass(), "value", -3842548265506930260L);
        setField(term1359, term1359.getClass(), "accessTime", term1361);
        setLongField(term1362, term1362.getClass(), "value", -5788180182343976541L);
        setField(term1359, term1359.getClass(), "createTime", term1362);
        term1346 = newInstance(Class.forName("java.util.Date"));
        setLongField(term1346, term1346.getClass(), "fastTime", -1263114719000L);
        setField(term1346, term1346.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getModifyJavaTime", argTypes, term207, args);
        assertTrue(recursiveEquals(term207, term1359));
        assertTrue(recursiveEquals(retValue, term1346));
    }

};


