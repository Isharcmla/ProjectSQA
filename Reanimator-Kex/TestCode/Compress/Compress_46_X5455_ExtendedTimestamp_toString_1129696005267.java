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

public class X5455_ExtendedTimestamp_toString_1129696005267 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53109;
     Object term53312;

    public X5455_ExtendedTimestamp_toString_1129696005267() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53109 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term53213 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term53109, term53109.getClass(), "flags", (byte) 0);
        setBooleanField(term53109, term53109.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term53109, term53109.getClass(), "bit1_accessTimePresent", true);
        setField(term53109, term53109.getClass(), "accessTime", null);
        setBooleanField(term53109, term53109.getClass(), "bit2_createTimePresent", true);
        setField(term53109, term53109.getClass(), "createTime", term53213);
        term53312 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term53313 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term53312, term53312.getClass(), "flags", (byte) 0);
        setBooleanField(term53312, term53312.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term53312, term53312.getClass(), "bit1_accessTimePresent", true);
        setBooleanField(term53312, term53312.getClass(), "bit2_createTimePresent", true);
        setField(term53312, term53312.getClass(), "modifyTime", null);
        setField(term53312, term53312.getClass(), "accessTime", null);
        setLongField(term53313, term53313.getClass(), "value", 0L);
        setField(term53312, term53312.getClass(), "createTime", term53313);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term53109, args);
        assertTrue(recursiveEquals(term53109, term53312));
        assertTrue(recursiveEquals(retValue, "0x5455 Zip Extra Field: Flags=0  Create:[Wed Dec 31 16:00:00 PST 1969] "));
    }

};


