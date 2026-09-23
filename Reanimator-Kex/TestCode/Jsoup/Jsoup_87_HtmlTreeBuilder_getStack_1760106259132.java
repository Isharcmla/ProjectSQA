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

public class HtmlTreeBuilder_getStack_1760106259132 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term37945;
     Object term327937;

    public HtmlTreeBuilder_getStack_1760106259132() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term37945 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term37945, term37945.getClass(), "state", null);
        setField(term37945, term37945.getClass(), "originalState", null);
        setBooleanField(term37945, term37945.getClass(), "baseUriSetFromDoc", false);
        setField(term37945, term37945.getClass(), "headElement", null);
        setField(term37945, term37945.getClass(), "formElement", null);
        setField(term37945, term37945.getClass(), "contextElement", null);
        setField(term37945, term37945.getClass(), "formattingElements", null);
        setField(term37945, term37945.getClass(), "pendingTableCharacters", null);
        setField(term37945, term37945.getClass(), "emptyEnd", null);
        setBooleanField(term37945, term37945.getClass(), "framesetOk", false);
        setBooleanField(term37945, term37945.getClass(), "fosterInserts", false);
        setBooleanField(term37945, term37945.getClass(), "fragmentParsing", false);
        setField(term37945, term37945.getClass(), "specificScopeTarget", null);
        setField(term37945, term37945.getClass(), "parser", null);
        setField(term37945, term37945.getClass(), "reader", null);
        setField(term37945, term37945.getClass(), "tokeniser", null);
        setField(term37945, term37945.getClass(), "doc", null);
        setField(term37945, term37945.getClass(), "stack", null);
        setField(term37945, term37945.getClass(), "baseUri", null);
        setField(term37945, term37945.getClass(), "currentToken", null);
        setField(term37945, term37945.getClass(), "settings", null);
        setField(term37945, term37945.getClass(), "start", null);
        setField(term37945, term37945.getClass(), "end", null);
        term327937 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term327937, term327937.getClass(), "state", null);
        setField(term327937, term327937.getClass(), "originalState", null);
        setBooleanField(term327937, term327937.getClass(), "baseUriSetFromDoc", false);
        setField(term327937, term327937.getClass(), "headElement", null);
        setField(term327937, term327937.getClass(), "formElement", null);
        setField(term327937, term327937.getClass(), "contextElement", null);
        setField(term327937, term327937.getClass(), "formattingElements", null);
        setField(term327937, term327937.getClass(), "pendingTableCharacters", null);
        setField(term327937, term327937.getClass(), "emptyEnd", null);
        setBooleanField(term327937, term327937.getClass(), "framesetOk", false);
        setBooleanField(term327937, term327937.getClass(), "fosterInserts", false);
        setBooleanField(term327937, term327937.getClass(), "fragmentParsing", false);
        setField(term327937, term327937.getClass(), "specificScopeTarget", null);
        setField(term327937, term327937.getClass(), "parser", null);
        setField(term327937, term327937.getClass(), "reader", null);
        setField(term327937, term327937.getClass(), "tokeniser", null);
        setField(term327937, term327937.getClass(), "doc", null);
        setField(term327937, term327937.getClass(), "stack", null);
        setField(term327937, term327937.getClass(), "baseUri", null);
        setField(term327937, term327937.getClass(), "currentToken", null);
        setField(term327937, term327937.getClass(), "settings", null);
        setField(term327937, term327937.getClass(), "start", null);
        setField(term327937, term327937.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getStack", argTypes, term37945, args);
        assertTrue(recursiveEquals(term37945, term327937));
        assertTrue(recursiveEquals(retValue, null));
    }

};


