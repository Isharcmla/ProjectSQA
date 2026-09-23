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

public class HtmlTreeBuilder_getHeadElement_1376057265161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71122;
     Object term166419;

    public HtmlTreeBuilder_getHeadElement_1376057265161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71122 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term71122, term71122.getClass(), "state", null);
        setField(term71122, term71122.getClass(), "originalState", null);
        setBooleanField(term71122, term71122.getClass(), "baseUriSetFromDoc", false);
        setField(term71122, term71122.getClass(), "headElement", null);
        setField(term71122, term71122.getClass(), "formElement", null);
        setField(term71122, term71122.getClass(), "contextElement", null);
        setField(term71122, term71122.getClass(), "formattingElements", null);
        setField(term71122, term71122.getClass(), "pendingTableCharacters", null);
        setField(term71122, term71122.getClass(), "emptyEnd", null);
        setBooleanField(term71122, term71122.getClass(), "framesetOk", false);
        setBooleanField(term71122, term71122.getClass(), "fosterInserts", false);
        setBooleanField(term71122, term71122.getClass(), "fragmentParsing", false);
        setField(term71122, term71122.getClass(), "specificScopeTarget", null);
        setField(term71122, term71122.getClass(), "reader", null);
        setField(term71122, term71122.getClass(), "tokeniser", null);
        setField(term71122, term71122.getClass(), "doc", null);
        setField(term71122, term71122.getClass(), "stack", null);
        setField(term71122, term71122.getClass(), "baseUri", null);
        setField(term71122, term71122.getClass(), "currentToken", null);
        setField(term71122, term71122.getClass(), "errors", null);
        setField(term71122, term71122.getClass(), "settings", null);
        setField(term71122, term71122.getClass(), "start", null);
        setField(term71122, term71122.getClass(), "end", null);
        term166419 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term166419, term166419.getClass(), "state", null);
        setField(term166419, term166419.getClass(), "originalState", null);
        setBooleanField(term166419, term166419.getClass(), "baseUriSetFromDoc", false);
        setField(term166419, term166419.getClass(), "headElement", null);
        setField(term166419, term166419.getClass(), "formElement", null);
        setField(term166419, term166419.getClass(), "contextElement", null);
        setField(term166419, term166419.getClass(), "formattingElements", null);
        setField(term166419, term166419.getClass(), "pendingTableCharacters", null);
        setField(term166419, term166419.getClass(), "emptyEnd", null);
        setBooleanField(term166419, term166419.getClass(), "framesetOk", false);
        setBooleanField(term166419, term166419.getClass(), "fosterInserts", false);
        setBooleanField(term166419, term166419.getClass(), "fragmentParsing", false);
        setField(term166419, term166419.getClass(), "specificScopeTarget", null);
        setField(term166419, term166419.getClass(), "reader", null);
        setField(term166419, term166419.getClass(), "tokeniser", null);
        setField(term166419, term166419.getClass(), "doc", null);
        setField(term166419, term166419.getClass(), "stack", null);
        setField(term166419, term166419.getClass(), "baseUri", null);
        setField(term166419, term166419.getClass(), "currentToken", null);
        setField(term166419, term166419.getClass(), "errors", null);
        setField(term166419, term166419.getClass(), "settings", null);
        setField(term166419, term166419.getClass(), "start", null);
        setField(term166419, term166419.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getHeadElement", argTypes, term71122, args);
        assertTrue(recursiveEquals(term71122, term166419));
        assertTrue(recursiveEquals(retValue, null));
    }

};


