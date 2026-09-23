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

public class HtmlTreeBuilder_setFormElement_823543729165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76719;
     Object term171205;

    public HtmlTreeBuilder_setFormElement_823543729165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76719 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term76719, term76719.getClass(), "state", null);
        setField(term76719, term76719.getClass(), "originalState", null);
        setBooleanField(term76719, term76719.getClass(), "baseUriSetFromDoc", false);
        setField(term76719, term76719.getClass(), "headElement", null);
        setField(term76719, term76719.getClass(), "formElement", null);
        setField(term76719, term76719.getClass(), "contextElement", null);
        setField(term76719, term76719.getClass(), "formattingElements", null);
        setField(term76719, term76719.getClass(), "pendingTableCharacters", null);
        setField(term76719, term76719.getClass(), "emptyEnd", null);
        setBooleanField(term76719, term76719.getClass(), "framesetOk", false);
        setBooleanField(term76719, term76719.getClass(), "fosterInserts", false);
        setBooleanField(term76719, term76719.getClass(), "fragmentParsing", false);
        setField(term76719, term76719.getClass(), "specificScopeTarget", null);
        setField(term76719, term76719.getClass(), "reader", null);
        setField(term76719, term76719.getClass(), "tokeniser", null);
        setField(term76719, term76719.getClass(), "doc", null);
        setField(term76719, term76719.getClass(), "stack", null);
        setField(term76719, term76719.getClass(), "baseUri", null);
        setField(term76719, term76719.getClass(), "currentToken", null);
        setField(term76719, term76719.getClass(), "errors", null);
        setField(term76719, term76719.getClass(), "settings", null);
        setField(term76719, term76719.getClass(), "start", null);
        setField(term76719, term76719.getClass(), "end", null);
        term171205 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term171205, term171205.getClass(), "state", null);
        setField(term171205, term171205.getClass(), "originalState", null);
        setBooleanField(term171205, term171205.getClass(), "baseUriSetFromDoc", false);
        setField(term171205, term171205.getClass(), "headElement", null);
        setField(term171205, term171205.getClass(), "formElement", null);
        setField(term171205, term171205.getClass(), "contextElement", null);
        setField(term171205, term171205.getClass(), "formattingElements", null);
        setField(term171205, term171205.getClass(), "pendingTableCharacters", null);
        setField(term171205, term171205.getClass(), "emptyEnd", null);
        setBooleanField(term171205, term171205.getClass(), "framesetOk", false);
        setBooleanField(term171205, term171205.getClass(), "fosterInserts", false);
        setBooleanField(term171205, term171205.getClass(), "fragmentParsing", false);
        setField(term171205, term171205.getClass(), "specificScopeTarget", null);
        setField(term171205, term171205.getClass(), "reader", null);
        setField(term171205, term171205.getClass(), "tokeniser", null);
        setField(term171205, term171205.getClass(), "doc", null);
        setField(term171205, term171205.getClass(), "stack", null);
        setField(term171205, term171205.getClass(), "baseUri", null);
        setField(term171205, term171205.getClass(), "currentToken", null);
        setField(term171205, term171205.getClass(), "errors", null);
        setField(term171205, term171205.getClass(), "settings", null);
        setField(term171205, term171205.getClass(), "start", null);
        setField(term171205, term171205.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.FormElement");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setFormElement", argTypes, term76719, args);
        assertTrue(recursiveEquals(term76719, term171205));
    }

};


