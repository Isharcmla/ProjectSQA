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

public class X5455_ExtendedTimestamp_setCreateJavaTime_18428917526 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term307;
     Object term318;

    public X5455_ExtendedTimestamp_setCreateJavaTime_18428917526() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term307 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term312 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term314 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term316 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term307, term307.getClass(), "flags", (byte) -121);
        setBooleanField(term307, term307.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term307, term307.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term307, term307.getClass(), "bit2_createTimePresent", false);
        setLongField(term312, term312.getClass(), "value", -5963439350418910964L);
        setField(term307, term307.getClass(), "modifyTime", term312);
        setLongField(term314, term314.getClass(), "value", 9013624480170062917L);
        setField(term307, term307.getClass(), "accessTime", term314);
        setLongField(term316, term316.getClass(), "value", 7862575738391801707L);
        setField(term307, term307.getClass(), "createTime", term316);
        term318 = newInstance(Class.forName("java.util.Date"));
        setLongField(term318, term318.getClass(), "fastTime", 1610958182830L);
        setField(term318, term318.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term318;
        callMethod(klass, "setCreateJavaTime", argTypes, term307, args);
    }

};


