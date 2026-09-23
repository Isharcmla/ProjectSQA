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

public class X5455_ExtendedTimestamp_equals_2089142370108 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7952;
     Object term8296;
     Object term9355;
     Object term9358;

    public X5455_ExtendedTimestamp_equals_2089142370108() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term7952 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term8348 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term8160 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term7952, term7952.getClass(), "flags", (byte) 0);
        setField(term7952, term7952.getClass(), "modifyTime", term8348);
        setField(term7952, term7952.getClass(), "accessTime", term8160);
        term8296 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term8452 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term8296, term8296.getClass(), "flags", (byte) 0);
        setField(term8296, term8296.getClass(), "modifyTime", term8348);
        setField(term8296, term8296.getClass(), "accessTime", term8452);
        term9355 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term9356 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term9357 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term9355, term9355.getClass(), "flags", (byte) 0);
        setBooleanField(term9355, term9355.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term9355, term9355.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term9355, term9355.getClass(), "bit2_createTimePresent", false);
        setLongField(term9356, term9356.getClass(), "value", 0L);
        setField(term9355, term9355.getClass(), "modifyTime", term9356);
        setLongField(term9357, term9357.getClass(), "value", 0L);
        setField(term9355, term9355.getClass(), "accessTime", term9357);
        setField(term9355, term9355.getClass(), "createTime", null);
        term9358 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term9359 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term9360 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term9358, term9358.getClass(), "flags", (byte) 0);
        setBooleanField(term9358, term9358.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term9358, term9358.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term9358, term9358.getClass(), "bit2_createTimePresent", false);
        setLongField(term9359, term9359.getClass(), "value", 0L);
        setField(term9358, term9358.getClass(), "modifyTime", term9359);
        setLongField(term9360, term9360.getClass(), "value", 0L);
        setField(term9358, term9358.getClass(), "accessTime", term9360);
        setField(term9358, term9358.getClass(), "createTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term8296;
        Object retValue = callMethod(klass, "equals", argTypes, term7952, args);
        assertTrue(recursiveEquals(term7952, term9355));
        assertTrue(recursiveEquals(term8296, term9358));
        assertTrue(recursiveEquals(retValue, true));
    }

};


