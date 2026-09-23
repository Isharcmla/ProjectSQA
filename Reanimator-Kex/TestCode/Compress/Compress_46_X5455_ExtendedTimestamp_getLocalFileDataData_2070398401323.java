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

public class X5455_ExtendedTimestamp_getLocalFileDataData_2070398401323 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66152;
     Object term66304;
     Object term66298;

    public X5455_ExtendedTimestamp_getLocalFileDataData_2070398401323() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66152 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term66256 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setBooleanField(term66152, term66152.getClass(), "bit0_modifyTimePresent", true);
        setBooleanField(term66152, term66152.getClass(), "bit1_accessTimePresent", true);
        setField(term66152, term66152.getClass(), "accessTime", null);
        setBooleanField(term66152, term66152.getClass(), "bit2_createTimePresent", false);
        setField(term66152, term66152.getClass(), "modifyTime", term66256);
        term66304 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term66305 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term66304, term66304.getClass(), "flags", (byte) 0);
        setBooleanField(term66304, term66304.getClass(), "bit0_modifyTimePresent", true);
        setBooleanField(term66304, term66304.getClass(), "bit1_accessTimePresent", true);
        setBooleanField(term66304, term66304.getClass(), "bit2_createTimePresent", false);
        setLongField(term66305, term66305.getClass(), "value", 0L);
        setField(term66304, term66304.getClass(), "modifyTime", term66305);
        setField(term66304, term66304.getClass(), "accessTime", null);
        setField(term66304, term66304.getClass(), "createTime", null);
        term66298 = (byte[]) newByteArray(5);
        setByteElement(term66298, 0, (byte) 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLocalFileDataData", argTypes, term66152, args);
        assertTrue(recursiveEquals(term66152, term66304));
        assertTrue(recursiveEquals(retValue, term66298));
    }

};


