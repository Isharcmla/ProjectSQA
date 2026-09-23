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

public class X5455_ExtendedTimestamp_toString_1129696005325 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67019;
     Object term67223;

    public X5455_ExtendedTimestamp_toString_1129696005325() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67019 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term67123 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term67019, term67019.getClass(), "flags", (byte) 0);
        setBooleanField(term67019, term67019.getClass(), "bit0_modifyTimePresent", true);
        setField(term67019, term67019.getClass(), "modifyTime", null);
        setBooleanField(term67019, term67019.getClass(), "bit1_accessTimePresent", true);
        setField(term67019, term67019.getClass(), "accessTime", null);
        setBooleanField(term67019, term67019.getClass(), "bit2_createTimePresent", true);
        setField(term67019, term67019.getClass(), "createTime", term67123);
        term67223 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term67224 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term67223, term67223.getClass(), "flags", (byte) 0);
        setBooleanField(term67223, term67223.getClass(), "bit0_modifyTimePresent", true);
        setBooleanField(term67223, term67223.getClass(), "bit1_accessTimePresent", true);
        setBooleanField(term67223, term67223.getClass(), "bit2_createTimePresent", true);
        setField(term67223, term67223.getClass(), "modifyTime", null);
        setField(term67223, term67223.getClass(), "accessTime", null);
        setLongField(term67224, term67224.getClass(), "value", 0L);
        setField(term67223, term67223.getClass(), "createTime", term67224);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term67019, args);
        assertTrue(recursiveEquals(term67019, term67223));
        assertTrue(recursiveEquals(retValue, "0x5455 Zip Extra Field: Flags=0  Create:[Wed Dec 31 16:00:00 PST 1969] "));
    }

};


