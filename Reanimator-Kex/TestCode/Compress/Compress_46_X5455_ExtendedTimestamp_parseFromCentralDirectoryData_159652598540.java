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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.compress.archivers.zip.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Integer;

public class X5455_ExtendedTimestamp_parseFromCentralDirectoryData_159652598540 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term82;
     Object term93;
     Object term98;
     Object term100;

    public X5455_ExtendedTimestamp_parseFromCentralDirectoryData_159652598540() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term82 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term87 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term89 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term91 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term82, term82.getClass(), "flags", (byte) -66);
        setBooleanField(term82, term82.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term82, term82.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term82, term82.getClass(), "bit2_createTimePresent", true);
        setLongField(term87, term87.getClass(), "value", -6573104506744284592L);
        setField(term82, term82.getClass(), "modifyTime", term87);
        setLongField(term89, term89.getClass(), "value", -4920224193275732920L);
        setField(term82, term82.getClass(), "accessTime", term89);
        setLongField(term91, term91.getClass(), "value", 8428634514691209827L);
        setField(term82, term82.getClass(), "createTime", term91);
        term93 = (byte[]) newByteArray(4);
        setByteElement(term93, 0, (byte) 83);
        setByteElement(term93, 1, (byte) 74);
        setByteElement(term93, 2, (byte) -71);
        setByteElement(term93, 3, (byte) 49);
        term98 = new Integer(1484323161);
        term100 = new Integer(391863371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Array.newInstance(byte.class, 0).getClass();
        argTypes[1] = int.class;
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = term93;
        args[1] = term98;
        args[2] = term100;
        try {
            callMethod(klass, "parseFromCentralDirectoryData", argTypes, term82, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


