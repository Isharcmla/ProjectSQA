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

public class DataUtil_detectCharsetFromBom_116151196049 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6935;
     Object term6954;

    public DataUtil_detectCharsetFromBom_116151196049() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6935 = newInstance(Class.forName("java.nio.HeapByteBufferR"));
        setIntField(term6935, term6935.getClass(), "limit", 3);
        setIntField(term6935, term6935.getClass(), "position", 0);
        term6954 = newInstance(Class.forName("java.nio.HeapByteBufferR"));
        setField(term6954, term6954.getClass(), "hb", null);
        setIntField(term6954, term6954.getClass(), "offset", 0);
        setBooleanField(term6954, term6954.getClass(), "isReadOnly", false);
        setBooleanField(term6954, term6954.getClass(), "bigEndian", false);
        setBooleanField(term6954, term6954.getClass(), "nativeByteOrder", false);
        setIntField(term6954, term6954.getClass(), "mark", 0);
        setIntField(term6954, term6954.getClass(), "position", 0);
        setIntField(term6954, term6954.getClass(), "limit", 3);
        setIntField(term6954, term6954.getClass(), "capacity", 0);
        setLongField(term6954, term6954.getClass(), "address", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.helper.DataUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.nio.ByteBuffer");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term6935;
        args[1] = null;
        Object retValue = callMethod(klass, "detectCharsetFromBom", argTypes, null, args);
        assertTrue(recursiveEquals(term6935, term6954));
        assertTrue(recursiveEquals(retValue, null));
    }

};


