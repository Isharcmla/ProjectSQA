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

public class HtmlTreeBuilder_getDocument_872883783123 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term14075;
     Object term119528;

    public HtmlTreeBuilder_getDocument_872883783123() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term14075 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term14075, term14075.getClass(), "state", null);
        setField(term14075, term14075.getClass(), "originalState", null);
        setBooleanField(term14075, term14075.getClass(), "baseUriSetFromDoc", false);
        setField(term14075, term14075.getClass(), "headElement", null);
        setField(term14075, term14075.getClass(), "formElement", null);
        setField(term14075, term14075.getClass(), "contextElement", null);
        setField(term14075, term14075.getClass(), "formattingElements", null);
        setField(term14075, term14075.getClass(), "pendingTableCharacters", null);
        setField(term14075, term14075.getClass(), "emptyEnd", null);
        setBooleanField(term14075, term14075.getClass(), "framesetOk", false);
        setBooleanField(term14075, term14075.getClass(), "fosterInserts", false);
        setBooleanField(term14075, term14075.getClass(), "fragmentParsing", false);
        setField(term14075, term14075.getClass(), "specificScopeTarget", null);
        setField(term14075, term14075.getClass(), "reader", null);
        setField(term14075, term14075.getClass(), "tokeniser", null);
        setField(term14075, term14075.getClass(), "doc", null);
        setField(term14075, term14075.getClass(), "stack", null);
        setField(term14075, term14075.getClass(), "baseUri", null);
        setField(term14075, term14075.getClass(), "currentToken", null);
        setField(term14075, term14075.getClass(), "errors", null);
        setField(term14075, term14075.getClass(), "settings", null);
        setField(term14075, term14075.getClass(), "start", null);
        setField(term14075, term14075.getClass(), "end", null);
        term119528 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term119528, term119528.getClass(), "state", null);
        setField(term119528, term119528.getClass(), "originalState", null);
        setBooleanField(term119528, term119528.getClass(), "baseUriSetFromDoc", false);
        setField(term119528, term119528.getClass(), "headElement", null);
        setField(term119528, term119528.getClass(), "formElement", null);
        setField(term119528, term119528.getClass(), "contextElement", null);
        setField(term119528, term119528.getClass(), "formattingElements", null);
        setField(term119528, term119528.getClass(), "pendingTableCharacters", null);
        setField(term119528, term119528.getClass(), "emptyEnd", null);
        setBooleanField(term119528, term119528.getClass(), "framesetOk", false);
        setBooleanField(term119528, term119528.getClass(), "fosterInserts", false);
        setBooleanField(term119528, term119528.getClass(), "fragmentParsing", false);
        setField(term119528, term119528.getClass(), "specificScopeTarget", null);
        setField(term119528, term119528.getClass(), "reader", null);
        setField(term119528, term119528.getClass(), "tokeniser", null);
        setField(term119528, term119528.getClass(), "doc", null);
        setField(term119528, term119528.getClass(), "stack", null);
        setField(term119528, term119528.getClass(), "baseUri", null);
        setField(term119528, term119528.getClass(), "currentToken", null);
        setField(term119528, term119528.getClass(), "errors", null);
        setField(term119528, term119528.getClass(), "settings", null);
        setField(term119528, term119528.getClass(), "start", null);
        setField(term119528, term119528.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getDocument", argTypes, term14075, args);
        assertTrue(recursiveEquals(term14075, term119528));
        assertTrue(recursiveEquals(retValue, null));
    }

};


