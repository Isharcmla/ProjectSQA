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

public class CharacterReader_consumeToAny_1422703610596 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term167261;
     Object term166847;

    public CharacterReader_consumeToAny_1422703610596() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term167261 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        term166847 = (char[]) newCharArray(0);
        setIntField(term167261, term167261.getClass(), "bufPos", -4);
        setIntField(term167261, term167261.getClass(), "bufSplitPoint", -3);
        setIntField(term167261, term167261.getClass(), "bufLength", 37);
        setField(term167261, term167261.getClass(), "charBuf", term166847);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term166847;
        callMethod(klass, "consumeToAny", argTypes, term167261, args);
    }

};


