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

public class X5455_ExtendedTimestamp_getLocalFileDataData_2070398401297 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59686;
     Object term59840;
     Object term59834;

    public X5455_ExtendedTimestamp_getLocalFileDataData_2070398401297() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59686 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term59790 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setBooleanField(term59686, term59686.getClass(), "bit0_modifyTimePresent", true);
        setBooleanField(term59686, term59686.getClass(), "bit1_accessTimePresent", true);
        setField(term59686, term59686.getClass(), "accessTime", null);
        setBooleanField(term59686, term59686.getClass(), "bit2_createTimePresent", true);
        setField(term59686, term59686.getClass(), "createTime", null);
        setField(term59686, term59686.getClass(), "modifyTime", term59790);
        term59840 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term59841 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term59840, term59840.getClass(), "flags", (byte) 0);
        setBooleanField(term59840, term59840.getClass(), "bit0_modifyTimePresent", true);
        setBooleanField(term59840, term59840.getClass(), "bit1_accessTimePresent", true);
        setBooleanField(term59840, term59840.getClass(), "bit2_createTimePresent", true);
        setLongField(term59841, term59841.getClass(), "value", 0L);
        setField(term59840, term59840.getClass(), "modifyTime", term59841);
        setField(term59840, term59840.getClass(), "accessTime", null);
        setField(term59840, term59840.getClass(), "createTime", null);
        term59834 = (byte[]) newByteArray(5);
        setByteElement(term59834, 0, (byte) 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLocalFileDataData", argTypes, term59686, args);
        assertTrue(recursiveEquals(term59686, term59840));
        assertTrue(recursiveEquals(retValue, term59834));
    }

};


