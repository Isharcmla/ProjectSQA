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

public class X5455_ExtendedTimestamp_setFlags_658991929206 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36264;
     Object term36906;

    public X5455_ExtendedTimestamp_setFlags_658991929206() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36264 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setByteField(term36264, term36264.getClass(), "flags", (byte) 0);
        setBooleanField(term36264, term36264.getClass(), "bit0_modifyTimePresent", false);
        term36906 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setByteField(term36906, term36906.getClass(), "flags", (byte) 3);
        setBooleanField(term36906, term36906.getClass(), "bit0_modifyTimePresent", true);
        setBooleanField(term36906, term36906.getClass(), "bit1_accessTimePresent", true);
        setBooleanField(term36906, term36906.getClass(), "bit2_createTimePresent", false);
        setField(term36906, term36906.getClass(), "modifyTime", null);
        setField(term36906, term36906.getClass(), "accessTime", null);
        setField(term36906, term36906.getClass(), "createTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = byte.class;
        Object[] args = new Object[1];
        args[0] = (byte) 3;
        callMethod(klass, "setFlags", argTypes, term36264, args);
        assertTrue(recursiveEquals(term36264, term36906));
    }

};


