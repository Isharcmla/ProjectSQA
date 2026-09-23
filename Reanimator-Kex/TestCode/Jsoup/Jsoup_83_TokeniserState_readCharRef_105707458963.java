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

public class TokeniserState_readCharRef_105707458963 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term96718;
     Object term96817;

    public TokeniserState_readCharRef_105707458963() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term96718 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term96788 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term96788, term96788.getClass(), "bufPos", -2147483648);
        setIntField(term96788, term96788.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term96788, term96788.getClass(), "bufLength", -2147483648);
        setField(term96718, term96718.getClass(), "reader", term96788);
        term96817 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term96818 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term96818, term96818.getClass(), "charBuf", null);
        setField(term96818, term96818.getClass(), "reader", null);
        setIntField(term96818, term96818.getClass(), "bufLength", -2147483648);
        setIntField(term96818, term96818.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term96818, term96818.getClass(), "bufPos", -2147483648);
        setIntField(term96818, term96818.getClass(), "readerPos", 0);
        setIntField(term96818, term96818.getClass(), "bufMark", 0);
        setField(term96818, term96818.getClass(), "stringCache", null);
        setField(term96817, term96817.getClass(), "reader", term96818);
        setField(term96817, term96817.getClass(), "errors", null);
        setField(term96817, term96817.getClass(), "state", null);
        setField(term96817, term96817.getClass(), "emitPending", null);
        setBooleanField(term96817, term96817.getClass(), "isEmitPending", false);
        setField(term96817, term96817.getClass(), "charsString", "&");
        setField(term96817, term96817.getClass(), "charsBuilder", null);
        setField(term96817, term96817.getClass(), "dataBuffer", null);
        setField(term96817, term96817.getClass(), "tagPending", null);
        setField(term96817, term96817.getClass(), "startPending", null);
        setField(term96817, term96817.getClass(), "endPending", null);
        setField(term96817, term96817.getClass(), "charPending", null);
        setField(term96817, term96817.getClass(), "doctypePending", null);
        setField(term96817, term96817.getClass(), "commentPending", null);
        setField(term96817, term96817.getClass(), "lastStartTag", null);
        setField(term96817, term96817.getClass(), "codepointHolder", null);
        setField(term96817, term96817.getClass(), "multipointHolder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TokeniserState");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.parser.Tokeniser");
        argTypes[1] = Class.forName("org.jsoup.parser.TokeniserState");
        Object[] args = new Object[2];
        args[0] = term96718;
        args[1] = null;
        callMethod(klass, "readCharRef", argTypes, null, args);
        assertTrue(recursiveEquals(term96718, term96817));
    }

};


