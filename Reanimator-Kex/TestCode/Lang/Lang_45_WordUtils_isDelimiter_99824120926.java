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
import java.lang.Character;

public class WordUtils_isDelimiter_99824120926 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term307;
     Object term309;
     Object term2063;

    public WordUtils_isDelimiter_99824120926() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term307 = new Character('t');
        term309 = (char[]) newCharArray(1);
        setCharElement(term309, 0, 'R');
        term2063 = (char[]) newCharArray(1);
        setCharElement(term2063, 0, 'R');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.WordUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = char.class;
        argTypes[1] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[2];
        args[0] = term307;
        args[1] = term309;
        callMethod(klass, "isDelimiter", argTypes, null, args);
        assertTrue(recursiveEquals(term307, 't'));
        assertTrue(recursiveEquals(term309, term2063));
    }

};


