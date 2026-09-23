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

public class X5455_ExtendedTimestamp_equals_2089142370161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22683;
     Object term23027;
     Object term23245;
     Object term23248;

    public X5455_ExtendedTimestamp_equals_2089142370161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22683 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term23079 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term22891 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term22683, term22683.getClass(), "flags", (byte) 0);
        setField(term22683, term22683.getClass(), "modifyTime", term23079);
        setLongField(term22891, term22891.getClass(), "value", -26388279068676L);
        setField(term22683, term22683.getClass(), "accessTime", term22891);
        term23027 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term23183 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term23027, term23027.getClass(), "flags", (byte) 0);
        setField(term23027, term23027.getClass(), "modifyTime", term23079);
        setLongField(term23183, term23183.getClass(), "value", 26388279068675L);
        setField(term23027, term23027.getClass(), "accessTime", term23183);
        term23245 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term23246 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term23247 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term23245, term23245.getClass(), "flags", (byte) 0);
        setBooleanField(term23245, term23245.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term23245, term23245.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term23245, term23245.getClass(), "bit2_createTimePresent", false);
        setLongField(term23246, term23246.getClass(), "value", 0L);
        setField(term23245, term23245.getClass(), "modifyTime", term23246);
        setLongField(term23247, term23247.getClass(), "value", -26388279068676L);
        setField(term23245, term23245.getClass(), "accessTime", term23247);
        setField(term23245, term23245.getClass(), "createTime", null);
        term23248 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term23249 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term23250 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term23248, term23248.getClass(), "flags", (byte) 0);
        setBooleanField(term23248, term23248.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term23248, term23248.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term23248, term23248.getClass(), "bit2_createTimePresent", false);
        setLongField(term23249, term23249.getClass(), "value", 0L);
        setField(term23248, term23248.getClass(), "modifyTime", term23249);
        setLongField(term23250, term23250.getClass(), "value", 26388279068675L);
        setField(term23248, term23248.getClass(), "accessTime", term23250);
        setField(term23248, term23248.getClass(), "createTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term23027;
        Object retValue = callMethod(klass, "equals", argTypes, term22683, args);
        assertTrue(recursiveEquals(term22683, term23245));
        assertTrue(recursiveEquals(term23027, term23248));
        assertTrue(recursiveEquals(retValue, false));
    }

};


