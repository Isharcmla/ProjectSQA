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
import java.lang.StringBuilder;
import java.lang.Object;

public class TokeniserState_readEndTag_86702548439 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term53484;
     Object term53652;
     Object term53693;
     Object term53694;

    public TokeniserState_readEndTag_86702548439() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        char[] term53395 = (char[]) newCharArray(0);
        StringBuilder term53582 = new StringBuilder();
        ((StringBuilder) term53582).append(term53395);
        term53484 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setField(term53484, term53484.getClass(), "charsString", "");
        setField(term53484, term53484.getClass(), "charsBuilder", term53582);
        term53652 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term53652, term53652.getClass(), "pos", -2147483648);
        setIntField(term53652, term53652.getClass(), "length", -2147483648);
        term53693 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term53693, term53693.getClass(), "input", null);
        setIntField(term53693, term53693.getClass(), "length", -2147483648);
        setIntField(term53693, term53693.getClass(), "pos", -2147483648);
        setIntField(term53693, term53693.getClass(), "mark", 0);
        setField(term53693, term53693.getClass(), "stringCache", null);
        term53694 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term53697 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term53698 = (byte[]) newByteArray(16);
        setField(term53694, term53694.getClass(), "reader", null);
        setField(term53694, term53694.getClass(), "errors", null);
        setField(term53694, term53694.getClass(), "state", null);
        setField(term53694, term53694.getClass(), "emitPending", null);
        setBooleanField(term53694, term53694.getClass(), "isEmitPending", false);
        setField(term53694, term53694.getClass(), "charsString", "");
        setByteElement(term53698, 0, (byte) 60);
        setByteElement(term53698, 1, (byte) 47);
        setField(term53697, term53697.getClass(), "value", term53698);
        setByteField(term53697, term53697.getClass(), "coder", (byte) 0);
        setIntField(term53697, term53697.getClass(), "count", 2);
        setField(term53694, term53694.getClass(), "charsBuilder", term53697);
        setField(term53694, term53694.getClass(), "dataBuffer", null);
        setField(term53694, term53694.getClass(), "tagPending", null);
        setField(term53694, term53694.getClass(), "startPending", null);
        setField(term53694, term53694.getClass(), "endPending", null);
        setField(term53694, term53694.getClass(), "charPending", null);
        setField(term53694, term53694.getClass(), "doctypePending", null);
        setField(term53694, term53694.getClass(), "commentPending", null);
        setField(term53694, term53694.getClass(), "lastStartTag", null);
        setBooleanField(term53694, term53694.getClass(), "selfClosingFlagAcknowledged", false);
        setField(term53694, term53694.getClass(), "codepointHolder", null);
        setField(term53694, term53694.getClass(), "multipointHolder", null);
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
        args[0] = term53484;
        args[1] = term53652;
        args[2] = null;
        args[3] = null;
        callMethod(klass, "readEndTag", argTypes, null, args);
        assertTrue(recursiveEquals(term53484, term53693));
        assertTrue(recursiveEquals(term53652, term53694));
    }

};


