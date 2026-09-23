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

public class TokeniserState_readCharRef_105707458975 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term130272;
     Object term131938;

    public TokeniserState_readCharRef_105707458975() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        char[] term129163 = (char[]) newCharArray(489);
        StringBuilder term130440 = new StringBuilder();
        ((StringBuilder) term130440).append(term129163);
        term130272 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term130342 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term130342, term130342.getClass(), "pos", -2147483648);
        setIntField(term130342, term130342.getClass(), "length", -2147483648);
        setField(term130272, term130272.getClass(), "reader", term130342);
        setField(term130272, term130272.getClass(), "charsString", "");
        setField(term130272, term130272.getClass(), "charsBuilder", term130440);
        term131938 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term131939 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term131942 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term131943 = (byte[]) newByteArray(980);
        setField(term131939, term131939.getClass(), "input", null);
        setIntField(term131939, term131939.getClass(), "length", -2147483648);
        setIntField(term131939, term131939.getClass(), "pos", -2147483648);
        setIntField(term131939, term131939.getClass(), "mark", 0);
        setField(term131939, term131939.getClass(), "stringCache", null);
        setField(term131938, term131938.getClass(), "reader", term131939);
        setField(term131938, term131938.getClass(), "errors", null);
        setField(term131938, term131938.getClass(), "state", null);
        setField(term131938, term131938.getClass(), "emitPending", null);
        setBooleanField(term131938, term131938.getClass(), "isEmitPending", false);
        setField(term131938, term131938.getClass(), "charsString", "");
        setByteElement(term131943, 489, (byte) 38);
        setField(term131942, term131942.getClass(), "value", term131943);
        setByteField(term131942, term131942.getClass(), "coder", (byte) 0);
        setIntField(term131942, term131942.getClass(), "count", 490);
        setField(term131938, term131938.getClass(), "charsBuilder", term131942);
        setField(term131938, term131938.getClass(), "dataBuffer", null);
        setField(term131938, term131938.getClass(), "tagPending", null);
        setField(term131938, term131938.getClass(), "startPending", null);
        setField(term131938, term131938.getClass(), "endPending", null);
        setField(term131938, term131938.getClass(), "charPending", null);
        setField(term131938, term131938.getClass(), "doctypePending", null);
        setField(term131938, term131938.getClass(), "commentPending", null);
        setField(term131938, term131938.getClass(), "lastStartTag", null);
        setBooleanField(term131938, term131938.getClass(), "selfClosingFlagAcknowledged", false);
        setField(term131938, term131938.getClass(), "codepointHolder", null);
        setField(term131938, term131938.getClass(), "multipointHolder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TokeniserState");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.parser.Tokeniser");
        argTypes[1] = Class.forName("org.jsoup.parser.TokeniserState");
        Object[] args = new Object[2];
        args[0] = term130272;
        args[1] = null;
        callMethod(klass, "readCharRef", argTypes, null, args);
        assertTrue(recursiveEquals(term130272, term131938));
    }

};


