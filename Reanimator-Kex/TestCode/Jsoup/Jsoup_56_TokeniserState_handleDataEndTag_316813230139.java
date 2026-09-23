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

public class TokeniserState_handleDataEndTag_316813230139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term283543;
     Object term283779;
     Object term288214;
     Object term288215;

    public TokeniserState_handleDataEndTag_316813230139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term283709 = new StringBuilder();
        term283543 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term283649 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term283543, term283543.getClass(), "lastStartTag", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term283649, term283649.getClass(), "tagName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term283543, term283543.getClass(), "tagPending", term283649);
        setField(term283543, term283543.getClass(), "dataBuffer", term283709);
        setField(term283543, term283543.getClass(), "charsString", null);
        term283779 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term283779, term283779.getClass(), "pos", -2147483648);
        setIntField(term283779, term283779.getClass(), "length", -2147483648);
        term288214 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term288214, term288214.getClass(), "input", null);
        setIntField(term288214, term288214.getClass(), "length", -2147483648);
        setIntField(term288214, term288214.getClass(), "pos", -2147483648);
        setIntField(term288214, term288214.getClass(), "mark", 0);
        setField(term288214, term288214.getClass(), "stringCache", null);
        term288215 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term288218 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term288219 = (byte[]) newByteArray(16);
        Object term288220 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term288215, term288215.getClass(), "reader", null);
        setField(term288215, term288215.getClass(), "errors", null);
        setField(term288215, term288215.getClass(), "state", null);
        setField(term288215, term288215.getClass(), "emitPending", null);
        setBooleanField(term288215, term288215.getClass(), "isEmitPending", false);
        setField(term288215, term288215.getClass(), "charsString", "</");
        setField(term288215, term288215.getClass(), "charsBuilder", null);
        setField(term288218, term288218.getClass(), "value", term288219);
        setByteField(term288218, term288218.getClass(), "coder", (byte) 0);
        setIntField(term288218, term288218.getClass(), "count", 0);
        setField(term288215, term288215.getClass(), "dataBuffer", term288218);
        setField(term288220, term288220.getClass(), "tagName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term288220, term288220.getClass(), "normalName", null);
        setField(term288220, term288220.getClass(), "pendingAttributeName", null);
        setField(term288220, term288220.getClass(), "pendingAttributeValue", null);
        setField(term288220, term288220.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term288220, term288220.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term288220, term288220.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term288220, term288220.getClass(), "selfClosing", false);
        setField(term288220, term288220.getClass(), "attributes", null);
        setField(term288220, term288220.getClass(), "type", null);
        setField(term288215, term288215.getClass(), "tagPending", term288220);
        setField(term288215, term288215.getClass(), "startPending", null);
        setField(term288215, term288215.getClass(), "endPending", null);
        setField(term288215, term288215.getClass(), "charPending", null);
        setField(term288215, term288215.getClass(), "doctypePending", null);
        setField(term288215, term288215.getClass(), "commentPending", null);
        setField(term288215, term288215.getClass(), "lastStartTag", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setBooleanField(term288215, term288215.getClass(), "selfClosingFlagAcknowledged", false);
        setField(term288215, term288215.getClass(), "codepointHolder", null);
        setField(term288215, term288215.getClass(), "multipointHolder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TokeniserState");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.jsoup.parser.Tokeniser");
        argTypes[1] = Class.forName("org.jsoup.parser.CharacterReader");
        argTypes[2] = Class.forName("org.jsoup.parser.TokeniserState");
        Object[] args = new Object[3];
        args[0] = term283543;
        args[1] = term283779;
        args[2] = null;
        callMethod(klass, "handleDataEndTag", argTypes, null, args);
        assertTrue(recursiveEquals(term283543, term288214));
        assertTrue(recursiveEquals(term283779, term288215));
    }

};


