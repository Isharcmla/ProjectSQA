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

public class X5455_ExtendedTimestamp_getLocalFileDataData_2070398401138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16971;
     Object term17149;
     Object term17147;

    public X5455_ExtendedTimestamp_getLocalFileDataData_2070398401138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term16971 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setBooleanField(term16971, term16971.getClass(), "bit0_modifyTimePresent", false);
        term17149 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setByteField(term17149, term17149.getClass(), "flags", (byte) 0);
        setBooleanField(term17149, term17149.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term17149, term17149.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term17149, term17149.getClass(), "bit2_createTimePresent", false);
        setField(term17149, term17149.getClass(), "modifyTime", null);
        setField(term17149, term17149.getClass(), "accessTime", null);
        setField(term17149, term17149.getClass(), "createTime", null);
        term17147 = (byte[]) newByteArray(1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLocalFileDataData", argTypes, term16971, args);
        assertTrue(recursiveEquals(term16971, term17149));
        assertTrue(recursiveEquals(retValue, term17147));
    }

};


