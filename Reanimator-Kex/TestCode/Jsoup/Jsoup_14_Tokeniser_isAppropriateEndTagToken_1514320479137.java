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

public class Tokeniser_isAppropriateEndTagToken_1514320479137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term224857;
     Object term225083;

    public Tokeniser_isAppropriateEndTagToken_1514320479137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term224857 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term224925 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term225031 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term224925, term224925.getClass(), "tagName", "");
        setField(term224857, term224857.getClass(), "tagPending", term224925);
        setField(term225031, term225031.getClass(), "tagName", "");
        setField(term224857, term224857.getClass(), "lastStartTag", term225031);
        term225083 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term225084 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term225087 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term225083, term225083.getClass(), "reader", null);
        setBooleanField(term225083, term225083.getClass(), "trackErrors", false);
        setField(term225083, term225083.getClass(), "errors", null);
        setField(term225083, term225083.getClass(), "state", null);
        setField(term225083, term225083.getClass(), "emitPending", null);
        setBooleanField(term225083, term225083.getClass(), "isEmitPending", false);
        setField(term225083, term225083.getClass(), "charBuffer", null);
        setField(term225083, term225083.getClass(), "dataBuffer", null);
        setField(term225084, term225084.getClass(), "tagName", "");
        setField(term225084, term225084.getClass(), "pendingAttributeName", null);
        setField(term225084, term225084.getClass(), "pendingAttributeValue", null);
        setBooleanField(term225084, term225084.getClass(), "selfClosing", false);
        setField(term225084, term225084.getClass(), "attributes", null);
        setField(term225084, term225084.getClass(), "type", null);
        setField(term225083, term225083.getClass(), "tagPending", term225084);
        setField(term225083, term225083.getClass(), "doctypePending", null);
        setField(term225083, term225083.getClass(), "commentPending", null);
        setField(term225087, term225087.getClass(), "tagName", "");
        setField(term225087, term225087.getClass(), "pendingAttributeName", null);
        setField(term225087, term225087.getClass(), "pendingAttributeValue", null);
        setBooleanField(term225087, term225087.getClass(), "selfClosing", false);
        setField(term225087, term225087.getClass(), "attributes", null);
        setField(term225087, term225087.getClass(), "type", null);
        setField(term225083, term225083.getClass(), "lastStartTag", term225087);
        setBooleanField(term225083, term225083.getClass(), "selfClosingFlagAcknowledged", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isAppropriateEndTagToken", argTypes, term224857, args);
        assertTrue(recursiveEquals(term224857, term225083));
    }

};


