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
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.parser.EqualityUtils.*;

public class TokeniserState_readEndTag_86702548427 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50269;
     Object term50339;
     Object term50361;
     Object term50362;

    public TokeniserState_readEndTag_86702548427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50269 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setField(term50269, term50269.getClass(), "charsString", null);
        term50339 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term50339, term50339.getClass(), "pos", -2147483648);
        setIntField(term50339, term50339.getClass(), "length", -2147483648);
        term50361 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term50361, term50361.getClass(), "input", null);
        setIntField(term50361, term50361.getClass(), "length", -2147483648);
        setIntField(term50361, term50361.getClass(), "pos", -2147483648);
        setIntField(term50361, term50361.getClass(), "mark", 0);
        setField(term50361, term50361.getClass(), "stringCache", null);
        term50362 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setField(term50362, term50362.getClass(), "reader", null);
        setField(term50362, term50362.getClass(), "errors", null);
        setField(term50362, term50362.getClass(), "state", null);
        setField(term50362, term50362.getClass(), "emitPending", null);
        setBooleanField(term50362, term50362.getClass(), "isEmitPending", false);
        setField(term50362, term50362.getClass(), "charsString", "</");
        setField(term50362, term50362.getClass(), "charsBuilder", null);
        setField(term50362, term50362.getClass(), "dataBuffer", null);
        setField(term50362, term50362.getClass(), "tagPending", null);
        setField(term50362, term50362.getClass(), "startPending", null);
        setField(term50362, term50362.getClass(), "endPending", null);
        setField(term50362, term50362.getClass(), "charPending", null);
        setField(term50362, term50362.getClass(), "doctypePending", null);
        setField(term50362, term50362.getClass(), "commentPending", null);
        setField(term50362, term50362.getClass(), "lastStartTag", null);
        setBooleanField(term50362, term50362.getClass(), "selfClosingFlagAcknowledged", false);
        setField(term50362, term50362.getClass(), "codepointHolder", null);
        setField(term50362, term50362.getClass(), "multipointHolder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TokeniserState");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.jsoup.parser.Tokeniser");
        argTypes[1] = Class.forName("org.jsoup.parser.CharacterReader");
        argTypes[2] = Class.forName("org.jsoup.parser.TokeniserState");
        argTypes[3] = Class.forName("org.jsoup.parser.TokeniserState");
        Object[] args = new Object[4];
        args[0] = term50269;
        args[1] = term50339;
        args[2] = null;
        args[3] = null;
        callMethod(klass, "readEndTag", argTypes, null, args);
        assertTrue(recursiveEquals(term50269, term50361));
        assertTrue(recursiveEquals(term50339, term50362));
    }

};


