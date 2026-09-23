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

public class CharacterReader_consumeToAny_1422703610599 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term168983;
     Object term168561;

    public CharacterReader_consumeToAny_1422703610599() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term168983 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        term168561 = (char[]) newCharArray(0);
        setIntField(term168983, term168983.getClass(), "bufPos", -1);
        setIntField(term168983, term168983.getClass(), "bufSplitPoint", 0);
        setIntField(term168983, term168983.getClass(), "bufLength", 41);
        setField(term168983, term168983.getClass(), "charBuf", term168561);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term168561;
        callMethod(klass, "consumeToAny", argTypes, term168983, args);
    }

};


