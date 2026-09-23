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

public class TokeniserState_readCharRef_105707458929 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term50302;
     Object term50397;

    public TokeniserState_readCharRef_105707458929() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term50302 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term50372 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term50372, term50372.getClass(), "pos", -2147483648);
        setIntField(term50372, term50372.getClass(), "length", -2147483648);
        setField(term50302, term50302.getClass(), "reader", term50372);
        term50397 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term50398 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term50398, term50398.getClass(), "input", null);
        setIntField(term50398, term50398.getClass(), "length", -2147483648);
        setIntField(term50398, term50398.getClass(), "pos", -2147483648);
        setIntField(term50398, term50398.getClass(), "mark", 0);
        setField(term50398, term50398.getClass(), "stringCache", null);
        setField(term50397, term50397.getClass(), "reader", term50398);
        setField(term50397, term50397.getClass(), "errors", null);
        setField(term50397, term50397.getClass(), "state", null);
        setField(term50397, term50397.getClass(), "emitPending", null);
        setBooleanField(term50397, term50397.getClass(), "isEmitPending", false);
        setField(term50397, term50397.getClass(), "charsString", "&");
        setField(term50397, term50397.getClass(), "charsBuilder", null);
        setField(term50397, term50397.getClass(), "dataBuffer", null);
        setField(term50397, term50397.getClass(), "tagPending", null);
        setField(term50397, term50397.getClass(), "startPending", null);
        setField(term50397, term50397.getClass(), "endPending", null);
        setField(term50397, term50397.getClass(), "charPending", null);
        setField(term50397, term50397.getClass(), "doctypePending", null);
        setField(term50397, term50397.getClass(), "commentPending", null);
        setField(term50397, term50397.getClass(), "lastStartTag", null);
        setBooleanField(term50397, term50397.getClass(), "selfClosingFlagAcknowledged", false);
        setField(term50397, term50397.getClass(), "codepointHolder", null);
        setField(term50397, term50397.getClass(), "multipointHolder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TokeniserState");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.parser.Tokeniser");
        argTypes[1] = Class.forName("org.jsoup.parser.TokeniserState");
        Object[] args = new Object[2];
        args[0] = term50302;
        args[1] = null;
        callMethod(klass, "readCharRef", argTypes, null, args);
        assertTrue(recursiveEquals(term50302, term50397));
    }

};


