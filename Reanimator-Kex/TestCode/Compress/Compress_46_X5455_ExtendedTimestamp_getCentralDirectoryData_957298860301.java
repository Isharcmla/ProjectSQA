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

public class X5455_ExtendedTimestamp_getCentralDirectoryData_957298860301 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term60592;
     Object term60885;
     Object term60879;

    public X5455_ExtendedTimestamp_getCentralDirectoryData_957298860301() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term60592 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term60696 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term60800 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setBooleanField(term60592, term60592.getClass(), "bit0_modifyTimePresent", true);
        setBooleanField(term60592, term60592.getClass(), "bit1_accessTimePresent", true);
        setField(term60592, term60592.getClass(), "accessTime", term60696);
        setBooleanField(term60592, term60592.getClass(), "bit2_createTimePresent", false);
        setField(term60592, term60592.getClass(), "modifyTime", term60800);
        term60885 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term60886 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term60887 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term60885, term60885.getClass(), "flags", (byte) 0);
        setBooleanField(term60885, term60885.getClass(), "bit0_modifyTimePresent", true);
        setBooleanField(term60885, term60885.getClass(), "bit1_accessTimePresent", true);
        setBooleanField(term60885, term60885.getClass(), "bit2_createTimePresent", false);
        setLongField(term60886, term60886.getClass(), "value", 0L);
        setField(term60885, term60885.getClass(), "modifyTime", term60886);
        setLongField(term60887, term60887.getClass(), "value", 0L);
        setField(term60885, term60885.getClass(), "accessTime", term60887);
        setField(term60885, term60885.getClass(), "createTime", null);
        term60879 = (byte[]) newByteArray(5);
        setByteElement(term60879, 0, (byte) 3);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getCentralDirectoryData", argTypes, term60592, args);
        assertTrue(recursiveEquals(term60592, term60885));
        assertTrue(recursiveEquals(retValue, term60879));
    }

};


