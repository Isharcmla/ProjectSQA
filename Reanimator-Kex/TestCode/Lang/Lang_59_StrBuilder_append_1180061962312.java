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

public class StrBuilder_append_1180061962312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55887;
     Object term98049;
     Object term98045;

    public StrBuilder_append_1180061962312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term55887 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        term98049 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term98049, term98049.getClass(), "buffer", null);
        setIntField(term98049, term98049.getClass(), "size", 0);
        setField(term98049, term98049.getClass(), "newLine", null);
        setField(term98049, term98049.getClass(), "nullText", null);
        term98045 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term98045, term98045.getClass(), "buffer", null);
        setIntField(term98045, term98045.getClass(), "size", 0);
        setField(term98045, term98045.getClass(), "newLine", null);
        setField(term98045, term98045.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "append", argTypes, term55887, args);
        assertTrue(recursiveEquals(term55887, term98049));
        assertTrue(recursiveEquals(retValue, term98045));
    }

};


