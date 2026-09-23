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

public class Tokeniser_consumeCharacterReference_2014082919169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term171662;
     Object term171784;

    public Tokeniser_consumeCharacterReference_2014082919169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term171662 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term171732 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term171732, term171732.getClass(), "bufPos", -2147483648);
        setIntField(term171732, term171732.getClass(), "bufLength", -2147483647);
        setIntField(term171732, term171732.getClass(), "bufSplitPoint", -2147483648);
        setField(term171662, term171662.getClass(), "reader", term171732);
        term171784 = new Character((char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Character");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term171784;
        args[1] = false;
        try {
            callMethod(klass, "consumeCharacterReference", argTypes, term171662, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


