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

public class TokeniserState_handleDataEndTag_316813230216 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term357440;
     Object term357650;

    public TokeniserState_handleDataEndTag_316813230216() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term357440 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term357542 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term357440, term357440.getClass(), "lastStartTag", "");
        setField(term357542, term357542.getClass(), "tagName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term357440, term357440.getClass(), "tagPending", term357542);
        setField(term357440, term357440.getClass(), "dataBuffer", null);
        term357650 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term357650, term357650.getClass(), "bufPos", -2147483648);
        setIntField(term357650, term357650.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term357650, term357650.getClass(), "bufLength", -2147483648);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TokeniserState");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.jsoup.parser.Tokeniser");
        argTypes[1] = Class.forName("org.jsoup.parser.CharacterReader");
        argTypes[2] = Class.forName("org.jsoup.parser.TokeniserState");
        Object[] args = new Object[3];
        args[0] = term357440;
        args[1] = term357650;
        args[2] = null;
        try {
            callMethod(klass, "handleDataEndTag", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


