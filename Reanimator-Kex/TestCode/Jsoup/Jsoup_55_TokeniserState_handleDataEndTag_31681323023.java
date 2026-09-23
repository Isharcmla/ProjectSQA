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
import java.lang.StringBuilder;
import java.lang.Object;

public class TokeniserState_handleDataEndTag_31681323023 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term49378;
     Object term49508;
     Object term49554;
     Object term49555;

    public TokeniserState_handleDataEndTag_31681323023() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term49438 = new StringBuilder();
        term49378 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setField(term49378, term49378.getClass(), "lastStartTag", null);
        setField(term49378, term49378.getClass(), "dataBuffer", term49438);
        term49508 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term49508, term49508.getClass(), "pos", -2147483648);
        setIntField(term49508, term49508.getClass(), "length", -2147483648);
        term49554 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term49554, term49554.getClass(), "input", null);
        setIntField(term49554, term49554.getClass(), "length", -2147483648);
        setIntField(term49554, term49554.getClass(), "pos", -2147483648);
        setIntField(term49554, term49554.getClass(), "mark", 0);
        setField(term49554, term49554.getClass(), "stringCache", null);
        term49555 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term49558 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term49559 = (byte[]) newByteArray(16);
        setField(term49555, term49555.getClass(), "reader", null);
        setField(term49555, term49555.getClass(), "errors", null);
        setField(term49555, term49555.getClass(), "state", null);
        setField(term49555, term49555.getClass(), "emitPending", null);
        setBooleanField(term49555, term49555.getClass(), "isEmitPending", false);
        setField(term49555, term49555.getClass(), "charsString", "</");
        setField(term49555, term49555.getClass(), "charsBuilder", null);
        setField(term49558, term49558.getClass(), "value", term49559);
        setByteField(term49558, term49558.getClass(), "coder", (byte) 0);
        setIntField(term49558, term49558.getClass(), "count", 0);
        setField(term49555, term49555.getClass(), "dataBuffer", term49558);
        setField(term49555, term49555.getClass(), "tagPending", null);
        setField(term49555, term49555.getClass(), "startPending", null);
        setField(term49555, term49555.getClass(), "endPending", null);
        setField(term49555, term49555.getClass(), "charPending", null);
        setField(term49555, term49555.getClass(), "doctypePending", null);
        setField(term49555, term49555.getClass(), "commentPending", null);
        setField(term49555, term49555.getClass(), "lastStartTag", null);
        setBooleanField(term49555, term49555.getClass(), "selfClosingFlagAcknowledged", false);
        setField(term49555, term49555.getClass(), "codepointHolder", null);
        setField(term49555, term49555.getClass(), "multipointHolder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TokeniserState");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.jsoup.parser.Tokeniser");
        argTypes[1] = Class.forName("org.jsoup.parser.CharacterReader");
        argTypes[2] = Class.forName("org.jsoup.parser.TokeniserState");
        Object[] args = new Object[3];
        args[0] = term49378;
        args[1] = term49508;
        args[2] = null;
        callMethod(klass, "handleDataEndTag", argTypes, null, args);
        assertTrue(recursiveEquals(term49378, term49554));
        assertTrue(recursiveEquals(term49508, term49555));
    }

};


