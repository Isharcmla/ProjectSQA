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

public class TokeniserState_handleDataEndTag_316813230117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term222641;
     Object term222873;
     Object term227308;
     Object term227309;

    public TokeniserState_handleDataEndTag_316813230117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term222803 = new StringBuilder();
        term222641 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term222743 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term222641, term222641.getClass(), "lastStartTag", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term222743, term222743.getClass(), "tagName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term222641, term222641.getClass(), "tagPending", term222743);
        setField(term222641, term222641.getClass(), "dataBuffer", term222803);
        setField(term222641, term222641.getClass(), "charsString", null);
        term222873 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term222873, term222873.getClass(), "pos", -2147483648);
        setIntField(term222873, term222873.getClass(), "length", -2147483648);
        term227308 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term227308, term227308.getClass(), "input", null);
        setIntField(term227308, term227308.getClass(), "length", -2147483648);
        setIntField(term227308, term227308.getClass(), "pos", -2147483648);
        setIntField(term227308, term227308.getClass(), "mark", 0);
        setField(term227308, term227308.getClass(), "stringCache", null);
        term227309 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term227312 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term227313 = (byte[]) newByteArray(16);
        Object term227314 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term227309, term227309.getClass(), "reader", null);
        setField(term227309, term227309.getClass(), "errors", null);
        setField(term227309, term227309.getClass(), "state", null);
        setField(term227309, term227309.getClass(), "emitPending", null);
        setBooleanField(term227309, term227309.getClass(), "isEmitPending", false);
        setField(term227309, term227309.getClass(), "charsString", "</");
        setField(term227309, term227309.getClass(), "charsBuilder", null);
        setField(term227312, term227312.getClass(), "value", term227313);
        setByteField(term227312, term227312.getClass(), "coder", (byte) 0);
        setIntField(term227312, term227312.getClass(), "count", 0);
        setField(term227309, term227309.getClass(), "dataBuffer", term227312);
        setField(term227314, term227314.getClass(), "tagName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term227314, term227314.getClass(), "normalName", null);
        setField(term227314, term227314.getClass(), "pendingAttributeName", null);
        setField(term227314, term227314.getClass(), "pendingAttributeValue", null);
        setField(term227314, term227314.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term227314, term227314.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term227314, term227314.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term227314, term227314.getClass(), "selfClosing", false);
        setField(term227314, term227314.getClass(), "attributes", null);
        setField(term227314, term227314.getClass(), "type", null);
        setField(term227309, term227309.getClass(), "tagPending", term227314);
        setField(term227309, term227309.getClass(), "startPending", null);
        setField(term227309, term227309.getClass(), "endPending", null);
        setField(term227309, term227309.getClass(), "charPending", null);
        setField(term227309, term227309.getClass(), "doctypePending", null);
        setField(term227309, term227309.getClass(), "commentPending", null);
        setField(term227309, term227309.getClass(), "lastStartTag", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setBooleanField(term227309, term227309.getClass(), "selfClosingFlagAcknowledged", false);
        setField(term227309, term227309.getClass(), "codepointHolder", null);
        setField(term227309, term227309.getClass(), "multipointHolder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TokeniserState");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.jsoup.parser.Tokeniser");
        argTypes[1] = Class.forName("org.jsoup.parser.CharacterReader");
        argTypes[2] = Class.forName("org.jsoup.parser.TokeniserState");
        Object[] args = new Object[3];
        args[0] = term222641;
        args[1] = term222873;
        args[2] = null;
        callMethod(klass, "handleDataEndTag", argTypes, null, args);
        assertTrue(recursiveEquals(term222641, term227308));
        assertTrue(recursiveEquals(term222873, term227309));
    }

};


