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

public class X5455_ExtendedTimestamp_getLocalFileDataData_2070398401313 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64408;
     Object term64562;
     Object term64556;

    public X5455_ExtendedTimestamp_getLocalFileDataData_2070398401313() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64408 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term64512 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setBooleanField(term64408, term64408.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term64408, term64408.getClass(), "bit1_accessTimePresent", true);
        setField(term64408, term64408.getClass(), "accessTime", term64512);
        setBooleanField(term64408, term64408.getClass(), "bit2_createTimePresent", true);
        term64562 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term64563 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term64562, term64562.getClass(), "flags", (byte) 0);
        setBooleanField(term64562, term64562.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term64562, term64562.getClass(), "bit1_accessTimePresent", true);
        setBooleanField(term64562, term64562.getClass(), "bit2_createTimePresent", true);
        setField(term64562, term64562.getClass(), "modifyTime", null);
        setLongField(term64563, term64563.getClass(), "value", 0L);
        setField(term64562, term64562.getClass(), "accessTime", term64563);
        setField(term64562, term64562.getClass(), "createTime", null);
        term64556 = (byte[]) newByteArray(5);
        setByteElement(term64556, 0, (byte) 2);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLocalFileDataData", argTypes, term64408, args);
        assertTrue(recursiveEquals(term64408, term64562));
        assertTrue(recursiveEquals(retValue, term64556));
    }

};


