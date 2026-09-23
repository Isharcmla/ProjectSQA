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

public class X5455_ExtendedTimestamp_getCreateTime_141550320649 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term196;
     Object term1336;
     Object term1322;

    public X5455_ExtendedTimestamp_getCreateTime_141550320649() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term196 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term201 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term203 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term205 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term196, term196.getClass(), "flags", (byte) -111);
        setBooleanField(term196, term196.getClass(), "bit0_modifyTimePresent", true);
        setBooleanField(term196, term196.getClass(), "bit1_accessTimePresent", true);
        setBooleanField(term196, term196.getClass(), "bit2_createTimePresent", true);
        setLongField(term201, term201.getClass(), "value", -7612550318181586304L);
        setField(term196, term196.getClass(), "modifyTime", term201);
        setLongField(term203, term203.getClass(), "value", -2170847986967241072L);
        setField(term196, term196.getClass(), "accessTime", term203);
        setLongField(term205, term205.getClass(), "value", 4044358158040652353L);
        setField(term196, term196.getClass(), "createTime", term205);
        term1336 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term1337 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term1338 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term1339 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term1336, term1336.getClass(), "flags", (byte) -111);
        setBooleanField(term1336, term1336.getClass(), "bit0_modifyTimePresent", true);
        setBooleanField(term1336, term1336.getClass(), "bit1_accessTimePresent", true);
        setBooleanField(term1336, term1336.getClass(), "bit2_createTimePresent", true);
        setLongField(term1337, term1337.getClass(), "value", -7612550318181586304L);
        setField(term1336, term1336.getClass(), "modifyTime", term1337);
        setLongField(term1338, term1338.getClass(), "value", -2170847986967241072L);
        setField(term1336, term1336.getClass(), "accessTime", term1338);
        setLongField(term1339, term1339.getClass(), "value", 4044358158040652353L);
        setField(term1336, term1336.getClass(), "createTime", term1339);
        term1322 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setLongField(term1322, term1322.getClass(), "value", 4044358158040652353L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getCreateTime", argTypes, term196, args);
        assertTrue(recursiveEquals(term196, term1336));
        assertTrue(recursiveEquals(retValue, term1322));
    }

};


