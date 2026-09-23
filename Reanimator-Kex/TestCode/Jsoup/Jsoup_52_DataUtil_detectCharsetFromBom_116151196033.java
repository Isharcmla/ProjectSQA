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

public class DataUtil_detectCharsetFromBom_116151196033 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4613;
     Object term4632;

    public DataUtil_detectCharsetFromBom_116151196033() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4613 = newInstance(Class.forName("java.nio.HeapByteBuffer"));
        term4632 = newInstance(Class.forName("java.nio.HeapByteBuffer"));
        setField(term4632, term4632.getClass(), "hb", null);
        setIntField(term4632, term4632.getClass(), "offset", 0);
        setBooleanField(term4632, term4632.getClass(), "isReadOnly", false);
        setBooleanField(term4632, term4632.getClass(), "bigEndian", false);
        setBooleanField(term4632, term4632.getClass(), "nativeByteOrder", false);
        setIntField(term4632, term4632.getClass(), "mark", 0);
        setIntField(term4632, term4632.getClass(), "position", 0);
        setIntField(term4632, term4632.getClass(), "limit", 0);
        setIntField(term4632, term4632.getClass(), "capacity", 0);
        setLongField(term4632, term4632.getClass(), "address", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.helper.DataUtil");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.nio.ByteBuffer");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term4613;
        args[1] = null;
        Object retValue = callMethod(klass, "detectCharsetFromBom", argTypes, null, args);
        assertTrue(recursiveEquals(term4613, term4632));
        assertTrue(recursiveEquals(retValue, null));
    }

};


