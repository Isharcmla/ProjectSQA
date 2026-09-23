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

public class HtmlTreeBuilder_aboveOnStack_665381070234 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term252052;
     Object term252116;

    public HtmlTreeBuilder_aboveOnStack_665381070234() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term252104 = new ArrayList();
        term252052 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term252052, term252052.getClass(), "stack", term252104);
        ArrayList term252117 = new ArrayList();
        term252116 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term252116, term252116.getClass(), "state", null);
        setField(term252116, term252116.getClass(), "originalState", null);
        setBooleanField(term252116, term252116.getClass(), "baseUriSetFromDoc", false);
        setField(term252116, term252116.getClass(), "headElement", null);
        setField(term252116, term252116.getClass(), "formElement", null);
        setField(term252116, term252116.getClass(), "contextElement", null);
        setField(term252116, term252116.getClass(), "formattingElements", null);
        setField(term252116, term252116.getClass(), "pendingTableCharacters", null);
        setField(term252116, term252116.getClass(), "emptyEnd", null);
        setBooleanField(term252116, term252116.getClass(), "framesetOk", false);
        setBooleanField(term252116, term252116.getClass(), "fosterInserts", false);
        setBooleanField(term252116, term252116.getClass(), "fragmentParsing", false);
        setField(term252116, term252116.getClass(), "specificScopeTarget", null);
        setField(term252116, term252116.getClass(), "reader", null);
        setField(term252116, term252116.getClass(), "tokeniser", null);
        setField(term252116, term252116.getClass(), "doc", null);
        setField(term252116, term252116.getClass(), "stack", term252117);
        setField(term252116, term252116.getClass(), "baseUri", null);
        setField(term252116, term252116.getClass(), "currentToken", null);
        setField(term252116, term252116.getClass(), "errors", null);
        setField(term252116, term252116.getClass(), "settings", null);
        setField(term252116, term252116.getClass(), "start", null);
        setField(term252116, term252116.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "aboveOnStack", argTypes, term252052, args);
        assertTrue(recursiveEquals(term252052, term252116));
        assertTrue(recursiveEquals(retValue, null));
    }

};


