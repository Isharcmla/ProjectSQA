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

public class X5455_ExtendedTimestamp_equals_2089142370227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40502;
     Object term40846;
     Object term41045;
     Object term41048;

    public X5455_ExtendedTimestamp_equals_2089142370227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40502 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term40606 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term41002 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term40502, term40502.getClass(), "flags", (byte) 0);
        setLongField(term40606, term40606.getClass(), "value", 0L);
        setField(term40502, term40502.getClass(), "modifyTime", term40606);
        setField(term40502, term40502.getClass(), "accessTime", term41002);
        setField(term40502, term40502.getClass(), "createTime", term40606);
        term40846 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term40950 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term40846, term40846.getClass(), "flags", (byte) 0);
        setLongField(term40950, term40950.getClass(), "value", 0L);
        setField(term40846, term40846.getClass(), "modifyTime", term40950);
        setField(term40846, term40846.getClass(), "accessTime", term41002);
        setField(term40846, term40846.getClass(), "createTime", null);
        term41045 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term41046 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term41047 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term41045, term41045.getClass(), "flags", (byte) 0);
        setBooleanField(term41045, term41045.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term41045, term41045.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term41045, term41045.getClass(), "bit2_createTimePresent", false);
        setLongField(term41046, term41046.getClass(), "value", 0L);
        setField(term41045, term41045.getClass(), "modifyTime", term41046);
        setLongField(term41047, term41047.getClass(), "value", 0L);
        setField(term41045, term41045.getClass(), "accessTime", term41047);
        setField(term41045, term41045.getClass(), "createTime", term41046);
        term41048 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term41049 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term41050 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term41048, term41048.getClass(), "flags", (byte) 0);
        setBooleanField(term41048, term41048.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term41048, term41048.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term41048, term41048.getClass(), "bit2_createTimePresent", false);
        setLongField(term41049, term41049.getClass(), "value", 0L);
        setField(term41048, term41048.getClass(), "modifyTime", term41049);
        setLongField(term41050, term41050.getClass(), "value", 0L);
        setField(term41048, term41048.getClass(), "accessTime", term41050);
        setField(term41048, term41048.getClass(), "createTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term40846;
        Object retValue = callMethod(klass, "equals", argTypes, term40502, args);
        assertTrue(recursiveEquals(term40502, term41045));
        assertTrue(recursiveEquals(term40846, term41048));
        assertTrue(recursiveEquals(retValue, false));
    }

};


