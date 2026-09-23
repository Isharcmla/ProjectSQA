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

public class TokeniserState_handleDataEndTag_31681323071 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term127224;
     Object term127452;
     Object term130421;
     Object term130422;

    public TokeniserState_handleDataEndTag_31681323071() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        char[] term123190 = (char[]) newCharArray(489);
        StringBuilder term127284 = new StringBuilder();
        ((StringBuilder) term127284).append(term123190);
        char[] term126131 = (char[]) newCharArray(489);
        StringBuilder term127382 = new StringBuilder();
        ((StringBuilder) term127382).append(term126131);
        term127224 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setField(term127224, term127224.getClass(), "lastStartTag", null);
        setField(term127224, term127224.getClass(), "dataBuffer", term127284);
        setField(term127224, term127224.getClass(), "charsString", "");
        setField(term127224, term127224.getClass(), "charsBuilder", term127382);
        term127452 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term127452, term127452.getClass(), "pos", -2147483648);
        setIntField(term127452, term127452.getClass(), "length", -2147483648);
        term130421 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term130421, term130421.getClass(), "input", null);
        setIntField(term130421, term130421.getClass(), "length", -2147483648);
        setIntField(term130421, term130421.getClass(), "pos", -2147483648);
        setIntField(term130421, term130421.getClass(), "mark", 0);
        setField(term130421, term130421.getClass(), "stringCache", null);
        term130422 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term130425 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term130426 = (byte[]) newByteArray(980);
        Object term130427 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term130428 = (byte[]) newByteArray(489);
        setField(term130422, term130422.getClass(), "reader", null);
        setField(term130422, term130422.getClass(), "errors", null);
        setField(term130422, term130422.getClass(), "state", null);
        setField(term130422, term130422.getClass(), "emitPending", null);
        setBooleanField(term130422, term130422.getClass(), "isEmitPending", false);
        setField(term130422, term130422.getClass(), "charsString", "");
        setByteElement(term130426, 489, (byte) 60);
        setByteElement(term130426, 490, (byte) 47);
        setField(term130425, term130425.getClass(), "value", term130426);
        setByteField(term130425, term130425.getClass(), "coder", (byte) 0);
        setIntField(term130425, term130425.getClass(), "count", 980);
        setField(term130422, term130422.getClass(), "charsBuilder", term130425);
        setField(term130427, term130427.getClass(), "value", term130428);
        setByteField(term130427, term130427.getClass(), "coder", (byte) 0);
        setIntField(term130427, term130427.getClass(), "count", 489);
        setField(term130422, term130422.getClass(), "dataBuffer", term130427);
        setField(term130422, term130422.getClass(), "tagPending", null);
        setField(term130422, term130422.getClass(), "startPending", null);
        setField(term130422, term130422.getClass(), "endPending", null);
        setField(term130422, term130422.getClass(), "charPending", null);
        setField(term130422, term130422.getClass(), "doctypePending", null);
        setField(term130422, term130422.getClass(), "commentPending", null);
        setField(term130422, term130422.getClass(), "lastStartTag", null);
        setBooleanField(term130422, term130422.getClass(), "selfClosingFlagAcknowledged", false);
        setField(term130422, term130422.getClass(), "codepointHolder", null);
        setField(term130422, term130422.getClass(), "multipointHolder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TokeniserState");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.jsoup.parser.Tokeniser");
        argTypes[1] = Class.forName("org.jsoup.parser.CharacterReader");
        argTypes[2] = Class.forName("org.jsoup.parser.TokeniserState");
        Object[] args = new Object[3];
        args[0] = term127224;
        args[1] = term127452;
        args[2] = null;
        callMethod(klass, "handleDataEndTag", argTypes, null, args);
        assertTrue(recursiveEquals(term127224, term130421));
        assertTrue(recursiveEquals(term127452, term130422));
    }

};


