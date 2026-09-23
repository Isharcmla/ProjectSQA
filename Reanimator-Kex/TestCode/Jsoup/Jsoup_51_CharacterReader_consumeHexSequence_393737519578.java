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

public class CharacterReader_consumeHexSequence_393737519578 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5627821;

    public CharacterReader_consumeHexSequence_393737519578() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5627821 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term5626885 = (char[]) newCharArray(128);
        setIntField(term5627821, term5627821.getClass(), "pos", 71);
        setIntField(term5627821, term5627821.getClass(), "length", 79);
        setCharElement(term5626885, 0, (char) 48);
        setCharElement(term5626885, 1, (char) 48);
        setCharElement(term5626885, 2, (char) 48);
        setCharElement(term5626885, 3, (char) 48);
        setCharElement(term5626885, 4, (char) 48);
        setCharElement(term5626885, 5, (char) 48);
        setCharElement(term5626885, 6, (char) 48);
        setCharElement(term5626885, 7, (char) 48);
        setCharElement(term5626885, 8, (char) 48);
        setCharElement(term5626885, 9, (char) 48);
        setCharElement(term5626885, 10, (char) 48);
        setCharElement(term5626885, 11, (char) 48);
        setCharElement(term5626885, 12, (char) 48);
        setCharElement(term5626885, 13, (char) 48);
        setCharElement(term5626885, 14, (char) 48);
        setCharElement(term5626885, 15, (char) 48);
        setCharElement(term5626885, 16, (char) 48);
        setCharElement(term5626885, 17, (char) 48);
        setCharElement(term5626885, 18, (char) 48);
        setCharElement(term5626885, 19, (char) 48);
        setCharElement(term5626885, 20, (char) 48);
        setCharElement(term5626885, 21, (char) 48);
        setCharElement(term5626885, 22, (char) 48);
        setCharElement(term5626885, 23, (char) 48);
        setCharElement(term5626885, 24, (char) 48);
        setCharElement(term5626885, 25, (char) 48);
        setCharElement(term5626885, 26, (char) 48);
        setCharElement(term5626885, 27, (char) 48);
        setCharElement(term5626885, 28, (char) 48);
        setCharElement(term5626885, 29, (char) 48);
        setCharElement(term5626885, 30, (char) 48);
        setCharElement(term5626885, 31, (char) 48);
        setCharElement(term5626885, 32, (char) 48);
        setCharElement(term5626885, 33, (char) 48);
        setCharElement(term5626885, 34, (char) 48);
        setCharElement(term5626885, 35, (char) 48);
        setCharElement(term5626885, 36, (char) 48);
        setCharElement(term5626885, 37, (char) 48);
        setCharElement(term5626885, 38, (char) 48);
        setCharElement(term5626885, 39, (char) 48);
        setCharElement(term5626885, 40, (char) 48);
        setCharElement(term5626885, 41, (char) 48);
        setCharElement(term5626885, 42, (char) 48);
        setCharElement(term5626885, 43, (char) 48);
        setCharElement(term5626885, 44, (char) 48);
        setCharElement(term5626885, 45, (char) 48);
        setCharElement(term5626885, 46, (char) 48);
        setCharElement(term5626885, 47, (char) 48);
        setCharElement(term5626885, 48, (char) 48);
        setCharElement(term5626885, 49, (char) 48);
        setCharElement(term5626885, 50, (char) 48);
        setCharElement(term5626885, 51, (char) 48);
        setCharElement(term5626885, 52, (char) 48);
        setCharElement(term5626885, 53, (char) 48);
        setCharElement(term5626885, 54, (char) 48);
        setCharElement(term5626885, 55, (char) 48);
        setCharElement(term5626885, 56, (char) 48);
        setCharElement(term5626885, 57, (char) 48);
        setCharElement(term5626885, 58, (char) 48);
        setCharElement(term5626885, 59, (char) 48);
        setCharElement(term5626885, 60, (char) 48);
        setCharElement(term5626885, 61, (char) 48);
        setCharElement(term5626885, 62, (char) 48);
        setCharElement(term5626885, 63, (char) 48);
        setCharElement(term5626885, 64, (char) 48);
        setCharElement(term5626885, 65, (char) 48);
        setCharElement(term5626885, 66, (char) 48);
        setCharElement(term5626885, 67, (char) 48);
        setCharElement(term5626885, 68, (char) 48);
        setCharElement(term5626885, 69, (char) 48);
        setCharElement(term5626885, 70, (char) 48);
        setCharElement(term5626885, 71, 'd');
        setCharElement(term5626885, 72, (char) 48);
        setCharElement(term5626885, 73, (char) 48);
        setCharElement(term5626885, 74, (char) 48);
        setCharElement(term5626885, 75, 'b');
        setCharElement(term5626885, 76, (char) 48);
        setCharElement(term5626885, 77, (char) 48);
        setCharElement(term5626885, 78, (char) 48);
        setCharElement(term5626885, 79, (char) 48);
        setCharElement(term5626885, 80, (char) 48);
        setCharElement(term5626885, 81, (char) 48);
        setCharElement(term5626885, 82, (char) 48);
        setCharElement(term5626885, 83, (char) 48);
        setCharElement(term5626885, 84, (char) 48);
        setCharElement(term5626885, 85, (char) 48);
        setCharElement(term5626885, 86, (char) 48);
        setCharElement(term5626885, 87, (char) 48);
        setCharElement(term5626885, 88, (char) 48);
        setCharElement(term5626885, 89, (char) 48);
        setCharElement(term5626885, 90, (char) 48);
        setCharElement(term5626885, 91, (char) 48);
        setCharElement(term5626885, 92, (char) 48);
        setCharElement(term5626885, 93, (char) 48);
        setCharElement(term5626885, 94, (char) 48);
        setCharElement(term5626885, 95, (char) 48);
        setCharElement(term5626885, 96, (char) 48);
        setCharElement(term5626885, 97, (char) 48);
        setCharElement(term5626885, 98, (char) 48);
        setCharElement(term5626885, 99, (char) 48);
        setCharElement(term5626885, 100, (char) 48);
        setCharElement(term5626885, 101, (char) 48);
        setCharElement(term5626885, 102, (char) 48);
        setCharElement(term5626885, 103, (char) 48);
        setCharElement(term5626885, 104, (char) 48);
        setCharElement(term5626885, 105, (char) 48);
        setCharElement(term5626885, 106, (char) 48);
        setCharElement(term5626885, 107, (char) 48);
        setCharElement(term5626885, 108, (char) 48);
        setCharElement(term5626885, 109, (char) 48);
        setCharElement(term5626885, 110, (char) 48);
        setCharElement(term5626885, 111, (char) 48);
        setCharElement(term5626885, 112, (char) 48);
        setCharElement(term5626885, 113, (char) 48);
        setCharElement(term5626885, 114, (char) 48);
        setCharElement(term5626885, 115, (char) 48);
        setCharElement(term5626885, 116, (char) 48);
        setCharElement(term5626885, 117, (char) 48);
        setCharElement(term5626885, 118, (char) 48);
        setCharElement(term5626885, 119, (char) 48);
        setCharElement(term5626885, 120, (char) 48);
        setCharElement(term5626885, 121, (char) 48);
        setCharElement(term5626885, 122, (char) 48);
        setCharElement(term5626885, 123, (char) 48);
        setCharElement(term5626885, 124, (char) 48);
        setCharElement(term5626885, 125, (char) 48);
        setCharElement(term5626885, 126, (char) 48);
        setCharElement(term5626885, 127, (char) 48);
        setField(term5627821, term5627821.getClass(), "input", term5626885);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "consumeHexSequence", argTypes, term5627821, args);
    }

};


