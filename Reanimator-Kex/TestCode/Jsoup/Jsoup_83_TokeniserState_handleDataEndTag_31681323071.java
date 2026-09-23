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

public class TokeniserState_handleDataEndTag_31681323071 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term101633;
     Object term101805;

    public TokeniserState_handleDataEndTag_31681323071() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term101633 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term101735 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term101633, term101633.getClass(), "lastStartTag", "");
        setField(term101633, term101633.getClass(), "tagPending", term101735);
        term101805 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term101805, term101805.getClass(), "bufPos", -2147483648);
        setIntField(term101805, term101805.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term101805, term101805.getClass(), "bufLength", -2147483648);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TokeniserState");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.jsoup.parser.Tokeniser");
        argTypes[1] = Class.forName("org.jsoup.parser.CharacterReader");
        argTypes[2] = Class.forName("org.jsoup.parser.TokeniserState");
        Object[] args = new Object[3];
        args[0] = term101633;
        args[1] = term101805;
        args[2] = null;
        try {
            callMethod(klass, "handleDataEndTag", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


