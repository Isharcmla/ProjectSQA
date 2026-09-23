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

public class X5455_ExtendedTimestamp_getLocalFileDataData_2070398401351 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term73740;
     Object term73916;
     Object term73906;

    public X5455_ExtendedTimestamp_getLocalFileDataData_2070398401351() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term73740 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term73844 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setBooleanField(term73740, term73740.getClass(), "bit0_modifyTimePresent", true);
        setBooleanField(term73740, term73740.getClass(), "bit1_accessTimePresent", true);
        setField(term73740, term73740.getClass(), "accessTime", term73844);
        setBooleanField(term73740, term73740.getClass(), "bit2_createTimePresent", true);
        setField(term73740, term73740.getClass(), "createTime", null);
        setField(term73740, term73740.getClass(), "modifyTime", term73844);
        term73916 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term73917 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term73916, term73916.getClass(), "flags", (byte) 0);
        setBooleanField(term73916, term73916.getClass(), "bit0_modifyTimePresent", true);
        setBooleanField(term73916, term73916.getClass(), "bit1_accessTimePresent", true);
        setBooleanField(term73916, term73916.getClass(), "bit2_createTimePresent", true);
        setLongField(term73917, term73917.getClass(), "value", 0L);
        setField(term73916, term73916.getClass(), "modifyTime", term73917);
        setField(term73916, term73916.getClass(), "accessTime", term73917);
        setField(term73916, term73916.getClass(), "createTime", null);
        term73906 = (byte[]) newByteArray(9);
        setByteElement(term73906, 0, (byte) 3);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLocalFileDataData", argTypes, term73740, args);
        assertTrue(recursiveEquals(term73740, term73916));
        assertTrue(recursiveEquals(retValue, term73906));
    }

};


