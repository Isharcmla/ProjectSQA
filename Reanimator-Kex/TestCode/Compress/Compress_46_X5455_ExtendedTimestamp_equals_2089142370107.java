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

public class X5455_ExtendedTimestamp_equals_2089142370107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7442;
     Object term7682;
     Object term9314;
     Object term9316;

    public X5455_ExtendedTimestamp_equals_2089142370107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7442 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term7546 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term7442, term7442.getClass(), "flags", (byte) 8);
        setField(term7442, term7442.getClass(), "modifyTime", term7546);
        term7682 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term7786 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term7682, term7682.getClass(), "flags", (byte) 0);
        setField(term7682, term7682.getClass(), "modifyTime", term7786);
        term9314 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term9315 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term9314, term9314.getClass(), "flags", (byte) 8);
        setBooleanField(term9314, term9314.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term9314, term9314.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term9314, term9314.getClass(), "bit2_createTimePresent", false);
        setLongField(term9315, term9315.getClass(), "value", 0L);
        setField(term9314, term9314.getClass(), "modifyTime", term9315);
        setField(term9314, term9314.getClass(), "accessTime", null);
        setField(term9314, term9314.getClass(), "createTime", null);
        term9316 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term9317 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term9316, term9316.getClass(), "flags", (byte) 0);
        setBooleanField(term9316, term9316.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term9316, term9316.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term9316, term9316.getClass(), "bit2_createTimePresent", false);
        setLongField(term9317, term9317.getClass(), "value", 0L);
        setField(term9316, term9316.getClass(), "modifyTime", term9317);
        setField(term9316, term9316.getClass(), "accessTime", null);
        setField(term9316, term9316.getClass(), "createTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term7682;
        Object retValue = callMethod(klass, "equals", argTypes, term7442, args);
        assertTrue(recursiveEquals(term7442, term9314));
        assertTrue(recursiveEquals(term7682, term9316));
        assertTrue(recursiveEquals(retValue, true));
    }

};


