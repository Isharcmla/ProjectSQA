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

public class X5455_ExtendedTimestamp_getLocalFileDataLength_948918694271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53835;
     Object term53954;
     Object term53944;

    public X5455_ExtendedTimestamp_getLocalFileDataLength_948918694271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53835 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term53939 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setBooleanField(term53835, term53835.getClass(), "bit0_modifyTimePresent", true);
        setBooleanField(term53835, term53835.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term53835, term53835.getClass(), "bit2_createTimePresent", true);
        setField(term53835, term53835.getClass(), "createTime", term53939);
        term53954 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term53955 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term53954, term53954.getClass(), "flags", (byte) 0);
        setBooleanField(term53954, term53954.getClass(), "bit0_modifyTimePresent", true);
        setBooleanField(term53954, term53954.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term53954, term53954.getClass(), "bit2_createTimePresent", true);
        setField(term53954, term53954.getClass(), "modifyTime", null);
        setField(term53954, term53954.getClass(), "accessTime", null);
        setLongField(term53955, term53955.getClass(), "value", 0L);
        setField(term53954, term53954.getClass(), "createTime", term53955);
        term53944 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipShort"));
        setIntField(term53944, term53944.getClass(), "value", 9);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLocalFileDataLength", argTypes, term53835, args);
        assertTrue(recursiveEquals(term53835, term53954));
        assertTrue(recursiveEquals(retValue, term53944));
    }

};


