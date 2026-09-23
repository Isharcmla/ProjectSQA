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

public class X5455_ExtendedTimestamp_hashCode_1640455695343 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71666;
     Object term71788;

    public X5455_ExtendedTimestamp_hashCode_1640455695343() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71666 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term71770 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term71666, term71666.getClass(), "flags", (byte) 0);
        setField(term71666, term71666.getClass(), "modifyTime", null);
        setLongField(term71770, term71770.getClass(), "value", 0L);
        setField(term71666, term71666.getClass(), "accessTime", term71770);
        setField(term71666, term71666.getClass(), "createTime", term71770);
        term71788 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term71789 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term71788, term71788.getClass(), "flags", (byte) 0);
        setBooleanField(term71788, term71788.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term71788, term71788.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term71788, term71788.getClass(), "bit2_createTimePresent", false);
        setField(term71788, term71788.getClass(), "modifyTime", null);
        setLongField(term71789, term71789.getClass(), "value", 0L);
        setField(term71788, term71788.getClass(), "accessTime", term71789);
        setField(term71788, term71788.getClass(), "createTime", term71789);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "hashCode", argTypes, term71666, args);
        assertTrue(recursiveEquals(term71666, term71788));
        assertTrue(recursiveEquals(retValue, 0));
    }

};


