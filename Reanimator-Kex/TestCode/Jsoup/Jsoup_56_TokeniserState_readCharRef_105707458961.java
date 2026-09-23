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

public class TokeniserState_readCharRef_105707458961 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term123011;

    public TokeniserState_readCharRef_105707458961() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term123011 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term123081 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term123081, term123081.getClass(), "pos", -2147483648);
        setIntField(term123081, term123081.getClass(), "length", -2147483648);
        setField(term123011, term123011.getClass(), "reader", term123081);
        setField(term123011, term123011.getClass(), "charsString", "");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TokeniserState");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.parser.Tokeniser");
        argTypes[1] = Class.forName("org.jsoup.parser.TokeniserState");
        Object[] args = new Object[2];
        args[0] = term123011;
        args[1] = null;
        try {
            callMethod(klass, "readCharRef", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


