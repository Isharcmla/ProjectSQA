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

public class CharacterReader_consumeHexSequence_393737519563 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5122530;

    public CharacterReader_consumeHexSequence_393737519563() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term5122530 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term5120412 = (char[]) newCharArray(32);
        setIntField(term5122530, term5122530.getClass(), "pos", -15);
        setIntField(term5122530, term5122530.getClass(), "length", 268435445);
        setCharElement(term5120412, 0, 'b');
        setCharElement(term5120412, 1, 'b');
        setCharElement(term5120412, 2, 'b');
        setCharElement(term5120412, 3, 'b');
        setCharElement(term5120412, 4, 'b');
        setCharElement(term5120412, 5, 'b');
        setCharElement(term5120412, 6, 'b');
        setCharElement(term5120412, 7, 'b');
        setCharElement(term5120412, 8, 'b');
        setCharElement(term5120412, 9, 'b');
        setCharElement(term5120412, 10, 'b');
        setCharElement(term5120412, 11, 'b');
        setCharElement(term5120412, 12, 'b');
        setCharElement(term5120412, 13, 'b');
        setCharElement(term5120412, 14, 'b');
        setCharElement(term5120412, 15, 'b');
        setCharElement(term5120412, 16, 'b');
        setCharElement(term5120412, 17, 'b');
        setCharElement(term5120412, 18, 'b');
        setCharElement(term5120412, 19, 'b');
        setCharElement(term5120412, 20, 'b');
        setCharElement(term5120412, 21, 'b');
        setCharElement(term5120412, 22, 'b');
        setCharElement(term5120412, 23, 'b');
        setCharElement(term5120412, 24, 'b');
        setCharElement(term5120412, 25, 'b');
        setCharElement(term5120412, 27, 'b');
        setCharElement(term5120412, 28, 'b');
        setCharElement(term5120412, 29, 'b');
        setCharElement(term5120412, 30, 'b');
        setCharElement(term5120412, 31, 'b');
        setCharElement(term5120412, -15, 'd');
        setCharElement(term5120412, -14, (char) 48);
        setCharElement(term5120412, -13, (char) 48);
        setCharElement(term5120412, -12, (char) 48);
        setCharElement(term5120412, -11, 'b');
        setCharElement(term5120412, -10, 'b');
        setCharElement(term5120412, -9, 'b');
        setCharElement(term5120412, -8, 'b');
        setCharElement(term5120412, -7, 'b');
        setCharElement(term5120412, -6, 'b');
        setCharElement(term5120412, -5, 'b');
        setCharElement(term5120412, -4, 'b');
        setCharElement(term5120412, -3, 'b');
        setCharElement(term5120412, -2, 'b');
        setCharElement(term5120412, -1, 'b');
        setField(term5122530, term5122530.getClass(), "input", term5120412);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "consumeHexSequence", argTypes, term5122530, args);
    }

};


