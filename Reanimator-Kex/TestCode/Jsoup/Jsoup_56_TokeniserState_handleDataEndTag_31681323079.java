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

public class TokeniserState_handleDataEndTag_31681323079 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term134757;
     Object term135027;
     Object term137050;
     Object term137051;

    public TokeniserState_handleDataEndTag_31681323079() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term134957 = new StringBuilder();
        term134757 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term134859 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term134757, term134757.getClass(), "lastStartTag", "");
        setField(term134859, term134859.getClass(), "tagName", "</                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ");
        setField(term134757, term134757.getClass(), "tagPending", term134859);
        setField(term134757, term134757.getClass(), "dataBuffer", term134957);
        term135027 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term135027, term135027.getClass(), "pos", -2147483648);
        setIntField(term135027, term135027.getClass(), "length", -2147483648);
        term137050 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term137050, term137050.getClass(), "input", null);
        setIntField(term137050, term137050.getClass(), "length", -2147483648);
        setIntField(term137050, term137050.getClass(), "pos", -2147483648);
        setIntField(term137050, term137050.getClass(), "mark", 0);
        setField(term137050, term137050.getClass(), "stringCache", null);
        term137051 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term137054 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term137055 = (byte[]) newByteArray(16);
        Object term137056 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term137051, term137051.getClass(), "reader", null);
        setField(term137051, term137051.getClass(), "errors", null);
        setField(term137051, term137051.getClass(), "state", null);
        setField(term137051, term137051.getClass(), "emitPending", null);
        setBooleanField(term137051, term137051.getClass(), "isEmitPending", false);
        setField(term137051, term137051.getClass(), "charsString", "</");
        setField(term137051, term137051.getClass(), "charsBuilder", null);
        setField(term137054, term137054.getClass(), "value", term137055);
        setByteField(term137054, term137054.getClass(), "coder", (byte) 0);
        setIntField(term137054, term137054.getClass(), "count", 0);
        setField(term137051, term137051.getClass(), "dataBuffer", term137054);
        setField(term137056, term137056.getClass(), "tagName", "</                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ");
        setField(term137056, term137056.getClass(), "normalName", null);
        setField(term137056, term137056.getClass(), "pendingAttributeName", null);
        setField(term137056, term137056.getClass(), "pendingAttributeValue", null);
        setField(term137056, term137056.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term137056, term137056.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term137056, term137056.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term137056, term137056.getClass(), "selfClosing", false);
        setField(term137056, term137056.getClass(), "attributes", null);
        setField(term137056, term137056.getClass(), "type", null);
        setField(term137051, term137051.getClass(), "tagPending", term137056);
        setField(term137051, term137051.getClass(), "startPending", null);
        setField(term137051, term137051.getClass(), "endPending", null);
        setField(term137051, term137051.getClass(), "charPending", null);
        setField(term137051, term137051.getClass(), "doctypePending", null);
        setField(term137051, term137051.getClass(), "commentPending", null);
        setField(term137051, term137051.getClass(), "lastStartTag", "");
        setBooleanField(term137051, term137051.getClass(), "selfClosingFlagAcknowledged", false);
        setField(term137051, term137051.getClass(), "codepointHolder", null);
        setField(term137051, term137051.getClass(), "multipointHolder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TokeniserState");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.jsoup.parser.Tokeniser");
        argTypes[1] = Class.forName("org.jsoup.parser.CharacterReader");
        argTypes[2] = Class.forName("org.jsoup.parser.TokeniserState");
        Object[] args = new Object[3];
        args[0] = term134757;
        args[1] = term135027;
        args[2] = null;
        callMethod(klass, "handleDataEndTag", argTypes, null, args);
        assertTrue(recursiveEquals(term134757, term137050));
        assertTrue(recursiveEquals(term135027, term137051));
    }

};


