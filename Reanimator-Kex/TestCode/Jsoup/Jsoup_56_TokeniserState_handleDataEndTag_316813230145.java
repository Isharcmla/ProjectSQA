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
import java.lang.StringBuilder;

public class TokeniserState_handleDataEndTag_316813230145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term305284;
     Object term305596;

    public TokeniserState_handleDataEndTag_316813230145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term305488 = new StringBuilder();
        term305284 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term305390 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term305284, term305284.getClass(), "lastStartTag", "");
        setField(term305390, term305390.getClass(), "tagName", "</                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ");
        setField(term305284, term305284.getClass(), "tagPending", term305390);
        setField(term305284, term305284.getClass(), "dataBuffer", term305488);
        setField(term305284, term305284.getClass(), "charsString", "");
        setField(term305284, term305284.getClass(), "charsBuilder", null);
        term305596 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term305596, term305596.getClass(), "pos", -2147483648);
        setIntField(term305596, term305596.getClass(), "length", -2147483648);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TokeniserState");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.jsoup.parser.Tokeniser");
        argTypes[1] = Class.forName("org.jsoup.parser.CharacterReader");
        argTypes[2] = Class.forName("org.jsoup.parser.TokeniserState");
        Object[] args = new Object[3];
        args[0] = term305284;
        args[1] = term305596;
        args[2] = null;
        try {
            callMethod(klass, "handleDataEndTag", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


