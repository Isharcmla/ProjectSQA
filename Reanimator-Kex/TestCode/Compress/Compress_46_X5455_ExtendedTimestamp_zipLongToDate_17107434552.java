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

public class X5455_ExtendedTimestamp_zipLongToDate_17107434552 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term229;
     Object term1392;
     Object term1390;

    public X5455_ExtendedTimestamp_zipLongToDate_17107434552() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term229 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setLongField(term229, term229.getClass(), "value", -2644215923136513282L);
        term1392 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setLongField(term1392, term1392.getClass(), "value", -2644215923136513282L);
        term1390 = newInstance(Class.forName("java.util.Date"));
        setLongField(term1390, term1390.getClass(), "fastTime", -1476117762000L);
        setField(term1390, term1390.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.compress.archivers.zip.ZipLong");
        Object[] args = new Object[1];
        args[0] = term229;
        Object retValue = callMethod(klass, "zipLongToDate", argTypes, null, args);
        assertTrue(recursiveEquals(term229, term1392));
        assertTrue(recursiveEquals(retValue, term1390));
    }

};


