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
import java.lang.Object;
import java.lang.Character;

public class Tokeniser_consumeCharacterReference_201408291997 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142033;
     Object term142155;

    public Tokeniser_consumeCharacterReference_201408291997() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term142033 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term142103 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term142103, term142103.getClass(), "bufPos", -2147483648);
        setIntField(term142103, term142103.getClass(), "bufLength", -2147483647);
        setField(term142033, term142033.getClass(), "reader", term142103);
        term142155 = new Character((char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Character");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term142155;
        args[1] = false;
        try {
            callMethod(klass, "consumeCharacterReference", argTypes, term142033, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


