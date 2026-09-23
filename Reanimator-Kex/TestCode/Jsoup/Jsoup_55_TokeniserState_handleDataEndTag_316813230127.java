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

public class TokeniserState_handleDataEndTag_316813230127 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term255167;
     Object term255403;
     Object term259839;
     Object term259840;

    public TokeniserState_handleDataEndTag_316813230127() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        StringBuilder term255333 = new StringBuilder();
        term255167 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term255273 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term255167, term255167.getClass(), "lastStartTag", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term255273, term255273.getClass(), "tagName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term255167, term255167.getClass(), "tagPending", term255273);
        setField(term255167, term255167.getClass(), "dataBuffer", term255333);
        setField(term255167, term255167.getClass(), "charsString", null);
        term255403 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setIntField(term255403, term255403.getClass(), "pos", -2147483648);
        setIntField(term255403, term255403.getClass(), "length", -2147483648);
        term259839 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        setField(term259839, term259839.getClass(), "input", null);
        setIntField(term259839, term259839.getClass(), "length", -2147483648);
        setIntField(term259839, term259839.getClass(), "pos", -2147483648);
        setIntField(term259839, term259839.getClass(), "mark", 0);
        setField(term259839, term259839.getClass(), "stringCache", null);
        term259840 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term259843 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term259844 = (byte[]) newByteArray(16);
        Object term259845 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term259840, term259840.getClass(), "reader", null);
        setField(term259840, term259840.getClass(), "errors", null);
        setField(term259840, term259840.getClass(), "state", null);
        setField(term259840, term259840.getClass(), "emitPending", null);
        setBooleanField(term259840, term259840.getClass(), "isEmitPending", false);
        setField(term259840, term259840.getClass(), "charsString", "</");
        setField(term259840, term259840.getClass(), "charsBuilder", null);
        setField(term259843, term259843.getClass(), "value", term259844);
        setByteField(term259843, term259843.getClass(), "coder", (byte) 0);
        setIntField(term259843, term259843.getClass(), "count", 0);
        setField(term259840, term259840.getClass(), "dataBuffer", term259843);
        setField(term259845, term259845.getClass(), "tagName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term259845, term259845.getClass(), "normalName", null);
        setField(term259845, term259845.getClass(), "pendingAttributeName", null);
        setField(term259845, term259845.getClass(), "pendingAttributeValue", null);
        setField(term259845, term259845.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term259845, term259845.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term259845, term259845.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term259845, term259845.getClass(), "selfClosing", false);
        setField(term259845, term259845.getClass(), "attributes", null);
        setField(term259845, term259845.getClass(), "type", null);
        setField(term259840, term259840.getClass(), "tagPending", term259845);
        setField(term259840, term259840.getClass(), "startPending", null);
        setField(term259840, term259840.getClass(), "endPending", null);
        setField(term259840, term259840.getClass(), "charPending", null);
        setField(term259840, term259840.getClass(), "doctypePending", null);
        setField(term259840, term259840.getClass(), "commentPending", null);
        setField(term259840, term259840.getClass(), "lastStartTag", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setBooleanField(term259840, term259840.getClass(), "selfClosingFlagAcknowledged", false);
        setField(term259840, term259840.getClass(), "codepointHolder", null);
        setField(term259840, term259840.getClass(), "multipointHolder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TokeniserState");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.jsoup.parser.Tokeniser");
        argTypes[1] = Class.forName("org.jsoup.parser.CharacterReader");
        argTypes[2] = Class.forName("org.jsoup.parser.TokeniserState");
        Object[] args = new Object[3];
        args[0] = term255167;
        args[1] = term255403;
        args[2] = null;
        callMethod(klass, "handleDataEndTag", argTypes, null, args);
        assertTrue(recursiveEquals(term255167, term259839));
        assertTrue(recursiveEquals(term255403, term259840));
    }

};


