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
import java.lang.Object;

public class X5455_ExtendedTimestamp_isBit0modifyTimePresent_7465332243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141;
     Object term1255;

    public X5455_ExtendedTimestamp_isBit0modifyTimePresent_7465332243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term141 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term146 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term148 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term150 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term141, term141.getClass(), "flags", (byte) 121);
        setBooleanField(term141, term141.getClass(), "bit0_modifyTimePresent", true);
        setBooleanField(term141, term141.getClass(), "bit1_accessTimePresent", true);
        setBooleanField(term141, term141.getClass(), "bit2_createTimePresent", true);
        setLongField(term146, term146.getClass(), "value", 6855071767938501807L);
        setField(term141, term141.getClass(), "modifyTime", term146);
        setLongField(term148, term148.getClass(), "value", -5892135042702373494L);
        setField(term141, term141.getClass(), "accessTime", term148);
        setLongField(term150, term150.getClass(), "value", 5262507301787091109L);
        setField(term141, term141.getClass(), "createTime", term150);
        term1255 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term1256 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term1257 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term1258 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term1255, term1255.getClass(), "flags", (byte) 121);
        setBooleanField(term1255, term1255.getClass(), "bit0_modifyTimePresent", true);
        setBooleanField(term1255, term1255.getClass(), "bit1_accessTimePresent", true);
        setBooleanField(term1255, term1255.getClass(), "bit2_createTimePresent", true);
        setLongField(term1256, term1256.getClass(), "value", 6855071767938501807L);
        setField(term1255, term1255.getClass(), "modifyTime", term1256);
        setLongField(term1257, term1257.getClass(), "value", -5892135042702373494L);
        setField(term1255, term1255.getClass(), "accessTime", term1257);
        setLongField(term1258, term1258.getClass(), "value", 5262507301787091109L);
        setField(term1255, term1255.getClass(), "createTime", term1258);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isBit0_modifyTimePresent", argTypes, term141, args);
        assertTrue(recursiveEquals(term141, term1255));
    }

};


