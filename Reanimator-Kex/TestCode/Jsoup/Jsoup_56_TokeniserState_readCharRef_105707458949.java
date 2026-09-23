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
import java.lang.Object;

public class TokeniserState_readCharRef_105707458949 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92512;
     Object term92607;

    public TokeniserState_readCharRef_105707458949() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term92512 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term92582 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term92582, term92582.getClass(), "pos", -2147483648);
        setIntField(term92582, term92582.getClass(), "length", -2147483648);
        setField(term92512, term92512.getClass(), "reader", term92582);
        term92607 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term92608 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term92608, term92608.getClass(), "input", null);
        setIntField(term92608, term92608.getClass(), "length", -2147483648);
        setIntField(term92608, term92608.getClass(), "pos", -2147483648);
        setIntField(term92608, term92608.getClass(), "mark", 0);
        setField(term92608, term92608.getClass(), "stringCache", null);
        setField(term92607, term92607.getClass(), "reader", term92608);
        setField(term92607, term92607.getClass(), "errors", null);
        setField(term92607, term92607.getClass(), "state", null);
        setField(term92607, term92607.getClass(), "emitPending", null);
        setBooleanField(term92607, term92607.getClass(), "isEmitPending", false);
        setField(term92607, term92607.getClass(), "charsString", "&");
        setField(term92607, term92607.getClass(), "charsBuilder", null);
        setField(term92607, term92607.getClass(), "dataBuffer", null);
        setField(term92607, term92607.getClass(), "tagPending", null);
        setField(term92607, term92607.getClass(), "startPending", null);
        setField(term92607, term92607.getClass(), "endPending", null);
        setField(term92607, term92607.getClass(), "charPending", null);
        setField(term92607, term92607.getClass(), "doctypePending", null);
        setField(term92607, term92607.getClass(), "commentPending", null);
        setField(term92607, term92607.getClass(), "lastStartTag", null);
        setBooleanField(term92607, term92607.getClass(), "selfClosingFlagAcknowledged", false);
        setField(term92607, term92607.getClass(), "codepointHolder", null);
        setField(term92607, term92607.getClass(), "multipointHolder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TokeniserState");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.parser.Tokeniser");
        argTypes[1] = Class.forName("org.jsoup.parser.TokeniserState");
        Object[] args = new Object[2];
        args[0] = term92512;
        args[1] = null;
        callMethod(klass, "readCharRef", argTypes, null, args);
        assertTrue(recursiveEquals(term92512, term92607));
    }

};


