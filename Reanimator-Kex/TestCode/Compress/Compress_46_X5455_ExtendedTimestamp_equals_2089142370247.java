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

public class X5455_ExtendedTimestamp_equals_2089142370247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46256;
     Object term46600;
     Object term46900;
     Object term46903;

    public X5455_ExtendedTimestamp_equals_2089142370247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46256 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term46360 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term46756 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term46256, term46256.getClass(), "flags", (byte) 0);
        setLongField(term46360, term46360.getClass(), "value", 0L);
        setField(term46256, term46256.getClass(), "modifyTime", term46360);
        setField(term46256, term46256.getClass(), "accessTime", term46756);
        setField(term46256, term46256.getClass(), "createTime", null);
        term46600 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term46704 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term46860 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term46600, term46600.getClass(), "flags", (byte) 0);
        setLongField(term46704, term46704.getClass(), "value", 0L);
        setField(term46600, term46600.getClass(), "modifyTime", term46704);
        setField(term46600, term46600.getClass(), "accessTime", term46756);
        setField(term46600, term46600.getClass(), "createTime", term46860);
        term46900 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term46901 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term46902 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term46900, term46900.getClass(), "flags", (byte) 0);
        setBooleanField(term46900, term46900.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term46900, term46900.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term46900, term46900.getClass(), "bit2_createTimePresent", false);
        setLongField(term46901, term46901.getClass(), "value", 0L);
        setField(term46900, term46900.getClass(), "modifyTime", term46901);
        setLongField(term46902, term46902.getClass(), "value", 0L);
        setField(term46900, term46900.getClass(), "accessTime", term46902);
        setField(term46900, term46900.getClass(), "createTime", null);
        term46903 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term46904 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term46905 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term46906 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term46903, term46903.getClass(), "flags", (byte) 0);
        setBooleanField(term46903, term46903.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term46903, term46903.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term46903, term46903.getClass(), "bit2_createTimePresent", false);
        setLongField(term46904, term46904.getClass(), "value", 0L);
        setField(term46903, term46903.getClass(), "modifyTime", term46904);
        setLongField(term46905, term46905.getClass(), "value", 0L);
        setField(term46903, term46903.getClass(), "accessTime", term46905);
        setLongField(term46906, term46906.getClass(), "value", 0L);
        setField(term46903, term46903.getClass(), "createTime", term46906);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term46600;
        Object retValue = callMethod(klass, "equals", argTypes, term46256, args);
        assertTrue(recursiveEquals(term46256, term46900));
        assertTrue(recursiveEquals(term46600, term46903));
        assertTrue(recursiveEquals(retValue, false));
    }

};


