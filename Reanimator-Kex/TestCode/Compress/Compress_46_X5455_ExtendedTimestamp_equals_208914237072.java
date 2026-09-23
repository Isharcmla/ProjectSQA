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

public class X5455_ExtendedTimestamp_equals_208914237072 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4342;
     Object term4497;
     Object term4498;

    public X5455_ExtendedTimestamp_equals_208914237072() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4342 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        term4497 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setByteField(term4497, term4497.getClass(), "flags", (byte) 0);
        setBooleanField(term4497, term4497.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term4497, term4497.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term4497, term4497.getClass(), "bit2_createTimePresent", false);
        setField(term4497, term4497.getClass(), "modifyTime", null);
        setField(term4497, term4497.getClass(), "accessTime", null);
        setField(term4497, term4497.getClass(), "createTime", null);
        term4498 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setByteField(term4498, term4498.getClass(), "flags", (byte) 0);
        setBooleanField(term4498, term4498.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term4498, term4498.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term4498, term4498.getClass(), "bit2_createTimePresent", false);
        setField(term4498, term4498.getClass(), "modifyTime", null);
        setField(term4498, term4498.getClass(), "accessTime", null);
        setField(term4498, term4498.getClass(), "createTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term4342;
        Object retValue = callMethod(klass, "equals", argTypes, term4342, args);
        assertTrue(recursiveEquals(term4342, term4497));
        assertTrue(recursiveEquals(term4342, term4498));
        assertTrue(recursiveEquals(retValue, true));
    }

};


