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

public class TokeniserState_handleDataEndTag_316813230133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term281629;
     Object term281937;

    public TokeniserState_handleDataEndTag_316813230133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term281829 = new StringBuilder();
        term281629 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term281731 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term281629, term281629.getClass(), "lastStartTag", "");
        setField(term281731, term281731.getClass(), "tagName", "</                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               ");
        setField(term281629, term281629.getClass(), "tagPending", term281731);
        setField(term281629, term281629.getClass(), "dataBuffer", term281829);
        setField(term281629, term281629.getClass(), "charsString", "");
        setField(term281629, term281629.getClass(), "charsBuilder", null);
        term281937 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term281937, term281937.getClass(), "pos", -2147483648);
        setIntField(term281937, term281937.getClass(), "length", -2147483648);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TokeniserState");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.jsoup.parser.Tokeniser");
        argTypes[1] = Class.forName("org.jsoup.parser.CharacterReader");
        argTypes[2] = Class.forName("org.jsoup.parser.TokeniserState");
        Object[] args = new Object[3];
        args[0] = term281629;
        args[1] = term281937;
        args[2] = null;
        try {
            callMethod(klass, "handleDataEndTag", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


