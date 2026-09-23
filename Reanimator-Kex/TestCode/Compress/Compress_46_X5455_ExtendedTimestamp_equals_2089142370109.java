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

public class X5455_ExtendedTimestamp_equals_2089142370109 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8623;
     Object term9071;
     Object term9400;
     Object term9404;

    public X5455_ExtendedTimestamp_equals_2089142370109() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8623 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term9123 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term9175 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term8935 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term8623, term8623.getClass(), "flags", (byte) 8);
        setField(term8623, term8623.getClass(), "modifyTime", term9123);
        setField(term8623, term8623.getClass(), "accessTime", term9175);
        setField(term8623, term8623.getClass(), "createTime", term8935);
        term9071 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term9279 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term9071, term9071.getClass(), "flags", (byte) -112);
        setField(term9071, term9071.getClass(), "modifyTime", term9123);
        setField(term9071, term9071.getClass(), "accessTime", term9175);
        setField(term9071, term9071.getClass(), "createTime", term9279);
        term9400 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term9401 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term9402 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term9403 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term9400, term9400.getClass(), "flags", (byte) 8);
        setBooleanField(term9400, term9400.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term9400, term9400.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term9400, term9400.getClass(), "bit2_createTimePresent", false);
        setLongField(term9401, term9401.getClass(), "value", 0L);
        setField(term9400, term9400.getClass(), "modifyTime", term9401);
        setLongField(term9402, term9402.getClass(), "value", 0L);
        setField(term9400, term9400.getClass(), "accessTime", term9402);
        setLongField(term9403, term9403.getClass(), "value", 0L);
        setField(term9400, term9400.getClass(), "createTime", term9403);
        term9404 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term9405 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term9406 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term9407 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term9404, term9404.getClass(), "flags", (byte) -112);
        setBooleanField(term9404, term9404.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term9404, term9404.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term9404, term9404.getClass(), "bit2_createTimePresent", false);
        setLongField(term9405, term9405.getClass(), "value", 0L);
        setField(term9404, term9404.getClass(), "modifyTime", term9405);
        setLongField(term9406, term9406.getClass(), "value", 0L);
        setField(term9404, term9404.getClass(), "accessTime", term9406);
        setLongField(term9407, term9407.getClass(), "value", 0L);
        setField(term9404, term9404.getClass(), "createTime", term9407);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term9071;
        Object retValue = callMethod(klass, "equals", argTypes, term8623, args);
        assertTrue(recursiveEquals(term8623, term9400));
        assertTrue(recursiveEquals(term9071, term9404));
        assertTrue(recursiveEquals(retValue, true));
    }

};


