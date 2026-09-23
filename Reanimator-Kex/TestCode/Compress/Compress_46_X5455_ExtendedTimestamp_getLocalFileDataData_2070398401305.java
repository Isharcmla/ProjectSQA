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

public class X5455_ExtendedTimestamp_getLocalFileDataData_2070398401305 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61399;
     Object term61575;
     Object term61565;

    public X5455_ExtendedTimestamp_getLocalFileDataData_2070398401305() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61399 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term61503 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setBooleanField(term61399, term61399.getClass(), "bit0_modifyTimePresent", true);
        setBooleanField(term61399, term61399.getClass(), "bit1_accessTimePresent", true);
        setField(term61399, term61399.getClass(), "accessTime", null);
        setBooleanField(term61399, term61399.getClass(), "bit2_createTimePresent", true);
        setField(term61399, term61399.getClass(), "createTime", term61503);
        setField(term61399, term61399.getClass(), "modifyTime", term61503);
        term61575 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term61576 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term61575, term61575.getClass(), "flags", (byte) 0);
        setBooleanField(term61575, term61575.getClass(), "bit0_modifyTimePresent", true);
        setBooleanField(term61575, term61575.getClass(), "bit1_accessTimePresent", true);
        setBooleanField(term61575, term61575.getClass(), "bit2_createTimePresent", true);
        setLongField(term61576, term61576.getClass(), "value", 0L);
        setField(term61575, term61575.getClass(), "modifyTime", term61576);
        setField(term61575, term61575.getClass(), "accessTime", null);
        setField(term61575, term61575.getClass(), "createTime", term61576);
        term61565 = (byte[]) newByteArray(9);
        setByteElement(term61565, 0, (byte) 5);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLocalFileDataData", argTypes, term61399, args);
        assertTrue(recursiveEquals(term61399, term61575));
        assertTrue(recursiveEquals(retValue, term61565));
    }

};


