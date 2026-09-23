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

public class Tokeniser_isAppropriateEndTagToken_1514320479387 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term365378;
     Object term367593;

    public Tokeniser_isAppropriateEndTagToken_1514320479387() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term365378 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term365480 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term365378, term365378.getClass(), "lastStartTag", "");
        setField(term365480, term365480.getClass(), "tagName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        setField(term365378, term365378.getClass(), "tagPending", term365480);
        term367593 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term367594 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term367593, term367593.getClass(), "reader", null);
        setField(term367593, term367593.getClass(), "errors", null);
        setField(term367593, term367593.getClass(), "state", null);
        setField(term367593, term367593.getClass(), "emitPending", null);
        setBooleanField(term367593, term367593.getClass(), "isEmitPending", false);
        setField(term367593, term367593.getClass(), "charsString", null);
        setField(term367593, term367593.getClass(), "charsBuilder", null);
        setField(term367593, term367593.getClass(), "dataBuffer", null);
        setField(term367594, term367594.getClass(), "tagName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        setField(term367594, term367594.getClass(), "normalName", null);
        setField(term367594, term367594.getClass(), "pendingAttributeName", null);
        setField(term367594, term367594.getClass(), "pendingAttributeValue", null);
        setField(term367594, term367594.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term367594, term367594.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term367594, term367594.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term367594, term367594.getClass(), "selfClosing", false);
        setField(term367594, term367594.getClass(), "attributes", null);
        setField(term367594, term367594.getClass(), "type", null);
        setField(term367593, term367593.getClass(), "tagPending", term367594);
        setField(term367593, term367593.getClass(), "startPending", null);
        setField(term367593, term367593.getClass(), "endPending", null);
        setField(term367593, term367593.getClass(), "charPending", null);
        setField(term367593, term367593.getClass(), "doctypePending", null);
        setField(term367593, term367593.getClass(), "commentPending", null);
        setField(term367593, term367593.getClass(), "lastStartTag", "");
        setBooleanField(term367593, term367593.getClass(), "selfClosingFlagAcknowledged", false);
        setField(term367593, term367593.getClass(), "codepointHolder", null);
        setField(term367593, term367593.getClass(), "multipointHolder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isAppropriateEndTagToken", argTypes, term365378, args);
        assertTrue(recursiveEquals(term365378, term367593));
        assertTrue(recursiveEquals(retValue, false));
    }

};


