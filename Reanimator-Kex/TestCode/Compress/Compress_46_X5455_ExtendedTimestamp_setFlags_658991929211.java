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

public class X5455_ExtendedTimestamp_setFlags_658991929211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37655;
     Object term37709;

    public X5455_ExtendedTimestamp_setFlags_658991929211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37655 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setByteField(term37655, term37655.getClass(), "flags", (byte) 0);
        setBooleanField(term37655, term37655.getClass(), "bit0_modifyTimePresent", false);
        term37709 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setByteField(term37709, term37709.getClass(), "flags", (byte) 0);
        setBooleanField(term37709, term37709.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term37709, term37709.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term37709, term37709.getClass(), "bit2_createTimePresent", false);
        setField(term37709, term37709.getClass(), "modifyTime", null);
        setField(term37709, term37709.getClass(), "accessTime", null);
        setField(term37709, term37709.getClass(), "createTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = byte.class;
        Object[] args = new Object[1];
        args[0] = (byte) 0;
        callMethod(klass, "setFlags", argTypes, term37655, args);
        assertTrue(recursiveEquals(term37655, term37709));
    }

};


