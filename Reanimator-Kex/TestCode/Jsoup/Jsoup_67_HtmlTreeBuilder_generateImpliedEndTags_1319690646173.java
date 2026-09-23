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

public class HtmlTreeBuilder_generateImpliedEndTags_1319690646173 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term84387;
     Object term176977;

    public HtmlTreeBuilder_generateImpliedEndTags_1319690646173() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term84387 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term84387, term84387.getClass(), "state", null);
        setField(term84387, term84387.getClass(), "originalState", null);
        setBooleanField(term84387, term84387.getClass(), "baseUriSetFromDoc", false);
        setField(term84387, term84387.getClass(), "headElement", null);
        setField(term84387, term84387.getClass(), "formElement", null);
        setField(term84387, term84387.getClass(), "contextElement", null);
        setField(term84387, term84387.getClass(), "formattingElements", null);
        setField(term84387, term84387.getClass(), "pendingTableCharacters", null);
        setField(term84387, term84387.getClass(), "emptyEnd", null);
        setBooleanField(term84387, term84387.getClass(), "framesetOk", false);
        setBooleanField(term84387, term84387.getClass(), "fosterInserts", false);
        setBooleanField(term84387, term84387.getClass(), "fragmentParsing", false);
        setField(term84387, term84387.getClass(), "specificScopeTarget", null);
        setField(term84387, term84387.getClass(), "reader", null);
        setField(term84387, term84387.getClass(), "tokeniser", null);
        setField(term84387, term84387.getClass(), "doc", null);
        setField(term84387, term84387.getClass(), "stack", null);
        setField(term84387, term84387.getClass(), "baseUri", null);
        setField(term84387, term84387.getClass(), "currentToken", null);
        setField(term84387, term84387.getClass(), "errors", null);
        setField(term84387, term84387.getClass(), "settings", null);
        setField(term84387, term84387.getClass(), "start", null);
        setField(term84387, term84387.getClass(), "end", null);
        term176977 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term176977, term176977.getClass(), "state", null);
        setField(term176977, term176977.getClass(), "originalState", null);
        setBooleanField(term176977, term176977.getClass(), "baseUriSetFromDoc", false);
        setField(term176977, term176977.getClass(), "headElement", null);
        setField(term176977, term176977.getClass(), "formElement", null);
        setField(term176977, term176977.getClass(), "contextElement", null);
        setField(term176977, term176977.getClass(), "formattingElements", null);
        setField(term176977, term176977.getClass(), "pendingTableCharacters", null);
        setField(term176977, term176977.getClass(), "emptyEnd", null);
        setBooleanField(term176977, term176977.getClass(), "framesetOk", false);
        setBooleanField(term176977, term176977.getClass(), "fosterInserts", false);
        setBooleanField(term176977, term176977.getClass(), "fragmentParsing", false);
        setField(term176977, term176977.getClass(), "specificScopeTarget", null);
        setField(term176977, term176977.getClass(), "reader", null);
        setField(term176977, term176977.getClass(), "tokeniser", null);
        setField(term176977, term176977.getClass(), "doc", null);
        setField(term176977, term176977.getClass(), "stack", null);
        setField(term176977, term176977.getClass(), "baseUri", null);
        setField(term176977, term176977.getClass(), "currentToken", null);
        setField(term176977, term176977.getClass(), "errors", null);
        setField(term176977, term176977.getClass(), "settings", null);
        setField(term176977, term176977.getClass(), "start", null);
        setField(term176977, term176977.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "generateImpliedEndTags", argTypes, term84387, args);
        assertTrue(recursiveEquals(term84387, term176977));
    }

};


