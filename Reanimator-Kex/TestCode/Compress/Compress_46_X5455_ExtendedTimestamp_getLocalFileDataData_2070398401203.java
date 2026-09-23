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

public class X5455_ExtendedTimestamp_getLocalFileDataData_2070398401203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36086;
     Object term36108;
     Object term36106;

    public X5455_ExtendedTimestamp_getLocalFileDataData_2070398401203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36086 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setBooleanField(term36086, term36086.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term36086, term36086.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term36086, term36086.getClass(), "bit2_createTimePresent", true);
        term36108 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setByteField(term36108, term36108.getClass(), "flags", (byte) 0);
        setBooleanField(term36108, term36108.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term36108, term36108.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term36108, term36108.getClass(), "bit2_createTimePresent", true);
        setField(term36108, term36108.getClass(), "modifyTime", null);
        setField(term36108, term36108.getClass(), "accessTime", null);
        setField(term36108, term36108.getClass(), "createTime", null);
        term36106 = (byte[]) newByteArray(1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLocalFileDataData", argTypes, term36086, args);
        assertTrue(recursiveEquals(term36086, term36108));
        assertTrue(recursiveEquals(retValue, term36106));
    }

};


