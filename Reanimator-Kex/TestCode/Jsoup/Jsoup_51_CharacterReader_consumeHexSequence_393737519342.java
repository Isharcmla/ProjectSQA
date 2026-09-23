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

public class CharacterReader_consumeHexSequence_393737519342 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2092164;

    public CharacterReader_consumeHexSequence_393737519342() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2092164 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term2092060 = (char[]) newCharArray(8);
        setIntField(term2092164, term2092164.getClass(), "pos", 6);
        setIntField(term2092164, term2092164.getClass(), "length", 7);
        setCharElement(term2092060, 0, 'G');
        setCharElement(term2092060, 1, 'G');
        setCharElement(term2092060, 2, 'G');
        setCharElement(term2092060, 3, 'G');
        setCharElement(term2092060, 4, 'G');
        setCharElement(term2092060, 5, 'G');
        setCharElement(term2092060, 6, 'G');
        setCharElement(term2092060, 7, 'G');
        setField(term2092164, term2092164.getClass(), "input", term2092060);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "consumeHexSequence", argTypes, term2092164, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


