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

public class X5455_ExtendedTimestamp_getCentralDirectoryLength_1421840173263 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52220;
     Object term52230;
     Object term52222;

    public X5455_ExtendedTimestamp_getCentralDirectoryLength_1421840173263() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term52220 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setBooleanField(term52220, term52220.getClass(), "bit0_modifyTimePresent", false);
        term52230 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setByteField(term52230, term52230.getClass(), "flags", (byte) 0);
        setBooleanField(term52230, term52230.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term52230, term52230.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term52230, term52230.getClass(), "bit2_createTimePresent", false);
        setField(term52230, term52230.getClass(), "modifyTime", null);
        setField(term52230, term52230.getClass(), "accessTime", null);
        setField(term52230, term52230.getClass(), "createTime", null);
        term52222 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipShort"));
        setIntField(term52222, term52222.getClass(), "value", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getCentralDirectoryLength", argTypes, term52220, args);
        assertTrue(recursiveEquals(term52220, term52230));
        assertTrue(recursiveEquals(retValue, term52222));
    }

};


