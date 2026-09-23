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
import java.util.ArrayList;

public class StrBuilder_appendAll_1799107050404 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term78370;
     Object term78422;
     Object term121383;
     Object term121384;

    public StrBuilder_appendAll_1799107050404() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term78370 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        term78422 = new ArrayList();
        term121383 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term121383, term121383.getClass(), "buffer", null);
        setIntField(term121383, term121383.getClass(), "size", 0);
        setField(term121383, term121383.getClass(), "newLine", null);
        setField(term121383, term121383.getClass(), "nullText", null);
        term121384 = new ArrayList();
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.util.Collection");
        Object[] args = new Object[1];
        args[0] = term78422;
        callMethod(klass, "appendAll", argTypes, term78370, args);
        assertTrue(recursiveEquals(term78370, term121383));
        assertTrue(recursiveEquals(term78422, term121384));
    }

};


