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

public class CharacterReader_consumeHexSequence_393737519546 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4372595;

    public CharacterReader_consumeHexSequence_393737519546() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4372595 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term4371945 = (char[]) newCharArray(128);
        setIntField(term4372595, term4372595.getClass(), "pos", 67);
        setIntField(term4372595, term4372595.getClass(), "length", 71);
        setCharElement(term4371945, 0, (char) 48);
        setCharElement(term4371945, 1, (char) 48);
        setCharElement(term4371945, 2, (char) 48);
        setCharElement(term4371945, 3, (char) 48);
        setCharElement(term4371945, 4, (char) 48);
        setCharElement(term4371945, 5, (char) 48);
        setCharElement(term4371945, 6, (char) 48);
        setCharElement(term4371945, 7, (char) 48);
        setCharElement(term4371945, 8, (char) 48);
        setCharElement(term4371945, 9, (char) 48);
        setCharElement(term4371945, 10, (char) 48);
        setCharElement(term4371945, 11, (char) 48);
        setCharElement(term4371945, 12, (char) 48);
        setCharElement(term4371945, 13, (char) 48);
        setCharElement(term4371945, 14, (char) 48);
        setCharElement(term4371945, 15, (char) 48);
        setCharElement(term4371945, 16, (char) 48);
        setCharElement(term4371945, 17, (char) 48);
        setCharElement(term4371945, 18, (char) 48);
        setCharElement(term4371945, 19, (char) 48);
        setCharElement(term4371945, 20, (char) 48);
        setCharElement(term4371945, 21, (char) 48);
        setCharElement(term4371945, 22, (char) 48);
        setCharElement(term4371945, 23, (char) 48);
        setCharElement(term4371945, 24, (char) 48);
        setCharElement(term4371945, 25, (char) 48);
        setCharElement(term4371945, 26, (char) 48);
        setCharElement(term4371945, 27, (char) 48);
        setCharElement(term4371945, 28, (char) 48);
        setCharElement(term4371945, 29, (char) 48);
        setCharElement(term4371945, 30, (char) 48);
        setCharElement(term4371945, 31, (char) 48);
        setCharElement(term4371945, 32, (char) 48);
        setCharElement(term4371945, 33, (char) 48);
        setCharElement(term4371945, 34, (char) 48);
        setCharElement(term4371945, 35, (char) 48);
        setCharElement(term4371945, 36, (char) 48);
        setCharElement(term4371945, 37, (char) 48);
        setCharElement(term4371945, 38, (char) 48);
        setCharElement(term4371945, 39, (char) 48);
        setCharElement(term4371945, 40, (char) 48);
        setCharElement(term4371945, 41, (char) 48);
        setCharElement(term4371945, 42, (char) 48);
        setCharElement(term4371945, 43, (char) 48);
        setCharElement(term4371945, 44, (char) 48);
        setCharElement(term4371945, 45, (char) 48);
        setCharElement(term4371945, 46, (char) 48);
        setCharElement(term4371945, 47, (char) 48);
        setCharElement(term4371945, 48, (char) 48);
        setCharElement(term4371945, 49, (char) 48);
        setCharElement(term4371945, 50, (char) 48);
        setCharElement(term4371945, 51, (char) 48);
        setCharElement(term4371945, 52, (char) 48);
        setCharElement(term4371945, 53, (char) 48);
        setCharElement(term4371945, 54, (char) 48);
        setCharElement(term4371945, 55, (char) 48);
        setCharElement(term4371945, 56, (char) 48);
        setCharElement(term4371945, 57, (char) 48);
        setCharElement(term4371945, 58, (char) 48);
        setCharElement(term4371945, 59, (char) 48);
        setCharElement(term4371945, 60, (char) 48);
        setCharElement(term4371945, 61, (char) 48);
        setCharElement(term4371945, 62, (char) 48);
        setCharElement(term4371945, 63, (char) 48);
        setCharElement(term4371945, 64, (char) 48);
        setCharElement(term4371945, 65, (char) 48);
        setCharElement(term4371945, 66, (char) 48);
        setCharElement(term4371945, 67, 'd');
        setCharElement(term4371945, 68, (char) 48);
        setCharElement(term4371945, 69, (char) 48);
        setCharElement(term4371945, 70, (char) 60);
        setCharElement(term4371945, 71, (char) 48);
        setCharElement(term4371945, 72, (char) 48);
        setCharElement(term4371945, 73, (char) 48);
        setCharElement(term4371945, 74, (char) 48);
        setCharElement(term4371945, 75, (char) 48);
        setCharElement(term4371945, 76, (char) 48);
        setCharElement(term4371945, 77, (char) 48);
        setCharElement(term4371945, 78, (char) 48);
        setCharElement(term4371945, 79, (char) 48);
        setCharElement(term4371945, 80, (char) 48);
        setCharElement(term4371945, 81, (char) 48);
        setCharElement(term4371945, 82, (char) 48);
        setCharElement(term4371945, 83, (char) 48);
        setCharElement(term4371945, 84, (char) 48);
        setCharElement(term4371945, 85, (char) 48);
        setCharElement(term4371945, 86, (char) 48);
        setCharElement(term4371945, 87, (char) 48);
        setCharElement(term4371945, 88, (char) 48);
        setCharElement(term4371945, 89, (char) 48);
        setCharElement(term4371945, 90, (char) 48);
        setCharElement(term4371945, 91, (char) 48);
        setCharElement(term4371945, 92, (char) 48);
        setCharElement(term4371945, 93, (char) 48);
        setCharElement(term4371945, 94, (char) 48);
        setCharElement(term4371945, 95, (char) 48);
        setCharElement(term4371945, 96, (char) 48);
        setCharElement(term4371945, 97, (char) 48);
        setCharElement(term4371945, 98, (char) 48);
        setCharElement(term4371945, 99, (char) 48);
        setCharElement(term4371945, 100, (char) 48);
        setCharElement(term4371945, 101, (char) 48);
        setCharElement(term4371945, 102, (char) 48);
        setCharElement(term4371945, 103, (char) 48);
        setCharElement(term4371945, 104, (char) 48);
        setCharElement(term4371945, 105, (char) 48);
        setCharElement(term4371945, 106, (char) 48);
        setCharElement(term4371945, 107, (char) 48);
        setCharElement(term4371945, 108, (char) 48);
        setCharElement(term4371945, 109, (char) 48);
        setCharElement(term4371945, 110, (char) 48);
        setCharElement(term4371945, 111, (char) 48);
        setCharElement(term4371945, 112, (char) 48);
        setCharElement(term4371945, 113, (char) 48);
        setCharElement(term4371945, 114, (char) 48);
        setCharElement(term4371945, 115, (char) 48);
        setCharElement(term4371945, 116, (char) 48);
        setCharElement(term4371945, 117, (char) 48);
        setCharElement(term4371945, 118, (char) 48);
        setCharElement(term4371945, 119, (char) 48);
        setCharElement(term4371945, 120, (char) 48);
        setCharElement(term4371945, 121, (char) 48);
        setCharElement(term4371945, 122, (char) 48);
        setCharElement(term4371945, 123, (char) 48);
        setCharElement(term4371945, 124, (char) 48);
        setCharElement(term4371945, 125, (char) 48);
        setCharElement(term4371945, 126, (char) 48);
        setCharElement(term4371945, 127, (char) 48);
        setField(term4372595, term4372595.getClass(), "input", term4371945);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "consumeHexSequence", argTypes, term4372595, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


