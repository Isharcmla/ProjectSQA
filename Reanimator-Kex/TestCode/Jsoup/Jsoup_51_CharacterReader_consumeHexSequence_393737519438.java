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
import java.lang.NullPointerException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CharacterReader_consumeHexSequence_393737519438 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2375437;

    public CharacterReader_consumeHexSequence_393737519438() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2375437 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term2375312 = (char[]) newCharArray(8);
        setIntField(term2375437, term2375437.getClass(), "pos", 1);
        setIntField(term2375437, term2375437.getClass(), "length", 3);
        setCharElement(term2375312, 0, 'd');
        setCharElement(term2375312, 1, 'd');
        setCharElement(term2375312, 2, (char) 60);
        setCharElement(term2375312, 3, 'd');
        setCharElement(term2375312, 4, 'd');
        setCharElement(term2375312, 5, 'd');
        setCharElement(term2375312, 6, 'd');
        setCharElement(term2375312, 7, 'd');
        setField(term2375437, term2375437.getClass(), "input", term2375312);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "consumeHexSequence", argTypes, term2375437, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


