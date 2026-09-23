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

public class HtmlTreeBuilder_clearStackToTableBodyContext_548735507284 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term220615;
     Object term220751;

    public HtmlTreeBuilder_clearStackToTableBodyContext_548735507284() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term220667 = new ArrayList();
        term220615 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term220615, term220615.getClass(), "stack", term220667);
        ArrayList term220752 = new ArrayList();
        term220751 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term220751, term220751.getClass(), "state", null);
        setField(term220751, term220751.getClass(), "originalState", null);
        setBooleanField(term220751, term220751.getClass(), "baseUriSetFromDoc", false);
        setField(term220751, term220751.getClass(), "headElement", null);
        setField(term220751, term220751.getClass(), "formElement", null);
        setField(term220751, term220751.getClass(), "contextElement", null);
        setField(term220751, term220751.getClass(), "formattingElements", null);
        setField(term220751, term220751.getClass(), "pendingTableCharacters", null);
        setField(term220751, term220751.getClass(), "emptyEnd", null);
        setBooleanField(term220751, term220751.getClass(), "framesetOk", false);
        setBooleanField(term220751, term220751.getClass(), "fosterInserts", false);
        setBooleanField(term220751, term220751.getClass(), "fragmentParsing", false);
        setField(term220751, term220751.getClass(), "specificScopeTarget", null);
        setField(term220751, term220751.getClass(), "reader", null);
        setField(term220751, term220751.getClass(), "tokeniser", null);
        setField(term220751, term220751.getClass(), "doc", null);
        setField(term220751, term220751.getClass(), "stack", term220752);
        setField(term220751, term220751.getClass(), "baseUri", null);
        setField(term220751, term220751.getClass(), "currentToken", null);
        setField(term220751, term220751.getClass(), "errors", null);
        setField(term220751, term220751.getClass(), "settings", null);
        setField(term220751, term220751.getClass(), "start", null);
        setField(term220751, term220751.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clearStackToTableBodyContext", argTypes, term220615, args);
        assertTrue(recursiveEquals(term220615, term220751));
    }

};


