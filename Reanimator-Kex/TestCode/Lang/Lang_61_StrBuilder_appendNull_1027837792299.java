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

public class StrBuilder_appendNull_1027837792299 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50235;
     Object term89322;
     Object term89320;

    public StrBuilder_appendNull_1027837792299() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50235 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term50235, term50235.getClass(), "nullText", null);
        term89322 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term89322, term89322.getClass(), "buffer", null);
        setIntField(term89322, term89322.getClass(), "size", 0);
        setField(term89322, term89322.getClass(), "newLine", null);
        setField(term89322, term89322.getClass(), "nullText", null);
        term89320 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term89320, term89320.getClass(), "buffer", null);
        setIntField(term89320, term89320.getClass(), "size", 0);
        setField(term89320, term89320.getClass(), "newLine", null);
        setField(term89320, term89320.getClass(), "nullText", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "appendNull", argTypes, term50235, args);
        assertTrue(recursiveEquals(term50235, term89322));
        assertTrue(recursiveEquals(retValue, term89320));
    }

};


