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

public class TokeniserState_readCharRef_1057074589169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term249655;

    public TokeniserState_readCharRef_1057074589169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term249655 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term249725 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term249779 = newInstance(Class.forName("java.io.LineNumberReader"));
        setIntField(term249725, term249725.getClass(), "bufPos", -2147483648);
        setIntField(term249725, term249725.getClass(), "bufSplitPoint", -2147483648);
        setField(term249725, term249725.getClass(), "reader", term249779);
        setField(term249655, term249655.getClass(), "reader", term249725);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TokeniserState");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.parser.Tokeniser");
        argTypes[1] = Class.forName("org.jsoup.parser.TokeniserState");
        Object[] args = new Object[2];
        args[0] = term249655;
        args[1] = null;
        try {
            callMethod(klass, "readCharRef", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


