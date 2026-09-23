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

public class X5455_ExtendedTimestamp_setFlags_65899192977 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4806;
     Object term4816;

    public X5455_ExtendedTimestamp_setFlags_65899192977() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4806 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setByteField(term4806, term4806.getClass(), "flags", (byte) 0);
        term4816 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setByteField(term4816, term4816.getClass(), "flags", (byte) 1);
        setBooleanField(term4816, term4816.getClass(), "bit0_modifyTimePresent", true);
        setBooleanField(term4816, term4816.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term4816, term4816.getClass(), "bit2_createTimePresent", false);
        setField(term4816, term4816.getClass(), "modifyTime", null);
        setField(term4816, term4816.getClass(), "accessTime", null);
        setField(term4816, term4816.getClass(), "createTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = byte.class;
        Object[] args = new Object[1];
        args[0] = (byte) 1;
        callMethod(klass, "setFlags", argTypes, term4806, args);
        assertTrue(recursiveEquals(term4806, term4816));
    }

};


