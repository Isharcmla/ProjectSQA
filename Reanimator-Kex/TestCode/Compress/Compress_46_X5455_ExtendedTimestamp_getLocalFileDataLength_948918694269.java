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

public class X5455_ExtendedTimestamp_getLocalFileDataLength_948918694269 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53549;
     Object term53668;
     Object term53658;

    public X5455_ExtendedTimestamp_getLocalFileDataLength_948918694269() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term53549 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term53653 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setBooleanField(term53549, term53549.getClass(), "bit0_modifyTimePresent", true);
        setBooleanField(term53549, term53549.getClass(), "bit1_accessTimePresent", true);
        setField(term53549, term53549.getClass(), "accessTime", term53653);
        term53668 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term53669 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term53668, term53668.getClass(), "flags", (byte) 0);
        setBooleanField(term53668, term53668.getClass(), "bit0_modifyTimePresent", true);
        setBooleanField(term53668, term53668.getClass(), "bit1_accessTimePresent", true);
        setBooleanField(term53668, term53668.getClass(), "bit2_createTimePresent", false);
        setField(term53668, term53668.getClass(), "modifyTime", null);
        setLongField(term53669, term53669.getClass(), "value", 0L);
        setField(term53668, term53668.getClass(), "accessTime", term53669);
        setField(term53668, term53668.getClass(), "createTime", null);
        term53658 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipShort"));
        setIntField(term53658, term53658.getClass(), "value", 9);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getLocalFileDataLength", argTypes, term53549, args);
        assertTrue(recursiveEquals(term53549, term53668));
        assertTrue(recursiveEquals(retValue, term53658));
    }

};


