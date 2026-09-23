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

public class TokeniserState_handleDataEndTag_316813230191 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term277275;
     Object term277583;

    public TokeniserState_handleDataEndTag_316813230191() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term277475 = new StringBuilder();
        term277275 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term277377 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term277275, term277275.getClass(), "lastStartTag", "");
        setField(term277377, term277377.getClass(), "tagName", "</                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
        setField(term277275, term277275.getClass(), "tagPending", term277377);
        setField(term277275, term277275.getClass(), "dataBuffer", term277475);
        setField(term277275, term277275.getClass(), "charsString", "");
        setField(term277275, term277275.getClass(), "charsBuilder", null);
        term277583 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term277583, term277583.getClass(), "bufPos", -2147483648);
        setIntField(term277583, term277583.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term277583, term277583.getClass(), "bufLength", -2147483648);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TokeniserState");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.jsoup.parser.Tokeniser");
        argTypes[1] = Class.forName("org.jsoup.parser.CharacterReader");
        argTypes[2] = Class.forName("org.jsoup.parser.TokeniserState");
        Object[] args = new Object[3];
        args[0] = term277275;
        args[1] = term277583;
        args[2] = null;
        try {
            callMethod(klass, "handleDataEndTag", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


