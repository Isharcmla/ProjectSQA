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

public class Tokeniser_consumeCharacterReference_2014082919214 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term209782;

    public Tokeniser_consumeCharacterReference_2014082919214() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term209782 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term209852 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term209904 = newInstance(Class.forName("java.io.CharArrayReader"));
        setIntField(term209852, term209852.getClass(), "bufPos", -2147483648);
        setIntField(term209852, term209852.getClass(), "bufLength", -2147483647);
        setIntField(term209852, term209852.getClass(), "bufSplitPoint", -2147483648);
        setIntField(term209852, term209852.getClass(), "readerPos", 0);
        setField(term209852, term209852.getClass(), "reader", term209904);
        setField(term209782, term209782.getClass(), "reader", term209852);
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
            callMethod(klass, "consumeCharacterReference", argTypes, term209782, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


