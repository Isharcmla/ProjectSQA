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
import java.lang.Object;

public class CharacterReader_consumeHexSequence_393737519514 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4121348;

    public CharacterReader_consumeHexSequence_393737519514() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4121348 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term4121207 = (char[]) newCharArray(1);
        Object[] term4121211 = (Object[]) newArray("java.lang.String", 105);
        setIntField(term4121348, term4121348.getClass(), "pos", -2080374784);
        setIntField(term4121348, term4121348.getClass(), "length", -2080374783);
        setCharElement(term4121207, -2080374784, 'c');
        setField(term4121348, term4121348.getClass(), "input", term4121207);
        setElement(term4121211, 0, " ");
        setElement(term4121211, 1, " ");
        setElement(term4121211, 2, " ");
        setElement(term4121211, 3, " ");
        setElement(term4121211, 4, " ");
        setElement(term4121211, 5, " ");
        setElement(term4121211, 6, " ");
        setElement(term4121211, 7, " ");
        setElement(term4121211, 8, " ");
        setElement(term4121211, 9, " ");
        setElement(term4121211, 10, " ");
        setElement(term4121211, 11, " ");
        setElement(term4121211, 12, " ");
        setElement(term4121211, 13, " ");
        setElement(term4121211, 14, " ");
        setElement(term4121211, 15, " ");
        setElement(term4121211, 16, " ");
        setElement(term4121211, 17, " ");
        setElement(term4121211, 18, " ");
        setElement(term4121211, 19, " ");
        setElement(term4121211, 20, " ");
        setElement(term4121211, 21, " ");
        setElement(term4121211, 22, " ");
        setElement(term4121211, 23, " ");
        setElement(term4121211, 24, " ");
        setElement(term4121211, 25, " ");
        setElement(term4121211, 26, " ");
        setElement(term4121211, 27, " ");
        setElement(term4121211, 28, " ");
        setElement(term4121211, 29, " ");
        setElement(term4121211, 30, " ");
        setElement(term4121211, 31, " ");
        setElement(term4121211, 32, " ");
        setElement(term4121211, 33, " ");
        setElement(term4121211, 34, " ");
        setElement(term4121211, 35, " ");
        setElement(term4121211, 36, " ");
        setElement(term4121211, 37, " ");
        setElement(term4121211, 38, " ");
        setElement(term4121211, 39, " ");
        setElement(term4121211, 40, " ");
        setElement(term4121211, 41, " ");
        setElement(term4121211, 42, " ");
        setElement(term4121211, 43, " ");
        setElement(term4121211, 44, " ");
        setElement(term4121211, 45, " ");
        setElement(term4121211, 46, " ");
        setElement(term4121211, 47, " ");
        setElement(term4121211, 48, " ");
        setElement(term4121211, 49, " ");
        setElement(term4121211, 50, " ");
        setElement(term4121211, 51, " ");
        setElement(term4121211, 52, " ");
        setElement(term4121211, 53, " ");
        setElement(term4121211, 54, " ");
        setElement(term4121211, 55, " ");
        setElement(term4121211, 56, " ");
        setElement(term4121211, 57, " ");
        setElement(term4121211, 58, " ");
        setElement(term4121211, 59, " ");
        setElement(term4121211, 60, " ");
        setElement(term4121211, 61, " ");
        setElement(term4121211, 62, " ");
        setElement(term4121211, 63, " ");
        setElement(term4121211, 64, " ");
        setElement(term4121211, 65, " ");
        setElement(term4121211, 66, " ");
        setElement(term4121211, 67, " ");
        setElement(term4121211, 68, " ");
        setElement(term4121211, 69, " ");
        setElement(term4121211, 70, " ");
        setElement(term4121211, 71, " ");
        setElement(term4121211, 72, " ");
        setElement(term4121211, 73, " ");
        setElement(term4121211, 74, " ");
        setElement(term4121211, 75, " ");
        setElement(term4121211, 76, " ");
        setElement(term4121211, 77, " ");
        setElement(term4121211, 78, " ");
        setElement(term4121211, 79, " ");
        setElement(term4121211, 80, " ");
        setElement(term4121211, 81, " ");
        setElement(term4121211, 82, " ");
        setElement(term4121211, 83, " ");
        setElement(term4121211, 84, " ");
        setElement(term4121211, 85, " ");
        setElement(term4121211, 86, " ");
        setElement(term4121211, 87, " ");
        setElement(term4121211, 88, " ");
        setElement(term4121211, 89, " ");
        setElement(term4121211, 90, " ");
        setElement(term4121211, 91, " ");
        setElement(term4121211, 92, " ");
        setElement(term4121211, 93, " ");
        setElement(term4121211, 94, " ");
        setElement(term4121211, 95, " ");
        setElement(term4121211, 96, " ");
        setElement(term4121211, 97, " ");
        setElement(term4121211, 98, " ");
        setElement(term4121211, 99, " ");
        setElement(term4121211, 100, " ");
        setElement(term4121211, 101, " ");
        setElement(term4121211, 102, " ");
        setElement(term4121211, 103, " ");
        setElement(term4121211, 104, " ");
        setField(term4121348, term4121348.getClass(), "stringCache", term4121211);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "consumeHexSequence", argTypes, term4121348, args);
    }

};


