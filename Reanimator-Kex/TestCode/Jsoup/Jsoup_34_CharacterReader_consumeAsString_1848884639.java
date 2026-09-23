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
import java.lang.StringIndexOutOfBoundsException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CharacterReader_consumeAsString_1848884639 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term125;

    public CharacterReader_consumeAsString_1848884639() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term125 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term126 = (char[]) newCharArray(7);
        setCharElement(term126, 0, 'x');
        setCharElement(term126, 1, 't');
        setCharElement(term126, 2, 'l');
        setCharElement(term126, 3, 'P');
        setCharElement(term126, 4, 'w');
        setCharElement(term126, 5, 'D');
        setCharElement(term126, 6, 'Y');
        setField(term125, term125.getClass(), "input", term126);
        setIntField(term125, term125.getClass(), "length", -1007160944);
        setIntField(term125, term125.getClass(), "pos", 1135664017);
        setIntField(term125, term125.getClass(), "mark", 590364439);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "consumeAsString", argTypes, term125, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


