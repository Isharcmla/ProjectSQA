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

public class CharacterReader_consumeToAny_14227036101142 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term457869;
     Object term456858;

    public CharacterReader_consumeToAny_14227036101142() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term457869 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term457869, term457869.getClass(), "bufPos", -1610612743);
        setIntField(term457869, term457869.getClass(), "bufSplitPoint", -1610612742);
        setIntField(term457869, term457869.getClass(), "bufLength", -1610612559);
        setField(term457869, term457869.getClass(), "charBuf", null);
        term456858 = (char[]) newCharArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term456858;
        try {
            callMethod(klass, "consumeToAny", argTypes, term457869, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


