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

public class TokeniserState_handleDataEndTag_316813230173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term268649;
     Object term268919;
     Object term271976;
     Object term271977;

    public TokeniserState_handleDataEndTag_316813230173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term268849 = new StringBuilder();
        term268649 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term268751 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term268649, term268649.getClass(), "lastStartTag", "");
        setField(term268751, term268751.getClass(), "tagName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
        setField(term268649, term268649.getClass(), "tagPending", term268751);
        setField(term268649, term268649.getClass(), "dataBuffer", term268849);
        setField(term268649, term268649.getClass(), "charsString", null);
        term268919 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term268919, term268919.getClass(), "bufPos", -2147483648);
        setIntField(term268919, term268919.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term268919, term268919.getClass(), "bufLength", -2147483648);
        term271976 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term271976, term271976.getClass(), "charBuf", null);
        setField(term271976, term271976.getClass(), "reader", null);
        setIntField(term271976, term271976.getClass(), "bufLength", -2147483648);
        setIntField(term271976, term271976.getClass(), "bufSplitPoint", -2147483647);
        setIntField(term271976, term271976.getClass(), "bufPos", -2147483648);
        setIntField(term271976, term271976.getClass(), "readerPos", 0);
        setIntField(term271976, term271976.getClass(), "bufMark", 0);
        setField(term271976, term271976.getClass(), "stringCache", null);
        term271977 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term271980 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term271981 = (byte[]) newByteArray(16);
        Object term271982 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term271977, term271977.getClass(), "reader", null);
        setField(term271977, term271977.getClass(), "errors", null);
        setField(term271977, term271977.getClass(), "state", null);
        setField(term271977, term271977.getClass(), "emitPending", null);
        setBooleanField(term271977, term271977.getClass(), "isEmitPending", false);
        setField(term271977, term271977.getClass(), "charsString", "</");
        setField(term271977, term271977.getClass(), "charsBuilder", null);
        setField(term271980, term271980.getClass(), "value", term271981);
        setByteField(term271980, term271980.getClass(), "coder", (byte) 0);
        setIntField(term271980, term271980.getClass(), "count", 0);
        setField(term271977, term271977.getClass(), "dataBuffer", term271980);
        setField(term271982, term271982.getClass(), "tagName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           ");
        setField(term271982, term271982.getClass(), "normalName", null);
        setField(term271982, term271982.getClass(), "pendingAttributeName", null);
        setField(term271982, term271982.getClass(), "pendingAttributeValue", null);
        setField(term271982, term271982.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term271982, term271982.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term271982, term271982.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term271982, term271982.getClass(), "selfClosing", false);
        setField(term271982, term271982.getClass(), "attributes", null);
        setField(term271982, term271982.getClass(), "type", null);
        setField(term271977, term271977.getClass(), "tagPending", term271982);
        setField(term271977, term271977.getClass(), "startPending", null);
        setField(term271977, term271977.getClass(), "endPending", null);
        setField(term271977, term271977.getClass(), "charPending", null);
        setField(term271977, term271977.getClass(), "doctypePending", null);
        setField(term271977, term271977.getClass(), "commentPending", null);
        setField(term271977, term271977.getClass(), "lastStartTag", "");
        setField(term271977, term271977.getClass(), "codepointHolder", null);
        setField(term271977, term271977.getClass(), "multipointHolder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TokeniserState");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.jsoup.parser.Tokeniser");
        argTypes[1] = Class.forName("org.jsoup.parser.CharacterReader");
        argTypes[2] = Class.forName("org.jsoup.parser.TokeniserState");
        Object[] args = new Object[3];
        args[0] = term268649;
        args[1] = term268919;
        args[2] = null;
        callMethod(klass, "handleDataEndTag", argTypes, null, args);
        assertTrue(recursiveEquals(term268649, term271976));
        assertTrue(recursiveEquals(term268919, term271977));
    }

};


