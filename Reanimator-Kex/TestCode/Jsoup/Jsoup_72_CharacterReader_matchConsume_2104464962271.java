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
import static org.jsoup.parser.EqualityUtils.*;

public class CharacterReader_matchConsume_2104464962271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59497;
     Object term61511;

    public CharacterReader_matchConsume_2104464962271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59497 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term58903 = (char[]) newCharArray(489);
        setIntField(term59497, term59497.getClass(), "bufPos", 0);
        setIntField(term59497, term59497.getClass(), "bufSplitPoint", 1);
        setIntField(term59497, term59497.getClass(), "bufLength", 490);
        setField(term59497, term59497.getClass(), "charBuf", term58903);
        term61511 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term61512 = (char[]) newCharArray(489);
        setField(term61511, term61511.getClass(), "charBuf", term61512);
        setField(term61511, term61511.getClass(), "reader", null);
        setIntField(term61511, term61511.getClass(), "bufLength", 490);
        setIntField(term61511, term61511.getClass(), "bufSplitPoint", 1);
        setIntField(term61511, term61511.getClass(), "bufPos", 0);
        setIntField(term61511, term61511.getClass(), "readerPos", 0);
        setIntField(term61511, term61511.getClass(), "bufMark", 0);
        setField(term61511, term61511.getClass(), "stringCache", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ";
        Object retValue = callMethod(klass, "matchConsume", argTypes, term59497, args);
        assertTrue(recursiveEquals(term59497, term61511));
        assertTrue(recursiveEquals(retValue, false));
    }

};


