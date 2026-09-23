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

public class CharacterReader_consumeToAny_14227036101038 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term379054;
     Object term378378;

    public CharacterReader_consumeToAny_14227036101038() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term379054 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        term378378 = (char[]) newCharArray(0);
        setIntField(term379054, term379054.getClass(), "bufPos", 469762039);
        setIntField(term379054, term379054.getClass(), "bufSplitPoint", 469762040);
        setIntField(term379054, term379054.getClass(), "bufLength", 469762156);
        setField(term379054, term379054.getClass(), "charBuf", term378378);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term378378;
        try {
            callMethod(klass, "consumeToAny", argTypes, term379054, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


