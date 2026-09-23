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

public class TokeniserState_handleDataEndTag_316813230107 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term174837;
     Object term175171;
     Object term180449;
     Object term180450;

    public TokeniserState_handleDataEndTag_316813230107() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term175041 = new StringBuilder();
        char[] term173719 = (char[]) newCharArray(489);
        StringBuilder term175101 = new StringBuilder();
        ((StringBuilder) term175101).append(term173719);
        term174837 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term174943 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term174837, term174837.getClass(), "lastStartTag", "");
        setField(term174943, term174943.getClass(), "tagName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term174837, term174837.getClass(), "tagPending", term174943);
        setField(term174837, term174837.getClass(), "dataBuffer", term175041);
        setField(term174837, term174837.getClass(), "charsString", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term174837, term174837.getClass(), "charsBuilder", term175101);
        term175171 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term175171, term175171.getClass(), "bufPos", -2147483648);
        setIntField(term175171, term175171.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term175171, term175171.getClass(), "bufLength", -2147483648);
        term180449 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term180449, term180449.getClass(), "charBuf", null);
        setField(term180449, term180449.getClass(), "reader", null);
        setIntField(term180449, term180449.getClass(), "bufLength", -2147483648);
        setIntField(term180449, term180449.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term180449, term180449.getClass(), "bufPos", -2147483648);
        setIntField(term180449, term180449.getClass(), "readerPos", 0);
        setIntField(term180449, term180449.getClass(), "bufMark", 0);
        setField(term180449, term180449.getClass(), "stringCache", null);
        term180450 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term180453 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term180454 = (byte[]) newByteArray(980);
        Object term180455 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term180456 = (byte[]) newByteArray(16);
        Object term180457 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term180450, term180450.getClass(), "reader", null);
        setField(term180450, term180450.getClass(), "errors", null);
        setField(term180450, term180450.getClass(), "state", null);
        setField(term180450, term180450.getClass(), "emitPending", null);
        setBooleanField(term180450, term180450.getClass(), "isEmitPending", false);
        setField(term180450, term180450.getClass(), "charsString", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setByteElement(term180454, 489, (byte) 60);
        setByteElement(term180454, 490, (byte) 47);
        setField(term180453, term180453.getClass(), "value", term180454);
        setByteField(term180453, term180453.getClass(), "coder", (byte) 0);
        setIntField(term180453, term180453.getClass(), "count", 491);
        setField(term180450, term180450.getClass(), "charsBuilder", term180453);
        setField(term180455, term180455.getClass(), "value", term180456);
        setByteField(term180455, term180455.getClass(), "coder", (byte) 0);
        setIntField(term180455, term180455.getClass(), "count", 0);
        setField(term180450, term180450.getClass(), "dataBuffer", term180455);
        setField(term180457, term180457.getClass(), "tagName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term180457, term180457.getClass(), "normalName", null);
        setField(term180457, term180457.getClass(), "pendingAttributeName", null);
        setField(term180457, term180457.getClass(), "pendingAttributeValue", null);
        setField(term180457, term180457.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term180457, term180457.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term180457, term180457.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term180457, term180457.getClass(), "selfClosing", false);
        setField(term180457, term180457.getClass(), "attributes", null);
        setField(term180457, term180457.getClass(), "type", null);
        setField(term180450, term180450.getClass(), "tagPending", term180457);
        setField(term180450, term180450.getClass(), "startPending", null);
        setField(term180450, term180450.getClass(), "endPending", null);
        setField(term180450, term180450.getClass(), "charPending", null);
        setField(term180450, term180450.getClass(), "doctypePending", null);
        setField(term180450, term180450.getClass(), "commentPending", null);
        setField(term180450, term180450.getClass(), "lastStartTag", "");
        setField(term180450, term180450.getClass(), "codepointHolder", null);
        setField(term180450, term180450.getClass(), "multipointHolder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TokeniserState");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.jsoup.parser.Tokeniser");
        argTypes[1] = Class.forName("org.jsoup.parser.CharacterReader");
        argTypes[2] = Class.forName("org.jsoup.parser.TokeniserState");
        Object[] args = new Object[3];
        args[0] = term174837;
        args[1] = term175171;
        args[2] = null;
        callMethod(klass, "handleDataEndTag", argTypes, null, args);
        assertTrue(recursiveEquals(term174837, term180449));
        assertTrue(recursiveEquals(term175171, term180450));
    }

};


