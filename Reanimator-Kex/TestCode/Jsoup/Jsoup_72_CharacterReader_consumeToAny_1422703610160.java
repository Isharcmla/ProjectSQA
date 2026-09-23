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

public class CharacterReader_consumeToAny_1422703610160 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29108;
     Object term29017;

    public CharacterReader_consumeToAny_1422703610160() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29108 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term29108, term29108.getClass(), "bufPos", -2147483648);
        setIntField(term29108, term29108.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term29108, term29108.getClass(), "bufLength", -2147483647);
        setField(term29108, term29108.getClass(), "charBuf", null);
        term29017 = (char[]) newCharArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term29017;
        try {
            callMethod(klass, "consumeToAny", argTypes, term29108, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


