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

public class Tokeniser_consumeCharacterReference_2014082919258 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term227786;
     Object term227952;

    public Tokeniser_consumeCharacterReference_2014082919258() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term227786 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term227856 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term227900 = newInstance(Class.forName("java.io.PipedReader"));
        setIntField(term227856, term227856.getClass(), "bufPos", -2147483648);
        setIntField(term227856, term227856.getClass(), "bufLength", -2147483647);
        setIntField(term227856, term227856.getClass(), "bufSplitPoint", -2147483648);
        setIntField(term227856, term227856.getClass(), "readerPos", 0);
        setField(term227856, term227856.getClass(), "reader", term227900);
        setField(term227786, term227786.getClass(), "reader", term227856);
        term227952 = new Character((char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Character");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term227952;
        args[1] = false;
        try {
            callMethod(klass, "consumeCharacterReference", argTypes, term227786, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


