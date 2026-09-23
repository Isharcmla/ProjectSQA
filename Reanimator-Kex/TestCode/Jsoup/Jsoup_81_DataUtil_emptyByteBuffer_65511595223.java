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

public class DataUtil_emptyByteBuffer_65511595223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term137163;

    public DataUtil_emptyByteBuffer_65511595223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term137163 = newInstance(Class.forName("java.nio.HeapByteBuffer"));
        byte[] term137164 = (byte[]) newByteArray(0);
        setField(term137163, term137163.getClass(), "hb", term137164);
        setIntField(term137163, term137163.getClass(), "offset", 0);
        setBooleanField(term137163, term137163.getClass(), "isReadOnly", false);
        setBooleanField(term137163, term137163.getClass(), "bigEndian", true);
        setBooleanField(term137163, term137163.getClass(), "nativeByteOrder", false);
        setIntField(term137163, term137163.getClass(), "mark", -1);
        setIntField(term137163, term137163.getClass(), "position", 0);
        setIntField(term137163, term137163.getClass(), "limit", 0);
        setIntField(term137163, term137163.getClass(), "capacity", 0);
        setLongField(term137163, term137163.getClass(), "address", 16L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.helper.DataUtil");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "emptyByteBuffer", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term137163));
    }

};


