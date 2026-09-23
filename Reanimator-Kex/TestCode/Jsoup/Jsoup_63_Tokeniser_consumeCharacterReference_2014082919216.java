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
import java.lang.IllegalArgumentException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Character;

public class Tokeniser_consumeCharacterReference_2014082919216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term210008;
     Object term210186;

    public Tokeniser_consumeCharacterReference_2014082919216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term210008 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term210078 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term210134 = newInstance(Class.forName("java.io.InputStreamReader"));
        setIntField(term210078, term210078.getClass(), "bufPos", -2147483648);
        setIntField(term210078, term210078.getClass(), "bufLength", -2147483647);
        setIntField(term210078, term210078.getClass(), "bufSplitPoint", -2147483648);
        setIntField(term210078, term210078.getClass(), "readerPos", 0);
        setField(term210078, term210078.getClass(), "reader", term210134);
        setField(term210008, term210008.getClass(), "reader", term210078);
        term210186 = new Character((char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Character");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term210186;
        args[1] = false;
        try {
            callMethod(klass, "consumeCharacterReference", argTypes, term210008, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


