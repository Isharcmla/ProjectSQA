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

public class TokeniserState_handleDataEndTag_31681323084 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142704;
     Object term142974;

    public TokeniserState_handleDataEndTag_31681323084() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term142866 = new StringBuilder();
        term142704 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term142806 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term142704, term142704.getClass(), "lastStartTag", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term142806, term142806.getClass(), "tagName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term142704, term142704.getClass(), "tagPending", term142806);
        setField(term142704, term142704.getClass(), "dataBuffer", term142866);
        setField(term142704, term142704.getClass(), "charsString", "");
        term142974 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term142974, term142974.getClass(), "pos", -2147483648);
        setIntField(term142974, term142974.getClass(), "length", -2147483648);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TokeniserState");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.jsoup.parser.Tokeniser");
        argTypes[1] = Class.forName("org.jsoup.parser.CharacterReader");
        argTypes[2] = Class.forName("org.jsoup.parser.TokeniserState");
        Object[] args = new Object[3];
        args[0] = term142704;
        args[1] = term142974;
        args[2] = null;
        try {
            callMethod(klass, "handleDataEndTag", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


