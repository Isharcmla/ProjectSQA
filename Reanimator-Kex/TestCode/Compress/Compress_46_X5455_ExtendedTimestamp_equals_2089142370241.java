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

public class X5455_ExtendedTimestamp_equals_2089142370241 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44788;
     Object term45236;
     Object term45551;
     Object term45555;

    public X5455_ExtendedTimestamp_equals_2089142370241() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44788 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term44892 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term45392 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term45100 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term44788, term44788.getClass(), "flags", (byte) 0);
        setLongField(term44892, term44892.getClass(), "value", 17592186060800L);
        setField(term44788, term44788.getClass(), "modifyTime", term44892);
        setField(term44788, term44788.getClass(), "accessTime", term45392);
        setLongField(term45100, term45100.getClass(), "value", -17592186060801L);
        setField(term44788, term44788.getClass(), "createTime", term45100);
        term45236 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term45340 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term45496 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term45236, term45236.getClass(), "flags", (byte) 0);
        setLongField(term45340, term45340.getClass(), "value", 17592186060800L);
        setField(term45236, term45236.getClass(), "modifyTime", term45340);
        setField(term45236, term45236.getClass(), "accessTime", term45392);
        setLongField(term45496, term45496.getClass(), "value", 17592186060800L);
        setField(term45236, term45236.getClass(), "createTime", term45496);
        term45551 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term45552 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term45553 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term45554 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term45551, term45551.getClass(), "flags", (byte) 0);
        setBooleanField(term45551, term45551.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term45551, term45551.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term45551, term45551.getClass(), "bit2_createTimePresent", false);
        setLongField(term45552, term45552.getClass(), "value", 17592186060800L);
        setField(term45551, term45551.getClass(), "modifyTime", term45552);
        setLongField(term45553, term45553.getClass(), "value", 0L);
        setField(term45551, term45551.getClass(), "accessTime", term45553);
        setLongField(term45554, term45554.getClass(), "value", -17592186060801L);
        setField(term45551, term45551.getClass(), "createTime", term45554);
        term45555 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term45556 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term45557 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term45558 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term45555, term45555.getClass(), "flags", (byte) 0);
        setBooleanField(term45555, term45555.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term45555, term45555.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term45555, term45555.getClass(), "bit2_createTimePresent", false);
        setLongField(term45556, term45556.getClass(), "value", 17592186060800L);
        setField(term45555, term45555.getClass(), "modifyTime", term45556);
        setLongField(term45557, term45557.getClass(), "value", 0L);
        setField(term45555, term45555.getClass(), "accessTime", term45557);
        setLongField(term45558, term45558.getClass(), "value", 17592186060800L);
        setField(term45555, term45555.getClass(), "createTime", term45558);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term45236;
        Object retValue = callMethod(klass, "equals", argTypes, term44788, args);
        assertTrue(recursiveEquals(term44788, term45551));
        assertTrue(recursiveEquals(term45236, term45555));
        assertTrue(recursiveEquals(retValue, false));
    }

};


