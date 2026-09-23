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

public class DataUtil_detectCharsetFromBom_185751459851 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term241398;
     Object term241417;

    public DataUtil_detectCharsetFromBom_185751459851() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term241398 = newInstance(Class.forName("java.nio.DirectByteBufferR"));
        term241417 = newInstance(Class.forName("java.nio.DirectByteBufferR"));
        setField(term241417, term241417.getClass(), "att", null);
        setField(term241417, term241417.getClass(), "cleaner", null);
        setField(term241417, term241417.getClass(), "fd", null);
        setField(term241417, term241417.getClass(), "hb", null);
        setIntField(term241417, term241417.getClass(), "offset", 0);
        setBooleanField(term241417, term241417.getClass(), "isReadOnly", false);
        setBooleanField(term241417, term241417.getClass(), "bigEndian", false);
        setBooleanField(term241417, term241417.getClass(), "nativeByteOrder", false);
        setIntField(term241417, term241417.getClass(), "mark", 0);
        setIntField(term241417, term241417.getClass(), "position", 0);
        setIntField(term241417, term241417.getClass(), "limit", 0);
        setIntField(term241417, term241417.getClass(), "capacity", 0);
        setLongField(term241417, term241417.getClass(), "address", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.helper.DataUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.nio.ByteBuffer");
        Object[] args = new Object[1];
        args[0] = term241398;
        Object retValue = callMethod(klass, "detectCharsetFromBom", argTypes, null, args);
        assertTrue(recursiveEquals(term241398, term241417));
        assertTrue(recursiveEquals(retValue, null));
    }

};


