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

public class CharacterReader_consumeToAny_1422703610889 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term306898;
     Object term306716;

    public CharacterReader_consumeToAny_1422703610889() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term306898 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term306720 = (char[]) newCharArray(3);
        setIntField(term306898, term306898.getClass(), "bufPos", 0);
        setIntField(term306898, term306898.getClass(), "bufSplitPoint", 1);
        setIntField(term306898, term306898.getClass(), "bufLength", 11);
        setField(term306898, term306898.getClass(), "charBuf", term306720);
        setField(term306898, term306898.getClass(), "stringCache", null);
        term306716 = (char[]) newCharArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term306716;
        try {
            callMethod(klass, "consumeToAny", argTypes, term306898, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


