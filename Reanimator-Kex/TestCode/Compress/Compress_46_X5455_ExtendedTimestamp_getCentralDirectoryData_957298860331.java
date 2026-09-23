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

public class X5455_ExtendedTimestamp_getCentralDirectoryData_957298860331 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68720;
     Object term68881;
     Object term68879;

    public X5455_ExtendedTimestamp_getCentralDirectoryData_957298860331() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68720 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term68824 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setBooleanField(term68720, term68720.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term68720, term68720.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term68720, term68720.getClass(), "bit2_createTimePresent", true);
        setField(term68720, term68720.getClass(), "createTime", term68824);
        term68881 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term68882 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term68881, term68881.getClass(), "flags", (byte) 0);
        setBooleanField(term68881, term68881.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term68881, term68881.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term68881, term68881.getClass(), "bit2_createTimePresent", true);
        setField(term68881, term68881.getClass(), "modifyTime", null);
        setField(term68881, term68881.getClass(), "accessTime", null);
        setLongField(term68882, term68882.getClass(), "value", 0L);
        setField(term68881, term68881.getClass(), "createTime", term68882);
        term68879 = (byte[]) newByteArray(1);
        setByteElement(term68879, 0, (byte) 4);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getCentralDirectoryData", argTypes, term68720, args);
        assertTrue(recursiveEquals(term68720, term68881));
        assertTrue(recursiveEquals(retValue, term68879));
    }

};


