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

public class TokeniserState_handleDataEndTag_31681323097 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term174503;
     Object term174833;
     Object term179092;
     Object term179093;

    public TokeniserState_handleDataEndTag_31681323097() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term174703 = new StringBuilder();
        char[] term173397 = (char[]) newCharArray(489);
        StringBuilder term174763 = new StringBuilder();
        ((StringBuilder) term174763).append(term173397);
        term174503 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term174605 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term174503, term174503.getClass(), "lastStartTag", "");
        setField(term174605, term174605.getClass(), "tagName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        setField(term174503, term174503.getClass(), "tagPending", term174605);
        setField(term174503, term174503.getClass(), "dataBuffer", term174703);
        setField(term174503, term174503.getClass(), "charsString", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        setField(term174503, term174503.getClass(), "charsBuilder", term174763);
        term174833 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term174833, term174833.getClass(), "pos", -2147483648);
        setIntField(term174833, term174833.getClass(), "length", -2147483648);
        term179092 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term179092, term179092.getClass(), "input", null);
        setIntField(term179092, term179092.getClass(), "length", -2147483648);
        setIntField(term179092, term179092.getClass(), "pos", -2147483648);
        setIntField(term179092, term179092.getClass(), "mark", 0);
        setField(term179092, term179092.getClass(), "stringCache", null);
        term179093 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term179096 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term179097 = (byte[]) newByteArray(980);
        Object term179098 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term179099 = (byte[]) newByteArray(16);
        Object term179100 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term179093, term179093.getClass(), "reader", null);
        setField(term179093, term179093.getClass(), "errors", null);
        setField(term179093, term179093.getClass(), "state", null);
        setField(term179093, term179093.getClass(), "emitPending", null);
        setBooleanField(term179093, term179093.getClass(), "isEmitPending", false);
        setField(term179093, term179093.getClass(), "charsString", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        setByteElement(term179097, 489, (byte) 60);
        setByteElement(term179097, 490, (byte) 47);
        setField(term179096, term179096.getClass(), "value", term179097);
        setByteField(term179096, term179096.getClass(), "coder", (byte) 0);
        setIntField(term179096, term179096.getClass(), "count", 491);
        setField(term179093, term179093.getClass(), "charsBuilder", term179096);
        setField(term179098, term179098.getClass(), "value", term179099);
        setByteField(term179098, term179098.getClass(), "coder", (byte) 0);
        setIntField(term179098, term179098.getClass(), "count", 0);
        setField(term179093, term179093.getClass(), "dataBuffer", term179098);
        setField(term179100, term179100.getClass(), "tagName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        setField(term179100, term179100.getClass(), "normalName", null);
        setField(term179100, term179100.getClass(), "pendingAttributeName", null);
        setField(term179100, term179100.getClass(), "pendingAttributeValue", null);
        setField(term179100, term179100.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term179100, term179100.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term179100, term179100.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term179100, term179100.getClass(), "selfClosing", false);
        setField(term179100, term179100.getClass(), "attributes", null);
        setField(term179100, term179100.getClass(), "type", null);
        setField(term179093, term179093.getClass(), "tagPending", term179100);
        setField(term179093, term179093.getClass(), "startPending", null);
        setField(term179093, term179093.getClass(), "endPending", null);
        setField(term179093, term179093.getClass(), "charPending", null);
        setField(term179093, term179093.getClass(), "doctypePending", null);
        setField(term179093, term179093.getClass(), "commentPending", null);
        setField(term179093, term179093.getClass(), "lastStartTag", "");
        setBooleanField(term179093, term179093.getClass(), "selfClosingFlagAcknowledged", false);
        setField(term179093, term179093.getClass(), "codepointHolder", null);
        setField(term179093, term179093.getClass(), "multipointHolder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TokeniserState");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.jsoup.parser.Tokeniser");
        argTypes[1] = Class.forName("org.jsoup.parser.CharacterReader");
        argTypes[2] = Class.forName("org.jsoup.parser.TokeniserState");
        Object[] args = new Object[3];
        args[0] = term174503;
        args[1] = term174833;
        args[2] = null;
        callMethod(klass, "handleDataEndTag", argTypes, null, args);
        assertTrue(recursiveEquals(term174503, term179092));
        assertTrue(recursiveEquals(term174833, term179093));
    }

};


