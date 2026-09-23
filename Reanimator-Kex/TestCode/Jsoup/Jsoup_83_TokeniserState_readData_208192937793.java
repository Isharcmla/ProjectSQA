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
import java.lang.String;

public class TokeniserState_readData_208192937793 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138398;
     Object term138468;
     Object term138537;
     Object term138538;

    public TokeniserState_readData_208192937793() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term138398 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        term138468 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term138468, term138468.getClass(), "bufPos", -2147483648);
        setIntField(term138468, term138468.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term138468, term138468.getClass(), "bufLength", -2147483648);
        term138537 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term138537, term138537.getClass(), "charBuf", null);
        setField(term138537, term138537.getClass(), "reader", null);
        setIntField(term138537, term138537.getClass(), "bufLength", -2147483648);
        setIntField(term138537, term138537.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term138537, term138537.getClass(), "bufPos", -2147483648);
        setIntField(term138537, term138537.getClass(), "readerPos", 0);
        setIntField(term138537, term138537.getClass(), "bufMark", 0);
        setField(term138537, term138537.getClass(), "stringCache", null);
        Class<? extends Object> term138544 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term138543 = ((Class) term138544).getDeclaredField((String) "EOF");
        ((Field) term138543).setAccessible(true);
        Object enum342 = ((Field) term138543).get((Object) null);
        term138538 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term138539 = newInstance(Class.forName("org.jsoup.parser.Token$EOF"));
        setField(term138538, term138538.getClass(), "reader", null);
        setField(term138538, term138538.getClass(), "errors", null);
        setField(term138538, term138538.getClass(), "state", null);
        setField(term138539, term138539.getClass(), "type", enum342);
        setField(term138538, term138538.getClass(), "emitPending", term138539);
        setBooleanField(term138538, term138538.getClass(), "isEmitPending", true);
        setField(term138538, term138538.getClass(), "charsString", null);
        setField(term138538, term138538.getClass(), "charsBuilder", null);
        setField(term138538, term138538.getClass(), "dataBuffer", null);
        setField(term138538, term138538.getClass(), "tagPending", null);
        setField(term138538, term138538.getClass(), "startPending", null);
        setField(term138538, term138538.getClass(), "endPending", null);
        setField(term138538, term138538.getClass(), "charPending", null);
        setField(term138538, term138538.getClass(), "doctypePending", null);
        setField(term138538, term138538.getClass(), "commentPending", null);
        setField(term138538, term138538.getClass(), "lastStartTag", null);
        setField(term138538, term138538.getClass(), "codepointHolder", null);
        setField(term138538, term138538.getClass(), "multipointHolder", null);
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
        args[0] = term138398;
        args[1] = term138468;
        args[2] = null;
        args[3] = null;
        callMethod(klass, "readData", argTypes, null, args);
        assertTrue(recursiveEquals(term138398, term138537));
        assertTrue(recursiveEquals(term138468, term138538));
    }

};


