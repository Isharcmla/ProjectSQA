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

public class CharacterReader_consumeHexSequence_393737519581 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5784676;

    public CharacterReader_consumeHexSequence_393737519581() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5784676 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term5783946 = (char[]) newCharArray(5);
        setIntField(term5784676, term5784676.getClass(), "pos", -2147389455);
        setIntField(term5784676, term5784676.getClass(), "length", 392957);
        setCharElement(term5783946, 0, 'b');
        setCharElement(term5783946, 1, 'b');
        setCharElement(term5783946, 2, 'b');
        setCharElement(term5783946, 3, 'b');
        setCharElement(term5783946, 4, 'b');
        setCharElement(term5783946, -2147389455, 'd');
        setCharElement(term5783946, -2147389454, (char) 48);
        setCharElement(term5783946, -2147389453, (char) 48);
        setCharElement(term5783946, -2147389452, (char) 48);
        setCharElement(term5783946, -2147389451, 'b');
        setCharElement(term5783946, -2147389450, 'b');
        setCharElement(term5783946, -2147389449, 'b');
        setCharElement(term5783946, -2147389448, 'b');
        setCharElement(term5783946, -2147389447, 'b');
        setCharElement(term5783946, -2147389446, 'b');
        setCharElement(term5783946, -2147389445, 'b');
        setCharElement(term5783946, -2147389444, 'b');
        setCharElement(term5783946, -2147389443, 'b');
        setCharElement(term5783946, -2147389442, 'b');
        setCharElement(term5783946, -2147389441, 'b');
        setCharElement(term5783946, -2147389440, 'b');
        setCharElement(term5783946, -2147389439, 'b');
        setCharElement(term5783946, -2147389438, 'b');
        setCharElement(term5783946, -2147389437, 'b');
        setCharElement(term5783946, -2147389436, 'b');
        setCharElement(term5783946, -2147389435, 'b');
        setCharElement(term5783946, -2147389434, 'b');
        setCharElement(term5783946, -2147389433, 'b');
        setCharElement(term5783946, -2147389432, 'b');
        setCharElement(term5783946, -2147389431, 'b');
        setCharElement(term5783946, -2147389430, 'b');
        setCharElement(term5783946, -2147389429, 'b');
        setCharElement(term5783946, -2147389428, 'b');
        setCharElement(term5783946, -2147389427, 'b');
        setCharElement(term5783946, -2147389426, 'G');
        setField(term5784676, term5784676.getClass(), "input", term5783946);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "consumeHexSequence", argTypes, term5784676, args);
    }

};


