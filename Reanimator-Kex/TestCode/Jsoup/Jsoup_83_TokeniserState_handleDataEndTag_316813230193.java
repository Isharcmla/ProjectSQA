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

public class TokeniserState_handleDataEndTag_316813230193 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term283211;
     Object term283523;

    public TokeniserState_handleDataEndTag_316813230193() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term283415 = new StringBuilder();
        term283211 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term283317 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term283211, term283211.getClass(), "lastStartTag", "");
        setField(term283317, term283317.getClass(), "tagName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        ");
        setField(term283211, term283211.getClass(), "tagPending", term283317);
        setField(term283211, term283211.getClass(), "dataBuffer", term283415);
        setField(term283211, term283211.getClass(), "charsString", "");
        setField(term283211, term283211.getClass(), "charsBuilder", null);
        term283523 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term283523, term283523.getClass(), "bufPos", -2147483648);
        setIntField(term283523, term283523.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term283523, term283523.getClass(), "bufLength", -2147483648);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TokeniserState");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.jsoup.parser.Tokeniser");
        argTypes[1] = Class.forName("org.jsoup.parser.CharacterReader");
        argTypes[2] = Class.forName("org.jsoup.parser.TokeniserState");
        Object[] args = new Object[3];
        args[0] = term283211;
        args[1] = term283523;
        args[2] = null;
        try {
            callMethod(klass, "handleDataEndTag", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


