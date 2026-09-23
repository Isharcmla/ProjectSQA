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

public class CharacterReader_consumeHexSequence_393737519545 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4371933;

    public CharacterReader_consumeHexSequence_393737519545() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4371933 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term4371811 = (char[]) newCharArray(8);
        setIntField(term4371933, term4371933.getClass(), "pos", 1);
        setIntField(term4371933, term4371933.getClass(), "length", 3);
        setCharElement(term4371811, 0, (char) 48);
        setCharElement(term4371811, 1, 'D');
        setCharElement(term4371811, 2, (char) 48);
        setCharElement(term4371811, 3, (char) 48);
        setCharElement(term4371811, 4, (char) 48);
        setCharElement(term4371811, 5, (char) 48);
        setCharElement(term4371811, 6, (char) 48);
        setCharElement(term4371811, 7, (char) 48);
        setField(term4371933, term4371933.getClass(), "input", term4371811);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "consumeHexSequence", argTypes, term4371933, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


