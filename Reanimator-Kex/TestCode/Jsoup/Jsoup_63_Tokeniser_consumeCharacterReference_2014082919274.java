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
import java.lang.IllegalArgumentException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Character;

public class Tokeniser_consumeCharacterReference_2014082919274 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term236094;
     Object term236270;

    public Tokeniser_consumeCharacterReference_2014082919274() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term236094 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term236164 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term236218 = newInstance(Class.forName("java.io.LineNumberReader"));
        setIntField(term236164, term236164.getClass(), "bufPos", -2147483648);
        setIntField(term236164, term236164.getClass(), "bufLength", -2147483647);
        setIntField(term236164, term236164.getClass(), "bufSplitPoint", -2147483648);
        setIntField(term236164, term236164.getClass(), "readerPos", 0);
        setField(term236164, term236164.getClass(), "reader", term236218);
        setField(term236094, term236094.getClass(), "reader", term236164);
        term236270 = new Character((char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Character");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term236270;
        args[1] = false;
        try {
            callMethod(klass, "consumeCharacterReference", argTypes, term236094, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


