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

public class HtmlTreeBuilder_getActiveFormattingElement_851320383200 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term247575;
     Object term247638;

    public HtmlTreeBuilder_getActiveFormattingElement_851320383200() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term247627 = new ArrayList();
        term247575 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term247575, term247575.getClass(), "formattingElements", term247627);
        ArrayList term247639 = new ArrayList();
        term247638 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term247638, term247638.getClass(), "state", null);
        setField(term247638, term247638.getClass(), "originalState", null);
        setBooleanField(term247638, term247638.getClass(), "baseUriSetFromDoc", false);
        setField(term247638, term247638.getClass(), "headElement", null);
        setField(term247638, term247638.getClass(), "formElement", null);
        setField(term247638, term247638.getClass(), "contextElement", null);
        setField(term247638, term247638.getClass(), "formattingElements", term247639);
        setField(term247638, term247638.getClass(), "pendingTableCharacters", null);
        setField(term247638, term247638.getClass(), "emptyEnd", null);
        setBooleanField(term247638, term247638.getClass(), "framesetOk", false);
        setBooleanField(term247638, term247638.getClass(), "fosterInserts", false);
        setBooleanField(term247638, term247638.getClass(), "fragmentParsing", false);
        setField(term247638, term247638.getClass(), "specificScopeTarget", null);
        setField(term247638, term247638.getClass(), "reader", null);
        setField(term247638, term247638.getClass(), "tokeniser", null);
        setField(term247638, term247638.getClass(), "doc", null);
        setField(term247638, term247638.getClass(), "stack", null);
        setField(term247638, term247638.getClass(), "baseUri", null);
        setField(term247638, term247638.getClass(), "currentToken", null);
        setField(term247638, term247638.getClass(), "errors", null);
        setField(term247638, term247638.getClass(), "settings", null);
        setField(term247638, term247638.getClass(), "start", null);
        setField(term247638, term247638.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "getActiveFormattingElement", argTypes, term247575, args);
        assertTrue(recursiveEquals(term247575, term247638));
        assertTrue(recursiveEquals(retValue, null));
    }

};


