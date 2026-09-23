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
     Object term201211;
     Object term201230;

    public DataUtil_detectCharsetFromBom_185751459851() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term201211 = newInstance(Class.forName("java.nio.DirectByteBuffer"));
        term201230 = newInstance(Class.forName("java.nio.DirectByteBuffer"));
        setField(term201230, term201230.getClass(), "att", null);
        setField(term201230, term201230.getClass(), "cleaner", null);
        setField(term201230, term201230.getClass(), "fd", null);
        setField(term201230, term201230.getClass(), "hb", null);
        setIntField(term201230, term201230.getClass(), "offset", 0);
        setBooleanField(term201230, term201230.getClass(), "isReadOnly", false);
        setBooleanField(term201230, term201230.getClass(), "bigEndian", false);
        setBooleanField(term201230, term201230.getClass(), "nativeByteOrder", false);
        setIntField(term201230, term201230.getClass(), "mark", 0);
        setIntField(term201230, term201230.getClass(), "position", 0);
        setIntField(term201230, term201230.getClass(), "limit", 0);
        setIntField(term201230, term201230.getClass(), "capacity", 0);
        setLongField(term201230, term201230.getClass(), "address", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.helper.DataUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.nio.ByteBuffer");
        Object[] args = new Object[1];
        args[0] = term201211;
        Object retValue = callMethod(klass, "detectCharsetFromBom", argTypes, null, args);
        assertTrue(recursiveEquals(term201211, term201230));
        assertTrue(recursiveEquals(retValue, null));
    }

};


