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

public class X5455_ExtendedTimestamp_isBit2createTimePresent_49364186646 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term163;
     Object term1291;

    public X5455_ExtendedTimestamp_isBit2createTimePresent_49364186646() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term163 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term168 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term170 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term172 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term163, term163.getClass(), "flags", (byte) -2);
        setBooleanField(term163, term163.getClass(), "bit0_modifyTimePresent", true);
        setBooleanField(term163, term163.getClass(), "bit1_accessTimePresent", true);
        setBooleanField(term163, term163.getClass(), "bit2_createTimePresent", true);
        setLongField(term168, term168.getClass(), "value", 6617340557564669657L);
        setField(term163, term163.getClass(), "modifyTime", term168);
        setLongField(term170, term170.getClass(), "value", 1439298019805881866L);
        setField(term163, term163.getClass(), "accessTime", term170);
        setLongField(term172, term172.getClass(), "value", -8708192233349544946L);
        setField(term163, term163.getClass(), "createTime", term172);
        term1291 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term1292 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term1293 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term1294 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term1291, term1291.getClass(), "flags", (byte) -2);
        setBooleanField(term1291, term1291.getClass(), "bit0_modifyTimePresent", true);
        setBooleanField(term1291, term1291.getClass(), "bit1_accessTimePresent", true);
        setBooleanField(term1291, term1291.getClass(), "bit2_createTimePresent", true);
        setLongField(term1292, term1292.getClass(), "value", 6617340557564669657L);
        setField(term1291, term1291.getClass(), "modifyTime", term1292);
        setLongField(term1293, term1293.getClass(), "value", 1439298019805881866L);
        setField(term1291, term1291.getClass(), "accessTime", term1293);
        setLongField(term1294, term1294.getClass(), "value", -8708192233349544946L);
        setField(term1291, term1291.getClass(), "createTime", term1294);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isBit2_createTimePresent", argTypes, term163, args);
        assertTrue(recursiveEquals(term163, term1291));
    }

};


