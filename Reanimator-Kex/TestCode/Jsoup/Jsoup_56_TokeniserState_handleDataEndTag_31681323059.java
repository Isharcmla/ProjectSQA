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

public class TokeniserState_handleDataEndTag_31681323059 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term117221;
     Object term117449;
     Object term120418;
     Object term120419;

    public TokeniserState_handleDataEndTag_31681323059() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        char[] term113187 = (char[]) newCharArray(489);
        StringBuilder term117281 = new StringBuilder();
        ((StringBuilder) term117281).append(term113187);
        char[] term116128 = (char[]) newCharArray(489);
        StringBuilder term117379 = new StringBuilder();
        ((StringBuilder) term117379).append(term116128);
        term117221 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setField(term117221, term117221.getClass(), "lastStartTag", null);
        setField(term117221, term117221.getClass(), "dataBuffer", term117281);
        setField(term117221, term117221.getClass(), "charsString", "");
        setField(term117221, term117221.getClass(), "charsBuilder", term117379);
        term117449 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term117449, term117449.getClass(), "pos", -2147483648);
        setIntField(term117449, term117449.getClass(), "length", -2147483648);
        term120418 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term120418, term120418.getClass(), "input", null);
        setIntField(term120418, term120418.getClass(), "length", -2147483648);
        setIntField(term120418, term120418.getClass(), "pos", -2147483648);
        setIntField(term120418, term120418.getClass(), "mark", 0);
        setField(term120418, term120418.getClass(), "stringCache", null);
        term120419 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term120422 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term120423 = (byte[]) newByteArray(980);
        Object term120424 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term120425 = (byte[]) newByteArray(489);
        setField(term120419, term120419.getClass(), "reader", null);
        setField(term120419, term120419.getClass(), "errors", null);
        setField(term120419, term120419.getClass(), "state", null);
        setField(term120419, term120419.getClass(), "emitPending", null);
        setBooleanField(term120419, term120419.getClass(), "isEmitPending", false);
        setField(term120419, term120419.getClass(), "charsString", "");
        setByteElement(term120423, 489, (byte) 60);
        setByteElement(term120423, 490, (byte) 47);
        setField(term120422, term120422.getClass(), "value", term120423);
        setByteField(term120422, term120422.getClass(), "coder", (byte) 0);
        setIntField(term120422, term120422.getClass(), "count", 980);
        setField(term120419, term120419.getClass(), "charsBuilder", term120422);
        setField(term120424, term120424.getClass(), "value", term120425);
        setByteField(term120424, term120424.getClass(), "coder", (byte) 0);
        setIntField(term120424, term120424.getClass(), "count", 489);
        setField(term120419, term120419.getClass(), "dataBuffer", term120424);
        setField(term120419, term120419.getClass(), "tagPending", null);
        setField(term120419, term120419.getClass(), "startPending", null);
        setField(term120419, term120419.getClass(), "endPending", null);
        setField(term120419, term120419.getClass(), "charPending", null);
        setField(term120419, term120419.getClass(), "doctypePending", null);
        setField(term120419, term120419.getClass(), "commentPending", null);
        setField(term120419, term120419.getClass(), "lastStartTag", null);
        setBooleanField(term120419, term120419.getClass(), "selfClosingFlagAcknowledged", false);
        setField(term120419, term120419.getClass(), "codepointHolder", null);
        setField(term120419, term120419.getClass(), "multipointHolder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TokeniserState");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.jsoup.parser.Tokeniser");
        argTypes[1] = Class.forName("org.jsoup.parser.CharacterReader");
        argTypes[2] = Class.forName("org.jsoup.parser.TokeniserState");
        Object[] args = new Object[3];
        args[0] = term117221;
        args[1] = term117449;
        args[2] = null;
        callMethod(klass, "handleDataEndTag", argTypes, null, args);
        assertTrue(recursiveEquals(term117221, term120418));
        assertTrue(recursiveEquals(term117449, term120419));
    }

};


