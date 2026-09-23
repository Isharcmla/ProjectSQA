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

public class HtmlTreeBuilder_lastFormattingElement_1625168298242 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term212759;
     Object term212830;

    public HtmlTreeBuilder_lastFormattingElement_1625168298242() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term212811 = new ArrayList();
        term212759 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term212759, term212759.getClass(), "formattingElements", term212811);
        ArrayList term212831 = new ArrayList();
        term212830 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term212830, term212830.getClass(), "state", null);
        setField(term212830, term212830.getClass(), "originalState", null);
        setBooleanField(term212830, term212830.getClass(), "baseUriSetFromDoc", false);
        setField(term212830, term212830.getClass(), "headElement", null);
        setField(term212830, term212830.getClass(), "formElement", null);
        setField(term212830, term212830.getClass(), "contextElement", null);
        setField(term212830, term212830.getClass(), "formattingElements", term212831);
        setField(term212830, term212830.getClass(), "pendingTableCharacters", null);
        setField(term212830, term212830.getClass(), "emptyEnd", null);
        setBooleanField(term212830, term212830.getClass(), "framesetOk", false);
        setBooleanField(term212830, term212830.getClass(), "fosterInserts", false);
        setBooleanField(term212830, term212830.getClass(), "fragmentParsing", false);
        setField(term212830, term212830.getClass(), "specificScopeTarget", null);
        setField(term212830, term212830.getClass(), "reader", null);
        setField(term212830, term212830.getClass(), "tokeniser", null);
        setField(term212830, term212830.getClass(), "doc", null);
        setField(term212830, term212830.getClass(), "stack", null);
        setField(term212830, term212830.getClass(), "baseUri", null);
        setField(term212830, term212830.getClass(), "currentToken", null);
        setField(term212830, term212830.getClass(), "errors", null);
        setField(term212830, term212830.getClass(), "settings", null);
        setField(term212830, term212830.getClass(), "start", null);
        setField(term212830, term212830.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "lastFormattingElement", argTypes, term212759, args);
        assertTrue(recursiveEquals(term212759, term212830));
        assertTrue(recursiveEquals(retValue, null));
    }

};


