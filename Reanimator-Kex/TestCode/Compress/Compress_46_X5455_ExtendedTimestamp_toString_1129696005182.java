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

public class X5455_ExtendedTimestamp_toString_1129696005182 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28919;
     Object term30008;

    public X5455_ExtendedTimestamp_toString_1129696005182() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28919 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term29023 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term28919, term28919.getClass(), "flags", (byte) 0);
        setBooleanField(term28919, term28919.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term28919, term28919.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term28919, term28919.getClass(), "bit2_createTimePresent", true);
        setField(term28919, term28919.getClass(), "createTime", term29023);
        term30008 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term30009 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term30008, term30008.getClass(), "flags", (byte) 0);
        setBooleanField(term30008, term30008.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term30008, term30008.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term30008, term30008.getClass(), "bit2_createTimePresent", true);
        setField(term30008, term30008.getClass(), "modifyTime", null);
        setField(term30008, term30008.getClass(), "accessTime", null);
        setLongField(term30009, term30009.getClass(), "value", 0L);
        setField(term30008, term30008.getClass(), "createTime", term30009);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term28919, args);
        assertTrue(recursiveEquals(term28919, term30008));
        assertTrue(recursiveEquals(retValue, "0x5455 Zip Extra Field: Flags=0  Create:[Wed Dec 31 16:00:00 PST 1969] "));
    }

};


