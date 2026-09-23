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
import java.lang.IllegalArgumentException;
import static org.apache.commons.compress.archivers.zip.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class X5455_ExtendedTimestamp_toString_112969600562 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term324;

    public X5455_ExtendedTimestamp_toString_112969600562() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term324 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term329 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term331 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term333 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term324, term324.getClass(), "flags", (byte) -119);
        setBooleanField(term324, term324.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term324, term324.getClass(), "bit1_accessTimePresent", true);
        setBooleanField(term324, term324.getClass(), "bit2_createTimePresent", false);
        setLongField(term329, term329.getClass(), "value", 5510783420697225605L);
        setField(term324, term324.getClass(), "modifyTime", term329);
        setLongField(term331, term331.getClass(), "value", 6005241913654469005L);
        setField(term324, term324.getClass(), "accessTime", term331);
        setLongField(term333, term333.getClass(), "value", -1983291584002806658L);
        setField(term324, term324.getClass(), "createTime", term333);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "toString", argTypes, term324, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


