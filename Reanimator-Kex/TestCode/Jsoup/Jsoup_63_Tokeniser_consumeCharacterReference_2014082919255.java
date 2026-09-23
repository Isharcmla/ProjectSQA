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
import org.jsoup.UncheckedIOException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Character;

public class Tokeniser_consumeCharacterReference_2014082919255 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term226727;
     Object term226887;

    public Tokeniser_consumeCharacterReference_2014082919255() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term226727 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term226797 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term226835 = newInstance(Class.forName("java.io.Reader$1"));
        setIntField(term226797, term226797.getClass(), "bufPos", -2147483648);
        setIntField(term226797, term226797.getClass(), "bufLength", -2147483647);
        setIntField(term226797, term226797.getClass(), "bufSplitPoint", -2147483648);
        setIntField(term226797, term226797.getClass(), "readerPos", 0);
        setField(term226797, term226797.getClass(), "reader", term226835);
        setField(term226727, term226727.getClass(), "reader", term226797);
        term226887 = new Character((char) 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.Character");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term226887;
        args[1] = false;
        try {
            callMethod(klass, "consumeCharacterReference", argTypes, term226727, args);
            assertTrue(false);
        }
        catch (UncheckedIOException e) {
        }

    }

};


