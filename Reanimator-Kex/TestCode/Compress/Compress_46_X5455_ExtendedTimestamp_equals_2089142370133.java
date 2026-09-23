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

public class X5455_ExtendedTimestamp_equals_2089142370133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term15242;
     Object term15586;
     Object term16230;
     Object term16233;

    public X5455_ExtendedTimestamp_equals_2089142370133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term15242 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term15346 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term15450 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term15242, term15242.getClass(), "flags", (byte) 0);
        setLongField(term15346, term15346.getClass(), "value", 0L);
        setField(term15242, term15242.getClass(), "modifyTime", term15346);
        setField(term15242, term15242.getClass(), "accessTime", term15450);
        term15586 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term15690 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term15794 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term15586, term15586.getClass(), "flags", (byte) 0);
        setLongField(term15690, term15690.getClass(), "value", 0L);
        setField(term15586, term15586.getClass(), "modifyTime", term15690);
        setField(term15586, term15586.getClass(), "accessTime", term15794);
        term16230 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term16231 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term16232 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term16230, term16230.getClass(), "flags", (byte) 0);
        setBooleanField(term16230, term16230.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term16230, term16230.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term16230, term16230.getClass(), "bit2_createTimePresent", false);
        setLongField(term16231, term16231.getClass(), "value", 0L);
        setField(term16230, term16230.getClass(), "modifyTime", term16231);
        setLongField(term16232, term16232.getClass(), "value", 0L);
        setField(term16230, term16230.getClass(), "accessTime", term16232);
        setField(term16230, term16230.getClass(), "createTime", null);
        term16233 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term16234 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term16235 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term16233, term16233.getClass(), "flags", (byte) 0);
        setBooleanField(term16233, term16233.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term16233, term16233.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term16233, term16233.getClass(), "bit2_createTimePresent", false);
        setLongField(term16234, term16234.getClass(), "value", 0L);
        setField(term16233, term16233.getClass(), "modifyTime", term16234);
        setLongField(term16235, term16235.getClass(), "value", 0L);
        setField(term16233, term16233.getClass(), "accessTime", term16235);
        setField(term16233, term16233.getClass(), "createTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term15586;
        Object retValue = callMethod(klass, "equals", argTypes, term15242, args);
        assertTrue(recursiveEquals(term15242, term16230));
        assertTrue(recursiveEquals(term15586, term16233));
        assertTrue(recursiveEquals(retValue, true));
    }

};


