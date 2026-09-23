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

public class X5455_ExtendedTimestamp_toString_1129696005233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42774;
     Object term42977;

    public X5455_ExtendedTimestamp_toString_1129696005233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42774 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term42878 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term42774, term42774.getClass(), "flags", (byte) 0);
        setBooleanField(term42774, term42774.getClass(), "bit0_modifyTimePresent", true);
        setField(term42774, term42774.getClass(), "modifyTime", null);
        setBooleanField(term42774, term42774.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term42774, term42774.getClass(), "bit2_createTimePresent", true);
        setField(term42774, term42774.getClass(), "createTime", term42878);
        term42977 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term42978 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term42977, term42977.getClass(), "flags", (byte) 0);
        setBooleanField(term42977, term42977.getClass(), "bit0_modifyTimePresent", true);
        setBooleanField(term42977, term42977.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term42977, term42977.getClass(), "bit2_createTimePresent", true);
        setField(term42977, term42977.getClass(), "modifyTime", null);
        setField(term42977, term42977.getClass(), "accessTime", null);
        setLongField(term42978, term42978.getClass(), "value", 0L);
        setField(term42977, term42977.getClass(), "createTime", term42978);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "toString", argTypes, term42774, args);
        assertTrue(recursiveEquals(term42774, term42977));
        assertTrue(recursiveEquals(retValue, "0x5455 Zip Extra Field: Flags=0  Create:[Wed Dec 31 16:00:00 PST 1969] "));
    }

};


