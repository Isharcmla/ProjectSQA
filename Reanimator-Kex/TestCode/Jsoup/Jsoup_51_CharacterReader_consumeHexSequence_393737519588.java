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

public class CharacterReader_consumeHexSequence_393737519588 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6019621;

    public CharacterReader_consumeHexSequence_393737519588() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6019621 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term6012128 = (char[]) newCharArray(109);
        setIntField(term6019621, term6019621.getClass(), "pos", 51);
        setIntField(term6019621, term6019621.getClass(), "length", 127);
        setCharElement(term6012128, 0, 'c');
        setCharElement(term6012128, 1, 'c');
        setCharElement(term6012128, 2, 'c');
        setCharElement(term6012128, 3, 'c');
        setCharElement(term6012128, 4, 'c');
        setCharElement(term6012128, 5, 'c');
        setCharElement(term6012128, 6, 'c');
        setCharElement(term6012128, 7, 'c');
        setCharElement(term6012128, 8, 'c');
        setCharElement(term6012128, 9, 'c');
        setCharElement(term6012128, 10, 'c');
        setCharElement(term6012128, 11, 'c');
        setCharElement(term6012128, 12, 'c');
        setCharElement(term6012128, 13, 'c');
        setCharElement(term6012128, 14, 'c');
        setCharElement(term6012128, 15, 'c');
        setCharElement(term6012128, 16, 'c');
        setCharElement(term6012128, 17, 'c');
        setCharElement(term6012128, 18, 'c');
        setCharElement(term6012128, 19, 'c');
        setCharElement(term6012128, 20, 'c');
        setCharElement(term6012128, 21, 'c');
        setCharElement(term6012128, 22, 'c');
        setCharElement(term6012128, 23, 'c');
        setCharElement(term6012128, 24, 'c');
        setCharElement(term6012128, 25, 'c');
        setCharElement(term6012128, 26, 'c');
        setCharElement(term6012128, 27, 'c');
        setCharElement(term6012128, 28, 'c');
        setCharElement(term6012128, 29, 'c');
        setCharElement(term6012128, 30, 'c');
        setCharElement(term6012128, 31, 'c');
        setCharElement(term6012128, 32, 'c');
        setCharElement(term6012128, 33, 'c');
        setCharElement(term6012128, 34, 'c');
        setCharElement(term6012128, 35, 'c');
        setCharElement(term6012128, 36, 'c');
        setCharElement(term6012128, 37, 'c');
        setCharElement(term6012128, 38, 'c');
        setCharElement(term6012128, 39, 'c');
        setCharElement(term6012128, 40, 'c');
        setCharElement(term6012128, 41, 'c');
        setCharElement(term6012128, 42, 'c');
        setCharElement(term6012128, 43, 'c');
        setCharElement(term6012128, 44, 'c');
        setCharElement(term6012128, 45, 'c');
        setCharElement(term6012128, 46, 'c');
        setCharElement(term6012128, 47, 'c');
        setCharElement(term6012128, 48, 'c');
        setCharElement(term6012128, 49, 'c');
        setCharElement(term6012128, 50, 'c');
        setCharElement(term6012128, 51, 'c');
        setCharElement(term6012128, 52, (char) 50);
        setCharElement(term6012128, 53, (char) 50);
        setCharElement(term6012128, 54, (char) 50);
        setCharElement(term6012128, 55, 'c');
        setCharElement(term6012128, 56, 'c');
        setCharElement(term6012128, 57, 'c');
        setCharElement(term6012128, 58, 'c');
        setCharElement(term6012128, 59, 'c');
        setCharElement(term6012128, 60, 'c');
        setCharElement(term6012128, 61, 'c');
        setCharElement(term6012128, 62, 'c');
        setCharElement(term6012128, 63, 'c');
        setCharElement(term6012128, 64, 'c');
        setCharElement(term6012128, 65, 'c');
        setCharElement(term6012128, 66, 'c');
        setCharElement(term6012128, 67, 'c');
        setCharElement(term6012128, 68, 'c');
        setCharElement(term6012128, 69, 'c');
        setCharElement(term6012128, 70, 'c');
        setCharElement(term6012128, 71, 'c');
        setCharElement(term6012128, 72, 'c');
        setCharElement(term6012128, 73, 'c');
        setCharElement(term6012128, 74, 'c');
        setCharElement(term6012128, 75, 'c');
        setCharElement(term6012128, 76, 'c');
        setCharElement(term6012128, 77, 'c');
        setCharElement(term6012128, 78, 'c');
        setCharElement(term6012128, 79, 'b');
        setCharElement(term6012128, 80, 'c');
        setCharElement(term6012128, 81, 'c');
        setCharElement(term6012128, 82, 'c');
        setCharElement(term6012128, 83, 'c');
        setCharElement(term6012128, 84, 'c');
        setCharElement(term6012128, 85, 'c');
        setCharElement(term6012128, 86, 'c');
        setCharElement(term6012128, 87, 'c');
        setCharElement(term6012128, 88, 'c');
        setCharElement(term6012128, 89, 'c');
        setCharElement(term6012128, 90, 'c');
        setCharElement(term6012128, 91, 'c');
        setCharElement(term6012128, 92, 'c');
        setCharElement(term6012128, 93, 'c');
        setCharElement(term6012128, 94, 'c');
        setCharElement(term6012128, 95, 'c');
        setCharElement(term6012128, 96, 'c');
        setCharElement(term6012128, 97, 'c');
        setCharElement(term6012128, 98, 'c');
        setCharElement(term6012128, 99, 'c');
        setCharElement(term6012128, 100, 'c');
        setCharElement(term6012128, 101, 'c');
        setCharElement(term6012128, 102, 'c');
        setCharElement(term6012128, 103, 'c');
        setCharElement(term6012128, 104, 'c');
        setCharElement(term6012128, 105, 'c');
        setCharElement(term6012128, 106, 'c');
        setCharElement(term6012128, 107, 'c');
        setCharElement(term6012128, 108, 'b');
        setField(term6019621, term6019621.getClass(), "input", term6012128);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "consumeHexSequence", argTypes, term6019621, args);
    }

};


