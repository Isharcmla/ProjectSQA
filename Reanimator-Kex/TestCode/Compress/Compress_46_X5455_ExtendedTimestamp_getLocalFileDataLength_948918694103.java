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

public class X5455_ExtendedTimestamp_getLocalFileDataLength_948918694103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7249;
     Object term7278;
     Object term7270;

    public X5455_ExtendedTimestamp_getLocalFileDataLength_948918694103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7249 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setBooleanField(term7249, term7249.getClass(), "bit0_modifyTimePresent", true);
        term7278 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setByteField(term7278, term7278.getClass(), "flags", (byte) 0);
        setBooleanField(term7278, term7278.getClass(), "bit0_modifyTimePresent", true);
        setBooleanField(term7278, term7278.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term7278, term7278.getClass(), "bit2_createTimePresent", false);
        setField(term7278, term7278.getClass(), "modifyTime", null);
        setField(term7278, term7278.getClass(), "accessTime", null);
        setField(term7278, term7278.getClass(), "createTime", null);
        term7270 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipShort"));
        setIntField(term7270, term7270.getClass(), "value", 5);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLocalFileDataLength", argTypes, term7249, args);
        assertTrue(recursiveEquals(term7249, term7278));
        assertTrue(recursiveEquals(retValue, term7270));
    }

};


