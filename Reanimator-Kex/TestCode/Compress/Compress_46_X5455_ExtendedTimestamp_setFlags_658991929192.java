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

public class X5455_ExtendedTimestamp_setFlags_658991929192 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33292;
     Object term34094;

    public X5455_ExtendedTimestamp_setFlags_658991929192() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33292 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setByteField(term33292, term33292.getClass(), "flags", (byte) 0);
        setBooleanField(term33292, term33292.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term33292, term33292.getClass(), "bit1_accessTimePresent", false);
        term34094 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setByteField(term34094, term34094.getClass(), "flags", (byte) 2);
        setBooleanField(term34094, term34094.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term34094, term34094.getClass(), "bit1_accessTimePresent", true);
        setBooleanField(term34094, term34094.getClass(), "bit2_createTimePresent", false);
        setField(term34094, term34094.getClass(), "modifyTime", null);
        setField(term34094, term34094.getClass(), "accessTime", null);
        setField(term34094, term34094.getClass(), "createTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = byte.class;
        Object[] args = new Object[1];
        args[0] = (byte) 2;
        callMethod(klass, "setFlags", argTypes, term33292, args);
        assertTrue(recursiveEquals(term33292, term34094));
    }

};


