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

public class X5455_ExtendedTimestamp_getLocalFileDataLength_94891869435 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term12;
     Object term411;
     Object term397;

    public X5455_ExtendedTimestamp_getLocalFileDataLength_94891869435() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term12 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term17 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term19 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term21 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term12, term12.getClass(), "flags", (byte) 48);
        setBooleanField(term12, term12.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term12, term12.getClass(), "bit1_accessTimePresent", true);
        setBooleanField(term12, term12.getClass(), "bit2_createTimePresent", true);
        setLongField(term17, term17.getClass(), "value", -8400487765614892086L);
        setField(term12, term12.getClass(), "modifyTime", term17);
        setLongField(term19, term19.getClass(), "value", 5270370404989704783L);
        setField(term12, term12.getClass(), "accessTime", term19);
        setLongField(term21, term21.getClass(), "value", 7411271909051562686L);
        setField(term12, term12.getClass(), "createTime", term21);
        term411 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term412 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term413 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term414 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term411, term411.getClass(), "flags", (byte) 48);
        setBooleanField(term411, term411.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term411, term411.getClass(), "bit1_accessTimePresent", true);
        setBooleanField(term411, term411.getClass(), "bit2_createTimePresent", true);
        setLongField(term412, term412.getClass(), "value", -8400487765614892086L);
        setField(term411, term411.getClass(), "modifyTime", term412);
        setLongField(term413, term413.getClass(), "value", 5270370404989704783L);
        setField(term411, term411.getClass(), "accessTime", term413);
        setLongField(term414, term414.getClass(), "value", 7411271909051562686L);
        setField(term411, term411.getClass(), "createTime", term414);
        term397 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipShort"));
        setIntField(term397, term397.getClass(), "value", 9);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLocalFileDataLength", argTypes, term12, args);
        assertTrue(recursiveEquals(term12, term411));
        assertTrue(recursiveEquals(retValue, term397));
    }

};


