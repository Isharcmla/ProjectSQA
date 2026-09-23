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

public class HtmlTreeBuilder_generateImpliedEndTags_1471943769170 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term83200;
     Object term178328;

    public HtmlTreeBuilder_generateImpliedEndTags_1471943769170() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term83200 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term83200, term83200.getClass(), "state", null);
        setField(term83200, term83200.getClass(), "originalState", null);
        setBooleanField(term83200, term83200.getClass(), "baseUriSetFromDoc", false);
        setField(term83200, term83200.getClass(), "headElement", null);
        setField(term83200, term83200.getClass(), "formElement", null);
        setField(term83200, term83200.getClass(), "contextElement", null);
        setField(term83200, term83200.getClass(), "formattingElements", null);
        setField(term83200, term83200.getClass(), "pendingTableCharacters", null);
        setField(term83200, term83200.getClass(), "emptyEnd", null);
        setBooleanField(term83200, term83200.getClass(), "framesetOk", false);
        setBooleanField(term83200, term83200.getClass(), "fosterInserts", false);
        setBooleanField(term83200, term83200.getClass(), "fragmentParsing", false);
        setField(term83200, term83200.getClass(), "specificScopeTarget", null);
        setField(term83200, term83200.getClass(), "reader", null);
        setField(term83200, term83200.getClass(), "tokeniser", null);
        setField(term83200, term83200.getClass(), "doc", null);
        setField(term83200, term83200.getClass(), "stack", null);
        setField(term83200, term83200.getClass(), "baseUri", null);
        setField(term83200, term83200.getClass(), "currentToken", null);
        setField(term83200, term83200.getClass(), "errors", null);
        setField(term83200, term83200.getClass(), "settings", null);
        setField(term83200, term83200.getClass(), "start", null);
        setField(term83200, term83200.getClass(), "end", null);
        term178328 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term178328, term178328.getClass(), "state", null);
        setField(term178328, term178328.getClass(), "originalState", null);
        setBooleanField(term178328, term178328.getClass(), "baseUriSetFromDoc", false);
        setField(term178328, term178328.getClass(), "headElement", null);
        setField(term178328, term178328.getClass(), "formElement", null);
        setField(term178328, term178328.getClass(), "contextElement", null);
        setField(term178328, term178328.getClass(), "formattingElements", null);
        setField(term178328, term178328.getClass(), "pendingTableCharacters", null);
        setField(term178328, term178328.getClass(), "emptyEnd", null);
        setBooleanField(term178328, term178328.getClass(), "framesetOk", false);
        setBooleanField(term178328, term178328.getClass(), "fosterInserts", false);
        setBooleanField(term178328, term178328.getClass(), "fragmentParsing", false);
        setField(term178328, term178328.getClass(), "specificScopeTarget", null);
        setField(term178328, term178328.getClass(), "reader", null);
        setField(term178328, term178328.getClass(), "tokeniser", null);
        setField(term178328, term178328.getClass(), "doc", null);
        setField(term178328, term178328.getClass(), "stack", null);
        setField(term178328, term178328.getClass(), "baseUri", null);
        setField(term178328, term178328.getClass(), "currentToken", null);
        setField(term178328, term178328.getClass(), "errors", null);
        setField(term178328, term178328.getClass(), "settings", null);
        setField(term178328, term178328.getClass(), "start", null);
        setField(term178328, term178328.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "generateImpliedEndTags", argTypes, term83200, args);
        assertTrue(recursiveEquals(term83200, term178328));
    }

};


