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

public class X5455_ExtendedTimestamp_getLocalFileDataData_2070398401319 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65603;
     Object term65779;
     Object term65769;

    public X5455_ExtendedTimestamp_getLocalFileDataData_2070398401319() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65603 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term65707 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setBooleanField(term65603, term65603.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term65603, term65603.getClass(), "bit1_accessTimePresent", true);
        setField(term65603, term65603.getClass(), "accessTime", term65707);
        setBooleanField(term65603, term65603.getClass(), "bit2_createTimePresent", true);
        setField(term65603, term65603.getClass(), "createTime", term65707);
        term65779 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term65780 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term65779, term65779.getClass(), "flags", (byte) 0);
        setBooleanField(term65779, term65779.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term65779, term65779.getClass(), "bit1_accessTimePresent", true);
        setBooleanField(term65779, term65779.getClass(), "bit2_createTimePresent", true);
        setField(term65779, term65779.getClass(), "modifyTime", null);
        setLongField(term65780, term65780.getClass(), "value", 0L);
        setField(term65779, term65779.getClass(), "accessTime", term65780);
        setField(term65779, term65779.getClass(), "createTime", term65780);
        term65769 = (byte[]) newByteArray(9);
        setByteElement(term65769, 0, (byte) 6);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLocalFileDataData", argTypes, term65603, args);
        assertTrue(recursiveEquals(term65603, term65779));
        assertTrue(recursiveEquals(retValue, term65769));
    }

};


