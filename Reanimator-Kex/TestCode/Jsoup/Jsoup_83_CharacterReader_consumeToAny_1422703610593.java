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

public class CharacterReader_consumeToAny_1422703610593 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term166316;
     Object term166110;

    public CharacterReader_consumeToAny_1422703610593() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term166316 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term166114 = (char[]) newCharArray(9);
        setIntField(term166316, term166316.getClass(), "bufPos", 1089470462);
        setIntField(term166316, term166316.getClass(), "bufSplitPoint", 1089470463);
        setIntField(term166316, term166316.getClass(), "bufLength", 1089470475);
        setField(term166316, term166316.getClass(), "charBuf", term166114);
        term166110 = (char[]) newCharArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term166110;
        callMethod(klass, "consumeToAny", argTypes, term166316, args);
    }

};


