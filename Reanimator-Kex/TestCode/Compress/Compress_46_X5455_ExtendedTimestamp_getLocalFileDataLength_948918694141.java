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

public class X5455_ExtendedTimestamp_getLocalFileDataLength_948918694141 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17324;
     Object term17443;
     Object term17433;

    public X5455_ExtendedTimestamp_getLocalFileDataLength_948918694141() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17324 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term17428 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setBooleanField(term17324, term17324.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term17324, term17324.getClass(), "bit1_accessTimePresent", true);
        setField(term17324, term17324.getClass(), "accessTime", term17428);
        setBooleanField(term17324, term17324.getClass(), "bit2_createTimePresent", false);
        term17443 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term17444 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term17443, term17443.getClass(), "flags", (byte) 0);
        setBooleanField(term17443, term17443.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term17443, term17443.getClass(), "bit1_accessTimePresent", true);
        setBooleanField(term17443, term17443.getClass(), "bit2_createTimePresent", false);
        setField(term17443, term17443.getClass(), "modifyTime", null);
        setLongField(term17444, term17444.getClass(), "value", 0L);
        setField(term17443, term17443.getClass(), "accessTime", term17444);
        setField(term17443, term17443.getClass(), "createTime", null);
        term17433 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipShort"));
        setIntField(term17433, term17433.getClass(), "value", 5);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLocalFileDataLength", argTypes, term17324, args);
        assertTrue(recursiveEquals(term17324, term17443));
        assertTrue(recursiveEquals(retValue, term17433));
    }

};


