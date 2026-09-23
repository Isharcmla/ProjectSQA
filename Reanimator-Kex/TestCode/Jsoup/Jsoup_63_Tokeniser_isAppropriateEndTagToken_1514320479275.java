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

public class Tokeniser_isAppropriateEndTagToken_1514320479275 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term236871;
     Object term239401;

    public Tokeniser_isAppropriateEndTagToken_1514320479275() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term236871 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term236977 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term236871, term236871.getClass(), "lastStartTag", "");
        setField(term236977, term236977.getClass(), "tagName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        setField(term236871, term236871.getClass(), "tagPending", term236977);
        term239401 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term239402 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term239401, term239401.getClass(), "reader", null);
        setField(term239401, term239401.getClass(), "errors", null);
        setField(term239401, term239401.getClass(), "state", null);
        setField(term239401, term239401.getClass(), "emitPending", null);
        setBooleanField(term239401, term239401.getClass(), "isEmitPending", false);
        setField(term239401, term239401.getClass(), "charsString", null);
        setField(term239401, term239401.getClass(), "charsBuilder", null);
        setField(term239401, term239401.getClass(), "dataBuffer", null);
        setField(term239402, term239402.getClass(), "tagName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
        setField(term239402, term239402.getClass(), "normalName", null);
        setField(term239402, term239402.getClass(), "pendingAttributeName", null);
        setField(term239402, term239402.getClass(), "pendingAttributeValue", null);
        setField(term239402, term239402.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term239402, term239402.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term239402, term239402.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term239402, term239402.getClass(), "selfClosing", false);
        setField(term239402, term239402.getClass(), "attributes", null);
        setField(term239402, term239402.getClass(), "type", null);
        setField(term239401, term239401.getClass(), "tagPending", term239402);
        setField(term239401, term239401.getClass(), "startPending", null);
        setField(term239401, term239401.getClass(), "endPending", null);
        setField(term239401, term239401.getClass(), "charPending", null);
        setField(term239401, term239401.getClass(), "doctypePending", null);
        setField(term239401, term239401.getClass(), "commentPending", null);
        setField(term239401, term239401.getClass(), "lastStartTag", "");
        setBooleanField(term239401, term239401.getClass(), "selfClosingFlagAcknowledged", false);
        setField(term239401, term239401.getClass(), "codepointHolder", null);
        setField(term239401, term239401.getClass(), "multipointHolder", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "isAppropriateEndTagToken", argTypes, term236871, args);
        assertTrue(recursiveEquals(term236871, term239401));
        assertTrue(recursiveEquals(retValue, false));
    }

};


