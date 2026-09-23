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

public class DataUtil_detectCharsetFromBom_185751459836 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term148251;
     Object term148375;

    public DataUtil_detectCharsetFromBom_185751459836() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term148251 = newInstance(Class.forName("java.nio.HeapByteBuffer"));
        term148375 = newInstance(Class.forName("java.nio.HeapByteBuffer"));
        setField(term148375, term148375.getClass(), "hb", null);
        setIntField(term148375, term148375.getClass(), "offset", 0);
        setBooleanField(term148375, term148375.getClass(), "isReadOnly", false);
        setBooleanField(term148375, term148375.getClass(), "bigEndian", false);
        setBooleanField(term148375, term148375.getClass(), "nativeByteOrder", false);
        setIntField(term148375, term148375.getClass(), "mark", 0);
        setIntField(term148375, term148375.getClass(), "position", 0);
        setIntField(term148375, term148375.getClass(), "limit", 0);
        setIntField(term148375, term148375.getClass(), "capacity", 0);
        setLongField(term148375, term148375.getClass(), "address", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.helper.DataUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.nio.ByteBuffer");
        Object[] args = new Object[1];
        args[0] = term148251;
        Object retValue = callMethod(klass, "detectCharsetFromBom", argTypes, null, args);
        assertTrue(recursiveEquals(term148251, term148375));
        assertTrue(recursiveEquals(retValue, null));
    }

};


