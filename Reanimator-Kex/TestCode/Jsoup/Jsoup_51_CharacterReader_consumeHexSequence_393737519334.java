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

public class CharacterReader_consumeHexSequence_393737519334 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2082323;

    public CharacterReader_consumeHexSequence_393737519334() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2082323 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term2082220 = (char[]) newCharArray(8);
        setIntField(term2082323, term2082323.getClass(), "pos", 6);
        setIntField(term2082323, term2082323.getClass(), "length", 7);
        setCharElement(term2082220, 0, 'D');
        setCharElement(term2082220, 1, 'D');
        setCharElement(term2082220, 2, 'D');
        setCharElement(term2082220, 3, 'D');
        setCharElement(term2082220, 4, 'D');
        setCharElement(term2082220, 5, 'D');
        setCharElement(term2082220, 6, 'D');
        setCharElement(term2082220, 7, 'D');
        setField(term2082323, term2082323.getClass(), "input", term2082220);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "consumeHexSequence", argTypes, term2082323, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


