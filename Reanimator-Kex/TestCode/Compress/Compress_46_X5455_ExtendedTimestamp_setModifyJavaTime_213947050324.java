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
import java.lang.Object;

public class X5455_ExtendedTimestamp_setModifyJavaTime_213947050324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term281;
     Object term292;

    public X5455_ExtendedTimestamp_setModifyJavaTime_213947050324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term281 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp"));
        Object term286 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term288 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        Object term290 = newInstance(Class.forName("org.apache.commons.compress.archivers.zip.ZipLong"));
        setByteField(term281, term281.getClass(), "flags", (byte) 67);
        setBooleanField(term281, term281.getClass(), "bit0_modifyTimePresent", true);
        setBooleanField(term281, term281.getClass(), "bit1_accessTimePresent", true);
        setBooleanField(term281, term281.getClass(), "bit2_createTimePresent", true);
        setLongField(term286, term286.getClass(), "value", -5248475803419977214L);
        setField(term281, term281.getClass(), "modifyTime", term286);
        setLongField(term288, term288.getClass(), "value", -6723783499250797216L);
        setField(term281, term281.getClass(), "accessTime", term288);
        setLongField(term290, term290.getClass(), "value", 41775768178052008L);
        setField(term281, term281.getClass(), "createTime", term290);
        term292 = newInstance(Class.forName("java.util.Date"));
        setLongField(term292, term292.getClass(), "fastTime", 1345889412244L);
        setField(term292, term292.getClass(), "cdate", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Date");
        Object[] args = new Object[1];
        args[0] = term292;
        callMethod(klass, "setModifyJavaTime", argTypes, term281, args);
    }

};


