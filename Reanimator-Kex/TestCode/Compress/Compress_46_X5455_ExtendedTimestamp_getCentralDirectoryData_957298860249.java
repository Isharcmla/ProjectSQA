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

public class X5455_ExtendedTimestamp_getCentralDirectoryData_957298860249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term47109;
     Object term47274;
     Object term47268;

    public X5455_ExtendedTimestamp_getCentralDirectoryData_957298860249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term47109 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term47213 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setBooleanField(term47109, term47109.getClass(), "bit0_modifyTimePresent", true);
        setBooleanField(term47109, term47109.getClass(), "bit1_accessTimePresent", true);
        setField(term47109, term47109.getClass(), "accessTime", null);
        setBooleanField(term47109, term47109.getClass(), "bit2_createTimePresent", false);
        setField(term47109, term47109.getClass(), "modifyTime", term47213);
        term47274 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term47275 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term47274, term47274.getClass(), "flags", (byte) 0);
        setBooleanField(term47274, term47274.getClass(), "bit0_modifyTimePresent", true);
        setBooleanField(term47274, term47274.getClass(), "bit1_accessTimePresent", true);
        setBooleanField(term47274, term47274.getClass(), "bit2_createTimePresent", false);
        setLongField(term47275, term47275.getClass(), "value", 0L);
        setField(term47274, term47274.getClass(), "modifyTime", term47275);
        setField(term47274, term47274.getClass(), "accessTime", null);
        setField(term47274, term47274.getClass(), "createTime", null);
        term47268 = (byte[]) newByteArray(5);
        setByteElement(term47268, 0, (byte) 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getCentralDirectoryData", argTypes, term47109, args);
        assertTrue(recursiveEquals(term47109, term47274));
        assertTrue(recursiveEquals(retValue, term47268));
    }

};


