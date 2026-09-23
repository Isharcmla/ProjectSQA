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

public class TokeniserState_readCharRef_105707458969 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term124982;
     Object term125195;

    public TokeniserState_readCharRef_105707458969() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term125150 = new StringBuilder();
        term124982 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term125052 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term125052, term125052.getClass(), "pos", -2147483648);
        setIntField(term125052, term125052.getClass(), "length", -2147483648);
        setField(term124982, term124982.getClass(), "reader", term125052);
        setField(term124982, term124982.getClass(), "charsString", "");
        setField(term124982, term124982.getClass(), "charsBuilder", term125150);
        term125195 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term125196 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object term125199 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term125200 = (byte[]) newByteArray(16);
        setField(term125196, term125196.getClass(), "input", null);
        setIntField(term125196, term125196.getClass(), "length", -2147483648);
        setIntField(term125196, term125196.getClass(), "pos", -2147483648);
        setIntField(term125196, term125196.getClass(), "mark", 0);
        setField(term125196, term125196.getClass(), "stringCache", null);
        setField(term125195, term125195.getClass(), "reader", term125196);
        setField(term125195, term125195.getClass(), "errors", null);
        setField(term125195, term125195.getClass(), "state", null);
        setField(term125195, term125195.getClass(), "emitPending", null);
        setBooleanField(term125195, term125195.getClass(), "isEmitPending", false);
        setField(term125195, term125195.getClass(), "charsString", "");
        setByteElement(term125200, 0, (byte) 38);
        setField(term125199, term125199.getClass(), "value", term125200);
        setByteField(term125199, term125199.getClass(), "coder", (byte) 0);
        setIntField(term125199, term125199.getClass(), "count", 1);
        setField(term125195, term125195.getClass(), "charsBuilder", term125199);
        setField(term125195, term125195.getClass(), "dataBuffer", null);
        setField(term125195, term125195.getClass(), "tagPending", null);
        setField(term125195, term125195.getClass(), "startPending", null);
        setField(term125195, term125195.getClass(), "endPending", null);
        setField(term125195, term125195.getClass(), "charPending", null);
        setField(term125195, term125195.getClass(), "doctypePending", null);
        setField(term125195, term125195.getClass(), "commentPending", null);
        setField(term125195, term125195.getClass(), "lastStartTag", null);
        setBooleanField(term125195, term125195.getClass(), "selfClosingFlagAcknowledged", false);
        setField(term125195, term125195.getClass(), "codepointHolder", null);
        setField(term125195, term125195.getClass(), "multipointHolder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TokeniserState");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.parser.Tokeniser");
        argTypes[1] = Class.forName("org.jsoup.parser.TokeniserState");
        Object[] args = new Object[2];
        args[0] = term124982;
        args[1] = null;
        callMethod(klass, "readCharRef", argTypes, null, args);
        assertTrue(recursiveEquals(term124982, term125195));
    }

};


