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

public class Tokeniser_emit_127242538956 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term180275;
     Object term180343;
     Object term180458;
     Object term180460;

    public Tokeniser_emit_127242538956() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term180275 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setBooleanField(term180275, term180275.getClass(), "isEmitPending", false);
        setField(term180275, term180275.getClass(), "emitPending", null);
        term180343 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        term180458 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term180459 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term180458, term180458.getClass(), "reader", null);
        setBooleanField(term180458, term180458.getClass(), "trackErrors", false);
        setField(term180458, term180458.getClass(), "errors", null);
        setField(term180458, term180458.getClass(), "state", null);
        setField(term180459, term180459.getClass(), "tagName", null);
        setField(term180459, term180459.getClass(), "pendingAttributeName", null);
        setField(term180459, term180459.getClass(), "pendingAttributeValue", null);
        setBooleanField(term180459, term180459.getClass(), "selfClosing", false);
        setField(term180459, term180459.getClass(), "attributes", null);
        setField(term180459, term180459.getClass(), "type", null);
        setField(term180458, term180458.getClass(), "emitPending", term180459);
        setBooleanField(term180458, term180458.getClass(), "isEmitPending", true);
        setField(term180458, term180458.getClass(), "charBuffer", null);
        setField(term180458, term180458.getClass(), "dataBuffer", null);
        setField(term180458, term180458.getClass(), "tagPending", null);
        setField(term180458, term180458.getClass(), "doctypePending", null);
        setField(term180458, term180458.getClass(), "commentPending", null);
        setField(term180458, term180458.getClass(), "lastStartTag", null);
        setBooleanField(term180458, term180458.getClass(), "selfClosingFlagAcknowledged", false);
        term180460 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setField(term180460, term180460.getClass(), "tagName", null);
        setField(term180460, term180460.getClass(), "pendingAttributeName", null);
        setField(term180460, term180460.getClass(), "pendingAttributeValue", null);
        setBooleanField(term180460, term180460.getClass(), "selfClosing", false);
        setField(term180460, term180460.getClass(), "attributes", null);
        setField(term180460, term180460.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term180343;
        callMethod(klass, "emit", argTypes, term180275, args);
        assertTrue(recursiveEquals(term180275, term180458));
        assertTrue(recursiveEquals(term180343, term180460));
    }

};


