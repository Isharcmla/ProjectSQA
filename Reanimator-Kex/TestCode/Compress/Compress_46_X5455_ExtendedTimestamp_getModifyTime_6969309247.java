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

public class X5455_ExtendedTimestamp_getModifyTime_6969309247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term174;
     Object term1306;
     Object term1295;

    public X5455_ExtendedTimestamp_getModifyTime_6969309247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term174 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term179 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term181 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term183 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term174, term174.getClass(), "flags", (byte) -16);
        setBooleanField(term174, term174.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term174, term174.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term174, term174.getClass(), "bit2_createTimePresent", false);
        setLongField(term179, term179.getClass(), "value", 5907001541142728739L);
        setField(term174, term174.getClass(), "modifyTime", term179);
        setLongField(term181, term181.getClass(), "value", 4178434741742309755L);
        setField(term174, term174.getClass(), "accessTime", term181);
        setLongField(term183, term183.getClass(), "value", -2068172595987555756L);
        setField(term174, term174.getClass(), "createTime", term183);
        term1306 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term1307 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term1308 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term1309 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term1306, term1306.getClass(), "flags", (byte) -16);
        setBooleanField(term1306, term1306.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term1306, term1306.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term1306, term1306.getClass(), "bit2_createTimePresent", false);
        setLongField(term1307, term1307.getClass(), "value", 5907001541142728739L);
        setField(term1306, term1306.getClass(), "modifyTime", term1307);
        setLongField(term1308, term1308.getClass(), "value", 4178434741742309755L);
        setField(term1306, term1306.getClass(), "accessTime", term1308);
        setLongField(term1309, term1309.getClass(), "value", -2068172595987555756L);
        setField(term1306, term1306.getClass(), "createTime", term1309);
        term1295 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setLongField(term1295, term1295.getClass(), "value", 5907001541142728739L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getModifyTime", argTypes, term174, args);
        assertTrue(recursiveEquals(term174, term1306));
        assertTrue(recursiveEquals(retValue, term1295));
    }

};


