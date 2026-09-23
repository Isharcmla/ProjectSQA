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

public class X5455_ExtendedTimestamp_hashCode_1640455695153 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20511;
     Object term20979;

    public X5455_ExtendedTimestamp_hashCode_1640455695153() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20511 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setByteField(term20511, term20511.getClass(), "flags", (byte) 0);
        setField(term20511, term20511.getClass(), "modifyTime", null);
        term20979 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setByteField(term20979, term20979.getClass(), "flags", (byte) 0);
        setBooleanField(term20979, term20979.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term20979, term20979.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term20979, term20979.getClass(), "bit2_createTimePresent", false);
        setField(term20979, term20979.getClass(), "modifyTime", null);
        setField(term20979, term20979.getClass(), "accessTime", null);
        setField(term20979, term20979.getClass(), "createTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term20511, args);
        assertTrue(recursiveEquals(term20511, term20979));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


