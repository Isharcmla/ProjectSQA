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

public class X5455_ExtendedTimestamp_getLocalFileDataLength_948918694102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6997;
     Object term7265;
     Object term7255;

    public X5455_ExtendedTimestamp_getLocalFileDataLength_948918694102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6997 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term7101 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setBooleanField(term6997, term6997.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term6997, term6997.getClass(), "bit1_accessTimePresent", true);
        setField(term6997, term6997.getClass(), "accessTime", term7101);
        setBooleanField(term6997, term6997.getClass(), "bit2_createTimePresent", true);
        setField(term6997, term6997.getClass(), "createTime", null);
        term7265 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term7266 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term7265, term7265.getClass(), "flags", (byte) 0);
        setBooleanField(term7265, term7265.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term7265, term7265.getClass(), "bit1_accessTimePresent", true);
        setBooleanField(term7265, term7265.getClass(), "bit2_createTimePresent", true);
        setField(term7265, term7265.getClass(), "modifyTime", null);
        setLongField(term7266, term7266.getClass(), "value", 0L);
        setField(term7265, term7265.getClass(), "accessTime", term7266);
        setField(term7265, term7265.getClass(), "createTime", null);
        term7255 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipShort"));
        setIntField(term7255, term7255.getClass(), "value", 5);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLocalFileDataLength", argTypes, term6997, args);
        assertTrue(recursiveEquals(term6997, term7265));
        assertTrue(recursiveEquals(retValue, term7255));
    }

};


