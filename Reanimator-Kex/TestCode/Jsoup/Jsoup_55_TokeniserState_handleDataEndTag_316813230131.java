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

public class TokeniserState_handleDataEndTag_316813230131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term274595;
     Object term274907;

    public TokeniserState_handleDataEndTag_316813230131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term274799 = new StringBuilder();
        term274595 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term274701 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term274595, term274595.getClass(), "lastStartTag", "");
        setField(term274701, term274701.getClass(), "tagName", "</                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ");
        setField(term274595, term274595.getClass(), "tagPending", term274701);
        setField(term274595, term274595.getClass(), "dataBuffer", term274799);
        setField(term274595, term274595.getClass(), "charsString", "");
        setField(term274595, term274595.getClass(), "charsBuilder", null);
        term274907 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term274907, term274907.getClass(), "pos", -2147483648);
        setIntField(term274907, term274907.getClass(), "length", -2147483648);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TokeniserState");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.jsoup.parser.Tokeniser");
        argTypes[1] = Class.forName("org.jsoup.parser.CharacterReader");
        argTypes[2] = Class.forName("org.jsoup.parser.TokeniserState");
        Object[] args = new Object[3];
        args[0] = term274595;
        args[1] = term274907;
        args[2] = null;
        try {
            callMethod(klass, "handleDataEndTag", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


