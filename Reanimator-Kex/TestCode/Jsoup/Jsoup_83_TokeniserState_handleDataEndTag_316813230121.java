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

public class TokeniserState_handleDataEndTag_316813230121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term200771;
     Object term201079;

    public TokeniserState_handleDataEndTag_316813230121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term200971 = new StringBuilder();
        term200771 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term200873 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term200771, term200771.getClass(), "lastStartTag", "");
        setField(term200873, term200873.getClass(), "tagName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term200771, term200771.getClass(), "tagPending", term200873);
        setField(term200771, term200771.getClass(), "dataBuffer", term200971);
        setField(term200771, term200771.getClass(), "charsString", "");
        term201079 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term201079, term201079.getClass(), "bufPos", -2147483648);
        setIntField(term201079, term201079.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term201079, term201079.getClass(), "bufLength", -2147483648);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TokeniserState");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.jsoup.parser.Tokeniser");
        argTypes[1] = Class.forName("org.jsoup.parser.CharacterReader");
        argTypes[2] = Class.forName("org.jsoup.parser.TokeniserState");
        Object[] args = new Object[3];
        args[0] = term200771;
        args[1] = term201079;
        args[2] = null;
        try {
            callMethod(klass, "handleDataEndTag", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


