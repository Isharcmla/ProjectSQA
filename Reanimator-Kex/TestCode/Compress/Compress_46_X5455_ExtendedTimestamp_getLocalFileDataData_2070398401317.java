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

public class X5455_ExtendedTimestamp_getLocalFileDataData_2070398401317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65242;
     Object term65394;
     Object term65388;

    public X5455_ExtendedTimestamp_getLocalFileDataData_2070398401317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65242 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term65346 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setBooleanField(term65242, term65242.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term65242, term65242.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term65242, term65242.getClass(), "bit2_createTimePresent", true);
        setField(term65242, term65242.getClass(), "createTime", term65346);
        term65394 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term65395 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term65394, term65394.getClass(), "flags", (byte) 0);
        setBooleanField(term65394, term65394.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term65394, term65394.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term65394, term65394.getClass(), "bit2_createTimePresent", true);
        setField(term65394, term65394.getClass(), "modifyTime", null);
        setField(term65394, term65394.getClass(), "accessTime", null);
        setLongField(term65395, term65395.getClass(), "value", 0L);
        setField(term65394, term65394.getClass(), "createTime", term65395);
        term65388 = (byte[]) newByteArray(5);
        setByteElement(term65388, 0, (byte) 4);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLocalFileDataData", argTypes, term65242, args);
        assertTrue(recursiveEquals(term65242, term65394));
        assertTrue(recursiveEquals(retValue, term65388));
    }

};


