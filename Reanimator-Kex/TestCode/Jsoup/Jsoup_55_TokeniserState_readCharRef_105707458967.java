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
import java.lang.StringBuilder;

public class TokeniserState_readCharRef_105707458967 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term119144;
     Object term120810;

    public TokeniserState_readCharRef_105707458967() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        char[] term118035 = (char[]) newCharArray(489);
        StringBuilder term119312 = new StringBuilder();
        ((StringBuilder) term119312).append(term118035);
        term119144 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term119214 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term119214, term119214.getClass(), "pos", -2147483648);
        setIntField(term119214, term119214.getClass(), "length", -2147483648);
        setField(term119144, term119144.getClass(), "reader", term119214);
        setField(term119144, term119144.getClass(), "charsString", "");
        setField(term119144, term119144.getClass(), "charsBuilder", term119312);
        term120810 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term120811 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term120814 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term120815 = (byte[]) newByteArray(980);
        setField(term120811, term120811.getClass(), "input", null);
        setIntField(term120811, term120811.getClass(), "length", -2147483648);
        setIntField(term120811, term120811.getClass(), "pos", -2147483648);
        setIntField(term120811, term120811.getClass(), "mark", 0);
        setField(term120811, term120811.getClass(), "stringCache", null);
        setField(term120810, term120810.getClass(), "reader", term120811);
        setField(term120810, term120810.getClass(), "errors", null);
        setField(term120810, term120810.getClass(), "state", null);
        setField(term120810, term120810.getClass(), "emitPending", null);
        setBooleanField(term120810, term120810.getClass(), "isEmitPending", false);
        setField(term120810, term120810.getClass(), "charsString", "");
        setByteElement(term120815, 489, (byte) 38);
        setField(term120814, term120814.getClass(), "value", term120815);
        setByteField(term120814, term120814.getClass(), "coder", (byte) 0);
        setIntField(term120814, term120814.getClass(), "count", 490);
        setField(term120810, term120810.getClass(), "charsBuilder", term120814);
        setField(term120810, term120810.getClass(), "dataBuffer", null);
        setField(term120810, term120810.getClass(), "tagPending", null);
        setField(term120810, term120810.getClass(), "startPending", null);
        setField(term120810, term120810.getClass(), "endPending", null);
        setField(term120810, term120810.getClass(), "charPending", null);
        setField(term120810, term120810.getClass(), "doctypePending", null);
        setField(term120810, term120810.getClass(), "commentPending", null);
        setField(term120810, term120810.getClass(), "lastStartTag", null);
        setBooleanField(term120810, term120810.getClass(), "selfClosingFlagAcknowledged", false);
        setField(term120810, term120810.getClass(), "codepointHolder", null);
        setField(term120810, term120810.getClass(), "multipointHolder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TokeniserState");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.parser.Tokeniser");
        argTypes[1] = Class.forName("org.jsoup.parser.TokeniserState");
        Object[] args = new Object[2];
        args[0] = term119144;
        args[1] = null;
        callMethod(klass, "readCharRef", argTypes, null, args);
        assertTrue(recursiveEquals(term119144, term120810));
    }

};


