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

public class Tokeniser_isAppropriateEndTagToken_1514320479343 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term303405;
     Object term306094;

    public Tokeniser_isAppropriateEndTagToken_1514320479343() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term303405 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term303507 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term303405, term303405.getClass(), "lastStartTag", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        setField(term303507, term303507.getClass(), "tagName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        setField(term303405, term303405.getClass(), "tagPending", term303507);
        term306094 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term306095 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term306094, term306094.getClass(), "reader", null);
        setField(term306094, term306094.getClass(), "errors", null);
        setField(term306094, term306094.getClass(), "state", null);
        setField(term306094, term306094.getClass(), "emitPending", null);
        setBooleanField(term306094, term306094.getClass(), "isEmitPending", false);
        setField(term306094, term306094.getClass(), "charsString", null);
        setField(term306094, term306094.getClass(), "charsBuilder", null);
        setField(term306094, term306094.getClass(), "dataBuffer", null);
        setField(term306095, term306095.getClass(), "tagName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        setField(term306095, term306095.getClass(), "normalName", null);
        setField(term306095, term306095.getClass(), "pendingAttributeName", null);
        setField(term306095, term306095.getClass(), "pendingAttributeValue", null);
        setField(term306095, term306095.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term306095, term306095.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term306095, term306095.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term306095, term306095.getClass(), "selfClosing", false);
        setField(term306095, term306095.getClass(), "attributes", null);
        setField(term306095, term306095.getClass(), "type", null);
        setField(term306094, term306094.getClass(), "tagPending", term306095);
        setField(term306094, term306094.getClass(), "startPending", null);
        setField(term306094, term306094.getClass(), "endPending", null);
        setField(term306094, term306094.getClass(), "charPending", null);
        setField(term306094, term306094.getClass(), "doctypePending", null);
        setField(term306094, term306094.getClass(), "commentPending", null);
        setField(term306094, term306094.getClass(), "lastStartTag", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        setBooleanField(term306094, term306094.getClass(), "selfClosingFlagAcknowledged", false);
        setField(term306094, term306094.getClass(), "codepointHolder", null);
        setField(term306094, term306094.getClass(), "multipointHolder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isAppropriateEndTagToken", argTypes, term303405, args);
        assertTrue(recursiveEquals(term303405, term306094));
        assertTrue(recursiveEquals(retValue, true));
    }

};


