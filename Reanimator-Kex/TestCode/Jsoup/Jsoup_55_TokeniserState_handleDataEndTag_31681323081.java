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

public class TokeniserState_handleDataEndTag_31681323081 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term163280;
     Object term163554;
     Object term165577;
     Object term165578;

    public TokeniserState_handleDataEndTag_31681323081() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term163484 = new StringBuilder();
        term163280 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term163386 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term163280, term163280.getClass(), "lastStartTag", "");
        setField(term163386, term163386.getClass(), "tagName", "</                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ");
        setField(term163280, term163280.getClass(), "tagPending", term163386);
        setField(term163280, term163280.getClass(), "dataBuffer", term163484);
        term163554 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term163554, term163554.getClass(), "pos", -2147483648);
        setIntField(term163554, term163554.getClass(), "length", -2147483648);
        term165577 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term165577, term165577.getClass(), "input", null);
        setIntField(term165577, term165577.getClass(), "length", -2147483648);
        setIntField(term165577, term165577.getClass(), "pos", -2147483648);
        setIntField(term165577, term165577.getClass(), "mark", 0);
        setField(term165577, term165577.getClass(), "stringCache", null);
        term165578 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term165581 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term165582 = (byte[]) newByteArray(16);
        Object term165583 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term165578, term165578.getClass(), "reader", null);
        setField(term165578, term165578.getClass(), "errors", null);
        setField(term165578, term165578.getClass(), "state", null);
        setField(term165578, term165578.getClass(), "emitPending", null);
        setBooleanField(term165578, term165578.getClass(), "isEmitPending", false);
        setField(term165578, term165578.getClass(), "charsString", "</");
        setField(term165578, term165578.getClass(), "charsBuilder", null);
        setField(term165581, term165581.getClass(), "value", term165582);
        setByteField(term165581, term165581.getClass(), "coder", (byte) 0);
        setIntField(term165581, term165581.getClass(), "count", 0);
        setField(term165578, term165578.getClass(), "dataBuffer", term165581);
        setField(term165583, term165583.getClass(), "tagName", "</                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ");
        setField(term165583, term165583.getClass(), "normalName", null);
        setField(term165583, term165583.getClass(), "pendingAttributeName", null);
        setField(term165583, term165583.getClass(), "pendingAttributeValue", null);
        setField(term165583, term165583.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term165583, term165583.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term165583, term165583.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term165583, term165583.getClass(), "selfClosing", false);
        setField(term165583, term165583.getClass(), "attributes", null);
        setField(term165583, term165583.getClass(), "type", null);
        setField(term165578, term165578.getClass(), "tagPending", term165583);
        setField(term165578, term165578.getClass(), "startPending", null);
        setField(term165578, term165578.getClass(), "endPending", null);
        setField(term165578, term165578.getClass(), "charPending", null);
        setField(term165578, term165578.getClass(), "doctypePending", null);
        setField(term165578, term165578.getClass(), "commentPending", null);
        setField(term165578, term165578.getClass(), "lastStartTag", "");
        setBooleanField(term165578, term165578.getClass(), "selfClosingFlagAcknowledged", false);
        setField(term165578, term165578.getClass(), "codepointHolder", null);
        setField(term165578, term165578.getClass(), "multipointHolder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TokeniserState");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.jsoup.parser.Tokeniser");
        argTypes[1] = Class.forName("org.jsoup.parser.CharacterReader");
        argTypes[2] = Class.forName("org.jsoup.parser.TokeniserState");
        Object[] args = new Object[3];
        args[0] = term163280;
        args[1] = term163554;
        args[2] = null;
        callMethod(klass, "handleDataEndTag", argTypes, null, args);
        assertTrue(recursiveEquals(term163280, term165577));
        assertTrue(recursiveEquals(term163554, term165578));
    }

};


