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

public class X5455_ExtendedTimestamp_equals_2089142370193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33480;
     Object term33928;
     Object term34139;
     Object term34143;

    public X5455_ExtendedTimestamp_equals_2089142370193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33480 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term33980 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term33688 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term33792 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term33480, term33480.getClass(), "flags", (byte) 0);
        setField(term33480, term33480.getClass(), "modifyTime", term33980);
        setLongField(term33688, term33688.getClass(), "value", 0L);
        setField(term33480, term33480.getClass(), "accessTime", term33688);
        setField(term33480, term33480.getClass(), "createTime", term33792);
        term33928 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term34084 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term33928, term33928.getClass(), "flags", (byte) 0);
        setField(term33928, term33928.getClass(), "modifyTime", term33980);
        setLongField(term34084, term34084.getClass(), "value", 0L);
        setField(term33928, term33928.getClass(), "accessTime", term34084);
        setField(term33928, term33928.getClass(), "createTime", null);
        term34139 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term34140 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term34141 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term34142 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term34139, term34139.getClass(), "flags", (byte) 0);
        setBooleanField(term34139, term34139.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term34139, term34139.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term34139, term34139.getClass(), "bit2_createTimePresent", false);
        setLongField(term34140, term34140.getClass(), "value", 0L);
        setField(term34139, term34139.getClass(), "modifyTime", term34140);
        setLongField(term34141, term34141.getClass(), "value", 0L);
        setField(term34139, term34139.getClass(), "accessTime", term34141);
        setLongField(term34142, term34142.getClass(), "value", 0L);
        setField(term34139, term34139.getClass(), "createTime", term34142);
        term34143 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term34144 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term34145 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term34143, term34143.getClass(), "flags", (byte) 0);
        setBooleanField(term34143, term34143.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term34143, term34143.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term34143, term34143.getClass(), "bit2_createTimePresent", false);
        setLongField(term34144, term34144.getClass(), "value", 0L);
        setField(term34143, term34143.getClass(), "modifyTime", term34144);
        setLongField(term34145, term34145.getClass(), "value", 0L);
        setField(term34143, term34143.getClass(), "accessTime", term34145);
        setField(term34143, term34143.getClass(), "createTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term33928;
        Object retValue = callMethod(klass, "equals", argTypes, term33480, args);
        assertTrue(recursiveEquals(term33480, term34139));
        assertTrue(recursiveEquals(term33928, term34143));
        assertTrue(recursiveEquals(retValue, false));
    }

};


