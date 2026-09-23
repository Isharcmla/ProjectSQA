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

public class HtmlTreeBuilder_getStack_1760106259138 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35605;
     Object term143305;

    public HtmlTreeBuilder_getStack_1760106259138() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35605 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term35605, term35605.getClass(), "state", null);
        setField(term35605, term35605.getClass(), "originalState", null);
        setBooleanField(term35605, term35605.getClass(), "baseUriSetFromDoc", false);
        setField(term35605, term35605.getClass(), "headElement", null);
        setField(term35605, term35605.getClass(), "formElement", null);
        setField(term35605, term35605.getClass(), "contextElement", null);
        setField(term35605, term35605.getClass(), "formattingElements", null);
        setField(term35605, term35605.getClass(), "pendingTableCharacters", null);
        setField(term35605, term35605.getClass(), "emptyEnd", null);
        setBooleanField(term35605, term35605.getClass(), "framesetOk", false);
        setBooleanField(term35605, term35605.getClass(), "fosterInserts", false);
        setBooleanField(term35605, term35605.getClass(), "fragmentParsing", false);
        setField(term35605, term35605.getClass(), "specificScopeTarget", null);
        setField(term35605, term35605.getClass(), "reader", null);
        setField(term35605, term35605.getClass(), "tokeniser", null);
        setField(term35605, term35605.getClass(), "doc", null);
        setField(term35605, term35605.getClass(), "stack", null);
        setField(term35605, term35605.getClass(), "baseUri", null);
        setField(term35605, term35605.getClass(), "currentToken", null);
        setField(term35605, term35605.getClass(), "errors", null);
        setField(term35605, term35605.getClass(), "settings", null);
        setField(term35605, term35605.getClass(), "start", null);
        setField(term35605, term35605.getClass(), "end", null);
        term143305 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term143305, term143305.getClass(), "state", null);
        setField(term143305, term143305.getClass(), "originalState", null);
        setBooleanField(term143305, term143305.getClass(), "baseUriSetFromDoc", false);
        setField(term143305, term143305.getClass(), "headElement", null);
        setField(term143305, term143305.getClass(), "formElement", null);
        setField(term143305, term143305.getClass(), "contextElement", null);
        setField(term143305, term143305.getClass(), "formattingElements", null);
        setField(term143305, term143305.getClass(), "pendingTableCharacters", null);
        setField(term143305, term143305.getClass(), "emptyEnd", null);
        setBooleanField(term143305, term143305.getClass(), "framesetOk", false);
        setBooleanField(term143305, term143305.getClass(), "fosterInserts", false);
        setBooleanField(term143305, term143305.getClass(), "fragmentParsing", false);
        setField(term143305, term143305.getClass(), "specificScopeTarget", null);
        setField(term143305, term143305.getClass(), "reader", null);
        setField(term143305, term143305.getClass(), "tokeniser", null);
        setField(term143305, term143305.getClass(), "doc", null);
        setField(term143305, term143305.getClass(), "stack", null);
        setField(term143305, term143305.getClass(), "baseUri", null);
        setField(term143305, term143305.getClass(), "currentToken", null);
        setField(term143305, term143305.getClass(), "errors", null);
        setField(term143305, term143305.getClass(), "settings", null);
        setField(term143305, term143305.getClass(), "start", null);
        setField(term143305, term143305.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getStack", argTypes, term35605, args);
        assertTrue(recursiveEquals(term35605, term143305));
        assertTrue(recursiveEquals(retValue, null));
    }

};


