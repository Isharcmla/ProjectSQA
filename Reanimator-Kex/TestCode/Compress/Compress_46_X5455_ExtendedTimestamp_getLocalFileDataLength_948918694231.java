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

public class X5455_ExtendedTimestamp_getLocalFileDataLength_948918694231 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42053;
     Object term42066;
     Object term42058;

    public X5455_ExtendedTimestamp_getLocalFileDataLength_948918694231() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42053 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setBooleanField(term42053, term42053.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term42053, term42053.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term42053, term42053.getClass(), "bit2_createTimePresent", true);
        term42066 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setByteField(term42066, term42066.getClass(), "flags", (byte) 0);
        setBooleanField(term42066, term42066.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term42066, term42066.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term42066, term42066.getClass(), "bit2_createTimePresent", true);
        setField(term42066, term42066.getClass(), "modifyTime", null);
        setField(term42066, term42066.getClass(), "accessTime", null);
        setField(term42066, term42066.getClass(), "createTime", null);
        term42058 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipShort"));
        setIntField(term42058, term42058.getClass(), "value", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLocalFileDataLength", argTypes, term42053, args);
        assertTrue(recursiveEquals(term42053, term42066));
        assertTrue(recursiveEquals(retValue, term42058));
    }

};


