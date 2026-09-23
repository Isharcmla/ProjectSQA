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

public class StrBuilder_appendNull_1027837792344 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72473;
     Object term150397;
     Object term150390;

    public StrBuilder_appendNull_1027837792344() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72473 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term72473, term72473.getClass(), "nullText", "");
        term150397 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term150397, term150397.getClass(), "buffer", null);
        setIntField(term150397, term150397.getClass(), "size", 0);
        setField(term150397, term150397.getClass(), "newLine", null);
        setField(term150397, term150397.getClass(), "nullText", "");
        term150390 = newInstance(Class.forName("org.apache.commons.lang.text.StrBuilder"));
        setField(term150390, term150390.getClass(), "buffer", null);
        setIntField(term150390, term150390.getClass(), "size", 0);
        setField(term150390, term150390.getClass(), "newLine", null);
        setField(term150390, term150390.getClass(), "nullText", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.text.StrBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "appendNull", argTypes, term72473, args);
        assertTrue(recursiveEquals(term72473, term150397));
        assertTrue(recursiveEquals(retValue, term150390));
    }

};


