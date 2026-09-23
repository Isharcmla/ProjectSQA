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

public class TokeniserState_handleDataEndTag_316813230129 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term265746;
     Object term266080;
     Object term270344;
     Object term270345;

    public TokeniserState_handleDataEndTag_316813230129() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term265950 = new StringBuilder();
        char[] term264640 = (char[]) newCharArray(489);
        StringBuilder term266010 = new StringBuilder();
        ((StringBuilder) term266010).append(term264640);
        term265746 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term265852 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term265746, term265746.getClass(), "lastStartTag", "");
        setField(term265852, term265852.getClass(), "tagName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        setField(term265746, term265746.getClass(), "tagPending", term265852);
        setField(term265746, term265746.getClass(), "dataBuffer", term265950);
        setField(term265746, term265746.getClass(), "charsString", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        setField(term265746, term265746.getClass(), "charsBuilder", term266010);
        term266080 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term266080, term266080.getClass(), "pos", -2147483648);
        setIntField(term266080, term266080.getClass(), "length", -2147483648);
        term270344 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term270344, term270344.getClass(), "input", null);
        setIntField(term270344, term270344.getClass(), "length", -2147483648);
        setIntField(term270344, term270344.getClass(), "pos", -2147483648);
        setIntField(term270344, term270344.getClass(), "mark", 0);
        setField(term270344, term270344.getClass(), "stringCache", null);
        term270345 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term270348 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term270349 = (byte[]) newByteArray(980);
        Object term270350 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term270351 = (byte[]) newByteArray(16);
        Object term270352 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term270345, term270345.getClass(), "reader", null);
        setField(term270345, term270345.getClass(), "errors", null);
        setField(term270345, term270345.getClass(), "state", null);
        setField(term270345, term270345.getClass(), "emitPending", null);
        setBooleanField(term270345, term270345.getClass(), "isEmitPending", false);
        setField(term270345, term270345.getClass(), "charsString", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        setByteElement(term270349, 489, (byte) 60);
        setByteElement(term270349, 490, (byte) 47);
        setField(term270348, term270348.getClass(), "value", term270349);
        setByteField(term270348, term270348.getClass(), "coder", (byte) 0);
        setIntField(term270348, term270348.getClass(), "count", 491);
        setField(term270345, term270345.getClass(), "charsBuilder", term270348);
        setField(term270350, term270350.getClass(), "value", term270351);
        setByteField(term270350, term270350.getClass(), "coder", (byte) 0);
        setIntField(term270350, term270350.getClass(), "count", 0);
        setField(term270345, term270345.getClass(), "dataBuffer", term270350);
        setField(term270352, term270352.getClass(), "tagName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        setField(term270352, term270352.getClass(), "normalName", null);
        setField(term270352, term270352.getClass(), "pendingAttributeName", null);
        setField(term270352, term270352.getClass(), "pendingAttributeValue", null);
        setField(term270352, term270352.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term270352, term270352.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term270352, term270352.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term270352, term270352.getClass(), "selfClosing", false);
        setField(term270352, term270352.getClass(), "attributes", null);
        setField(term270352, term270352.getClass(), "type", null);
        setField(term270345, term270345.getClass(), "tagPending", term270352);
        setField(term270345, term270345.getClass(), "startPending", null);
        setField(term270345, term270345.getClass(), "endPending", null);
        setField(term270345, term270345.getClass(), "charPending", null);
        setField(term270345, term270345.getClass(), "doctypePending", null);
        setField(term270345, term270345.getClass(), "commentPending", null);
        setField(term270345, term270345.getClass(), "lastStartTag", "");
        setBooleanField(term270345, term270345.getClass(), "selfClosingFlagAcknowledged", false);
        setField(term270345, term270345.getClass(), "codepointHolder", null);
        setField(term270345, term270345.getClass(), "multipointHolder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TokeniserState");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.jsoup.parser.Tokeniser");
        argTypes[1] = Class.forName("org.jsoup.parser.CharacterReader");
        argTypes[2] = Class.forName("org.jsoup.parser.TokeniserState");
        Object[] args = new Object[3];
        args[0] = term265746;
        args[1] = term266080;
        args[2] = null;
        callMethod(klass, "handleDataEndTag", argTypes, null, args);
        assertTrue(recursiveEquals(term265746, term270344));
        assertTrue(recursiveEquals(term266080, term270345));
    }

};


