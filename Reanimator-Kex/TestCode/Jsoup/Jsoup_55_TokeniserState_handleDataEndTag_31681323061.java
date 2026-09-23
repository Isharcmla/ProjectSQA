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

public class TokeniserState_handleDataEndTag_31681323061 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term113416;
     Object term113644;
     Object term113709;
     Object term113710;

    public TokeniserState_handleDataEndTag_31681323061() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term113476 = new StringBuilder();
        StringBuilder term113574 = new StringBuilder();
        term113416 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setField(term113416, term113416.getClass(), "lastStartTag", null);
        setField(term113416, term113416.getClass(), "dataBuffer", term113476);
        setField(term113416, term113416.getClass(), "charsString", "");
        setField(term113416, term113416.getClass(), "charsBuilder", term113574);
        term113644 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term113644, term113644.getClass(), "pos", -2147483648);
        setIntField(term113644, term113644.getClass(), "length", -2147483648);
        term113709 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term113709, term113709.getClass(), "input", null);
        setIntField(term113709, term113709.getClass(), "length", -2147483648);
        setIntField(term113709, term113709.getClass(), "pos", -2147483648);
        setIntField(term113709, term113709.getClass(), "mark", 0);
        setField(term113709, term113709.getClass(), "stringCache", null);
        term113710 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term113713 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term113714 = (byte[]) newByteArray(16);
        Object term113715 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term113716 = (byte[]) newByteArray(16);
        setField(term113710, term113710.getClass(), "reader", null);
        setField(term113710, term113710.getClass(), "errors", null);
        setField(term113710, term113710.getClass(), "state", null);
        setField(term113710, term113710.getClass(), "emitPending", null);
        setBooleanField(term113710, term113710.getClass(), "isEmitPending", false);
        setField(term113710, term113710.getClass(), "charsString", "");
        setByteElement(term113714, 0, (byte) 60);
        setByteElement(term113714, 1, (byte) 47);
        setField(term113713, term113713.getClass(), "value", term113714);
        setByteField(term113713, term113713.getClass(), "coder", (byte) 0);
        setIntField(term113713, term113713.getClass(), "count", 2);
        setField(term113710, term113710.getClass(), "charsBuilder", term113713);
        setField(term113715, term113715.getClass(), "value", term113716);
        setByteField(term113715, term113715.getClass(), "coder", (byte) 0);
        setIntField(term113715, term113715.getClass(), "count", 0);
        setField(term113710, term113710.getClass(), "dataBuffer", term113715);
        setField(term113710, term113710.getClass(), "tagPending", null);
        setField(term113710, term113710.getClass(), "startPending", null);
        setField(term113710, term113710.getClass(), "endPending", null);
        setField(term113710, term113710.getClass(), "charPending", null);
        setField(term113710, term113710.getClass(), "doctypePending", null);
        setField(term113710, term113710.getClass(), "commentPending", null);
        setField(term113710, term113710.getClass(), "lastStartTag", null);
        setBooleanField(term113710, term113710.getClass(), "selfClosingFlagAcknowledged", false);
        setField(term113710, term113710.getClass(), "codepointHolder", null);
        setField(term113710, term113710.getClass(), "multipointHolder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TokeniserState");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.jsoup.parser.Tokeniser");
        argTypes[1] = Class.forName("org.jsoup.parser.CharacterReader");
        argTypes[2] = Class.forName("org.jsoup.parser.TokeniserState");
        Object[] args = new Object[3];
        args[0] = term113416;
        args[1] = term113644;
        args[2] = null;
        callMethod(klass, "handleDataEndTag", argTypes, null, args);
        assertTrue(recursiveEquals(term113416, term113709));
        assertTrue(recursiveEquals(term113644, term113710));
    }

};


