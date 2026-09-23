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

public class TokeniserState_handleDataEndTag_316813230131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term249665;
     Object term249939;
     Object term251962;
     Object term251963;

    public TokeniserState_handleDataEndTag_316813230131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term249869 = new StringBuilder();
        term249665 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term249771 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term249665, term249665.getClass(), "lastStartTag", "");
        setField(term249771, term249771.getClass(), "tagName", "</                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ");
        setField(term249665, term249665.getClass(), "tagPending", term249771);
        setField(term249665, term249665.getClass(), "dataBuffer", term249869);
        term249939 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term249939, term249939.getClass(), "pos", -2147483648);
        setIntField(term249939, term249939.getClass(), "length", -2147483648);
        term251962 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term251962, term251962.getClass(), "input", null);
        setIntField(term251962, term251962.getClass(), "length", -2147483648);
        setIntField(term251962, term251962.getClass(), "pos", -2147483648);
        setIntField(term251962, term251962.getClass(), "mark", 0);
        setField(term251962, term251962.getClass(), "stringCache", null);
        term251963 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term251966 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term251967 = (byte[]) newByteArray(16);
        Object term251968 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term251963, term251963.getClass(), "reader", null);
        setField(term251963, term251963.getClass(), "errors", null);
        setField(term251963, term251963.getClass(), "state", null);
        setField(term251963, term251963.getClass(), "emitPending", null);
        setBooleanField(term251963, term251963.getClass(), "isEmitPending", false);
        setField(term251963, term251963.getClass(), "charsString", "</");
        setField(term251963, term251963.getClass(), "charsBuilder", null);
        setField(term251966, term251966.getClass(), "value", term251967);
        setByteField(term251966, term251966.getClass(), "coder", (byte) 0);
        setIntField(term251966, term251966.getClass(), "count", 0);
        setField(term251963, term251963.getClass(), "dataBuffer", term251966);
        setField(term251968, term251968.getClass(), "tagName", "</                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ");
        setField(term251968, term251968.getClass(), "normalName", null);
        setField(term251968, term251968.getClass(), "pendingAttributeName", null);
        setField(term251968, term251968.getClass(), "pendingAttributeValue", null);
        setField(term251968, term251968.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term251968, term251968.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term251968, term251968.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term251968, term251968.getClass(), "selfClosing", false);
        setField(term251968, term251968.getClass(), "attributes", null);
        setField(term251968, term251968.getClass(), "type", null);
        setField(term251963, term251963.getClass(), "tagPending", term251968);
        setField(term251963, term251963.getClass(), "startPending", null);
        setField(term251963, term251963.getClass(), "endPending", null);
        setField(term251963, term251963.getClass(), "charPending", null);
        setField(term251963, term251963.getClass(), "doctypePending", null);
        setField(term251963, term251963.getClass(), "commentPending", null);
        setField(term251963, term251963.getClass(), "lastStartTag", "");
        setBooleanField(term251963, term251963.getClass(), "selfClosingFlagAcknowledged", false);
        setField(term251963, term251963.getClass(), "codepointHolder", null);
        setField(term251963, term251963.getClass(), "multipointHolder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TokeniserState");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.jsoup.parser.Tokeniser");
        argTypes[1] = Class.forName("org.jsoup.parser.CharacterReader");
        argTypes[2] = Class.forName("org.jsoup.parser.TokeniserState");
        Object[] args = new Object[3];
        args[0] = term249665;
        args[1] = term249939;
        args[2] = null;
        callMethod(klass, "handleDataEndTag", argTypes, null, args);
        assertTrue(recursiveEquals(term249665, term251962));
        assertTrue(recursiveEquals(term249939, term251963));
    }

};


