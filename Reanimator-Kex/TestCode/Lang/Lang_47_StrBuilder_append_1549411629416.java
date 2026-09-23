package org.apache.commons.lang.text;

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
import static org.apache.commons.lang.text.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang.text.EqualityUtils.*;

public class StrBuilder_append_1549411629416 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term81255;
     Object term127906;
     Object term127907;
     Object term127902;

    public StrBuilder_append_1549411629416() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term81255 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setIntField(term81255, term81255.getClass(), "size", 0);
        term127906 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term127906, term127906.getClass(), "buffer", null);
        setIntField(term127906, term127906.getClass(), "size", 0);
        setField(term127906, term127906.getClass(), "newLine", null);
        setField(term127906, term127906.getClass(), "nullText", null);
        term127907 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term127907, term127907.getClass(), "buffer", null);
        setIntField(term127907, term127907.getClass(), "size", 0);
        setField(term127907, term127907.getClass(), "newLine", null);
        setField(term127907, term127907.getClass(), "nullText", null);
        term127902 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term127902, term127902.getClass(), "buffer", null);
        setIntField(term127902, term127902.getClass(), "size", 0);
        setField(term127902, term127902.getClass(), "newLine", null);
        setField(term127902, term127902.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Object[] args = new Object[1];
        args[0] = term81255;
        Object retValue = callMethod(klass, "append", argTypes, term81255, args);
        assertTrue(recursiveEquals(term81255, term127906));
        assertTrue(recursiveEquals(term81255, term127907));
        assertTrue(recursiveEquals(retValue, term127902));
    }

};


