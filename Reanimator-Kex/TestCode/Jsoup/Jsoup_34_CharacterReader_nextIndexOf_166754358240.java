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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Character;

public class CharacterReader_nextIndexOf_166754358240 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term144;
     Object term150;

    public CharacterReader_nextIndexOf_166754358240() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term144 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term145 = (char[]) newCharArray(1);
        setCharElement(term145, 0, 'F');
        setField(term144, term144.getClass(), "input", term145);
        setIntField(term144, term144.getClass(), "length", 865208305);
        setIntField(term144, term144.getClass(), "pos", -1275173084);
        setIntField(term144, term144.getClass(), "mark", -244121226);
        term150 = new Character('s');
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = char.class;
        Object[] args = new Object[1];
        args[0] = term150;
        try {
            callMethod(klass, "nextIndexOf", argTypes, term144, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


