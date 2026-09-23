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

public class X5455_ExtendedTimestamp_equals_2089142370229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term41239;
     Object term41583;
     Object term41883;
     Object term41886;

    public X5455_ExtendedTimestamp_equals_2089142370229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term41239 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term41635 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term41447 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term41239, term41239.getClass(), "flags", (byte) 0);
        setField(term41239, term41239.getClass(), "modifyTime", term41635);
        setLongField(term41447, term41447.getClass(), "value", 0L);
        setField(term41239, term41239.getClass(), "accessTime", term41447);
        setField(term41239, term41239.getClass(), "createTime", null);
        term41583 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term41739 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term41843 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term41583, term41583.getClass(), "flags", (byte) 0);
        setField(term41583, term41583.getClass(), "modifyTime", term41635);
        setLongField(term41739, term41739.getClass(), "value", 0L);
        setField(term41583, term41583.getClass(), "accessTime", term41739);
        setField(term41583, term41583.getClass(), "createTime", term41843);
        term41883 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term41884 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term41885 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term41883, term41883.getClass(), "flags", (byte) 0);
        setBooleanField(term41883, term41883.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term41883, term41883.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term41883, term41883.getClass(), "bit2_createTimePresent", false);
        setLongField(term41884, term41884.getClass(), "value", 0L);
        setField(term41883, term41883.getClass(), "modifyTime", term41884);
        setLongField(term41885, term41885.getClass(), "value", 0L);
        setField(term41883, term41883.getClass(), "accessTime", term41885);
        setField(term41883, term41883.getClass(), "createTime", null);
        term41886 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term41887 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term41888 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term41889 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term41886, term41886.getClass(), "flags", (byte) 0);
        setBooleanField(term41886, term41886.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term41886, term41886.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term41886, term41886.getClass(), "bit2_createTimePresent", false);
        setLongField(term41887, term41887.getClass(), "value", 0L);
        setField(term41886, term41886.getClass(), "modifyTime", term41887);
        setLongField(term41888, term41888.getClass(), "value", 0L);
        setField(term41886, term41886.getClass(), "accessTime", term41888);
        setLongField(term41889, term41889.getClass(), "value", 0L);
        setField(term41886, term41886.getClass(), "createTime", term41889);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term41583;
        Object retValue = callMethod(klass, "equals", argTypes, term41239, args);
        assertTrue(recursiveEquals(term41239, term41883));
        assertTrue(recursiveEquals(term41583, term41886));
        assertTrue(recursiveEquals(retValue, false));
    }

};


