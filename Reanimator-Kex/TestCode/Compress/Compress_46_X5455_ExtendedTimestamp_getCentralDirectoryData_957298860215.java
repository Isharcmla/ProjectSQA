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

public class X5455_ExtendedTimestamp_getCentralDirectoryData_957298860215 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term38316;
     Object term38347;
     Object term38345;

    public X5455_ExtendedTimestamp_getCentralDirectoryData_957298860215() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term38316 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setBooleanField(term38316, term38316.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term38316, term38316.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term38316, term38316.getClass(), "bit2_createTimePresent", true);
        term38347 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setByteField(term38347, term38347.getClass(), "flags", (byte) 0);
        setBooleanField(term38347, term38347.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term38347, term38347.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term38347, term38347.getClass(), "bit2_createTimePresent", true);
        setField(term38347, term38347.getClass(), "modifyTime", null);
        setField(term38347, term38347.getClass(), "accessTime", null);
        setField(term38347, term38347.getClass(), "createTime", null);
        term38345 = (byte[]) newByteArray(1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getCentralDirectoryData", argTypes, term38316, args);
        assertTrue(recursiveEquals(term38316, term38347));
        assertTrue(recursiveEquals(retValue, term38345));
    }

};


