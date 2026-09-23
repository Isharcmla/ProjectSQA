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

public class HtmlTreeBuilder_getActiveFormattingElement_851320383247 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term318262;
     Object term318325;

    public HtmlTreeBuilder_getActiveFormattingElement_851320383247() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term318314 = new ArrayList();
        term318262 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term318262, term318262.getClass(), "formattingElements", term318314);
        ArrayList term318326 = new ArrayList();
        term318325 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term318325, term318325.getClass(), "state", null);
        setField(term318325, term318325.getClass(), "originalState", null);
        setBooleanField(term318325, term318325.getClass(), "baseUriSetFromDoc", false);
        setField(term318325, term318325.getClass(), "headElement", null);
        setField(term318325, term318325.getClass(), "formElement", null);
        setField(term318325, term318325.getClass(), "contextElement", null);
        setField(term318325, term318325.getClass(), "formattingElements", term318326);
        setField(term318325, term318325.getClass(), "pendingTableCharacters", null);
        setField(term318325, term318325.getClass(), "emptyEnd", null);
        setBooleanField(term318325, term318325.getClass(), "framesetOk", false);
        setBooleanField(term318325, term318325.getClass(), "fosterInserts", false);
        setBooleanField(term318325, term318325.getClass(), "fragmentParsing", false);
        setField(term318325, term318325.getClass(), "specificScopeTarget", null);
        setField(term318325, term318325.getClass(), "parser", null);
        setField(term318325, term318325.getClass(), "reader", null);
        setField(term318325, term318325.getClass(), "tokeniser", null);
        setField(term318325, term318325.getClass(), "doc", null);
        setField(term318325, term318325.getClass(), "stack", null);
        setField(term318325, term318325.getClass(), "baseUri", null);
        setField(term318325, term318325.getClass(), "currentToken", null);
        setField(term318325, term318325.getClass(), "settings", null);
        setField(term318325, term318325.getClass(), "start", null);
        setField(term318325, term318325.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "getActiveFormattingElement", argTypes, term318262, args);
        assertTrue(recursiveEquals(term318262, term318325));
        assertTrue(recursiveEquals(retValue, null));
    }

};


