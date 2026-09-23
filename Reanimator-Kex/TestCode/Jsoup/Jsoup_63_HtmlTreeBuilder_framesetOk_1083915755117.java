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
import java.lang.Boolean;

public class HtmlTreeBuilder_framesetOk_1083915755117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11183;
     Object term11188;
     Object term114435;

    public HtmlTreeBuilder_framesetOk_1083915755117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term11183 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term11183, term11183.getClass(), "state", null);
        setField(term11183, term11183.getClass(), "originalState", null);
        setBooleanField(term11183, term11183.getClass(), "baseUriSetFromDoc", false);
        setField(term11183, term11183.getClass(), "headElement", null);
        setField(term11183, term11183.getClass(), "formElement", null);
        setField(term11183, term11183.getClass(), "contextElement", null);
        setField(term11183, term11183.getClass(), "formattingElements", null);
        setField(term11183, term11183.getClass(), "pendingTableCharacters", null);
        setField(term11183, term11183.getClass(), "emptyEnd", null);
        setBooleanField(term11183, term11183.getClass(), "framesetOk", false);
        setBooleanField(term11183, term11183.getClass(), "fosterInserts", false);
        setBooleanField(term11183, term11183.getClass(), "fragmentParsing", false);
        setField(term11183, term11183.getClass(), "specificScopeTarget", null);
        setField(term11183, term11183.getClass(), "reader", null);
        setField(term11183, term11183.getClass(), "tokeniser", null);
        setField(term11183, term11183.getClass(), "doc", null);
        setField(term11183, term11183.getClass(), "stack", null);
        setField(term11183, term11183.getClass(), "baseUri", null);
        setField(term11183, term11183.getClass(), "currentToken", null);
        setField(term11183, term11183.getClass(), "errors", null);
        setField(term11183, term11183.getClass(), "settings", null);
        setField(term11183, term11183.getClass(), "start", null);
        setField(term11183, term11183.getClass(), "end", null);
        term11188 = new Boolean(false);
        term114435 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term114435, term114435.getClass(), "state", null);
        setField(term114435, term114435.getClass(), "originalState", null);
        setBooleanField(term114435, term114435.getClass(), "baseUriSetFromDoc", false);
        setField(term114435, term114435.getClass(), "headElement", null);
        setField(term114435, term114435.getClass(), "formElement", null);
        setField(term114435, term114435.getClass(), "contextElement", null);
        setField(term114435, term114435.getClass(), "formattingElements", null);
        setField(term114435, term114435.getClass(), "pendingTableCharacters", null);
        setField(term114435, term114435.getClass(), "emptyEnd", null);
        setBooleanField(term114435, term114435.getClass(), "framesetOk", false);
        setBooleanField(term114435, term114435.getClass(), "fosterInserts", false);
        setBooleanField(term114435, term114435.getClass(), "fragmentParsing", false);
        setField(term114435, term114435.getClass(), "specificScopeTarget", null);
        setField(term114435, term114435.getClass(), "reader", null);
        setField(term114435, term114435.getClass(), "tokeniser", null);
        setField(term114435, term114435.getClass(), "doc", null);
        setField(term114435, term114435.getClass(), "stack", null);
        setField(term114435, term114435.getClass(), "baseUri", null);
        setField(term114435, term114435.getClass(), "currentToken", null);
        setField(term114435, term114435.getClass(), "errors", null);
        setField(term114435, term114435.getClass(), "settings", null);
        setField(term114435, term114435.getClass(), "start", null);
        setField(term114435, term114435.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term11188;
        callMethod(klass, "framesetOk", argTypes, term11183, args);
        assertTrue(recursiveEquals(term11183, term114435));
        assertTrue(recursiveEquals(term11188, false));
    }

};


