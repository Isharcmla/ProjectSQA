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

public class X5455_ExtendedTimestamp_getAccessJavaTime_116482122768 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3953;
     Object term4116;

    public X5455_ExtendedTimestamp_getAccessJavaTime_116482122768() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3953 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setField(term3953, term3953.getClass(), "accessTime", null);
        term4116 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setByteField(term4116, term4116.getClass(), "flags", (byte) 0);
        setBooleanField(term4116, term4116.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term4116, term4116.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term4116, term4116.getClass(), "bit2_createTimePresent", false);
        setField(term4116, term4116.getClass(), "modifyTime", null);
        setField(term4116, term4116.getClass(), "accessTime", null);
        setField(term4116, term4116.getClass(), "createTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getAccessJavaTime", argTypes, term3953, args);
        assertTrue(recursiveEquals(term3953, term4116));
        assertTrue(recursiveEquals(retValue, null));
    }

};


