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

public class StringUtil_stringBuilder_194698377244 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2043;
     Object term20214;

    public StringUtil_stringBuilder_194698377244() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2043 = newInstance(Class.forName("org.jsoup.helper.StringUtil"));
        term20214 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term20215 = (byte[]) newByteArray(8192);
        setField(term20214, term20214.getClass(), "value", term20215);
        setByteField(term20214, term20214.getClass(), "coder", (byte) 0);
        setIntField(term20214, term20214.getClass(), "count", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.helper.StringUtil");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "stringBuilder", argTypes, term2043, args);
        assertTrue(recursiveEquals(retValue, term20214));
    }

};


