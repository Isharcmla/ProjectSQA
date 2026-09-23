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

public class X5455_ExtendedTimestamp_equals_208914237064 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term346;
     Object term357;
     Object term3777;
     Object term3781;

    public X5455_ExtendedTimestamp_equals_208914237064() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term346 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term351 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term353 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term355 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term346, term346.getClass(), "flags", (byte) 80);
        setBooleanField(term346, term346.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term346, term346.getClass(), "bit1_accessTimePresent", true);
        setBooleanField(term346, term346.getClass(), "bit2_createTimePresent", false);
        setLongField(term351, term351.getClass(), "value", 4474998035090263139L);
        setField(term346, term346.getClass(), "modifyTime", term351);
        setLongField(term353, term353.getClass(), "value", 2848819812340321742L);
        setField(term346, term346.getClass(), "accessTime", term353);
        setLongField(term355, term355.getClass(), "value", -8876856890348836498L);
        setField(term346, term346.getClass(), "createTime", term355);
        term357 = newInstance(Class.forName("java.lang.Object"));
        term3777 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term3778 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term3779 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term3780 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term3777, term3777.getClass(), "flags", (byte) 80);
        setBooleanField(term3777, term3777.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term3777, term3777.getClass(), "bit1_accessTimePresent", true);
        setBooleanField(term3777, term3777.getClass(), "bit2_createTimePresent", false);
        setLongField(term3778, term3778.getClass(), "value", 4474998035090263139L);
        setField(term3777, term3777.getClass(), "modifyTime", term3778);
        setLongField(term3779, term3779.getClass(), "value", 2848819812340321742L);
        setField(term3777, term3777.getClass(), "accessTime", term3779);
        setLongField(term3780, term3780.getClass(), "value", -8876856890348836498L);
        setField(term3777, term3777.getClass(), "createTime", term3780);
        term3781 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term357;
        Object retValue = callMethod(klass, "equals", argTypes, term346, args);
        assertTrue(recursiveEquals(term346, term3777));
        assertTrue(recursiveEquals(term357, term3781));
        assertTrue(recursiveEquals(retValue, false));
    }

};


