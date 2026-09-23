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

public class CharacterReader_consumeToAny_1422703610680 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term175378;
     Object term173667;

    public CharacterReader_consumeToAny_1422703610680() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term175378 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term173671 = (char[]) newCharArray(786);
        setIntField(term175378, term175378.getClass(), "bufPos", 785);
        setIntField(term175378, term175378.getClass(), "bufSplitPoint", 786);
        setIntField(term175378, term175378.getClass(), "bufLength", 790);
        setField(term175378, term175378.getClass(), "charBuf", term173671);
        setField(term175378, term175378.getClass(), "stringCache", null);
        term173667 = (char[]) newCharArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term173667;
        try {
            callMethod(klass, "consumeToAny", argTypes, term175378, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


