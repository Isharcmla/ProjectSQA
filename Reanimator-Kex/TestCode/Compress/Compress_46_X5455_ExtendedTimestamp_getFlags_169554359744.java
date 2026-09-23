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

public class X5455_ExtendedTimestamp_getFlags_169554359744 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term130;
     Object term1259;

    public X5455_ExtendedTimestamp_getFlags_169554359744() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term130 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term135 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term137 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term139 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term130, term130.getClass(), "flags", (byte) 87);
        setBooleanField(term130, term130.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term130, term130.getClass(), "bit1_accessTimePresent", true);
        setBooleanField(term130, term130.getClass(), "bit2_createTimePresent", true);
        setLongField(term135, term135.getClass(), "value", -4502405999831680926L);
        setField(term130, term130.getClass(), "modifyTime", term135);
        setLongField(term137, term137.getClass(), "value", 1967728129628047933L);
        setField(term130, term130.getClass(), "accessTime", term137);
        setLongField(term139, term139.getClass(), "value", 2120084523938730454L);
        setField(term130, term130.getClass(), "createTime", term139);
        term1259 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term1260 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term1261 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term1262 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term1259, term1259.getClass(), "flags", (byte) 87);
        setBooleanField(term1259, term1259.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term1259, term1259.getClass(), "bit1_accessTimePresent", true);
        setBooleanField(term1259, term1259.getClass(), "bit2_createTimePresent", true);
        setLongField(term1260, term1260.getClass(), "value", -4502405999831680926L);
        setField(term1259, term1259.getClass(), "modifyTime", term1260);
        setLongField(term1261, term1261.getClass(), "value", 1967728129628047933L);
        setField(term1259, term1259.getClass(), "accessTime", term1261);
        setLongField(term1262, term1262.getClass(), "value", 2120084523938730454L);
        setField(term1259, term1259.getClass(), "createTime", term1262);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getFlags", argTypes, term130, args);
        assertTrue(recursiveEquals(term130, term1259));
        assertTrue(recursiveEquals(retValue, (byte) 87));
    }

};


