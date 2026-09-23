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

public class X5455_ExtendedTimestamp_getLocalFileDataData_2070398401225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40293;
     Object term40315;
     Object term40313;

    public X5455_ExtendedTimestamp_getLocalFileDataData_2070398401225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40293 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setBooleanField(term40293, term40293.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term40293, term40293.getClass(), "bit1_accessTimePresent", true);
        term40315 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setByteField(term40315, term40315.getClass(), "flags", (byte) 0);
        setBooleanField(term40315, term40315.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term40315, term40315.getClass(), "bit1_accessTimePresent", true);
        setBooleanField(term40315, term40315.getClass(), "bit2_createTimePresent", false);
        setField(term40315, term40315.getClass(), "modifyTime", null);
        setField(term40315, term40315.getClass(), "accessTime", null);
        setField(term40315, term40315.getClass(), "createTime", null);
        term40313 = (byte[]) newByteArray(1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLocalFileDataData", argTypes, term40293, args);
        assertTrue(recursiveEquals(term40293, term40315));
        assertTrue(recursiveEquals(retValue, term40313));
    }

};


