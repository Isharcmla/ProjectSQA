package org.apache.commons.lang;

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
import static org.apache.commons.lang.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang.EqualityUtils.*;

public class WordUtils_uncapitalize_136693432551 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17077;
     Object term79204;

    public WordUtils_uncapitalize_136693432551() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term17077 = (char[]) newCharArray(3);
        setCharElement(term17077, 0, (char) 2);
        setCharElement(term17077, 1, (char) 4);
        term79204 = (char[]) newCharArray(3);
        setCharElement(term79204, 0, (char) 2);
        setCharElement(term79204, 1, (char) 4);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.WordUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = "\uFFE0\u0001\u0001\u0001\u0010\u0001                                                                                                                                                                                                                                                                                                                                                                         ";
        args[1] = term17077;
        Object retValue = callMethod(klass, "uncapitalize", argTypes, null, args);
        assertTrue(recursiveEquals(term17077, "\uFFE0\uFFFF\u0001 \u0001 \u0001 \u0010 \u0001                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   "));
        assertTrue(recursiveEquals(retValue, "\uFFE0\uFFFF\u0001 \u0001 \u0001 \u0010 \u0001                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   "));
    }

};


