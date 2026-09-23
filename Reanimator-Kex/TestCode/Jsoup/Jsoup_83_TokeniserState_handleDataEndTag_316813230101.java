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

public class TokeniserState_handleDataEndTag_316813230101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term158788;
     Object term159062;
     Object term162119;
     Object term162120;

    public TokeniserState_handleDataEndTag_316813230101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term158992 = new StringBuilder();
        term158788 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term158894 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term158788, term158788.getClass(), "lastStartTag", "");
        setField(term158894, term158894.getClass(), "tagName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
        setField(term158788, term158788.getClass(), "tagPending", term158894);
        setField(term158788, term158788.getClass(), "dataBuffer", term158992);
        setField(term158788, term158788.getClass(), "charsString", null);
        term159062 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term159062, term159062.getClass(), "bufPos", -2147483648);
        setIntField(term159062, term159062.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term159062, term159062.getClass(), "bufLength", -2147483648);
        term162119 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term162119, term162119.getClass(), "charBuf", null);
        setField(term162119, term162119.getClass(), "reader", null);
        setIntField(term162119, term162119.getClass(), "bufLength", -2147483648);
        setIntField(term162119, term162119.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term162119, term162119.getClass(), "bufPos", -2147483648);
        setIntField(term162119, term162119.getClass(), "readerPos", 0);
        setIntField(term162119, term162119.getClass(), "bufMark", 0);
        setField(term162119, term162119.getClass(), "stringCache", null);
        term162120 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term162123 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term162124 = (byte[]) newByteArray(16);
        Object term162125 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term162120, term162120.getClass(), "reader", null);
        setField(term162120, term162120.getClass(), "errors", null);
        setField(term162120, term162120.getClass(), "state", null);
        setField(term162120, term162120.getClass(), "emitPending", null);
        setBooleanField(term162120, term162120.getClass(), "isEmitPending", false);
        setField(term162120, term162120.getClass(), "charsString", "</");
        setField(term162120, term162120.getClass(), "charsBuilder", null);
        setField(term162123, term162123.getClass(), "value", term162124);
        setByteField(term162123, term162123.getClass(), "coder", (byte) 0);
        setIntField(term162123, term162123.getClass(), "count", 0);
        setField(term162120, term162120.getClass(), "dataBuffer", term162123);
        setField(term162125, term162125.getClass(), "tagName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
        setField(term162125, term162125.getClass(), "normalName", null);
        setField(term162125, term162125.getClass(), "pendingAttributeName", null);
        setField(term162125, term162125.getClass(), "pendingAttributeValue", null);
        setField(term162125, term162125.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term162125, term162125.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term162125, term162125.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term162125, term162125.getClass(), "selfClosing", false);
        setField(term162125, term162125.getClass(), "attributes", null);
        setField(term162125, term162125.getClass(), "type", null);
        setField(term162120, term162120.getClass(), "tagPending", term162125);
        setField(term162120, term162120.getClass(), "startPending", null);
        setField(term162120, term162120.getClass(), "endPending", null);
        setField(term162120, term162120.getClass(), "charPending", null);
        setField(term162120, term162120.getClass(), "doctypePending", null);
        setField(term162120, term162120.getClass(), "commentPending", null);
        setField(term162120, term162120.getClass(), "lastStartTag", "");
        setField(term162120, term162120.getClass(), "codepointHolder", null);
        setField(term162120, term162120.getClass(), "multipointHolder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TokeniserState");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.jsoup.parser.Tokeniser");
        argTypes[1] = Class.forName("org.jsoup.parser.CharacterReader");
        argTypes[2] = Class.forName("org.jsoup.parser.TokeniserState");
        Object[] args = new Object[3];
        args[0] = term158788;
        args[1] = term159062;
        args[2] = null;
        callMethod(klass, "handleDataEndTag", argTypes, null, args);
        assertTrue(recursiveEquals(term158788, term162119));
        assertTrue(recursiveEquals(term159062, term162120));
    }

};


