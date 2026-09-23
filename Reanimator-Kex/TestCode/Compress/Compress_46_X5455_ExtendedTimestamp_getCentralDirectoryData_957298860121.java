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

public class X5455_ExtendedTimestamp_getCentralDirectoryData_957298860121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11782;
     Object term12631;
     Object term12629;

    public X5455_ExtendedTimestamp_getCentralDirectoryData_957298860121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11782 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term11886 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setBooleanField(term11782, term11782.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term11782, term11782.getClass(), "bit1_accessTimePresent", true);
        setField(term11782, term11782.getClass(), "accessTime", term11886);
        setBooleanField(term11782, term11782.getClass(), "bit2_createTimePresent", true);
        term12631 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term12632 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term12631, term12631.getClass(), "flags", (byte) 0);
        setBooleanField(term12631, term12631.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term12631, term12631.getClass(), "bit1_accessTimePresent", true);
        setBooleanField(term12631, term12631.getClass(), "bit2_createTimePresent", true);
        setField(term12631, term12631.getClass(), "modifyTime", null);
        setLongField(term12632, term12632.getClass(), "value", 0L);
        setField(term12631, term12631.getClass(), "accessTime", term12632);
        setField(term12631, term12631.getClass(), "createTime", null);
        term12629 = (byte[]) newByteArray(1);
        setByteElement(term12629, 0, (byte) 2);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getCentralDirectoryData", argTypes, term11782, args);
        assertTrue(recursiveEquals(term11782, term12631));
        assertTrue(recursiveEquals(retValue, term12629));
    }

};


