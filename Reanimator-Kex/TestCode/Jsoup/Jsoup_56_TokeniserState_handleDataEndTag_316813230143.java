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

public class TokeniserState_handleDataEndTag_316813230143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term296433;
     Object term296767;
     Object term301026;
     Object term301027;

    public TokeniserState_handleDataEndTag_316813230143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term296637 = new StringBuilder();
        char[] term295327 = (char[]) newCharArray(489);
        StringBuilder term296697 = new StringBuilder();
        ((StringBuilder) term296697).append(term295327);
        term296433 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term296539 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term296433, term296433.getClass(), "lastStartTag", "");
        setField(term296539, term296539.getClass(), "tagName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        setField(term296433, term296433.getClass(), "tagPending", term296539);
        setField(term296433, term296433.getClass(), "dataBuffer", term296637);
        setField(term296433, term296433.getClass(), "charsString", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        setField(term296433, term296433.getClass(), "charsBuilder", term296697);
        term296767 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term296767, term296767.getClass(), "pos", -2147483648);
        setIntField(term296767, term296767.getClass(), "length", -2147483648);
        term301026 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term301026, term301026.getClass(), "input", null);
        setIntField(term301026, term301026.getClass(), "length", -2147483648);
        setIntField(term301026, term301026.getClass(), "pos", -2147483648);
        setIntField(term301026, term301026.getClass(), "mark", 0);
        setField(term301026, term301026.getClass(), "stringCache", null);
        term301027 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term301030 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term301031 = (byte[]) newByteArray(980);
        Object term301032 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term301033 = (byte[]) newByteArray(16);
        Object term301034 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term301027, term301027.getClass(), "reader", null);
        setField(term301027, term301027.getClass(), "errors", null);
        setField(term301027, term301027.getClass(), "state", null);
        setField(term301027, term301027.getClass(), "emitPending", null);
        setBooleanField(term301027, term301027.getClass(), "isEmitPending", false);
        setField(term301027, term301027.getClass(), "charsString", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        setByteElement(term301031, 489, (byte) 60);
        setByteElement(term301031, 490, (byte) 47);
        setField(term301030, term301030.getClass(), "value", term301031);
        setByteField(term301030, term301030.getClass(), "coder", (byte) 0);
        setIntField(term301030, term301030.getClass(), "count", 491);
        setField(term301027, term301027.getClass(), "charsBuilder", term301030);
        setField(term301032, term301032.getClass(), "value", term301033);
        setByteField(term301032, term301032.getClass(), "coder", (byte) 0);
        setIntField(term301032, term301032.getClass(), "count", 0);
        setField(term301027, term301027.getClass(), "dataBuffer", term301032);
        setField(term301034, term301034.getClass(), "tagName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        setField(term301034, term301034.getClass(), "normalName", null);
        setField(term301034, term301034.getClass(), "pendingAttributeName", null);
        setField(term301034, term301034.getClass(), "pendingAttributeValue", null);
        setField(term301034, term301034.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term301034, term301034.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term301034, term301034.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term301034, term301034.getClass(), "selfClosing", false);
        setField(term301034, term301034.getClass(), "attributes", null);
        setField(term301034, term301034.getClass(), "type", null);
        setField(term301027, term301027.getClass(), "tagPending", term301034);
        setField(term301027, term301027.getClass(), "startPending", null);
        setField(term301027, term301027.getClass(), "endPending", null);
        setField(term301027, term301027.getClass(), "charPending", null);
        setField(term301027, term301027.getClass(), "doctypePending", null);
        setField(term301027, term301027.getClass(), "commentPending", null);
        setField(term301027, term301027.getClass(), "lastStartTag", "");
        setBooleanField(term301027, term301027.getClass(), "selfClosingFlagAcknowledged", false);
        setField(term301027, term301027.getClass(), "codepointHolder", null);
        setField(term301027, term301027.getClass(), "multipointHolder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TokeniserState");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.jsoup.parser.Tokeniser");
        argTypes[1] = Class.forName("org.jsoup.parser.CharacterReader");
        argTypes[2] = Class.forName("org.jsoup.parser.TokeniserState");
        Object[] args = new Object[3];
        args[0] = term296433;
        args[1] = term296767;
        args[2] = null;
        callMethod(klass, "handleDataEndTag", argTypes, null, args);
        assertTrue(recursiveEquals(term296433, term301026));
        assertTrue(recursiveEquals(term296767, term301027));
    }

};


