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

public class X5455_ExtendedTimestamp_getCreateJavaTime_96128627553 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term231;
     Object term1412;
     Object term1399;

    public X5455_ExtendedTimestamp_getCreateJavaTime_96128627553() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term231 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term236 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term238 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term240 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term231, term231.getClass(), "flags", (byte) 36);
        setBooleanField(term231, term231.getClass(), "bit0_modifyTimePresent", true);
        setBooleanField(term231, term231.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term231, term231.getClass(), "bit2_createTimePresent", false);
        setLongField(term236, term236.getClass(), "value", -1468719814009985452L);
        setField(term231, term231.getClass(), "modifyTime", term236);
        setLongField(term238, term238.getClass(), "value", -7738503207562305297L);
        setField(term231, term231.getClass(), "accessTime", term238);
        setLongField(term240, term240.getClass(), "value", 3825396310311739952L);
        setField(term231, term231.getClass(), "createTime", term240);
        term1412 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term1413 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term1414 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term1415 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term1412, term1412.getClass(), "flags", (byte) 36);
        setBooleanField(term1412, term1412.getClass(), "bit0_modifyTimePresent", true);
        setBooleanField(term1412, term1412.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term1412, term1412.getClass(), "bit2_createTimePresent", false);
        setLongField(term1413, term1413.getClass(), "value", -1468719814009985452L);
        setField(term1412, term1412.getClass(), "modifyTime", term1413);
        setLongField(term1414, term1414.getClass(), "value", -7738503207562305297L);
        setField(term1412, term1412.getClass(), "accessTime", term1414);
        setLongField(term1415, term1415.getClass(), "value", 3825396310311739952L);
        setField(term1412, term1412.getClass(), "createTime", term1415);
        term1399 = newInstance(Class.forName("java.util.Date"));
        setLongField(term1399, term1399.getClass(), "fastTime", 691577392000L);
        setField(term1399, term1399.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getCreateJavaTime", argTypes, term231, args);
        assertTrue(recursiveEquals(term231, term1412));
        assertTrue(recursiveEquals(retValue, term1399));
    }

};


