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

public class X5455_ExtendedTimestamp_setModifyTime_61626780854 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term242;
     Object term253;
     Object term1429;
     Object term1433;

    public X5455_ExtendedTimestamp_setModifyTime_61626780854() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term242 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term247 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term249 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term251 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term242, term242.getClass(), "flags", (byte) 118);
        setBooleanField(term242, term242.getClass(), "bit0_modifyTimePresent", true);
        setBooleanField(term242, term242.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term242, term242.getClass(), "bit2_createTimePresent", false);
        setLongField(term247, term247.getClass(), "value", -3838084482494604218L);
        setField(term242, term242.getClass(), "modifyTime", term247);
        setLongField(term249, term249.getClass(), "value", 3892018155439224435L);
        setField(term242, term242.getClass(), "accessTime", term249);
        setLongField(term251, term251.getClass(), "value", 5953383087795962419L);
        setField(term242, term242.getClass(), "createTime", term251);
        term253 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setLongField(term253, term253.getClass(), "value", 7994303628307559416L);
        term1429 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term1430 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term1431 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term1432 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term1429, term1429.getClass(), "flags", (byte) 119);
        setBooleanField(term1429, term1429.getClass(), "bit0_modifyTimePresent", true);
        setBooleanField(term1429, term1429.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term1429, term1429.getClass(), "bit2_createTimePresent", false);
        setLongField(term1430, term1430.getClass(), "value", 7994303628307559416L);
        setField(term1429, term1429.getClass(), "modifyTime", term1430);
        setLongField(term1431, term1431.getClass(), "value", 3892018155439224435L);
        setField(term1429, term1429.getClass(), "accessTime", term1431);
        setLongField(term1432, term1432.getClass(), "value", 5953383087795962419L);
        setField(term1429, term1429.getClass(), "createTime", term1432);
        term1433 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setLongField(term1433, term1433.getClass(), "value", 7994303628307559416L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.zip.ZipLong");
        Object[] args = new Object[1];
        args[0] = term253;
        callMethod(klass, "setModifyTime", argTypes, term242, args);
        assertTrue(recursiveEquals(term242, term1429));
        assertTrue(recursiveEquals(term253, term1433));
    }

};


