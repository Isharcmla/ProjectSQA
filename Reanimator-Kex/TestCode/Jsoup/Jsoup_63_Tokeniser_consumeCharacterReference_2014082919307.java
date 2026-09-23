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

public class Tokeniser_consumeCharacterReference_2014082919307 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term268545;

    public Tokeniser_consumeCharacterReference_2014082919307() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term268545 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term268615 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term268669 = newInstance(Class.forName("java.io.LineNumberReader"));
        setIntField(term268615, term268615.getClass(), "bufPos", -2147483648);
        setIntField(term268615, term268615.getClass(), "bufLength", -2147483647);
        setIntField(term268615, term268615.getClass(), "bufSplitPoint", -2147483648);
        setIntField(term268615, term268615.getClass(), "readerPos", 0);
        setField(term268615, term268615.getClass(), "reader", term268669);
        setField(term268545, term268545.getClass(), "reader", term268615);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Character");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = false;
        try {
            callMethod(klass, "consumeCharacterReference", argTypes, term268545, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


