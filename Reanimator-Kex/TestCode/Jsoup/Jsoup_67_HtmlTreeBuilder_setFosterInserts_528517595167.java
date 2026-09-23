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

public class HtmlTreeBuilder_setFosterInserts_528517595167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term76011;
     Object term76016;
     Object term167306;

    public HtmlTreeBuilder_setFosterInserts_528517595167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term76011 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term76011, term76011.getClass(), "state", null);
        setField(term76011, term76011.getClass(), "originalState", null);
        setBooleanField(term76011, term76011.getClass(), "baseUriSetFromDoc", false);
        setField(term76011, term76011.getClass(), "headElement", null);
        setField(term76011, term76011.getClass(), "formElement", null);
        setField(term76011, term76011.getClass(), "contextElement", null);
        setField(term76011, term76011.getClass(), "formattingElements", null);
        setField(term76011, term76011.getClass(), "pendingTableCharacters", null);
        setField(term76011, term76011.getClass(), "emptyEnd", null);
        setBooleanField(term76011, term76011.getClass(), "framesetOk", false);
        setBooleanField(term76011, term76011.getClass(), "fosterInserts", false);
        setBooleanField(term76011, term76011.getClass(), "fragmentParsing", false);
        setField(term76011, term76011.getClass(), "specificScopeTarget", null);
        setField(term76011, term76011.getClass(), "reader", null);
        setField(term76011, term76011.getClass(), "tokeniser", null);
        setField(term76011, term76011.getClass(), "doc", null);
        setField(term76011, term76011.getClass(), "stack", null);
        setField(term76011, term76011.getClass(), "baseUri", null);
        setField(term76011, term76011.getClass(), "currentToken", null);
        setField(term76011, term76011.getClass(), "errors", null);
        setField(term76011, term76011.getClass(), "settings", null);
        setField(term76011, term76011.getClass(), "start", null);
        setField(term76011, term76011.getClass(), "end", null);
        term76016 = new Boolean(false);
        term167306 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term167306, term167306.getClass(), "state", null);
        setField(term167306, term167306.getClass(), "originalState", null);
        setBooleanField(term167306, term167306.getClass(), "baseUriSetFromDoc", false);
        setField(term167306, term167306.getClass(), "headElement", null);
        setField(term167306, term167306.getClass(), "formElement", null);
        setField(term167306, term167306.getClass(), "contextElement", null);
        setField(term167306, term167306.getClass(), "formattingElements", null);
        setField(term167306, term167306.getClass(), "pendingTableCharacters", null);
        setField(term167306, term167306.getClass(), "emptyEnd", null);
        setBooleanField(term167306, term167306.getClass(), "framesetOk", false);
        setBooleanField(term167306, term167306.getClass(), "fosterInserts", false);
        setBooleanField(term167306, term167306.getClass(), "fragmentParsing", false);
        setField(term167306, term167306.getClass(), "specificScopeTarget", null);
        setField(term167306, term167306.getClass(), "reader", null);
        setField(term167306, term167306.getClass(), "tokeniser", null);
        setField(term167306, term167306.getClass(), "doc", null);
        setField(term167306, term167306.getClass(), "stack", null);
        setField(term167306, term167306.getClass(), "baseUri", null);
        setField(term167306, term167306.getClass(), "currentToken", null);
        setField(term167306, term167306.getClass(), "errors", null);
        setField(term167306, term167306.getClass(), "settings", null);
        setField(term167306, term167306.getClass(), "start", null);
        setField(term167306, term167306.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term76016;
        callMethod(klass, "setFosterInserts", argTypes, term76011, args);
        assertTrue(recursiveEquals(term76011, term167306));
        assertTrue(recursiveEquals(term76016, false));
    }

};


