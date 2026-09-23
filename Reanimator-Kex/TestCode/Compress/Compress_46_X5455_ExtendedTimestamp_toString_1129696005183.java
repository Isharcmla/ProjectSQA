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

public class X5455_ExtendedTimestamp_toString_1129696005183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29724;
     Object term30178;

    public X5455_ExtendedTimestamp_toString_1129696005183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29724 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term29828 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term29724, term29724.getClass(), "flags", (byte) 0);
        setBooleanField(term29724, term29724.getClass(), "bit0_modifyTimePresent", true);
        setField(term29724, term29724.getClass(), "modifyTime", term29828);
        term30178 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term30179 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term30178, term30178.getClass(), "flags", (byte) 0);
        setBooleanField(term30178, term30178.getClass(), "bit0_modifyTimePresent", true);
        setBooleanField(term30178, term30178.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term30178, term30178.getClass(), "bit2_createTimePresent", false);
        setLongField(term30179, term30179.getClass(), "value", 0L);
        setField(term30178, term30178.getClass(), "modifyTime", term30179);
        setField(term30178, term30178.getClass(), "accessTime", null);
        setField(term30178, term30178.getClass(), "createTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term29724, args);
        assertTrue(recursiveEquals(term29724, term30178));
        assertTrue(recursiveEquals(retValue, "0x5455 Zip Extra Field: Flags=0  Modify:[Wed Dec 31 16:00:00 PST 1969] "));
    }

};


