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

public class TokeniserState_handleDataEndTag_31681323078 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term122630;
     Object term122942;

    public TokeniserState_handleDataEndTag_31681323078() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term122834 = new StringBuilder();
        term122630 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term122736 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term122630, term122630.getClass(), "lastStartTag", "");
        setField(term122736, term122736.getClass(), "tagName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term122630, term122630.getClass(), "tagPending", term122736);
        setField(term122630, term122630.getClass(), "dataBuffer", term122834);
        setField(term122630, term122630.getClass(), "charsString", "");
        term122942 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term122942, term122942.getClass(), "bufPos", -2147483648);
        setIntField(term122942, term122942.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term122942, term122942.getClass(), "bufLength", -2147483648);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TokeniserState");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.jsoup.parser.Tokeniser");
        argTypes[1] = Class.forName("org.jsoup.parser.CharacterReader");
        argTypes[2] = Class.forName("org.jsoup.parser.TokeniserState");
        Object[] args = new Object[3];
        args[0] = term122630;
        args[1] = term122942;
        args[2] = null;
        try {
            callMethod(klass, "handleDataEndTag", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


