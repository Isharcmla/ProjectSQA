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

public class X5455_ExtendedTimestamp_equals_2089142370201 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35064;
     Object term35512;
     Object term35920;
     Object term35924;

    public X5455_ExtendedTimestamp_equals_2089142370201() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35064 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term35564 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term35616 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term35376 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term35064, term35064.getClass(), "flags", (byte) 0);
        setField(term35064, term35064.getClass(), "modifyTime", term35564);
        setField(term35064, term35064.getClass(), "accessTime", term35616);
        setField(term35064, term35064.getClass(), "createTime", term35376);
        term35512 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setByteField(term35512, term35512.getClass(), "flags", (byte) 0);
        setField(term35512, term35512.getClass(), "modifyTime", term35564);
        setField(term35512, term35512.getClass(), "accessTime", term35616);
        setField(term35512, term35512.getClass(), "createTime", null);
        term35920 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term35921 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term35922 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term35923 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term35920, term35920.getClass(), "flags", (byte) 0);
        setBooleanField(term35920, term35920.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term35920, term35920.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term35920, term35920.getClass(), "bit2_createTimePresent", false);
        setLongField(term35921, term35921.getClass(), "value", 0L);
        setField(term35920, term35920.getClass(), "modifyTime", term35921);
        setLongField(term35922, term35922.getClass(), "value", 0L);
        setField(term35920, term35920.getClass(), "accessTime", term35922);
        setLongField(term35923, term35923.getClass(), "value", 0L);
        setField(term35920, term35920.getClass(), "createTime", term35923);
        term35924 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term35925 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term35926 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term35924, term35924.getClass(), "flags", (byte) 0);
        setBooleanField(term35924, term35924.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term35924, term35924.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term35924, term35924.getClass(), "bit2_createTimePresent", false);
        setLongField(term35925, term35925.getClass(), "value", 0L);
        setField(term35924, term35924.getClass(), "modifyTime", term35925);
        setLongField(term35926, term35926.getClass(), "value", 0L);
        setField(term35924, term35924.getClass(), "accessTime", term35926);
        setField(term35924, term35924.getClass(), "createTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term35512;
        Object retValue = callMethod(klass, "equals", argTypes, term35064, args);
        assertTrue(recursiveEquals(term35064, term35920));
        assertTrue(recursiveEquals(term35512, term35924));
        assertTrue(recursiveEquals(retValue, false));
    }

};


