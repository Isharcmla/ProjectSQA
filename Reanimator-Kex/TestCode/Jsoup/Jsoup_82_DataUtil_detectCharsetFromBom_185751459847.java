package org.jsoup.helper;

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
import static org.jsoup.helper.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.helper.EqualityUtils.*;

public class DataUtil_detectCharsetFromBom_185751459847 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term200419;
     Object term200438;

    public DataUtil_detectCharsetFromBom_185751459847() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term200419 = newInstance(Class.forName("java.nio.HeapByteBufferR"));
        setIntField(term200419, term200419.getClass(), "limit", 3);
        setIntField(term200419, term200419.getClass(), "position", 0);
        term200438 = newInstance(Class.forName("java.nio.HeapByteBufferR"));
        setField(term200438, term200438.getClass(), "hb", null);
        setIntField(term200438, term200438.getClass(), "offset", 0);
        setBooleanField(term200438, term200438.getClass(), "isReadOnly", false);
        setBooleanField(term200438, term200438.getClass(), "bigEndian", false);
        setBooleanField(term200438, term200438.getClass(), "nativeByteOrder", false);
        setIntField(term200438, term200438.getClass(), "mark", 0);
        setIntField(term200438, term200438.getClass(), "position", 0);
        setIntField(term200438, term200438.getClass(), "limit", 3);
        setIntField(term200438, term200438.getClass(), "capacity", 0);
        setLongField(term200438, term200438.getClass(), "address", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.helper.DataUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.nio.ByteBuffer");
        Object[] args = new Object[1];
        args[0] = term200419;
        Object retValue = callMethod(klass, "detectCharsetFromBom", argTypes, null, args);
        assertTrue(recursiveEquals(term200419, term200438));
        assertTrue(recursiveEquals(retValue, null));
    }

};


