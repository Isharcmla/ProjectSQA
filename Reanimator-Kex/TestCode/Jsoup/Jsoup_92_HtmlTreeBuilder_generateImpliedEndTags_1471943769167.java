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

public class HtmlTreeBuilder_generateImpliedEndTags_1471943769167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89966;
     Object term205723;

    public HtmlTreeBuilder_generateImpliedEndTags_1471943769167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term89966 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term89966, term89966.getClass(), "state", null);
        setField(term89966, term89966.getClass(), "originalState", null);
        setBooleanField(term89966, term89966.getClass(), "baseUriSetFromDoc", false);
        setField(term89966, term89966.getClass(), "headElement", null);
        setField(term89966, term89966.getClass(), "formElement", null);
        setField(term89966, term89966.getClass(), "contextElement", null);
        setField(term89966, term89966.getClass(), "formattingElements", null);
        setField(term89966, term89966.getClass(), "pendingTableCharacters", null);
        setField(term89966, term89966.getClass(), "emptyEnd", null);
        setBooleanField(term89966, term89966.getClass(), "framesetOk", false);
        setBooleanField(term89966, term89966.getClass(), "fosterInserts", false);
        setBooleanField(term89966, term89966.getClass(), "fragmentParsing", false);
        setField(term89966, term89966.getClass(), "specificScopeTarget", null);
        setField(term89966, term89966.getClass(), "parser", null);
        setField(term89966, term89966.getClass(), "reader", null);
        setField(term89966, term89966.getClass(), "tokeniser", null);
        setField(term89966, term89966.getClass(), "doc", null);
        setField(term89966, term89966.getClass(), "stack", null);
        setField(term89966, term89966.getClass(), "baseUri", null);
        setField(term89966, term89966.getClass(), "currentToken", null);
        setField(term89966, term89966.getClass(), "settings", null);
        setField(term89966, term89966.getClass(), "start", null);
        setField(term89966, term89966.getClass(), "end", null);
        term205723 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term205723, term205723.getClass(), "state", null);
        setField(term205723, term205723.getClass(), "originalState", null);
        setBooleanField(term205723, term205723.getClass(), "baseUriSetFromDoc", false);
        setField(term205723, term205723.getClass(), "headElement", null);
        setField(term205723, term205723.getClass(), "formElement", null);
        setField(term205723, term205723.getClass(), "contextElement", null);
        setField(term205723, term205723.getClass(), "formattingElements", null);
        setField(term205723, term205723.getClass(), "pendingTableCharacters", null);
        setField(term205723, term205723.getClass(), "emptyEnd", null);
        setBooleanField(term205723, term205723.getClass(), "framesetOk", false);
        setBooleanField(term205723, term205723.getClass(), "fosterInserts", false);
        setBooleanField(term205723, term205723.getClass(), "fragmentParsing", false);
        setField(term205723, term205723.getClass(), "specificScopeTarget", null);
        setField(term205723, term205723.getClass(), "parser", null);
        setField(term205723, term205723.getClass(), "reader", null);
        setField(term205723, term205723.getClass(), "tokeniser", null);
        setField(term205723, term205723.getClass(), "doc", null);
        setField(term205723, term205723.getClass(), "stack", null);
        setField(term205723, term205723.getClass(), "baseUri", null);
        setField(term205723, term205723.getClass(), "currentToken", null);
        setField(term205723, term205723.getClass(), "settings", null);
        setField(term205723, term205723.getClass(), "start", null);
        setField(term205723, term205723.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "generateImpliedEndTags", argTypes, term89966, args);
        assertTrue(recursiveEquals(term89966, term205723));
    }

};


