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

public class X5455_ExtendedTimestamp_getLocalFileDataLength_948918694237 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44193;
     Object term44313;
     Object term44303;

    public X5455_ExtendedTimestamp_getLocalFileDataLength_948918694237() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44193 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term44297 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setBooleanField(term44193, term44193.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term44193, term44193.getClass(), "bit1_accessTimePresent", true);
        setField(term44193, term44193.getClass(), "accessTime", null);
        setBooleanField(term44193, term44193.getClass(), "bit2_createTimePresent", true);
        setField(term44193, term44193.getClass(), "createTime", term44297);
        term44313 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term44314 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term44313, term44313.getClass(), "flags", (byte) 0);
        setBooleanField(term44313, term44313.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term44313, term44313.getClass(), "bit1_accessTimePresent", true);
        setBooleanField(term44313, term44313.getClass(), "bit2_createTimePresent", true);
        setField(term44313, term44313.getClass(), "modifyTime", null);
        setField(term44313, term44313.getClass(), "accessTime", null);
        setLongField(term44314, term44314.getClass(), "value", 0L);
        setField(term44313, term44313.getClass(), "createTime", term44314);
        term44303 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipShort"));
        setIntField(term44303, term44303.getClass(), "value", 5);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLocalFileDataLength", argTypes, term44193, args);
        assertTrue(recursiveEquals(term44193, term44313));
        assertTrue(recursiveEquals(retValue, term44303));
    }

};


