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
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CharacterReader_consumeHexSequence_393737519568 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5287214;

    public CharacterReader_consumeHexSequence_393737519568() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5287214 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term5277619 = (char[]) newCharArray(89);
        setIntField(term5287214, term5287214.getClass(), "pos", 0);
        setIntField(term5287214, term5287214.getClass(), "length", 127);
        setCharElement(term5277619, 0, 'd');
        setCharElement(term5277619, 1, (char) 50);
        setCharElement(term5277619, 2, (char) 50);
        setCharElement(term5277619, 3, (char) 50);
        setCharElement(term5277619, 4, 'c');
        setCharElement(term5277619, 5, 'c');
        setCharElement(term5277619, 6, 'c');
        setCharElement(term5277619, 7, 'c');
        setCharElement(term5277619, 8, 'c');
        setCharElement(term5277619, 9, 'c');
        setCharElement(term5277619, 10, 'c');
        setCharElement(term5277619, 11, 'c');
        setCharElement(term5277619, 12, 'c');
        setCharElement(term5277619, 13, 'c');
        setCharElement(term5277619, 14, 'c');
        setCharElement(term5277619, 15, 'c');
        setCharElement(term5277619, 16, 'c');
        setCharElement(term5277619, 17, 'c');
        setCharElement(term5277619, 18, 'c');
        setCharElement(term5277619, 19, 'c');
        setCharElement(term5277619, 20, 'c');
        setCharElement(term5277619, 21, 'c');
        setCharElement(term5277619, 22, 'd');
        setCharElement(term5277619, 23, 'c');
        setCharElement(term5277619, 24, 'c');
        setCharElement(term5277619, 25, 'c');
        setCharElement(term5277619, 26, 'c');
        setCharElement(term5277619, 27, 'c');
        setCharElement(term5277619, 28, 'c');
        setCharElement(term5277619, 29, 'c');
        setCharElement(term5277619, 30, 'c');
        setCharElement(term5277619, 31, 'c');
        setCharElement(term5277619, 32, 'c');
        setCharElement(term5277619, 33, 'c');
        setCharElement(term5277619, 34, 'c');
        setCharElement(term5277619, 35, 'c');
        setCharElement(term5277619, 36, 'c');
        setCharElement(term5277619, 37, 'c');
        setCharElement(term5277619, 38, 'c');
        setCharElement(term5277619, 39, 'c');
        setCharElement(term5277619, 40, 'c');
        setCharElement(term5277619, 41, 'c');
        setCharElement(term5277619, 42, 'c');
        setCharElement(term5277619, 43, 'c');
        setCharElement(term5277619, 44, 'c');
        setCharElement(term5277619, 45, 'c');
        setCharElement(term5277619, 46, 'c');
        setCharElement(term5277619, 47, 'c');
        setCharElement(term5277619, 48, 'c');
        setCharElement(term5277619, 49, 'c');
        setCharElement(term5277619, 50, 'c');
        setCharElement(term5277619, 51, 'c');
        setCharElement(term5277619, 52, 'c');
        setCharElement(term5277619, 53, 'c');
        setCharElement(term5277619, 54, 'c');
        setCharElement(term5277619, 55, 'c');
        setCharElement(term5277619, 56, 'c');
        setCharElement(term5277619, 57, 'c');
        setCharElement(term5277619, 58, 'c');
        setCharElement(term5277619, 59, 'c');
        setCharElement(term5277619, 60, 'c');
        setCharElement(term5277619, 61, 'c');
        setCharElement(term5277619, 62, 'c');
        setCharElement(term5277619, 63, 'c');
        setCharElement(term5277619, 64, 'c');
        setCharElement(term5277619, 65, 'c');
        setCharElement(term5277619, 66, 'c');
        setCharElement(term5277619, 67, 'c');
        setCharElement(term5277619, 68, 'c');
        setCharElement(term5277619, 69, 'c');
        setCharElement(term5277619, 70, 'c');
        setCharElement(term5277619, 71, 'c');
        setCharElement(term5277619, 72, 'c');
        setCharElement(term5277619, 73, 'c');
        setCharElement(term5277619, 74, 'c');
        setCharElement(term5277619, 75, 'c');
        setCharElement(term5277619, 76, 'c');
        setCharElement(term5277619, 77, 'c');
        setCharElement(term5277619, 78, 'c');
        setCharElement(term5277619, 79, 'c');
        setCharElement(term5277619, 80, 'c');
        setCharElement(term5277619, 81, 'c');
        setCharElement(term5277619, 82, 'c');
        setCharElement(term5277619, 83, 'c');
        setCharElement(term5277619, 84, 'c');
        setCharElement(term5277619, 85, 'c');
        setCharElement(term5277619, 86, 'c');
        setCharElement(term5277619, 87, 'c');
        setCharElement(term5277619, 88, 'd');
        setField(term5287214, term5287214.getClass(), "input", term5277619);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "consumeHexSequence", argTypes, term5287214, args);
    }

};


