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

public class TokeniserState_handleDataEndTag_31681323093 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term156905;
     Object term157137;
     Object term161578;
     Object term161579;

    public TokeniserState_handleDataEndTag_31681323093() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term157067 = new StringBuilder();
        term156905 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term157007 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term156905, term156905.getClass(), "lastStartTag", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term157007, term157007.getClass(), "tagName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term156905, term156905.getClass(), "tagPending", term157007);
        setField(term156905, term156905.getClass(), "dataBuffer", term157067);
        setField(term156905, term156905.getClass(), "charsString", null);
        term157137 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term157137, term157137.getClass(), "pos", -2147483648);
        setIntField(term157137, term157137.getClass(), "length", -2147483648);
        term161578 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term161578, term161578.getClass(), "input", null);
        setIntField(term161578, term161578.getClass(), "length", -2147483648);
        setIntField(term161578, term161578.getClass(), "pos", -2147483648);
        setIntField(term161578, term161578.getClass(), "mark", 0);
        setField(term161578, term161578.getClass(), "stringCache", null);
        term161579 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term161582 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term161583 = (byte[]) newByteArray(16);
        Object term161584 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term161579, term161579.getClass(), "reader", null);
        setField(term161579, term161579.getClass(), "errors", null);
        setField(term161579, term161579.getClass(), "state", null);
        setField(term161579, term161579.getClass(), "emitPending", null);
        setBooleanField(term161579, term161579.getClass(), "isEmitPending", false);
        setField(term161579, term161579.getClass(), "charsString", "</");
        setField(term161579, term161579.getClass(), "charsBuilder", null);
        setField(term161582, term161582.getClass(), "value", term161583);
        setByteField(term161582, term161582.getClass(), "coder", (byte) 0);
        setIntField(term161582, term161582.getClass(), "count", 0);
        setField(term161579, term161579.getClass(), "dataBuffer", term161582);
        setField(term161584, term161584.getClass(), "tagName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term161584, term161584.getClass(), "normalName", null);
        setField(term161584, term161584.getClass(), "pendingAttributeName", null);
        setField(term161584, term161584.getClass(), "pendingAttributeValue", null);
        setField(term161584, term161584.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term161584, term161584.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term161584, term161584.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term161584, term161584.getClass(), "selfClosing", false);
        setField(term161584, term161584.getClass(), "attributes", null);
        setField(term161584, term161584.getClass(), "type", null);
        setField(term161579, term161579.getClass(), "tagPending", term161584);
        setField(term161579, term161579.getClass(), "startPending", null);
        setField(term161579, term161579.getClass(), "endPending", null);
        setField(term161579, term161579.getClass(), "charPending", null);
        setField(term161579, term161579.getClass(), "doctypePending", null);
        setField(term161579, term161579.getClass(), "commentPending", null);
        setField(term161579, term161579.getClass(), "lastStartTag", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setBooleanField(term161579, term161579.getClass(), "selfClosingFlagAcknowledged", false);
        setField(term161579, term161579.getClass(), "codepointHolder", null);
        setField(term161579, term161579.getClass(), "multipointHolder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TokeniserState");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.jsoup.parser.Tokeniser");
        argTypes[1] = Class.forName("org.jsoup.parser.CharacterReader");
        argTypes[2] = Class.forName("org.jsoup.parser.TokeniserState");
        Object[] args = new Object[3];
        args[0] = term156905;
        args[1] = term157137;
        args[2] = null;
        callMethod(klass, "handleDataEndTag", argTypes, null, args);
        assertTrue(recursiveEquals(term156905, term161578));
        assertTrue(recursiveEquals(term157137, term161579));
    }

};


