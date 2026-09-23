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

public class X5455_ExtendedTimestamp_equals_2089142370207 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term36448;
     Object term36688;
     Object term36943;
     Object term36945;

    public X5455_ExtendedTimestamp_equals_2089142370207() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term36448 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term36552 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term36448, term36448.getClass(), "flags", (byte) -8);
        setLongField(term36552, term36552.getClass(), "value", 0L);
        setField(term36448, term36448.getClass(), "modifyTime", term36552);
        setField(term36448, term36448.getClass(), "accessTime", null);
        term36688 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term36792 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term36896 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term36688, term36688.getClass(), "flags", (byte) 0);
        setLongField(term36792, term36792.getClass(), "value", 0L);
        setField(term36688, term36688.getClass(), "modifyTime", term36792);
        setField(term36688, term36688.getClass(), "accessTime", term36896);
        term36943 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term36944 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term36943, term36943.getClass(), "flags", (byte) -8);
        setBooleanField(term36943, term36943.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term36943, term36943.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term36943, term36943.getClass(), "bit2_createTimePresent", false);
        setLongField(term36944, term36944.getClass(), "value", 0L);
        setField(term36943, term36943.getClass(), "modifyTime", term36944);
        setField(term36943, term36943.getClass(), "accessTime", null);
        setField(term36943, term36943.getClass(), "createTime", null);
        term36945 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term36946 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term36947 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term36945, term36945.getClass(), "flags", (byte) 0);
        setBooleanField(term36945, term36945.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term36945, term36945.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term36945, term36945.getClass(), "bit2_createTimePresent", false);
        setLongField(term36946, term36946.getClass(), "value", 0L);
        setField(term36945, term36945.getClass(), "modifyTime", term36946);
        setLongField(term36947, term36947.getClass(), "value", 0L);
        setField(term36945, term36945.getClass(), "accessTime", term36947);
        setField(term36945, term36945.getClass(), "createTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term36688;
        Object retValue = callMethod(klass, "equals", argTypes, term36448, args);
        assertTrue(recursiveEquals(term36448, term36943));
        assertTrue(recursiveEquals(term36688, term36945));
        assertTrue(recursiveEquals(retValue, false));
    }

};


