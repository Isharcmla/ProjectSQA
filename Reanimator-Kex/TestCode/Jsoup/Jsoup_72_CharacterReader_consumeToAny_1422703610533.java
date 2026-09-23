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

public class CharacterReader_consumeToAny_1422703610533 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1145005;
     Object term1144858;

    public CharacterReader_consumeToAny_1422703610533() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1145005 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        term1144858 = (char[]) newCharArray(0);
        setIntField(term1145005, term1145005.getClass(), "bufPos", -1002651128);
        setIntField(term1145005, term1145005.getClass(), "bufSplitPoint", -1002651127);
        setIntField(term1145005, term1145005.getClass(), "bufLength", -1002651121);
        setField(term1145005, term1145005.getClass(), "charBuf", term1144858);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(char.class, 0).getClass();
        Object[] args = new Object[1];
        args[0] = term1144858;
        try {
            callMethod(klass, "consumeToAny", argTypes, term1145005, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


