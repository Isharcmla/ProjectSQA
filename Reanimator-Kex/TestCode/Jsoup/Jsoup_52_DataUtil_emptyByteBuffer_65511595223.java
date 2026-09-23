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
     Object term3755;

    public DataUtil_emptyByteBuffer_65511595223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3755 = newInstance(Class.forName("java.nio.HeapByteBuffer"));
        byte[] term3756 = (byte[]) newByteArray(0);
        setField(term3755, term3755.getClass(), "hb", term3756);
        setIntField(term3755, term3755.getClass(), "offset", 0);
        setBooleanField(term3755, term3755.getClass(), "isReadOnly", false);
        setBooleanField(term3755, term3755.getClass(), "bigEndian", true);
        setBooleanField(term3755, term3755.getClass(), "nativeByteOrder", false);
        setIntField(term3755, term3755.getClass(), "mark", -1);
        setIntField(term3755, term3755.getClass(), "position", 0);
        setIntField(term3755, term3755.getClass(), "limit", 0);
        setIntField(term3755, term3755.getClass(), "capacity", 0);
        setLongField(term3755, term3755.getClass(), "address", 16L);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.helper.DataUtil");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "emptyByteBuffer", argTypes, null, args);
        assertTrue(recursiveEquals(retValue, term3755));
    }

};


