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

public class DataUtil_detectCharsetFromBom_185751459857 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term202585;
     Object term202604;

    public DataUtil_detectCharsetFromBom_185751459857() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term202585 = newInstance(Class.forName("java.nio.DirectByteBufferR"));
        term202604 = newInstance(Class.forName("java.nio.DirectByteBufferR"));
        setField(term202604, term202604.getClass(), "att", null);
        setField(term202604, term202604.getClass(), "cleaner", null);
        setField(term202604, term202604.getClass(), "fd", null);
        setField(term202604, term202604.getClass(), "hb", null);
        setIntField(term202604, term202604.getClass(), "offset", 0);
        setBooleanField(term202604, term202604.getClass(), "isReadOnly", false);
        setBooleanField(term202604, term202604.getClass(), "bigEndian", false);
        setBooleanField(term202604, term202604.getClass(), "nativeByteOrder", false);
        setIntField(term202604, term202604.getClass(), "mark", 0);
        setIntField(term202604, term202604.getClass(), "position", 0);
        setIntField(term202604, term202604.getClass(), "limit", 0);
        setIntField(term202604, term202604.getClass(), "capacity", 0);
        setLongField(term202604, term202604.getClass(), "address", 0L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.helper.DataUtil");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.nio.ByteBuffer");
        Object[] args = new Object[1];
        args[0] = term202585;
        Object retValue = callMethod(klass, "detectCharsetFromBom", argTypes, null, args);
        assertTrue(recursiveEquals(term202585, term202604));
        assertTrue(recursiveEquals(retValue, null));
    }

};


