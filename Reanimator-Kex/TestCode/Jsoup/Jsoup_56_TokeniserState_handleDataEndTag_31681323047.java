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

public class TokeniserState_handleDataEndTag_31681323047 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term92093;
     Object term92321;
     Object term92386;
     Object term92387;

    public TokeniserState_handleDataEndTag_31681323047() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term92153 = new StringBuilder();
        StringBuilder term92251 = new StringBuilder();
        term92093 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setField(term92093, term92093.getClass(), "lastStartTag", null);
        setField(term92093, term92093.getClass(), "dataBuffer", term92153);
        setField(term92093, term92093.getClass(), "charsString", "");
        setField(term92093, term92093.getClass(), "charsBuilder", term92251);
        term92321 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term92321, term92321.getClass(), "pos", -2147483648);
        setIntField(term92321, term92321.getClass(), "length", -2147483648);
        term92386 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term92386, term92386.getClass(), "input", null);
        setIntField(term92386, term92386.getClass(), "length", -2147483648);
        setIntField(term92386, term92386.getClass(), "pos", -2147483648);
        setIntField(term92386, term92386.getClass(), "mark", 0);
        setField(term92386, term92386.getClass(), "stringCache", null);
        term92387 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term92390 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term92391 = (byte[]) newByteArray(16);
        Object term92392 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term92393 = (byte[]) newByteArray(16);
        setField(term92387, term92387.getClass(), "reader", null);
        setField(term92387, term92387.getClass(), "errors", null);
        setField(term92387, term92387.getClass(), "state", null);
        setField(term92387, term92387.getClass(), "emitPending", null);
        setBooleanField(term92387, term92387.getClass(), "isEmitPending", false);
        setField(term92387, term92387.getClass(), "charsString", "");
        setByteElement(term92391, 0, (byte) 60);
        setByteElement(term92391, 1, (byte) 47);
        setField(term92390, term92390.getClass(), "value", term92391);
        setByteField(term92390, term92390.getClass(), "coder", (byte) 0);
        setIntField(term92390, term92390.getClass(), "count", 2);
        setField(term92387, term92387.getClass(), "charsBuilder", term92390);
        setField(term92392, term92392.getClass(), "value", term92393);
        setByteField(term92392, term92392.getClass(), "coder", (byte) 0);
        setIntField(term92392, term92392.getClass(), "count", 0);
        setField(term92387, term92387.getClass(), "dataBuffer", term92392);
        setField(term92387, term92387.getClass(), "tagPending", null);
        setField(term92387, term92387.getClass(), "startPending", null);
        setField(term92387, term92387.getClass(), "endPending", null);
        setField(term92387, term92387.getClass(), "charPending", null);
        setField(term92387, term92387.getClass(), "doctypePending", null);
        setField(term92387, term92387.getClass(), "commentPending", null);
        setField(term92387, term92387.getClass(), "lastStartTag", null);
        setBooleanField(term92387, term92387.getClass(), "selfClosingFlagAcknowledged", false);
        setField(term92387, term92387.getClass(), "codepointHolder", null);
        setField(term92387, term92387.getClass(), "multipointHolder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TokeniserState");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.jsoup.parser.Tokeniser");
        argTypes[1] = Class.forName("org.jsoup.parser.CharacterReader");
        argTypes[2] = Class.forName("org.jsoup.parser.TokeniserState");
        Object[] args = new Object[3];
        args[0] = term92093;
        args[1] = term92321;
        args[2] = null;
        callMethod(klass, "handleDataEndTag", argTypes, null, args);
        assertTrue(recursiveEquals(term92093, term92386));
        assertTrue(recursiveEquals(term92321, term92387));
    }

};


