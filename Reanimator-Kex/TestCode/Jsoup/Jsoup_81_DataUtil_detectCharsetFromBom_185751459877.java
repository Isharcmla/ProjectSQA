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

public class DataUtil_detectCharsetFromBom_185751459877 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term244732;
     Object term250621;

    public DataUtil_detectCharsetFromBom_185751459877() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term244732 = newInstance(Class.forName("java.nio.HeapByteBufferR"));
        term250621 = newInstance(Class.forName("java.nio.HeapByteBufferR"));
        setField(term250621, term250621.getClass(), "hb", null);
        setIntField(term250621, term250621.getClass(), "offset", 0);
        setBooleanField(term250621, term250621.getClass(), "isReadOnly", false);
        setBooleanField(term250621, term250621.getClass(), "bigEndian", false);
        setBooleanField(term250621, term250621.getClass(), "nativeByteOrder", false);
        setIntField(term250621, term250621.getClass(), "mark", 0);
        setIntField(term250621, term250621.getClass(), "position", 0);
        setIntField(term250621, term250621.getClass(), "limit", 0);
        setIntField(term250621, term250621.getClass(), "capacity", 0);
        setLongField(term250621, term250621.getClass(), "address", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.helper.DataUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.nio.ByteBuffer");
        Object[] args = new Object[1];
        args[0] = term244732;
        Object retValue = callMethod(klass, "detectCharsetFromBom", argTypes, null, args);
        assertTrue(recursiveEquals(term244732, term250621));
        assertTrue(recursiveEquals(retValue, null));
    }

};


