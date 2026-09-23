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

public class X5455_ExtendedTimestamp_equals_2089142370177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26716;
     Object term27164;
     Object term27498;
     Object term27502;

    public X5455_ExtendedTimestamp_equals_2089142370177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26716 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term27216 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term26924 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term27028 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term26716, term26716.getClass(), "flags", (byte) 0);
        setField(term26716, term26716.getClass(), "modifyTime", term27216);
        setLongField(term26924, term26924.getClass(), "value", -3429438403390648474L);
        setField(term26716, term26716.getClass(), "accessTime", term26924);
        setLongField(term27028, term27028.getClass(), "value", -6734814566188149579L);
        setField(term26716, term26716.getClass(), "createTime", term27028);
        term27164 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term27320 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term27424 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term27164, term27164.getClass(), "flags", (byte) 0);
        setField(term27164, term27164.getClass(), "modifyTime", term27216);
        setLongField(term27320, term27320.getClass(), "value", -3429438403390648474L);
        setField(term27164, term27164.getClass(), "accessTime", term27320);
        setLongField(term27424, term27424.getClass(), "value", -3429438403390648474L);
        setField(term27164, term27164.getClass(), "createTime", term27424);
        term27498 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term27499 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term27500 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term27501 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term27498, term27498.getClass(), "flags", (byte) 0);
        setBooleanField(term27498, term27498.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term27498, term27498.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term27498, term27498.getClass(), "bit2_createTimePresent", false);
        setLongField(term27499, term27499.getClass(), "value", 0L);
        setField(term27498, term27498.getClass(), "modifyTime", term27499);
        setLongField(term27500, term27500.getClass(), "value", -3429438403390648474L);
        setField(term27498, term27498.getClass(), "accessTime", term27500);
        setLongField(term27501, term27501.getClass(), "value", -6734814566188149579L);
        setField(term27498, term27498.getClass(), "createTime", term27501);
        term27502 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term27503 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term27504 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term27505 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term27502, term27502.getClass(), "flags", (byte) 0);
        setBooleanField(term27502, term27502.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term27502, term27502.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term27502, term27502.getClass(), "bit2_createTimePresent", false);
        setLongField(term27503, term27503.getClass(), "value", 0L);
        setField(term27502, term27502.getClass(), "modifyTime", term27503);
        setLongField(term27504, term27504.getClass(), "value", -3429438403390648474L);
        setField(term27502, term27502.getClass(), "accessTime", term27504);
        setLongField(term27505, term27505.getClass(), "value", -3429438403390648474L);
        setField(term27502, term27502.getClass(), "createTime", term27505);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term27164;
        Object retValue = callMethod(klass, "equals", argTypes, term26716, args);
        assertTrue(recursiveEquals(term26716, term27498));
        assertTrue(recursiveEquals(term27164, term27502));
        assertTrue(recursiveEquals(retValue, false));
    }

};


