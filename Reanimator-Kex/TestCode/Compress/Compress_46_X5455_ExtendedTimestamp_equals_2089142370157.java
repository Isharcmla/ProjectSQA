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

public class X5455_ExtendedTimestamp_equals_2089142370157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term21514;
     Object term21858;
     Object term22090;
     Object term22093;

    public X5455_ExtendedTimestamp_equals_2089142370157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term21514 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term21910 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term21962 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term21514, term21514.getClass(), "flags", (byte) 0);
        setField(term21514, term21514.getClass(), "modifyTime", term21910);
        setField(term21514, term21514.getClass(), "accessTime", term21962);
        setField(term21514, term21514.getClass(), "createTime", null);
        term21858 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term22066 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term21858, term21858.getClass(), "flags", (byte) 0);
        setField(term21858, term21858.getClass(), "modifyTime", term21910);
        setField(term21858, term21858.getClass(), "accessTime", term21962);
        setField(term21858, term21858.getClass(), "createTime", term22066);
        term22090 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term22091 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term22092 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term22090, term22090.getClass(), "flags", (byte) 0);
        setBooleanField(term22090, term22090.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term22090, term22090.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term22090, term22090.getClass(), "bit2_createTimePresent", false);
        setLongField(term22091, term22091.getClass(), "value", 0L);
        setField(term22090, term22090.getClass(), "modifyTime", term22091);
        setLongField(term22092, term22092.getClass(), "value", 0L);
        setField(term22090, term22090.getClass(), "accessTime", term22092);
        setField(term22090, term22090.getClass(), "createTime", null);
        term22093 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term22094 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term22095 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term22096 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term22093, term22093.getClass(), "flags", (byte) 0);
        setBooleanField(term22093, term22093.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term22093, term22093.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term22093, term22093.getClass(), "bit2_createTimePresent", false);
        setLongField(term22094, term22094.getClass(), "value", 0L);
        setField(term22093, term22093.getClass(), "modifyTime", term22094);
        setLongField(term22095, term22095.getClass(), "value", 0L);
        setField(term22093, term22093.getClass(), "accessTime", term22095);
        setLongField(term22096, term22096.getClass(), "value", 0L);
        setField(term22093, term22093.getClass(), "createTime", term22096);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term21858;
        Object retValue = callMethod(klass, "equals", argTypes, term21514, args);
        assertTrue(recursiveEquals(term21514, term22090));
        assertTrue(recursiveEquals(term21858, term22093));
        assertTrue(recursiveEquals(retValue, false));
    }

};


