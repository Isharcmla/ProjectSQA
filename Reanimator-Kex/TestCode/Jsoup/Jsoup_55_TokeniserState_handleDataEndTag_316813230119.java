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

public class TokeniserState_handleDataEndTag_316813230119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term230529;
     Object term230803;

    public TokeniserState_handleDataEndTag_316813230119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term230695 = new StringBuilder();
        term230529 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term230635 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term230529, term230529.getClass(), "lastStartTag", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term230635, term230635.getClass(), "tagName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term230529, term230529.getClass(), "tagPending", term230635);
        setField(term230529, term230529.getClass(), "dataBuffer", term230695);
        setField(term230529, term230529.getClass(), "charsString", "");
        term230803 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term230803, term230803.getClass(), "pos", -2147483648);
        setIntField(term230803, term230803.getClass(), "length", -2147483648);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TokeniserState");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.jsoup.parser.Tokeniser");
        argTypes[1] = Class.forName("org.jsoup.parser.CharacterReader");
        argTypes[2] = Class.forName("org.jsoup.parser.TokeniserState");
        Object[] args = new Object[3];
        args[0] = term230529;
        args[1] = term230803;
        args[2] = null;
        try {
            callMethod(klass, "handleDataEndTag", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


