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

public class TokeniserState_handleDataEndTag_31681323057 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term91847;
     Object term92121;
     Object term94423;
     Object term94424;

    public TokeniserState_handleDataEndTag_31681323057() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term92051 = new StringBuilder();
        term91847 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term91953 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term91847, term91847.getClass(), "lastStartTag", "");
        setField(term91953, term91953.getClass(), "tagName", "</                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ");
        setField(term91847, term91847.getClass(), "tagPending", term91953);
        setField(term91847, term91847.getClass(), "dataBuffer", term92051);
        term92121 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term92121, term92121.getClass(), "bufPos", -2147483648);
        setIntField(term92121, term92121.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term92121, term92121.getClass(), "bufLength", -2147483648);
        term94423 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term94423, term94423.getClass(), "charBuf", null);
        setField(term94423, term94423.getClass(), "reader", null);
        setIntField(term94423, term94423.getClass(), "bufLength", -2147483648);
        setIntField(term94423, term94423.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term94423, term94423.getClass(), "bufPos", -2147483648);
        setIntField(term94423, term94423.getClass(), "readerPos", 0);
        setIntField(term94423, term94423.getClass(), "bufMark", 0);
        setField(term94423, term94423.getClass(), "stringCache", null);
        term94424 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term94427 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term94428 = (byte[]) newByteArray(16);
        Object term94429 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term94424, term94424.getClass(), "reader", null);
        setField(term94424, term94424.getClass(), "errors", null);
        setField(term94424, term94424.getClass(), "state", null);
        setField(term94424, term94424.getClass(), "emitPending", null);
        setBooleanField(term94424, term94424.getClass(), "isEmitPending", false);
        setField(term94424, term94424.getClass(), "charsString", "</");
        setField(term94424, term94424.getClass(), "charsBuilder", null);
        setField(term94427, term94427.getClass(), "value", term94428);
        setByteField(term94427, term94427.getClass(), "coder", (byte) 0);
        setIntField(term94427, term94427.getClass(), "count", 0);
        setField(term94424, term94424.getClass(), "dataBuffer", term94427);
        setField(term94429, term94429.getClass(), "tagName", "</                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ");
        setField(term94429, term94429.getClass(), "normalName", null);
        setField(term94429, term94429.getClass(), "pendingAttributeName", null);
        setField(term94429, term94429.getClass(), "pendingAttributeValue", null);
        setField(term94429, term94429.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term94429, term94429.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term94429, term94429.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term94429, term94429.getClass(), "selfClosing", false);
        setField(term94429, term94429.getClass(), "attributes", null);
        setField(term94429, term94429.getClass(), "type", null);
        setField(term94424, term94424.getClass(), "tagPending", term94429);
        setField(term94424, term94424.getClass(), "startPending", null);
        setField(term94424, term94424.getClass(), "endPending", null);
        setField(term94424, term94424.getClass(), "charPending", null);
        setField(term94424, term94424.getClass(), "doctypePending", null);
        setField(term94424, term94424.getClass(), "commentPending", null);
        setField(term94424, term94424.getClass(), "lastStartTag", "");
        setField(term94424, term94424.getClass(), "codepointHolder", null);
        setField(term94424, term94424.getClass(), "multipointHolder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TokeniserState");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.jsoup.parser.Tokeniser");
        argTypes[1] = Class.forName("org.jsoup.parser.CharacterReader");
        argTypes[2] = Class.forName("org.jsoup.parser.TokeniserState");
        Object[] args = new Object[3];
        args[0] = term91847;
        args[1] = term92121;
        args[2] = null;
        callMethod(klass, "handleDataEndTag", argTypes, null, args);
        assertTrue(recursiveEquals(term91847, term94423));
        assertTrue(recursiveEquals(term92121, term94424));
    }

};


