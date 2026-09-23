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

public class X5455_ExtendedTimestamp_hashCode_1640455695176 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term26411;
     Object term27442;

    public X5455_ExtendedTimestamp_hashCode_1640455695176() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term26411 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term26515 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term26411, term26411.getClass(), "flags", (byte) 0);
        setLongField(term26515, term26515.getClass(), "value", 0L);
        setField(term26411, term26411.getClass(), "modifyTime", term26515);
        setField(term26411, term26411.getClass(), "accessTime", null);
        setField(term26411, term26411.getClass(), "createTime", term26515);
        term27442 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term27443 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term27442, term27442.getClass(), "flags", (byte) 0);
        setBooleanField(term27442, term27442.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term27442, term27442.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term27442, term27442.getClass(), "bit2_createTimePresent", false);
        setLongField(term27443, term27443.getClass(), "value", 0L);
        setField(term27442, term27442.getClass(), "modifyTime", term27443);
        setField(term27442, term27442.getClass(), "accessTime", null);
        setField(term27442, term27442.getClass(), "createTime", term27443);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term26411, args);
        assertTrue(recursiveEquals(term26411, term27442));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


