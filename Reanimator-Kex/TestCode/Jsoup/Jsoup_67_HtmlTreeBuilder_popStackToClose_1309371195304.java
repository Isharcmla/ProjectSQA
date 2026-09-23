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

public class HtmlTreeBuilder_popStackToClose_1309371195304 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term225849;
     Object term225912;

    public HtmlTreeBuilder_popStackToClose_1309371195304() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term225901 = new ArrayList();
        term225849 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term225849, term225849.getClass(), "stack", term225901);
        ArrayList term225913 = new ArrayList();
        term225912 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term225912, term225912.getClass(), "state", null);
        setField(term225912, term225912.getClass(), "originalState", null);
        setBooleanField(term225912, term225912.getClass(), "baseUriSetFromDoc", false);
        setField(term225912, term225912.getClass(), "headElement", null);
        setField(term225912, term225912.getClass(), "formElement", null);
        setField(term225912, term225912.getClass(), "contextElement", null);
        setField(term225912, term225912.getClass(), "formattingElements", null);
        setField(term225912, term225912.getClass(), "pendingTableCharacters", null);
        setField(term225912, term225912.getClass(), "emptyEnd", null);
        setBooleanField(term225912, term225912.getClass(), "framesetOk", false);
        setBooleanField(term225912, term225912.getClass(), "fosterInserts", false);
        setBooleanField(term225912, term225912.getClass(), "fragmentParsing", false);
        setField(term225912, term225912.getClass(), "specificScopeTarget", null);
        setField(term225912, term225912.getClass(), "reader", null);
        setField(term225912, term225912.getClass(), "tokeniser", null);
        setField(term225912, term225912.getClass(), "doc", null);
        setField(term225912, term225912.getClass(), "stack", term225913);
        setField(term225912, term225912.getClass(), "baseUri", null);
        setField(term225912, term225912.getClass(), "currentToken", null);
        setField(term225912, term225912.getClass(), "errors", null);
        setField(term225912, term225912.getClass(), "settings", null);
        setField(term225912, term225912.getClass(), "start", null);
        setField(term225912, term225912.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "popStackToClose", argTypes, term225849, args);
        assertTrue(recursiveEquals(term225849, term225912));
    }

};


