package org.apache.commons.lang3;

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
import static org.apache.commons.lang3.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class StringUtils_stripAll_1400325423339 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term121908;

    public StringUtils_stripAll_1400325423339() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term121908 = (Object[]) newArray("java.lang.String", 16);
        setElement(term121908, 0, "\u0004   ");
        setElement(term121908, 1, " \u0001\u0001\u0001");
        setElement(term121908, 2, "\u0004\u0004\u0004\u0004");
        setElement(term121908, 4, "\u0004\u0004\u0004\u0004");
        setElement(term121908, 5, "\u0004\u0004\u0004\u0004");
        setElement(term121908, 6, "\u0004\u0004\u0004\u0004");
        setElement(term121908, 7, "\u0004\u0004\u0004\u0004");
        setElement(term121908, 8, "\u0004\u0004\u0004\u0004");
        setElement(term121908, 9, "\u0004\u0004\u0004\u0004");
        setElement(term121908, 10, "\u0004\u0004\u0004\u0004");
        setElement(term121908, 11, "\u0004\u0004\u0004\u0004");
        setElement(term121908, 12, "\u0004\u0004\u0004\u0004");
        setElement(term121908, 13, "\u0004\u0004\u0004\u0004");
        setElement(term121908, 14, "\u0004\u0004\u0004\u0004");
        setElement(term121908, 15, "\u0004\u0004\u0004\u0004");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.StringUtils");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term121908;
        callMethod(klass, "stripAll", argTypes, null, args);
    }

};


