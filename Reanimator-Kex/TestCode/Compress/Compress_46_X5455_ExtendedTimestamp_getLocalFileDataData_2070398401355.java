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

public class X5455_ExtendedTimestamp_getLocalFileDataData_2070398401355 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74630;
     Object term74784;
     Object term74778;

    public X5455_ExtendedTimestamp_getLocalFileDataData_2070398401355() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74630 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term74734 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setBooleanField(term74630, term74630.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term74630, term74630.getClass(), "bit1_accessTimePresent", true);
        setField(term74630, term74630.getClass(), "accessTime", null);
        setBooleanField(term74630, term74630.getClass(), "bit2_createTimePresent", true);
        setField(term74630, term74630.getClass(), "createTime", term74734);
        term74784 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term74785 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term74784, term74784.getClass(), "flags", (byte) 0);
        setBooleanField(term74784, term74784.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term74784, term74784.getClass(), "bit1_accessTimePresent", true);
        setBooleanField(term74784, term74784.getClass(), "bit2_createTimePresent", true);
        setField(term74784, term74784.getClass(), "modifyTime", null);
        setField(term74784, term74784.getClass(), "accessTime", null);
        setLongField(term74785, term74785.getClass(), "value", 0L);
        setField(term74784, term74784.getClass(), "createTime", term74785);
        term74778 = (byte[]) newByteArray(5);
        setByteElement(term74778, 0, (byte) 4);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLocalFileDataData", argTypes, term74630, args);
        assertTrue(recursiveEquals(term74630, term74784));
        assertTrue(recursiveEquals(retValue, term74778));
    }

};


