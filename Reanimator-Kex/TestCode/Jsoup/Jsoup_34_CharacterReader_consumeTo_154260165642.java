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
import java.lang.Character;

public class CharacterReader_consumeTo_154260165642 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term170;
     Object term180;

    public CharacterReader_consumeTo_154260165642() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term170 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term171 = (char[]) newCharArray(5);
        setCharElement(term171, 0, 'm');
        setCharElement(term171, 1, 'a');
        setCharElement(term171, 2, 'n');
        setCharElement(term171, 3, 'W');
        setCharElement(term171, 4, 'E');
        setField(term170, term170.getClass(), "input", term171);
        setIntField(term170, term170.getClass(), "length", -226514366);
        setIntField(term170, term170.getClass(), "pos", 1193880199);
        setIntField(term170, term170.getClass(), "mark", -1087774327);
        term180 = new Character('G');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = term180;
        try {
            callMethod(klass, "consumeTo", argTypes, term170, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


