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

public class X5455_ExtendedTimestamp_setFlags_658991929139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17129;
     Object term17160;

    public X5455_ExtendedTimestamp_setFlags_658991929139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17129 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setByteField(term17129, term17129.getClass(), "flags", (byte) 0);
        setBooleanField(term17129, term17129.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term17129, term17129.getClass(), "bit1_accessTimePresent", false);
        term17160 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setByteField(term17160, term17160.getClass(), "flags", (byte) 5);
        setBooleanField(term17160, term17160.getClass(), "bit0_modifyTimePresent", true);
        setBooleanField(term17160, term17160.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term17160, term17160.getClass(), "bit2_createTimePresent", true);
        setField(term17160, term17160.getClass(), "modifyTime", null);
        setField(term17160, term17160.getClass(), "accessTime", null);
        setField(term17160, term17160.getClass(), "createTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = byte.class;
        Object[] args = new Object[1];
        args[0] = (byte) 5;
        callMethod(klass, "setFlags", argTypes, term17129, args);
        assertTrue(recursiveEquals(term17129, term17160));
    }

};


