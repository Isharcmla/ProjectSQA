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

public class X5455_ExtendedTimestamp_isBit1accessTimePresent_168905969945 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term152;
     Object term1275;

    public X5455_ExtendedTimestamp_isBit1accessTimePresent_168905969945() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term152 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term157 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term159 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term161 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term152, term152.getClass(), "flags", (byte) -99);
        setBooleanField(term152, term152.getClass(), "bit0_modifyTimePresent", true);
        setBooleanField(term152, term152.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term152, term152.getClass(), "bit2_createTimePresent", true);
        setLongField(term157, term157.getClass(), "value", -6823727938421990489L);
        setField(term152, term152.getClass(), "modifyTime", term157);
        setLongField(term159, term159.getClass(), "value", -484994522244390100L);
        setField(term152, term152.getClass(), "accessTime", term159);
        setLongField(term161, term161.getClass(), "value", 1233889271256172047L);
        setField(term152, term152.getClass(), "createTime", term161);
        term1275 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term1276 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term1277 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term1278 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term1275, term1275.getClass(), "flags", (byte) -99);
        setBooleanField(term1275, term1275.getClass(), "bit0_modifyTimePresent", true);
        setBooleanField(term1275, term1275.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term1275, term1275.getClass(), "bit2_createTimePresent", true);
        setLongField(term1276, term1276.getClass(), "value", -6823727938421990489L);
        setField(term1275, term1275.getClass(), "modifyTime", term1276);
        setLongField(term1277, term1277.getClass(), "value", -484994522244390100L);
        setField(term1275, term1275.getClass(), "accessTime", term1277);
        setLongField(term1278, term1278.getClass(), "value", 1233889271256172047L);
        setField(term1275, term1275.getClass(), "createTime", term1278);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isBit1_accessTimePresent", argTypes, term152, args);
        assertTrue(recursiveEquals(term152, term1275));
    }

};


