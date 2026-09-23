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

public class Tokeniser_emit_1272425389105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term107556;
     Object term107620;
     Object term107665;
     Object term107667;

    public Tokeniser_emit_1272425389105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term107556 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setBooleanField(term107556, term107556.getClass(), "isEmitPending", false);
        setField(term107556, term107556.getClass(), "emitPending", null);
        term107620 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        term107665 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term107666 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term107665, term107665.getClass(), "reader", null);
        setField(term107665, term107665.getClass(), "errors", null);
        setField(term107665, term107665.getClass(), "state", null);
        setField(term107666, term107666.getClass(), "tagName", null);
        setField(term107666, term107666.getClass(), "pendingAttributeName", null);
        setField(term107666, term107666.getClass(), "pendingAttributeValue", null);
        setBooleanField(term107666, term107666.getClass(), "selfClosing", false);
        setField(term107666, term107666.getClass(), "attributes", null);
        setField(term107666, term107666.getClass(), "type", null);
        setField(term107665, term107665.getClass(), "emitPending", term107666);
        setBooleanField(term107665, term107665.getClass(), "isEmitPending", true);
        setField(term107665, term107665.getClass(), "charBuffer", null);
        setField(term107665, term107665.getClass(), "dataBuffer", null);
        setField(term107665, term107665.getClass(), "tagPending", null);
        setField(term107665, term107665.getClass(), "doctypePending", null);
        setField(term107665, term107665.getClass(), "commentPending", null);
        setField(term107665, term107665.getClass(), "lastStartTag", null);
        setBooleanField(term107665, term107665.getClass(), "selfClosingFlagAcknowledged", false);
        term107667 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term107667, term107667.getClass(), "tagName", null);
        setField(term107667, term107667.getClass(), "pendingAttributeName", null);
        setField(term107667, term107667.getClass(), "pendingAttributeValue", null);
        setBooleanField(term107667, term107667.getClass(), "selfClosing", false);
        setField(term107667, term107667.getClass(), "attributes", null);
        setField(term107667, term107667.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = term107620;
        callMethod(klass, "emit", argTypes, term107556, args);
        assertTrue(recursiveEquals(term107556, term107665));
        assertTrue(recursiveEquals(term107620, term107667));
    }

};


