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

public class TokeniserState_handleDataEndTag_316813230103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term164003;
     Object term164273;
     Object term166298;
     Object term166299;

    public TokeniserState_handleDataEndTag_316813230103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term164203 = new StringBuilder();
        term164003 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term164105 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term164003, term164003.getClass(), "lastStartTag", "");
        setField(term164105, term164105.getClass(), "tagName", "</                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ");
        setField(term164003, term164003.getClass(), "tagPending", term164105);
        setField(term164003, term164003.getClass(), "dataBuffer", term164203);
        term164273 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term164273, term164273.getClass(), "bufPos", -2147483648);
        setIntField(term164273, term164273.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term164273, term164273.getClass(), "bufLength", -2147483648);
        term166298 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term166298, term166298.getClass(), "charBuf", null);
        setField(term166298, term166298.getClass(), "reader", null);
        setIntField(term166298, term166298.getClass(), "bufLength", -2147483648);
        setIntField(term166298, term166298.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term166298, term166298.getClass(), "bufPos", -2147483648);
        setIntField(term166298, term166298.getClass(), "readerPos", 0);
        setIntField(term166298, term166298.getClass(), "bufMark", 0);
        setField(term166298, term166298.getClass(), "stringCache", null);
        term166299 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term166302 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term166303 = (byte[]) newByteArray(16);
        Object term166304 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term166299, term166299.getClass(), "reader", null);
        setField(term166299, term166299.getClass(), "errors", null);
        setField(term166299, term166299.getClass(), "state", null);
        setField(term166299, term166299.getClass(), "emitPending", null);
        setBooleanField(term166299, term166299.getClass(), "isEmitPending", false);
        setField(term166299, term166299.getClass(), "charsString", "</");
        setField(term166299, term166299.getClass(), "charsBuilder", null);
        setField(term166302, term166302.getClass(), "value", term166303);
        setByteField(term166302, term166302.getClass(), "coder", (byte) 0);
        setIntField(term166302, term166302.getClass(), "count", 0);
        setField(term166299, term166299.getClass(), "dataBuffer", term166302);
        setField(term166304, term166304.getClass(), "tagName", "</                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       ");
        setField(term166304, term166304.getClass(), "normalName", null);
        setField(term166304, term166304.getClass(), "pendingAttributeName", null);
        setField(term166304, term166304.getClass(), "pendingAttributeValue", null);
        setField(term166304, term166304.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term166304, term166304.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term166304, term166304.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term166304, term166304.getClass(), "selfClosing", false);
        setField(term166304, term166304.getClass(), "attributes", null);
        setField(term166304, term166304.getClass(), "type", null);
        setField(term166299, term166299.getClass(), "tagPending", term166304);
        setField(term166299, term166299.getClass(), "startPending", null);
        setField(term166299, term166299.getClass(), "endPending", null);
        setField(term166299, term166299.getClass(), "charPending", null);
        setField(term166299, term166299.getClass(), "doctypePending", null);
        setField(term166299, term166299.getClass(), "commentPending", null);
        setField(term166299, term166299.getClass(), "lastStartTag", "");
        setField(term166299, term166299.getClass(), "codepointHolder", null);
        setField(term166299, term166299.getClass(), "multipointHolder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TokeniserState");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.jsoup.parser.Tokeniser");
        argTypes[1] = Class.forName("org.jsoup.parser.CharacterReader");
        argTypes[2] = Class.forName("org.jsoup.parser.TokeniserState");
        Object[] args = new Object[3];
        args[0] = term164003;
        args[1] = term164273;
        args[2] = null;
        callMethod(klass, "handleDataEndTag", argTypes, null, args);
        assertTrue(recursiveEquals(term164003, term166298));
        assertTrue(recursiveEquals(term164273, term166299));
    }

};


