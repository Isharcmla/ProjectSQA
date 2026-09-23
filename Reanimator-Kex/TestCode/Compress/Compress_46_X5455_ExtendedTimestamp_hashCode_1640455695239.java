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

public class X5455_ExtendedTimestamp_hashCode_1640455695239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44467;
     Object term44586;

    public X5455_ExtendedTimestamp_hashCode_1640455695239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44467 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term44571 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term44467, term44467.getClass(), "flags", (byte) 0);
        setField(term44467, term44467.getClass(), "modifyTime", null);
        setField(term44467, term44467.getClass(), "accessTime", term44571);
        term44586 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term44587 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term44586, term44586.getClass(), "flags", (byte) 0);
        setBooleanField(term44586, term44586.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term44586, term44586.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term44586, term44586.getClass(), "bit2_createTimePresent", false);
        setField(term44586, term44586.getClass(), "modifyTime", null);
        setLongField(term44587, term44587.getClass(), "value", 0L);
        setField(term44586, term44586.getClass(), "accessTime", term44587);
        setField(term44586, term44586.getClass(), "createTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term44467, args);
        assertTrue(recursiveEquals(term44467, term44586));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


