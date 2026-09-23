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

public class X5455_ExtendedTimestamp_equals_2089142370129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13512;
     Object term13960;
     Object term14661;
     Object term14665;

    public X5455_ExtendedTimestamp_equals_2089142370129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term13512 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term14012 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term13720 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term13824 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term13512, term13512.getClass(), "flags", (byte) 0);
        setField(term13512, term13512.getClass(), "modifyTime", term14012);
        setLongField(term13720, term13720.getClass(), "value", 0L);
        setField(term13512, term13512.getClass(), "accessTime", term13720);
        setField(term13512, term13512.getClass(), "createTime", term13824);
        term13960 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term14116 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term14220 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term13960, term13960.getClass(), "flags", (byte) 0);
        setField(term13960, term13960.getClass(), "modifyTime", term14012);
        setLongField(term14116, term14116.getClass(), "value", 0L);
        setField(term13960, term13960.getClass(), "accessTime", term14116);
        setField(term13960, term13960.getClass(), "createTime", term14220);
        term14661 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term14662 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term14663 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term14664 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term14661, term14661.getClass(), "flags", (byte) 0);
        setBooleanField(term14661, term14661.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term14661, term14661.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term14661, term14661.getClass(), "bit2_createTimePresent", false);
        setLongField(term14662, term14662.getClass(), "value", 0L);
        setField(term14661, term14661.getClass(), "modifyTime", term14662);
        setLongField(term14663, term14663.getClass(), "value", 0L);
        setField(term14661, term14661.getClass(), "accessTime", term14663);
        setLongField(term14664, term14664.getClass(), "value", 0L);
        setField(term14661, term14661.getClass(), "createTime", term14664);
        term14665 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term14666 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term14667 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term14668 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term14665, term14665.getClass(), "flags", (byte) 0);
        setBooleanField(term14665, term14665.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term14665, term14665.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term14665, term14665.getClass(), "bit2_createTimePresent", false);
        setLongField(term14666, term14666.getClass(), "value", 0L);
        setField(term14665, term14665.getClass(), "modifyTime", term14666);
        setLongField(term14667, term14667.getClass(), "value", 0L);
        setField(term14665, term14665.getClass(), "accessTime", term14667);
        setLongField(term14668, term14668.getClass(), "value", 0L);
        setField(term14665, term14665.getClass(), "createTime", term14668);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term13960;
        Object retValue = callMethod(klass, "equals", argTypes, term13512, args);
        assertTrue(recursiveEquals(term13512, term14661));
        assertTrue(recursiveEquals(term13960, term14665));
        assertTrue(recursiveEquals(retValue, true));
    }

};


