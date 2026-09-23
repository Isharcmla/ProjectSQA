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

public class X5455_ExtendedTimestamp_equals_2089142370160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term22261;
     Object term22501;
     Object term23206;
     Object term23208;

    public X5455_ExtendedTimestamp_equals_2089142370160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term22261 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term22365 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term22261, term22261.getClass(), "flags", (byte) 0);
        setField(term22261, term22261.getClass(), "modifyTime", term22365);
        term22501 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setByteField(term22501, term22501.getClass(), "flags", (byte) 0);
        setField(term22501, term22501.getClass(), "modifyTime", null);
        term23206 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term23207 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term23206, term23206.getClass(), "flags", (byte) 0);
        setBooleanField(term23206, term23206.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term23206, term23206.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term23206, term23206.getClass(), "bit2_createTimePresent", false);
        setLongField(term23207, term23207.getClass(), "value", 0L);
        setField(term23206, term23206.getClass(), "modifyTime", term23207);
        setField(term23206, term23206.getClass(), "accessTime", null);
        setField(term23206, term23206.getClass(), "createTime", null);
        term23208 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setByteField(term23208, term23208.getClass(), "flags", (byte) 0);
        setBooleanField(term23208, term23208.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term23208, term23208.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term23208, term23208.getClass(), "bit2_createTimePresent", false);
        setField(term23208, term23208.getClass(), "modifyTime", null);
        setField(term23208, term23208.getClass(), "accessTime", null);
        setField(term23208, term23208.getClass(), "createTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term22501;
        Object retValue = callMethod(klass, "equals", argTypes, term22261, args);
        assertTrue(recursiveEquals(term22261, term23206));
        assertTrue(recursiveEquals(term22501, term23208));
        assertTrue(recursiveEquals(retValue, false));
    }

};


