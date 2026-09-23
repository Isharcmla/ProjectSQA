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

public class X5455_ExtendedTimestamp_equals_2089142370259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49694;
     Object term50038;
     Object term50298;
     Object term50301;

    public X5455_ExtendedTimestamp_equals_2089142370259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term49694 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term49798 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term49902 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term49694, term49694.getClass(), "flags", (byte) 0);
        setLongField(term49798, term49798.getClass(), "value", -2719518232582030773L);
        setField(term49694, term49694.getClass(), "modifyTime", term49798);
        setLongField(term49902, term49902.getClass(), "value", -116276811295131768L);
        setField(term49694, term49694.getClass(), "accessTime", term49902);
        term50038 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term50142 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term50246 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term50038, term50038.getClass(), "flags", (byte) 0);
        setLongField(term50142, term50142.getClass(), "value", -2719518232582030773L);
        setField(term50038, term50038.getClass(), "modifyTime", term50142);
        setLongField(term50246, term50246.getClass(), "value", -2719518232582030773L);
        setField(term50038, term50038.getClass(), "accessTime", term50246);
        term50298 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term50299 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term50300 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term50298, term50298.getClass(), "flags", (byte) 0);
        setBooleanField(term50298, term50298.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term50298, term50298.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term50298, term50298.getClass(), "bit2_createTimePresent", false);
        setLongField(term50299, term50299.getClass(), "value", -2719518232582030773L);
        setField(term50298, term50298.getClass(), "modifyTime", term50299);
        setLongField(term50300, term50300.getClass(), "value", -116276811295131768L);
        setField(term50298, term50298.getClass(), "accessTime", term50300);
        setField(term50298, term50298.getClass(), "createTime", null);
        term50301 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term50302 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term50303 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term50301, term50301.getClass(), "flags", (byte) 0);
        setBooleanField(term50301, term50301.getClass(), "bit0_modifyTimePresent", false);
        setBooleanField(term50301, term50301.getClass(), "bit1_accessTimePresent", false);
        setBooleanField(term50301, term50301.getClass(), "bit2_createTimePresent", false);
        setLongField(term50302, term50302.getClass(), "value", -2719518232582030773L);
        setField(term50301, term50301.getClass(), "modifyTime", term50302);
        setLongField(term50303, term50303.getClass(), "value", -2719518232582030773L);
        setField(term50301, term50301.getClass(), "accessTime", term50303);
        setField(term50301, term50301.getClass(), "createTime", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term50038;
        Object retValue = callMethod(klass, "equals", argTypes, term49694, args);
        assertTrue(recursiveEquals(term49694, term50298));
        assertTrue(recursiveEquals(term50038, term50301));
        assertTrue(recursiveEquals(retValue, false));
    }

};


