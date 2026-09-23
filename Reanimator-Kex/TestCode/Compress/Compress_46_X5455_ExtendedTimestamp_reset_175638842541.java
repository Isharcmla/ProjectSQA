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

public class X5455_ExtendedTimestamp_reset_175638842541 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term106;
     Object term1211;

    public X5455_ExtendedTimestamp_reset_175638842541() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term106 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term111 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term113 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term115 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term106, term106.getClass(), "flags", (byte) -54);
        setBooleanField(term106, term106.getClass(), "bit0_modifyTimePresent", true);
        setBooleanField(term106, term106.getClass(), "bit1_accessTimePresent", true);
        setBooleanField(term106, term106.getClass(), "bit2_createTimePresent", true);
        setLongField(term111, term111.getClass(), "value", -2585684163342970173L);
        setField(term106, term106.getClass(), "modifyTime", term111);
        setLongField(term113, term113.getClass(), "value", 8059786003080744426L);
        setField(term106, term106.getClass(), "accessTime", term113);
        setLongField(term115, term115.getClass(), "value", -4365849114644724155L);
        setField(term106, term106.getClass(), "createTime", term115);
        term1211 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setByteField(term1211, term1211.getClass(), "flags", (byte) 0);
        setBooleanField(term1211, term1211.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term1211, term1211.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term1211, term1211.getClass(), "bit2_createTimePresent", false);
        setField(term1211, term1211.getClass(), "modifyTime", null);
        setField(term1211, term1211.getClass(), "accessTime", null);
        setField(term1211, term1211.getClass(), "createTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "reset", argTypes, term106, args);
        assertTrue(recursiveEquals(term106, term1211));
    }

};


