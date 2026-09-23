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

public class HtmlTreeBuilder_isFosterInserts_852900573162 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term72553;
     Object term166426;

    public HtmlTreeBuilder_isFosterInserts_852900573162() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term72553 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term72553, term72553.getClass(), "state", null);
        setField(term72553, term72553.getClass(), "originalState", null);
        setBooleanField(term72553, term72553.getClass(), "baseUriSetFromDoc", false);
        setField(term72553, term72553.getClass(), "headElement", null);
        setField(term72553, term72553.getClass(), "formElement", null);
        setField(term72553, term72553.getClass(), "contextElement", null);
        setField(term72553, term72553.getClass(), "formattingElements", null);
        setField(term72553, term72553.getClass(), "pendingTableCharacters", null);
        setField(term72553, term72553.getClass(), "emptyEnd", null);
        setBooleanField(term72553, term72553.getClass(), "framesetOk", false);
        setBooleanField(term72553, term72553.getClass(), "fosterInserts", false);
        setBooleanField(term72553, term72553.getClass(), "fragmentParsing", false);
        setField(term72553, term72553.getClass(), "specificScopeTarget", null);
        setField(term72553, term72553.getClass(), "reader", null);
        setField(term72553, term72553.getClass(), "tokeniser", null);
        setField(term72553, term72553.getClass(), "doc", null);
        setField(term72553, term72553.getClass(), "stack", null);
        setField(term72553, term72553.getClass(), "baseUri", null);
        setField(term72553, term72553.getClass(), "currentToken", null);
        setField(term72553, term72553.getClass(), "errors", null);
        setField(term72553, term72553.getClass(), "settings", null);
        setField(term72553, term72553.getClass(), "start", null);
        setField(term72553, term72553.getClass(), "end", null);
        term166426 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term166426, term166426.getClass(), "state", null);
        setField(term166426, term166426.getClass(), "originalState", null);
        setBooleanField(term166426, term166426.getClass(), "baseUriSetFromDoc", false);
        setField(term166426, term166426.getClass(), "headElement", null);
        setField(term166426, term166426.getClass(), "formElement", null);
        setField(term166426, term166426.getClass(), "contextElement", null);
        setField(term166426, term166426.getClass(), "formattingElements", null);
        setField(term166426, term166426.getClass(), "pendingTableCharacters", null);
        setField(term166426, term166426.getClass(), "emptyEnd", null);
        setBooleanField(term166426, term166426.getClass(), "framesetOk", false);
        setBooleanField(term166426, term166426.getClass(), "fosterInserts", false);
        setBooleanField(term166426, term166426.getClass(), "fragmentParsing", false);
        setField(term166426, term166426.getClass(), "specificScopeTarget", null);
        setField(term166426, term166426.getClass(), "reader", null);
        setField(term166426, term166426.getClass(), "tokeniser", null);
        setField(term166426, term166426.getClass(), "doc", null);
        setField(term166426, term166426.getClass(), "stack", null);
        setField(term166426, term166426.getClass(), "baseUri", null);
        setField(term166426, term166426.getClass(), "currentToken", null);
        setField(term166426, term166426.getClass(), "errors", null);
        setField(term166426, term166426.getClass(), "settings", null);
        setField(term166426, term166426.getClass(), "start", null);
        setField(term166426, term166426.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isFosterInserts", argTypes, term72553, args);
        assertTrue(recursiveEquals(term72553, term166426));
    }

};


