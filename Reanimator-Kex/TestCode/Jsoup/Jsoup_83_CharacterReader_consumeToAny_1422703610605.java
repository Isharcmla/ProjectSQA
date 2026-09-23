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

public class CharacterReader_consumeToAny_1422703610605 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term170809;
     Object term170371;

    public CharacterReader_consumeToAny_1422703610605() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term170809 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        term170371 = (char[]) newCharArray(0);
        setIntField(term170809, term170809.getClass(), "bufPos", -9);
        setIntField(term170809, term170809.getClass(), "bufSplitPoint", -8);
        setIntField(term170809, term170809.getClass(), "bufLength", 35);
        setField(term170809, term170809.getClass(), "charBuf", term170371);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term170371;
        callMethod(klass, "consumeToAny", argTypes, term170809, args);
    }

};


