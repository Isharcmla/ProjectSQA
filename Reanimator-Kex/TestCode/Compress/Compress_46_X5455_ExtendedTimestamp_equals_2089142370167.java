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

public class X5455_ExtendedTimestamp_equals_2089142370167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24178;
     Object term24314;
     Object term24466;
     Object term24467;

    public X5455_ExtendedTimestamp_equals_2089142370167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24178 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setByteField(term24178, term24178.getClass(), "flags", (byte) 0);
        setField(term24178, term24178.getClass(), "modifyTime", null);
        term24314 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term24418 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term24314, term24314.getClass(), "flags", (byte) 0);
        setField(term24314, term24314.getClass(), "modifyTime", term24418);
        term24466 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setByteField(term24466, term24466.getClass(), "flags", (byte) 0);
        setBooleanField(term24466, term24466.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term24466, term24466.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term24466, term24466.getClass(), "bit2_createTimePresent", false);
        setField(term24466, term24466.getClass(), "modifyTime", null);
        setField(term24466, term24466.getClass(), "accessTime", null);
        setField(term24466, term24466.getClass(), "createTime", null);
        term24467 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term24468 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term24467, term24467.getClass(), "flags", (byte) 0);
        setBooleanField(term24467, term24467.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term24467, term24467.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term24467, term24467.getClass(), "bit2_createTimePresent", false);
        setLongField(term24468, term24468.getClass(), "value", 0L);
        setField(term24467, term24467.getClass(), "modifyTime", term24468);
        setField(term24467, term24467.getClass(), "accessTime", null);
        setField(term24467, term24467.getClass(), "createTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term24314;
        Object retValue = callMethod(klass, "equals", argTypes, term24178, args);
        assertTrue(recursiveEquals(term24178, term24466));
        assertTrue(recursiveEquals(term24314, term24467));
        assertTrue(recursiveEquals(retValue, false));
    }

};


