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

public class WordUtils_uncapitalize_136693432560 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32908;
     Object term555885;

    public WordUtils_uncapitalize_136693432560() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term32908 = (char[]) newCharArray(3);
        setCharElement(term32908, 0, (char) 4);
        setCharElement(term32908, 1, (char) 1);
        setCharElement(term32908, 2, (char) 1024);
        term555885 = (char[]) newCharArray(3);
        setCharElement(term555885, 0, (char) 4);
        setCharElement(term555885, 1, (char) 1);
        setCharElement(term555885, 2, (char) 1024);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.WordUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = "D \u0001                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ";
        args[1] = term32908;
        Object retValue = callMethod(klass, "uncapitalize", argTypes, null, args);
        assertTrue(recursiveEquals(term32908, "D \u0001                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         "));
        assertTrue(recursiveEquals(retValue, "d \u0001                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         "));
    }

};


