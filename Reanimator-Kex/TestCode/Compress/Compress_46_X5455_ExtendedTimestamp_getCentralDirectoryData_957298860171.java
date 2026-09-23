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

public class X5455_ExtendedTimestamp_getCentralDirectoryData_957298860171 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term24672;
     Object term25910;
     Object term25904;

    public X5455_ExtendedTimestamp_getCentralDirectoryData_957298860171() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term24672 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term24776 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setBooleanField(term24672, term24672.getClass(), "bit0_modifyTimePresent", true);
        setBooleanField(term24672, term24672.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term24672, term24672.getClass(), "bit2_createTimePresent", false);
        setField(term24672, term24672.getClass(), "modifyTime", term24776);
        term25910 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term25911 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term25910, term25910.getClass(), "flags", (byte) 0);
        setBooleanField(term25910, term25910.getClass(), "bit0_modifyTimePresent", true);
        setBooleanField(term25910, term25910.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term25910, term25910.getClass(), "bit2_createTimePresent", false);
        setLongField(term25911, term25911.getClass(), "value", 0L);
        setField(term25910, term25910.getClass(), "modifyTime", term25911);
        setField(term25910, term25910.getClass(), "accessTime", null);
        setField(term25910, term25910.getClass(), "createTime", null);
        term25904 = (byte[]) newByteArray(5);
        setByteElement(term25904, 0, (byte) 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getCentralDirectoryData", argTypes, term24672, args);
        assertTrue(recursiveEquals(term24672, term25910));
        assertTrue(recursiveEquals(retValue, term25904));
    }

};


