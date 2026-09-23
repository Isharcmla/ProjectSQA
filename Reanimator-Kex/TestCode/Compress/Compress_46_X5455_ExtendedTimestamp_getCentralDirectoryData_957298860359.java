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

public class X5455_ExtendedTimestamp_getCentralDirectoryData_957298860359 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term75437;
     Object term75732;
     Object term75726;

    public X5455_ExtendedTimestamp_getCentralDirectoryData_957298860359() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term75437 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term75541 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term75645 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setBooleanField(term75437, term75437.getClass(), "bit0_modifyTimePresent", true);
        setBooleanField(term75437, term75437.getClass(), "bit1_accessTimePresent", true);
        setField(term75437, term75437.getClass(), "accessTime", null);
        setBooleanField(term75437, term75437.getClass(), "bit2_createTimePresent", true);
        setField(term75437, term75437.getClass(), "createTime", term75541);
        setField(term75437, term75437.getClass(), "modifyTime", term75645);
        term75732 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term75733 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term75734 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term75732, term75732.getClass(), "flags", (byte) 0);
        setBooleanField(term75732, term75732.getClass(), "bit0_modifyTimePresent", true);
        setBooleanField(term75732, term75732.getClass(), "bit1_accessTimePresent", true);
        setBooleanField(term75732, term75732.getClass(), "bit2_createTimePresent", true);
        setLongField(term75733, term75733.getClass(), "value", 0L);
        setField(term75732, term75732.getClass(), "modifyTime", term75733);
        setField(term75732, term75732.getClass(), "accessTime", null);
        setLongField(term75734, term75734.getClass(), "value", 0L);
        setField(term75732, term75732.getClass(), "createTime", term75734);
        term75726 = (byte[]) newByteArray(5);
        setByteElement(term75726, 0, (byte) 5);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getCentralDirectoryData", argTypes, term75437, args);
        assertTrue(recursiveEquals(term75437, term75732));
        assertTrue(recursiveEquals(retValue, term75726));
    }

};


