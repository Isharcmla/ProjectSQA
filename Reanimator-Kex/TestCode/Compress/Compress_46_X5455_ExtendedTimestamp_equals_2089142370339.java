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

public class X5455_ExtendedTimestamp_equals_2089142370339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70417;
     Object term70761;
     Object term71129;
     Object term71132;

    public X5455_ExtendedTimestamp_equals_2089142370339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70417 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term70521 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term70625 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term70417, term70417.getClass(), "flags", (byte) 0);
        setLongField(term70521, term70521.getClass(), "value", 0L);
        setField(term70417, term70417.getClass(), "modifyTime", term70521);
        setLongField(term70625, term70625.getClass(), "value", -1L);
        setField(term70417, term70417.getClass(), "accessTime", term70625);
        setField(term70417, term70417.getClass(), "createTime", null);
        term70761 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term70865 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term70969 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term71073 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term70761, term70761.getClass(), "flags", (byte) 0);
        setLongField(term70865, term70865.getClass(), "value", 0L);
        setField(term70761, term70761.getClass(), "modifyTime", term70865);
        setLongField(term70969, term70969.getClass(), "value", -1L);
        setField(term70761, term70761.getClass(), "accessTime", term70969);
        setField(term70761, term70761.getClass(), "createTime", term71073);
        term71129 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term71130 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term71131 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term71129, term71129.getClass(), "flags", (byte) 0);
        setBooleanField(term71129, term71129.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term71129, term71129.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term71129, term71129.getClass(), "bit2_createTimePresent", false);
        setLongField(term71130, term71130.getClass(), "value", 0L);
        setField(term71129, term71129.getClass(), "modifyTime", term71130);
        setLongField(term71131, term71131.getClass(), "value", -1L);
        setField(term71129, term71129.getClass(), "accessTime", term71131);
        setField(term71129, term71129.getClass(), "createTime", null);
        term71132 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term71133 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term71134 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term71135 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term71132, term71132.getClass(), "flags", (byte) 0);
        setBooleanField(term71132, term71132.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term71132, term71132.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term71132, term71132.getClass(), "bit2_createTimePresent", false);
        setLongField(term71133, term71133.getClass(), "value", 0L);
        setField(term71132, term71132.getClass(), "modifyTime", term71133);
        setLongField(term71134, term71134.getClass(), "value", -1L);
        setField(term71132, term71132.getClass(), "accessTime", term71134);
        setLongField(term71135, term71135.getClass(), "value", 0L);
        setField(term71132, term71132.getClass(), "createTime", term71135);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term70761;
        Object retValue = callMethod(klass, "equals", argTypes, term70417, args);
        assertTrue(recursiveEquals(term70417, term71129));
        assertTrue(recursiveEquals(term70761, term71132));
        assertTrue(recursiveEquals(retValue, false));
    }

};


