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
import java.util.ArrayList;
import java.lang.Object;

public class HtmlTreeBuilder_clearStackToTableContext_1480285551386 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term263754;
     Object term263986;

    public HtmlTreeBuilder_clearStackToTableContext_1480285551386() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term263860 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term263914 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        ArrayList term263806 = new ArrayList();
        ((ArrayList) term263806).add(term263860);
        ((ArrayList) term263806).add(term263914);
        term263754 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term263754, term263754.getClass(), "stack", term263806);
        ArrayList term263987 = new ArrayList();
        term263986 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term263986, term263986.getClass(), "state", null);
        setField(term263986, term263986.getClass(), "originalState", null);
        setBooleanField(term263986, term263986.getClass(), "baseUriSetFromDoc", false);
        setField(term263986, term263986.getClass(), "headElement", null);
        setField(term263986, term263986.getClass(), "formElement", null);
        setField(term263986, term263986.getClass(), "contextElement", null);
        setField(term263986, term263986.getClass(), "formattingElements", null);
        setField(term263986, term263986.getClass(), "pendingTableCharacters", null);
        setField(term263986, term263986.getClass(), "emptyEnd", null);
        setBooleanField(term263986, term263986.getClass(), "framesetOk", false);
        setBooleanField(term263986, term263986.getClass(), "fosterInserts", false);
        setBooleanField(term263986, term263986.getClass(), "fragmentParsing", false);
        setField(term263986, term263986.getClass(), "specificScopeTarget", null);
        setField(term263986, term263986.getClass(), "reader", null);
        setField(term263986, term263986.getClass(), "tokeniser", null);
        setField(term263986, term263986.getClass(), "doc", null);
        setField(term263986, term263986.getClass(), "stack", term263987);
        setField(term263986, term263986.getClass(), "baseUri", null);
        setField(term263986, term263986.getClass(), "currentToken", null);
        setField(term263986, term263986.getClass(), "errors", null);
        setField(term263986, term263986.getClass(), "settings", null);
        setField(term263986, term263986.getClass(), "start", null);
        setField(term263986, term263986.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clearStackToTableContext", argTypes, term263754, args);
        assertTrue(recursiveEquals(term263754, term263986));
    }

};


