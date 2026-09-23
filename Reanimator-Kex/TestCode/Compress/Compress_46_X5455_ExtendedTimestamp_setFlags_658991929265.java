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

public class X5455_ExtendedTimestamp_setFlags_658991929265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52387;
     Object term52397;

    public X5455_ExtendedTimestamp_setFlags_658991929265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52387 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setByteField(term52387, term52387.getClass(), "flags", (byte) 0);
        setBooleanField(term52387, term52387.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term52387, term52387.getClass(), "bit1_accessTimePresent", false);
        term52397 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setByteField(term52397, term52397.getClass(), "flags", (byte) 7);
        setBooleanField(term52397, term52397.getClass(), "bit0_modifyTimePresent", true);
        setBooleanField(term52397, term52397.getClass(), "bit1_accessTimePresent", true);
        setBooleanField(term52397, term52397.getClass(), "bit2_createTimePresent", true);
        setField(term52397, term52397.getClass(), "modifyTime", null);
        setField(term52397, term52397.getClass(), "accessTime", null);
        setField(term52397, term52397.getClass(), "createTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = byte.class;
        Object[] args = new Object[1];
        args[0] = (byte) 7;
        callMethod(klass, "setFlags", argTypes, term52387, args);
        assertTrue(recursiveEquals(term52387, term52397));
    }

};


