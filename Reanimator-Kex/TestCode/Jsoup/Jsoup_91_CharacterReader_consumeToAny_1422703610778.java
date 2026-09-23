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
import java.lang.NullPointerException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class CharacterReader_consumeToAny_1422703610778 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term219440;
     Object term219301;

    public CharacterReader_consumeToAny_1422703610778() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term219440 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term219440, term219440.getClass(), "bufPos", 763891712);
        setIntField(term219440, term219440.getClass(), "bufSplitPoint", 763891713);
        setIntField(term219440, term219440.getClass(), "bufLength", 763891719);
        setField(term219440, term219440.getClass(), "charBuf", null);
        setField(term219440, term219440.getClass(), "stringCache", null);
        term219301 = (char[]) newCharArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term219301;
        try {
            callMethod(klass, "consumeToAny", argTypes, term219440, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


