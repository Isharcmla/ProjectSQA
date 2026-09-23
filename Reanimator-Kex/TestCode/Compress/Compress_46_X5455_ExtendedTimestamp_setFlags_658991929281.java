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

public class X5455_ExtendedTimestamp_setFlags_658991929281 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56278;
     Object term56288;

    public X5455_ExtendedTimestamp_setFlags_658991929281() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56278 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setByteField(term56278, term56278.getClass(), "flags", (byte) 0);
        setBooleanField(term56278, term56278.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term56278, term56278.getClass(), "bit1_accessTimePresent", false);
        term56288 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setByteField(term56288, term56288.getClass(), "flags", (byte) 4);
        setBooleanField(term56288, term56288.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term56288, term56288.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term56288, term56288.getClass(), "bit2_createTimePresent", true);
        setField(term56288, term56288.getClass(), "modifyTime", null);
        setField(term56288, term56288.getClass(), "accessTime", null);
        setField(term56288, term56288.getClass(), "createTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = byte.class;
        Object[] args = new Object[1];
        args[0] = (byte) 4;
        callMethod(klass, "setFlags", argTypes, term56278, args);
        assertTrue(recursiveEquals(term56278, term56288));
    }

};


