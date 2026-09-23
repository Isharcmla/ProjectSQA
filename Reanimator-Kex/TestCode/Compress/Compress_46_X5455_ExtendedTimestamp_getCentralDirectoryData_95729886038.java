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

public class X5455_ExtendedTimestamp_getCentralDirectoryData_95729886038 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45;
     Object term580;
     Object term578;

    public X5455_ExtendedTimestamp_getCentralDirectoryData_95729886038() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term50 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term52 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term54 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term45, term45.getClass(), "flags", (byte) 18);
        setBooleanField(term45, term45.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term45, term45.getClass(), "bit1_accessTimePresent", true);
        setBooleanField(term45, term45.getClass(), "bit2_createTimePresent", false);
        setLongField(term50, term50.getClass(), "value", -4325723315152823407L);
        setField(term45, term45.getClass(), "modifyTime", term50);
        setLongField(term52, term52.getClass(), "value", 2535595959091595249L);
        setField(term45, term45.getClass(), "accessTime", term52);
        setLongField(term54, term54.getClass(), "value", -5476826692763582090L);
        setField(term45, term45.getClass(), "createTime", term54);
        term580 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term581 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term582 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term583 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term580, term580.getClass(), "flags", (byte) 18);
        setBooleanField(term580, term580.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term580, term580.getClass(), "bit1_accessTimePresent", true);
        setBooleanField(term580, term580.getClass(), "bit2_createTimePresent", false);
        setLongField(term581, term581.getClass(), "value", -4325723315152823407L);
        setField(term580, term580.getClass(), "modifyTime", term581);
        setLongField(term582, term582.getClass(), "value", 2535595959091595249L);
        setField(term580, term580.getClass(), "accessTime", term582);
        setLongField(term583, term583.getClass(), "value", -5476826692763582090L);
        setField(term580, term580.getClass(), "createTime", term583);
        term578 = (byte[]) newByteArray(1);
        setByteElement(term578, 0, (byte) 2);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getCentralDirectoryData", argTypes, term45, args);
        assertTrue(recursiveEquals(term45, term580));
        assertTrue(recursiveEquals(retValue, term578));
    }

};


