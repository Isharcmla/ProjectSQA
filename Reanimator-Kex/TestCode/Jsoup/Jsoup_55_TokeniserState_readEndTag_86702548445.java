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

public class TokeniserState_readEndTag_86702548445 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term90367;
     Object term90535;
     Object term90576;
     Object term90577;

    public TokeniserState_readEndTag_86702548445() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        char[] term90278 = (char[]) newCharArray(0);
        StringBuilder term90465 = new StringBuilder();
        ((StringBuilder) term90465).append(term90278);
        term90367 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setField(term90367, term90367.getClass(), "charsString", "");
        setField(term90367, term90367.getClass(), "charsBuilder", term90465);
        term90535 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term90535, term90535.getClass(), "pos", -2147483648);
        setIntField(term90535, term90535.getClass(), "length", -2147483648);
        term90576 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term90576, term90576.getClass(), "input", null);
        setIntField(term90576, term90576.getClass(), "length", -2147483648);
        setIntField(term90576, term90576.getClass(), "pos", -2147483648);
        setIntField(term90576, term90576.getClass(), "mark", 0);
        setField(term90576, term90576.getClass(), "stringCache", null);
        term90577 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term90580 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term90581 = (byte[]) newByteArray(16);
        setField(term90577, term90577.getClass(), "reader", null);
        setField(term90577, term90577.getClass(), "errors", null);
        setField(term90577, term90577.getClass(), "state", null);
        setField(term90577, term90577.getClass(), "emitPending", null);
        setBooleanField(term90577, term90577.getClass(), "isEmitPending", false);
        setField(term90577, term90577.getClass(), "charsString", "");
        setByteElement(term90581, 0, (byte) 60);
        setByteElement(term90581, 1, (byte) 47);
        setField(term90580, term90580.getClass(), "value", term90581);
        setByteField(term90580, term90580.getClass(), "coder", (byte) 0);
        setIntField(term90580, term90580.getClass(), "count", 2);
        setField(term90577, term90577.getClass(), "charsBuilder", term90580);
        setField(term90577, term90577.getClass(), "dataBuffer", null);
        setField(term90577, term90577.getClass(), "tagPending", null);
        setField(term90577, term90577.getClass(), "startPending", null);
        setField(term90577, term90577.getClass(), "endPending", null);
        setField(term90577, term90577.getClass(), "charPending", null);
        setField(term90577, term90577.getClass(), "doctypePending", null);
        setField(term90577, term90577.getClass(), "commentPending", null);
        setField(term90577, term90577.getClass(), "lastStartTag", null);
        setBooleanField(term90577, term90577.getClass(), "selfClosingFlagAcknowledged", false);
        setField(term90577, term90577.getClass(), "codepointHolder", null);
        setField(term90577, term90577.getClass(), "multipointHolder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TokeniserState");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.jsoup.parser.Tokeniser");
        argTypes[1] = Class.forName("org.jsoup.parser.CharacterReader");
        argTypes[2] = Class.forName("org.jsoup.parser.TokeniserState");
        argTypes[3] = Class.forName("org.jsoup.parser.TokeniserState");
        Object[] args = new Object[4];
        args[0] = term90367;
        args[1] = term90535;
        args[2] = null;
        args[3] = null;
        callMethod(klass, "readEndTag", argTypes, null, args);
        assertTrue(recursiveEquals(term90367, term90576));
        assertTrue(recursiveEquals(term90535, term90577));
    }

};


