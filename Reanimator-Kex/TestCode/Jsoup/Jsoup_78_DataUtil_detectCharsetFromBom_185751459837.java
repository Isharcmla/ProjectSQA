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

public class DataUtil_detectCharsetFromBom_185751459837 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term189383;
     Object term239891;

    public DataUtil_detectCharsetFromBom_185751459837() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term189383 = newInstance(Class.forName("java.nio.DirectByteBufferR"));
        term239891 = newInstance(Class.forName("java.nio.DirectByteBufferR"));
        setField(term239891, term239891.getClass(), "att", null);
        setField(term239891, term239891.getClass(), "cleaner", null);
        setField(term239891, term239891.getClass(), "fd", null);
        setField(term239891, term239891.getClass(), "hb", null);
        setIntField(term239891, term239891.getClass(), "offset", 0);
        setBooleanField(term239891, term239891.getClass(), "isReadOnly", false);
        setBooleanField(term239891, term239891.getClass(), "bigEndian", false);
        setBooleanField(term239891, term239891.getClass(), "nativeByteOrder", false);
        setIntField(term239891, term239891.getClass(), "mark", 0);
        setIntField(term239891, term239891.getClass(), "position", 0);
        setIntField(term239891, term239891.getClass(), "limit", 0);
        setIntField(term239891, term239891.getClass(), "capacity", 0);
        setLongField(term239891, term239891.getClass(), "address", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.helper.DataUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.nio.ByteBuffer");
        Object[] args = new Object[1];
        args[0] = term189383;
        Object retValue = callMethod(klass, "detectCharsetFromBom", argTypes, null, args);
        assertTrue(recursiveEquals(term189383, term239891));
        assertTrue(recursiveEquals(retValue, null));
    }

};


