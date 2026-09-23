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

public class X5455_ExtendedTimestamp_hashCode_1640455695118 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11212;
     Object term11602;

    public X5455_ExtendedTimestamp_hashCode_1640455695118() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11212 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term11316 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term11212, term11212.getClass(), "flags", (byte) 0);
        setLongField(term11316, term11316.getClass(), "value", 0L);
        setField(term11212, term11212.getClass(), "modifyTime", term11316);
        setField(term11212, term11212.getClass(), "accessTime", null);
        term11602 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term11603 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term11602, term11602.getClass(), "flags", (byte) 0);
        setBooleanField(term11602, term11602.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term11602, term11602.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term11602, term11602.getClass(), "bit2_createTimePresent", false);
        setLongField(term11603, term11603.getClass(), "value", 0L);
        setField(term11602, term11602.getClass(), "modifyTime", term11603);
        setField(term11602, term11602.getClass(), "accessTime", null);
        setField(term11602, term11602.getClass(), "createTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term11212, args);
        assertTrue(recursiveEquals(term11212, term11602));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


