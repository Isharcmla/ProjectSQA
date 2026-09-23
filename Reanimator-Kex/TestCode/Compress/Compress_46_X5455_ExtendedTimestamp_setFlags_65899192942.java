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
import java.lang.Byte;

public class X5455_ExtendedTimestamp_setFlags_65899192942 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117;
     Object term128;
     Object term1227;

    public X5455_ExtendedTimestamp_setFlags_65899192942() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term117 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term122 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term124 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term126 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term117, term117.getClass(), "flags", (byte) 67);
        setBooleanField(term117, term117.getClass(), "bit0_modifyTimePresent", true);
        setBooleanField(term117, term117.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term117, term117.getClass(), "bit2_createTimePresent", false);
        setLongField(term122, term122.getClass(), "value", 2486810210675247493L);
        setField(term117, term117.getClass(), "modifyTime", term122);
        setLongField(term124, term124.getClass(), "value", 7009926388951271268L);
        setField(term117, term117.getClass(), "accessTime", term124);
        setLongField(term126, term126.getClass(), "value", -7672528020740371001L);
        setField(term117, term117.getClass(), "createTime", term126);
        term128 = new Byte((byte) 78);
        term1227 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term1228 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term1229 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term1230 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term1227, term1227.getClass(), "flags", (byte) 78);
        setBooleanField(term1227, term1227.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term1227, term1227.getClass(), "bit1_accessTimePresent", true);
        setBooleanField(term1227, term1227.getClass(), "bit2_createTimePresent", true);
        setLongField(term1228, term1228.getClass(), "value", 2486810210675247493L);
        setField(term1227, term1227.getClass(), "modifyTime", term1228);
        setLongField(term1229, term1229.getClass(), "value", 7009926388951271268L);
        setField(term1227, term1227.getClass(), "accessTime", term1229);
        setLongField(term1230, term1230.getClass(), "value", -7672528020740371001L);
        setField(term1227, term1227.getClass(), "createTime", term1230);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = byte.class;
        Object[] args = new Object[1];
        args[0] = term128;
        callMethod(klass, "setFlags", argTypes, term117, args);
        assertTrue(recursiveEquals(term117, term1227));
        assertTrue(recursiveEquals(term128, (byte) 78));
    }

};


