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

public class X5455_ExtendedTimestamp_equals_2089142370173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25143;
     Object term25591;
     Object term26243;
     Object term26247;

    public X5455_ExtendedTimestamp_equals_2089142370173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term25143 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term25247 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term25747 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term25455 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term25143, term25143.getClass(), "flags", (byte) 0);
        setLongField(term25247, term25247.getClass(), "value", 0L);
        setField(term25143, term25143.getClass(), "modifyTime", term25247);
        setField(term25143, term25143.getClass(), "accessTime", term25747);
        setField(term25143, term25143.getClass(), "createTime", term25455);
        term25591 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term25695 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term25851 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term25591, term25591.getClass(), "flags", (byte) 0);
        setLongField(term25695, term25695.getClass(), "value", 0L);
        setField(term25591, term25591.getClass(), "modifyTime", term25695);
        setField(term25591, term25591.getClass(), "accessTime", term25747);
        setField(term25591, term25591.getClass(), "createTime", term25851);
        term26243 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term26244 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term26245 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term26246 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term26243, term26243.getClass(), "flags", (byte) 0);
        setBooleanField(term26243, term26243.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term26243, term26243.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term26243, term26243.getClass(), "bit2_createTimePresent", false);
        setLongField(term26244, term26244.getClass(), "value", 0L);
        setField(term26243, term26243.getClass(), "modifyTime", term26244);
        setLongField(term26245, term26245.getClass(), "value", 0L);
        setField(term26243, term26243.getClass(), "accessTime", term26245);
        setLongField(term26246, term26246.getClass(), "value", 0L);
        setField(term26243, term26243.getClass(), "createTime", term26246);
        term26247 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term26248 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term26249 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term26250 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term26247, term26247.getClass(), "flags", (byte) 0);
        setBooleanField(term26247, term26247.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term26247, term26247.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term26247, term26247.getClass(), "bit2_createTimePresent", false);
        setLongField(term26248, term26248.getClass(), "value", 0L);
        setField(term26247, term26247.getClass(), "modifyTime", term26248);
        setLongField(term26249, term26249.getClass(), "value", 0L);
        setField(term26247, term26247.getClass(), "accessTime", term26249);
        setLongField(term26250, term26250.getClass(), "value", 0L);
        setField(term26247, term26247.getClass(), "createTime", term26250);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term25591;
        Object retValue = callMethod(klass, "equals", argTypes, term25143, args);
        assertTrue(recursiveEquals(term25143, term26243));
        assertTrue(recursiveEquals(term25591, term26247));
        assertTrue(recursiveEquals(retValue, true));
    }

};


