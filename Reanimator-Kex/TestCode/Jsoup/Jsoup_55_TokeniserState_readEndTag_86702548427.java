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
     Object term50130;
     Object term50200;
     Object term50222;
     Object term50223;

    public TokeniserState_readEndTag_86702548427() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50130 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setField(term50130, term50130.getClass(), "charsString", null);
        term50200 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term50200, term50200.getClass(), "pos", -2147483648);
        setIntField(term50200, term50200.getClass(), "length", -2147483648);
        term50222 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term50222, term50222.getClass(), "input", null);
        setIntField(term50222, term50222.getClass(), "length", -2147483648);
        setIntField(term50222, term50222.getClass(), "pos", -2147483648);
        setIntField(term50222, term50222.getClass(), "mark", 0);
        setField(term50222, term50222.getClass(), "stringCache", null);
        term50223 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setField(term50223, term50223.getClass(), "reader", null);
        setField(term50223, term50223.getClass(), "errors", null);
        setField(term50223, term50223.getClass(), "state", null);
        setField(term50223, term50223.getClass(), "emitPending", null);
        setBooleanField(term50223, term50223.getClass(), "isEmitPending", false);
        setField(term50223, term50223.getClass(), "charsString", "</");
        setField(term50223, term50223.getClass(), "charsBuilder", null);
        setField(term50223, term50223.getClass(), "dataBuffer", null);
        setField(term50223, term50223.getClass(), "tagPending", null);
        setField(term50223, term50223.getClass(), "startPending", null);
        setField(term50223, term50223.getClass(), "endPending", null);
        setField(term50223, term50223.getClass(), "charPending", null);
        setField(term50223, term50223.getClass(), "doctypePending", null);
        setField(term50223, term50223.getClass(), "commentPending", null);
        setField(term50223, term50223.getClass(), "lastStartTag", null);
        setBooleanField(term50223, term50223.getClass(), "selfClosingFlagAcknowledged", false);
        setField(term50223, term50223.getClass(), "codepointHolder", null);
        setField(term50223, term50223.getClass(), "multipointHolder", null);
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
        args[0] = term50130;
        args[1] = term50200;
        args[2] = null;
        args[3] = null;
        callMethod(klass, "readEndTag", argTypes, null, args);
        assertTrue(recursiveEquals(term50130, term50222));
        assertTrue(recursiveEquals(term50200, term50223));
    }

};


