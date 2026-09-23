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

public class X5455_ExtendedTimestamp_getLocalFileDataLength_948918694303 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61057;
     Object term61177;
     Object term61167;

    public X5455_ExtendedTimestamp_getLocalFileDataLength_948918694303() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61057 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term61161 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setBooleanField(term61057, term61057.getClass(), "bit0_modifyTimePresent", true);
        setBooleanField(term61057, term61057.getClass(), "bit1_accessTimePresent", true);
        setField(term61057, term61057.getClass(), "accessTime", term61161);
        setBooleanField(term61057, term61057.getClass(), "bit2_createTimePresent", true);
        setField(term61057, term61057.getClass(), "createTime", term61161);
        term61177 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term61178 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term61177, term61177.getClass(), "flags", (byte) 0);
        setBooleanField(term61177, term61177.getClass(), "bit0_modifyTimePresent", true);
        setBooleanField(term61177, term61177.getClass(), "bit1_accessTimePresent", true);
        setBooleanField(term61177, term61177.getClass(), "bit2_createTimePresent", true);
        setField(term61177, term61177.getClass(), "modifyTime", null);
        setLongField(term61178, term61178.getClass(), "value", 0L);
        setField(term61177, term61177.getClass(), "accessTime", term61178);
        setField(term61177, term61177.getClass(), "createTime", term61178);
        term61167 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipShort"));
        setIntField(term61167, term61167.getClass(), "value", 13);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLocalFileDataLength", argTypes, term61057, args);
        assertTrue(recursiveEquals(term61057, term61177));
        assertTrue(recursiveEquals(retValue, term61167));
    }

};


