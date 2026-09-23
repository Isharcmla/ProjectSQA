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

public class X5455_ExtendedTimestamp_getHeaderId_167975162534 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term388;
     Object term375;

    public X5455_ExtendedTimestamp_getHeaderId_167975162534() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term6 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term8 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term10 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term1, term1.getClass(), "flags", (byte) 47);
        setBooleanField(term1, term1.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term1, term1.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term1, term1.getClass(), "bit2_createTimePresent", false);
        setLongField(term6, term6.getClass(), "value", 2442117782898005296L);
        setField(term1, term1.getClass(), "modifyTime", term6);
        setLongField(term8, term8.getClass(), "value", 6375119433582206027L);
        setField(term1, term1.getClass(), "accessTime", term8);
        setLongField(term10, term10.getClass(), "value", -8257434502486459194L);
        setField(term1, term1.getClass(), "createTime", term10);
        term388 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term389 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term390 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term391 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term388, term388.getClass(), "flags", (byte) 47);
        setBooleanField(term388, term388.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term388, term388.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term388, term388.getClass(), "bit2_createTimePresent", false);
        setLongField(term389, term389.getClass(), "value", 2442117782898005296L);
        setField(term388, term388.getClass(), "modifyTime", term389);
        setLongField(term390, term390.getClass(), "value", 6375119433582206027L);
        setField(term388, term388.getClass(), "accessTime", term390);
        setLongField(term391, term391.getClass(), "value", -8257434502486459194L);
        setField(term388, term388.getClass(), "createTime", term391);
        term375 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipShort"));
        setIntField(term375, term375.getClass(), "value", 21589);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getHeaderId", argTypes, term1, args);
        assertTrue(recursiveEquals(term1, term388));
        assertTrue(recursiveEquals(retValue, term375));
    }

};


