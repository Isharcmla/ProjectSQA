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

public class X5455_ExtendedTimestamp_getCentralDirectoryData_957298860154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term20690;
     Object term21072;
     Object term21070;

    public X5455_ExtendedTimestamp_getCentralDirectoryData_957298860154() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term20690 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term20794 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setBooleanField(term20690, term20690.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term20690, term20690.getClass(), "bit1_accessTimePresent", true);
        setField(term20690, term20690.getClass(), "accessTime", term20794);
        setBooleanField(term20690, term20690.getClass(), "bit2_createTimePresent", true);
        setField(term20690, term20690.getClass(), "createTime", term20794);
        term21072 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term21073 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term21072, term21072.getClass(), "flags", (byte) 0);
        setBooleanField(term21072, term21072.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term21072, term21072.getClass(), "bit1_accessTimePresent", true);
        setBooleanField(term21072, term21072.getClass(), "bit2_createTimePresent", true);
        setField(term21072, term21072.getClass(), "modifyTime", null);
        setLongField(term21073, term21073.getClass(), "value", 0L);
        setField(term21072, term21072.getClass(), "accessTime", term21073);
        setField(term21072, term21072.getClass(), "createTime", term21073);
        term21070 = (byte[]) newByteArray(1);
        setByteElement(term21070, 0, (byte) 6);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getCentralDirectoryData", argTypes, term20690, args);
        assertTrue(recursiveEquals(term20690, term21072));
        assertTrue(recursiveEquals(retValue, term21070));
    }

};


