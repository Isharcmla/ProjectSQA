package org.jsoup.parser;

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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CharacterReader_consumeToEnd_1419030637521 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4122427;

    public CharacterReader_consumeToEnd_1419030637521() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4122427 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term4122313 = (char[]) newCharArray(9);
        Object[] term4122323 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term4122427, term4122427.getClass(), "pos", 0);
        setIntField(term4122427, term4122427.getClass(), "length", 1);
        setCharElement(term4122313, 0, (char) 49153);
        setCharElement(term4122313, 1, (char) 49153);
        setCharElement(term4122313, 2, (char) 49153);
        setCharElement(term4122313, 3, (char) 49153);
        setCharElement(term4122313, 4, (char) 49153);
        setCharElement(term4122313, 5, (char) 49153);
        setCharElement(term4122313, 6, (char) 49153);
        setCharElement(term4122313, 7, (char) 49153);
        setCharElement(term4122313, 8, (char) 49153);
        setField(term4122427, term4122427.getClass(), "input", term4122313);
        setField(term4122427, term4122427.getClass(), "stringCache", term4122323);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "consumeToEnd", argTypes, term4122427, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


