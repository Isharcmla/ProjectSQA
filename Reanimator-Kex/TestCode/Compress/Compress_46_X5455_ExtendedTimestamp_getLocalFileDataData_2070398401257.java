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

public class X5455_ExtendedTimestamp_getLocalFileDataData_2070398401257 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49341;
     Object term49491;
     Object term49485;

    public X5455_ExtendedTimestamp_getLocalFileDataData_2070398401257() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49341 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term49445 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setBooleanField(term49341, term49341.getClass(), "bit0_modifyTimePresent", true);
        setBooleanField(term49341, term49341.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term49341, term49341.getClass(), "bit2_createTimePresent", false);
        setField(term49341, term49341.getClass(), "modifyTime", term49445);
        term49491 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term49492 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term49491, term49491.getClass(), "flags", (byte) 0);
        setBooleanField(term49491, term49491.getClass(), "bit0_modifyTimePresent", true);
        setBooleanField(term49491, term49491.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term49491, term49491.getClass(), "bit2_createTimePresent", false);
        setLongField(term49492, term49492.getClass(), "value", 0L);
        setField(term49491, term49491.getClass(), "modifyTime", term49492);
        setField(term49491, term49491.getClass(), "accessTime", null);
        setField(term49491, term49491.getClass(), "createTime", null);
        term49485 = (byte[]) newByteArray(5);
        setByteElement(term49485, 0, (byte) 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLocalFileDataData", argTypes, term49341, args);
        assertTrue(recursiveEquals(term49341, term49491));
        assertTrue(recursiveEquals(retValue, term49485));
    }

};


