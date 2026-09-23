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

public class X5455_ExtendedTimestamp_hashCode_164045569565 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term358;
     Object term3807;

    public X5455_ExtendedTimestamp_hashCode_164045569565() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term358 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term363 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term365 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term367 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term358, term358.getClass(), "flags", (byte) 42);
        setBooleanField(term358, term358.getClass(), "bit0_modifyTimePresent", true);
        setBooleanField(term358, term358.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term358, term358.getClass(), "bit2_createTimePresent", true);
        setLongField(term363, term363.getClass(), "value", 846579494941632714L);
        setField(term358, term358.getClass(), "modifyTime", term363);
        setLongField(term365, term365.getClass(), "value", 6689117472719450333L);
        setField(term358, term358.getClass(), "accessTime", term365);
        setLongField(term367, term367.getClass(), "value", 5836128569274066678L);
        setField(term358, term358.getClass(), "createTime", term367);
        term3807 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term3808 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term3809 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term3810 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term3807, term3807.getClass(), "flags", (byte) 42);
        setBooleanField(term3807, term3807.getClass(), "bit0_modifyTimePresent", true);
        setBooleanField(term3807, term3807.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term3807, term3807.getClass(), "bit2_createTimePresent", true);
        setLongField(term3808, term3808.getClass(), "value", 846579494941632714L);
        setField(term3807, term3807.getClass(), "modifyTime", term3808);
        setLongField(term3809, term3809.getClass(), "value", 6689117472719450333L);
        setField(term3807, term3807.getClass(), "accessTime", term3809);
        setLongField(term3810, term3810.getClass(), "value", 5836128569274066678L);
        setField(term3807, term3807.getClass(), "createTime", term3810);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term358, args);
        assertTrue(recursiveEquals(term358, term3807));
        assertTrue(recursiveEquals(retValue, -1646788789));
    }

};


