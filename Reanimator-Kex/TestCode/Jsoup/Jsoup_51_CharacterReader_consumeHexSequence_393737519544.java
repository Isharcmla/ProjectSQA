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

public class CharacterReader_consumeHexSequence_393737519544 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4371799;

    public CharacterReader_consumeHexSequence_393737519544() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4371799 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term4371676 = (char[]) newCharArray(8);
        setIntField(term4371799, term4371799.getClass(), "pos", 1);
        setIntField(term4371799, term4371799.getClass(), "length", 3);
        setCharElement(term4371676, 0, 'D');
        setCharElement(term4371676, 1, 'D');
        setCharElement(term4371676, 2, (char) 60);
        setCharElement(term4371676, 3, 'D');
        setCharElement(term4371676, 4, 'D');
        setCharElement(term4371676, 5, 'D');
        setCharElement(term4371676, 6, 'D');
        setCharElement(term4371676, 7, 'D');
        setField(term4371799, term4371799.getClass(), "input", term4371676);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "consumeHexSequence", argTypes, term4371799, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


