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

public class TokeniserState_readCharRef_1057074589219 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term363559;
     Object term381776;

    public TokeniserState_readCharRef_1057074589219() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        char[] term362448 = (char[]) newCharArray(489);
        StringBuilder term363727 = new StringBuilder();
        ((StringBuilder) term363727).append(term362448);
        term363559 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term363629 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term363629, term363629.getClass(), "bufPos", -2147483648);
        setIntField(term363629, term363629.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term363629, term363629.getClass(), "bufLength", -2147483648);
        setField(term363559, term363559.getClass(), "reader", term363629);
        setField(term363559, term363559.getClass(), "charsString", "");
        setField(term363559, term363559.getClass(), "charsBuilder", term363727);
        term381776 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term381777 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term381780 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term381781 = (byte[]) newByteArray(980);
        setField(term381777, term381777.getClass(), "charBuf", null);
        setField(term381777, term381777.getClass(), "reader", null);
        setIntField(term381777, term381777.getClass(), "bufLength", -2147483648);
        setIntField(term381777, term381777.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term381777, term381777.getClass(), "bufPos", -2147483648);
        setIntField(term381777, term381777.getClass(), "readerPos", 0);
        setIntField(term381777, term381777.getClass(), "bufMark", 0);
        setField(term381777, term381777.getClass(), "stringCache", null);
        setField(term381776, term381776.getClass(), "reader", term381777);
        setField(term381776, term381776.getClass(), "errors", null);
        setField(term381776, term381776.getClass(), "state", null);
        setField(term381776, term381776.getClass(), "emitPending", null);
        setBooleanField(term381776, term381776.getClass(), "isEmitPending", false);
        setField(term381776, term381776.getClass(), "charsString", "");
        setByteElement(term381781, 489, (byte) 38);
        setField(term381780, term381780.getClass(), "value", term381781);
        setByteField(term381780, term381780.getClass(), "coder", (byte) 0);
        setIntField(term381780, term381780.getClass(), "count", 490);
        setField(term381776, term381776.getClass(), "charsBuilder", term381780);
        setField(term381776, term381776.getClass(), "dataBuffer", null);
        setField(term381776, term381776.getClass(), "tagPending", null);
        setField(term381776, term381776.getClass(), "startPending", null);
        setField(term381776, term381776.getClass(), "endPending", null);
        setField(term381776, term381776.getClass(), "charPending", null);
        setField(term381776, term381776.getClass(), "doctypePending", null);
        setField(term381776, term381776.getClass(), "commentPending", null);
        setField(term381776, term381776.getClass(), "lastStartTag", null);
        setField(term381776, term381776.getClass(), "codepointHolder", null);
        setField(term381776, term381776.getClass(), "multipointHolder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TokeniserState");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.parser.Tokeniser");
        argTypes[1] = Class.forName("org.jsoup.parser.TokeniserState");
        Object[] args = new Object[2];
        args[0] = term363559;
        args[1] = null;
        callMethod(klass, "readCharRef", argTypes, null, args);
        assertTrue(recursiveEquals(term363559, term381776));
    }

};


