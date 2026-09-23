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

public class X5455_ExtendedTimestamp_equals_2089142370273 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term54171;
     Object term54619;
     Object term55002;
     Object term55006;

    public X5455_ExtendedTimestamp_equals_2089142370273() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term54171 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term54275 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term54379 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term54483 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term54171, term54171.getClass(), "flags", (byte) 0);
        setLongField(term54275, term54275.getClass(), "value", 3458764513820540928L);
        setField(term54171, term54171.getClass(), "modifyTime", term54275);
        setLongField(term54379, term54379.getClass(), "value", 3458764513820540928L);
        setField(term54171, term54171.getClass(), "accessTime", term54379);
        setLongField(term54483, term54483.getClass(), "value", 3458764513820540928L);
        setField(term54171, term54171.getClass(), "createTime", term54483);
        term54619 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term54723 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term54827 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term54931 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term54619, term54619.getClass(), "flags", (byte) 0);
        setLongField(term54723, term54723.getClass(), "value", 3458764513820540928L);
        setField(term54619, term54619.getClass(), "modifyTime", term54723);
        setLongField(term54827, term54827.getClass(), "value", 3458764513820540928L);
        setField(term54619, term54619.getClass(), "accessTime", term54827);
        setLongField(term54931, term54931.getClass(), "value", 897929434303907834L);
        setField(term54619, term54619.getClass(), "createTime", term54931);
        term55002 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term55003 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term55004 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term55005 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term55002, term55002.getClass(), "flags", (byte) 0);
        setBooleanField(term55002, term55002.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term55002, term55002.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term55002, term55002.getClass(), "bit2_createTimePresent", false);
        setLongField(term55003, term55003.getClass(), "value", 3458764513820540928L);
        setField(term55002, term55002.getClass(), "modifyTime", term55003);
        setLongField(term55004, term55004.getClass(), "value", 3458764513820540928L);
        setField(term55002, term55002.getClass(), "accessTime", term55004);
        setLongField(term55005, term55005.getClass(), "value", 3458764513820540928L);
        setField(term55002, term55002.getClass(), "createTime", term55005);
        term55006 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term55007 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term55008 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term55009 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term55006, term55006.getClass(), "flags", (byte) 0);
        setBooleanField(term55006, term55006.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term55006, term55006.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term55006, term55006.getClass(), "bit2_createTimePresent", false);
        setLongField(term55007, term55007.getClass(), "value", 3458764513820540928L);
        setField(term55006, term55006.getClass(), "modifyTime", term55007);
        setLongField(term55008, term55008.getClass(), "value", 3458764513820540928L);
        setField(term55006, term55006.getClass(), "accessTime", term55008);
        setLongField(term55009, term55009.getClass(), "value", 897929434303907834L);
        setField(term55006, term55006.getClass(), "createTime", term55009);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term54619;
        Object retValue = callMethod(klass, "equals", argTypes, term54171, args);
        assertTrue(recursiveEquals(term54171, term55002));
        assertTrue(recursiveEquals(term54619, term55006));
        assertTrue(recursiveEquals(retValue, false));
    }

};


