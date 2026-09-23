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

public class X5455_ExtendedTimestamp_setAccessJavaTime_1924577725 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term294;
     Object term305;

    public X5455_ExtendedTimestamp_setAccessJavaTime_1924577725() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term294 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term299 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term301 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term303 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term294, term294.getClass(), "flags", (byte) 66);
        setBooleanField(term294, term294.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term294, term294.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term294, term294.getClass(), "bit2_createTimePresent", false);
        setLongField(term299, term299.getClass(), "value", 6682528376118987775L);
        setField(term294, term294.getClass(), "modifyTime", term299);
        setLongField(term301, term301.getClass(), "value", 682356318767179819L);
        setField(term294, term294.getClass(), "accessTime", term301);
        setLongField(term303, term303.getClass(), "value", -7291743527973326814L);
        setField(term294, term294.getClass(), "createTime", term303);
        term305 = newInstance(Class.forName("java.util.Date"));
        setLongField(term305, term305.getClass(), "fastTime", 1480456351369L);
        setField(term305, term305.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term305;
        callMethod(klass, "setAccessJavaTime", argTypes, term294, args);
    }

};


