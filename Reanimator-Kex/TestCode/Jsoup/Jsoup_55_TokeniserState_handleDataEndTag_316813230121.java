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

public class TokeniserState_handleDataEndTag_316813230121 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term240501;
     Object term240831;
     Object term245090;
     Object term245091;

    public TokeniserState_handleDataEndTag_316813230121() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term240701 = new StringBuilder();
        char[] term239395 = (char[]) newCharArray(489);
        StringBuilder term240761 = new StringBuilder();
        ((StringBuilder) term240761).append(term239395);
        term240501 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term240603 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term240501, term240501.getClass(), "lastStartTag", "");
        setField(term240603, term240603.getClass(), "tagName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        setField(term240501, term240501.getClass(), "tagPending", term240603);
        setField(term240501, term240501.getClass(), "dataBuffer", term240701);
        setField(term240501, term240501.getClass(), "charsString", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        setField(term240501, term240501.getClass(), "charsBuilder", term240761);
        term240831 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term240831, term240831.getClass(), "pos", -2147483648);
        setIntField(term240831, term240831.getClass(), "length", -2147483648);
        term245090 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term245090, term245090.getClass(), "input", null);
        setIntField(term245090, term245090.getClass(), "length", -2147483648);
        setIntField(term245090, term245090.getClass(), "pos", -2147483648);
        setIntField(term245090, term245090.getClass(), "mark", 0);
        setField(term245090, term245090.getClass(), "stringCache", null);
        term245091 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term245094 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term245095 = (byte[]) newByteArray(980);
        Object term245096 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term245097 = (byte[]) newByteArray(16);
        Object term245098 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term245091, term245091.getClass(), "reader", null);
        setField(term245091, term245091.getClass(), "errors", null);
        setField(term245091, term245091.getClass(), "state", null);
        setField(term245091, term245091.getClass(), "emitPending", null);
        setBooleanField(term245091, term245091.getClass(), "isEmitPending", false);
        setField(term245091, term245091.getClass(), "charsString", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        setByteElement(term245095, 489, (byte) 60);
        setByteElement(term245095, 490, (byte) 47);
        setField(term245094, term245094.getClass(), "value", term245095);
        setByteField(term245094, term245094.getClass(), "coder", (byte) 0);
        setIntField(term245094, term245094.getClass(), "count", 491);
        setField(term245091, term245091.getClass(), "charsBuilder", term245094);
        setField(term245096, term245096.getClass(), "value", term245097);
        setByteField(term245096, term245096.getClass(), "coder", (byte) 0);
        setIntField(term245096, term245096.getClass(), "count", 0);
        setField(term245091, term245091.getClass(), "dataBuffer", term245096);
        setField(term245098, term245098.getClass(), "tagName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        setField(term245098, term245098.getClass(), "normalName", null);
        setField(term245098, term245098.getClass(), "pendingAttributeName", null);
        setField(term245098, term245098.getClass(), "pendingAttributeValue", null);
        setField(term245098, term245098.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term245098, term245098.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term245098, term245098.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term245098, term245098.getClass(), "selfClosing", false);
        setField(term245098, term245098.getClass(), "attributes", null);
        setField(term245098, term245098.getClass(), "type", null);
        setField(term245091, term245091.getClass(), "tagPending", term245098);
        setField(term245091, term245091.getClass(), "startPending", null);
        setField(term245091, term245091.getClass(), "endPending", null);
        setField(term245091, term245091.getClass(), "charPending", null);
        setField(term245091, term245091.getClass(), "doctypePending", null);
        setField(term245091, term245091.getClass(), "commentPending", null);
        setField(term245091, term245091.getClass(), "lastStartTag", "");
        setBooleanField(term245091, term245091.getClass(), "selfClosingFlagAcknowledged", false);
        setField(term245091, term245091.getClass(), "codepointHolder", null);
        setField(term245091, term245091.getClass(), "multipointHolder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TokeniserState");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.jsoup.parser.Tokeniser");
        argTypes[1] = Class.forName("org.jsoup.parser.CharacterReader");
        argTypes[2] = Class.forName("org.jsoup.parser.TokeniserState");
        Object[] args = new Object[3];
        args[0] = term240501;
        args[1] = term240831;
        args[2] = null;
        callMethod(klass, "handleDataEndTag", argTypes, null, args);
        assertTrue(recursiveEquals(term240501, term245090));
        assertTrue(recursiveEquals(term240831, term245091));
    }

};


