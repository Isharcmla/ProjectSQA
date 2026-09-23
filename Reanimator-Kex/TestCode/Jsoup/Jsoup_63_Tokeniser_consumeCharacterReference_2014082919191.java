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
import java.lang.Object;
import java.lang.Character;

public class Tokeniser_consumeCharacterReference_2014082919191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term192730;
     Object term192852;

    public Tokeniser_consumeCharacterReference_2014082919191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term192730 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term192800 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term192637 = (char[]) newCharArray(0);
        setIntField(term192800, term192800.getClass(), "bufPos", -2147483648);
        setIntField(term192800, term192800.getClass(), "bufLength", -2147483647);
        setIntField(term192800, term192800.getClass(), "bufSplitPoint", -2147483647);
        setField(term192800, term192800.getClass(), "charBuf", term192637);
        setField(term192730, term192730.getClass(), "reader", term192800);
        term192852 = new Character((char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Character");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term192852;
        args[1] = false;
        try {
            callMethod(klass, "consumeCharacterReference", argTypes, term192730, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


