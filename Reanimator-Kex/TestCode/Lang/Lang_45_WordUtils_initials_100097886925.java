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

public class WordUtils_initials_100097886925 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term288;
     Object term2022;

    public WordUtils_initials_100097886925() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term288 = (char[]) newCharArray(4);
        setCharElement(term288, 0, 'l');
        setCharElement(term288, 1, 'J');
        setCharElement(term288, 2, 'A');
        setCharElement(term288, 3, 'E');
        term2022 = (char[]) newCharArray(4);
        setCharElement(term2022, 0, 'l');
        setCharElement(term2022, 1, 'J');
        setCharElement(term2022, 2, 'A');
        setCharElement(term2022, 3, 'E');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.WordUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = "uuaPigETmJ";
        args[1] = term288;
        Object retValue = callMethod(klass, "initials", argTypes, null, args);
        assertTrue(recursiveEquals(term288, "uuaPigETmJ"));
        assertTrue(recursiveEquals(retValue, "uT"));
    }

};


