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

public class X5455_ExtendedTimestamp_getCentralDirectoryData_957298860311 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64071;
     Object term64238;
     Object term64232;

    public X5455_ExtendedTimestamp_getCentralDirectoryData_957298860311() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64071 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term64175 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setBooleanField(term64071, term64071.getClass(), "bit0_modifyTimePresent", true);
        setBooleanField(term64071, term64071.getClass(), "bit1_accessTimePresent", true);
        setField(term64071, term64071.getClass(), "accessTime", null);
        setBooleanField(term64071, term64071.getClass(), "bit2_createTimePresent", true);
        setField(term64071, term64071.getClass(), "createTime", null);
        setField(term64071, term64071.getClass(), "modifyTime", term64175);
        term64238 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term64239 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term64238, term64238.getClass(), "flags", (byte) 0);
        setBooleanField(term64238, term64238.getClass(), "bit0_modifyTimePresent", true);
        setBooleanField(term64238, term64238.getClass(), "bit1_accessTimePresent", true);
        setBooleanField(term64238, term64238.getClass(), "bit2_createTimePresent", true);
        setLongField(term64239, term64239.getClass(), "value", 0L);
        setField(term64238, term64238.getClass(), "modifyTime", term64239);
        setField(term64238, term64238.getClass(), "accessTime", null);
        setField(term64238, term64238.getClass(), "createTime", null);
        term64232 = (byte[]) newByteArray(5);
        setByteElement(term64232, 0, (byte) 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getCentralDirectoryData", argTypes, term64071, args);
        assertTrue(recursiveEquals(term64071, term64238));
        assertTrue(recursiveEquals(retValue, term64232));
    }

};


