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

public class X5455_ExtendedTimestamp_getLocalFileDataData_2070398401307 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62232;
     Object term62384;
     Object term62378;

    public X5455_ExtendedTimestamp_getLocalFileDataData_2070398401307() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62232 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term62336 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setBooleanField(term62232, term62232.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term62232, term62232.getClass(), "bit1_accessTimePresent", true);
        setField(term62232, term62232.getClass(), "accessTime", term62336);
        term62384 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term62385 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term62384, term62384.getClass(), "flags", (byte) 0);
        setBooleanField(term62384, term62384.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term62384, term62384.getClass(), "bit1_accessTimePresent", true);
        setBooleanField(term62384, term62384.getClass(), "bit2_createTimePresent", false);
        setField(term62384, term62384.getClass(), "modifyTime", null);
        setLongField(term62385, term62385.getClass(), "value", 0L);
        setField(term62384, term62384.getClass(), "accessTime", term62385);
        setField(term62384, term62384.getClass(), "createTime", null);
        term62378 = (byte[]) newByteArray(5);
        setByteElement(term62378, 0, (byte) 2);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLocalFileDataData", argTypes, term62232, args);
        assertTrue(recursiveEquals(term62232, term62384));
        assertTrue(recursiveEquals(retValue, term62378));
    }

};


