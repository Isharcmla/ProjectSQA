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

public class TokeniserState_handleDataEndTag_31681323073 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term133629;
     Object term133899;
     Object term135922;
     Object term135923;

    public TokeniserState_handleDataEndTag_31681323073() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term133829 = new StringBuilder();
        term133629 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term133731 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term133629, term133629.getClass(), "lastStartTag", "");
        setField(term133731, term133731.getClass(), "tagName", "</                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ");
        setField(term133629, term133629.getClass(), "tagPending", term133731);
        setField(term133629, term133629.getClass(), "dataBuffer", term133829);
        term133899 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term133899, term133899.getClass(), "pos", -2147483648);
        setIntField(term133899, term133899.getClass(), "length", -2147483648);
        term135922 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term135922, term135922.getClass(), "input", null);
        setIntField(term135922, term135922.getClass(), "length", -2147483648);
        setIntField(term135922, term135922.getClass(), "pos", -2147483648);
        setIntField(term135922, term135922.getClass(), "mark", 0);
        setField(term135922, term135922.getClass(), "stringCache", null);
        term135923 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term135926 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term135927 = (byte[]) newByteArray(16);
        Object term135928 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term135923, term135923.getClass(), "reader", null);
        setField(term135923, term135923.getClass(), "errors", null);
        setField(term135923, term135923.getClass(), "state", null);
        setField(term135923, term135923.getClass(), "emitPending", null);
        setBooleanField(term135923, term135923.getClass(), "isEmitPending", false);
        setField(term135923, term135923.getClass(), "charsString", "</");
        setField(term135923, term135923.getClass(), "charsBuilder", null);
        setField(term135926, term135926.getClass(), "value", term135927);
        setByteField(term135926, term135926.getClass(), "coder", (byte) 0);
        setIntField(term135926, term135926.getClass(), "count", 0);
        setField(term135923, term135923.getClass(), "dataBuffer", term135926);
        setField(term135928, term135928.getClass(), "tagName", "</                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ");
        setField(term135928, term135928.getClass(), "normalName", null);
        setField(term135928, term135928.getClass(), "pendingAttributeName", null);
        setField(term135928, term135928.getClass(), "pendingAttributeValue", null);
        setField(term135928, term135928.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term135928, term135928.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term135928, term135928.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term135928, term135928.getClass(), "selfClosing", false);
        setField(term135928, term135928.getClass(), "attributes", null);
        setField(term135928, term135928.getClass(), "type", null);
        setField(term135923, term135923.getClass(), "tagPending", term135928);
        setField(term135923, term135923.getClass(), "startPending", null);
        setField(term135923, term135923.getClass(), "endPending", null);
        setField(term135923, term135923.getClass(), "charPending", null);
        setField(term135923, term135923.getClass(), "doctypePending", null);
        setField(term135923, term135923.getClass(), "commentPending", null);
        setField(term135923, term135923.getClass(), "lastStartTag", "");
        setBooleanField(term135923, term135923.getClass(), "selfClosingFlagAcknowledged", false);
        setField(term135923, term135923.getClass(), "codepointHolder", null);
        setField(term135923, term135923.getClass(), "multipointHolder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TokeniserState");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.jsoup.parser.Tokeniser");
        argTypes[1] = Class.forName("org.jsoup.parser.CharacterReader");
        argTypes[2] = Class.forName("org.jsoup.parser.TokeniserState");
        Object[] args = new Object[3];
        args[0] = term133629;
        args[1] = term133899;
        args[2] = null;
        callMethod(klass, "handleDataEndTag", argTypes, null, args);
        assertTrue(recursiveEquals(term133629, term135922));
        assertTrue(recursiveEquals(term133899, term135923));
    }

};


