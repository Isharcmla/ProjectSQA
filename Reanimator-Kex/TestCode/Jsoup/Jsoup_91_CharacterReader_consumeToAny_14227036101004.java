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

public class CharacterReader_consumeToAny_14227036101004 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term361058;
     Object term360602;

    public CharacterReader_consumeToAny_14227036101004() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term361058 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term361058, term361058.getClass(), "bufPos", 671088632);
        setIntField(term361058, term361058.getClass(), "bufSplitPoint", 671088633);
        setIntField(term361058, term361058.getClass(), "bufLength", 671088705);
        setField(term361058, term361058.getClass(), "charBuf", null);
        term360602 = (char[]) newCharArray(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term360602;
        try {
            callMethod(klass, "consumeToAny", argTypes, term361058, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


