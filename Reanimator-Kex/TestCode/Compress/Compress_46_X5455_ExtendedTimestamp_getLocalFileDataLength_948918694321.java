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

public class X5455_ExtendedTimestamp_getLocalFileDataLength_948918694321 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65951;
     Object term65965;
     Object term65957;

    public X5455_ExtendedTimestamp_getLocalFileDataLength_948918694321() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65951 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setBooleanField(term65951, term65951.getClass(), "bit0_modifyTimePresent", true);
        setBooleanField(term65951, term65951.getClass(), "bit1_accessTimePresent", true);
        setField(term65951, term65951.getClass(), "accessTime", null);
        setBooleanField(term65951, term65951.getClass(), "bit2_createTimePresent", true);
        term65965 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        setByteField(term65965, term65965.getClass(), "flags", (byte) 0);
        setBooleanField(term65965, term65965.getClass(), "bit0_modifyTimePresent", true);
        setBooleanField(term65965, term65965.getClass(), "bit1_accessTimePresent", true);
        setBooleanField(term65965, term65965.getClass(), "bit2_createTimePresent", true);
        setField(term65965, term65965.getClass(), "modifyTime", null);
        setField(term65965, term65965.getClass(), "accessTime", null);
        setField(term65965, term65965.getClass(), "createTime", null);
        term65957 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipShort"));
        setIntField(term65957, term65957.getClass(), "value", 5);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLocalFileDataLength", argTypes, term65951, args);
        assertTrue(recursiveEquals(term65951, term65965));
        assertTrue(recursiveEquals(retValue, term65957));
    }

};


