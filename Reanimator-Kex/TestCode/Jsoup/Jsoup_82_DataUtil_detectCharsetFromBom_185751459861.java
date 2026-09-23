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

public class DataUtil_detectCharsetFromBom_185751459861 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term203575;
     Object term203594;

    public DataUtil_detectCharsetFromBom_185751459861() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term203575 = newInstance(Class.forName("java.nio.HeapByteBufferR"));
        term203594 = newInstance(Class.forName("java.nio.HeapByteBufferR"));
        setField(term203594, term203594.getClass(), "hb", null);
        setIntField(term203594, term203594.getClass(), "offset", 0);
        setBooleanField(term203594, term203594.getClass(), "isReadOnly", false);
        setBooleanField(term203594, term203594.getClass(), "bigEndian", false);
        setBooleanField(term203594, term203594.getClass(), "nativeByteOrder", false);
        setIntField(term203594, term203594.getClass(), "mark", 0);
        setIntField(term203594, term203594.getClass(), "position", 0);
        setIntField(term203594, term203594.getClass(), "limit", 0);
        setIntField(term203594, term203594.getClass(), "capacity", 0);
        setLongField(term203594, term203594.getClass(), "address", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.helper.DataUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.nio.ByteBuffer");
        Object[] args = new Object[1];
        args[0] = term203575;
        Object retValue = callMethod(klass, "detectCharsetFromBom", argTypes, null, args);
        assertTrue(recursiveEquals(term203575, term203594));
        assertTrue(recursiveEquals(retValue, null));
    }

};


