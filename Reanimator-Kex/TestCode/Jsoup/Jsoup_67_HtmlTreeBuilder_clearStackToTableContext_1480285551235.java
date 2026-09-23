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

public class HtmlTreeBuilder_clearStackToTableContext_1480285551235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term208410;
     Object term210322;

    public HtmlTreeBuilder_clearStackToTableContext_1480285551235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term208462 = new ArrayList();
        term208410 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term208410, term208410.getClass(), "stack", term208462);
        ArrayList term210323 = new ArrayList();
        term210322 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term210322, term210322.getClass(), "state", null);
        setField(term210322, term210322.getClass(), "originalState", null);
        setBooleanField(term210322, term210322.getClass(), "baseUriSetFromDoc", false);
        setField(term210322, term210322.getClass(), "headElement", null);
        setField(term210322, term210322.getClass(), "formElement", null);
        setField(term210322, term210322.getClass(), "contextElement", null);
        setField(term210322, term210322.getClass(), "formattingElements", null);
        setField(term210322, term210322.getClass(), "pendingTableCharacters", null);
        setField(term210322, term210322.getClass(), "emptyEnd", null);
        setBooleanField(term210322, term210322.getClass(), "framesetOk", false);
        setBooleanField(term210322, term210322.getClass(), "fosterInserts", false);
        setBooleanField(term210322, term210322.getClass(), "fragmentParsing", false);
        setField(term210322, term210322.getClass(), "specificScopeTarget", null);
        setField(term210322, term210322.getClass(), "reader", null);
        setField(term210322, term210322.getClass(), "tokeniser", null);
        setField(term210322, term210322.getClass(), "doc", null);
        setField(term210322, term210322.getClass(), "stack", term210323);
        setField(term210322, term210322.getClass(), "baseUri", null);
        setField(term210322, term210322.getClass(), "currentToken", null);
        setField(term210322, term210322.getClass(), "errors", null);
        setField(term210322, term210322.getClass(), "settings", null);
        setField(term210322, term210322.getClass(), "start", null);
        setField(term210322, term210322.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clearStackToTableContext", argTypes, term208410, args);
        assertTrue(recursiveEquals(term208410, term210322));
    }

};


