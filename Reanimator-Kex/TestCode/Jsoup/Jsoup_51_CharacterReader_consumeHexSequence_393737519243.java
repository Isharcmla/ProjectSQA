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

public class CharacterReader_consumeHexSequence_393737519243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term93407;

    public CharacterReader_consumeHexSequence_393737519243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term93407 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term93306 = (char[]) newCharArray(8);
        setIntField(term93407, term93407.getClass(), "pos", 6);
        setIntField(term93407, term93407.getClass(), "length", 7);
        setCharElement(term93306, 0, (char) 58);
        setCharElement(term93306, 1, (char) 58);
        setCharElement(term93306, 2, (char) 58);
        setCharElement(term93306, 3, (char) 58);
        setCharElement(term93306, 4, (char) 58);
        setCharElement(term93306, 5, (char) 58);
        setCharElement(term93306, 6, (char) 58);
        setCharElement(term93306, 7, (char) 58);
        setField(term93407, term93407.getClass(), "input", term93306);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "consumeHexSequence", argTypes, term93407, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


