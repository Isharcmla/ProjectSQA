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
import java.lang.Boolean;

public class StringUtil_appendNormalisedWhitespace_13137099210 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term229;
     Object term261;

    public StringUtil_appendNormalisedWhitespace_13137099210() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term229 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term230 = (byte[]) newByteArray(16);
        setField(term229, term229.getClass(), "value", term230);
        setByteField(term229, term229.getClass(), "coder", (byte) 47);
        setIntField(term229, term229.getClass(), "count", 391863371);
        term261 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.helper.StringUtil");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = boolean.class;
        Object[] args = new Object[3];
        args[0] = term229;
        args[1] = "NRdvgJlhkX";
        args[2] = term261;
        callMethod(klass, "appendNormalisedWhitespace", argTypes, null, args);
    }

};


