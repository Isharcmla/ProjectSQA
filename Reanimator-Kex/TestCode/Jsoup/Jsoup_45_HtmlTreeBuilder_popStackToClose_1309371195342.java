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

public class HtmlTreeBuilder_popStackToClose_1309371195342 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term715509;
     Object term715715;

    public HtmlTreeBuilder_popStackToClose_1309371195342() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term715561 = new ArrayList();
        term715509 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term715509, term715509.getClass(), "stack", term715561);
        ArrayList term715716 = new ArrayList();
        term715715 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term715715, term715715.getClass(), "state", null);
        setField(term715715, term715715.getClass(), "originalState", null);
        setBooleanField(term715715, term715715.getClass(), "baseUriSetFromDoc", false);
        setField(term715715, term715715.getClass(), "headElement", null);
        setField(term715715, term715715.getClass(), "formElement", null);
        setField(term715715, term715715.getClass(), "contextElement", null);
        setField(term715715, term715715.getClass(), "formattingElements", null);
        setField(term715715, term715715.getClass(), "pendingTableCharacters", null);
        setField(term715715, term715715.getClass(), "emptyEnd", null);
        setBooleanField(term715715, term715715.getClass(), "framesetOk", false);
        setBooleanField(term715715, term715715.getClass(), "fosterInserts", false);
        setBooleanField(term715715, term715715.getClass(), "fragmentParsing", false);
        setField(term715715, term715715.getClass(), "specificScopeTarget", null);
        setField(term715715, term715715.getClass(), "reader", null);
        setField(term715715, term715715.getClass(), "tokeniser", null);
        setField(term715715, term715715.getClass(), "doc", null);
        setField(term715715, term715715.getClass(), "stack", term715716);
        setField(term715715, term715715.getClass(), "baseUri", null);
        setField(term715715, term715715.getClass(), "currentToken", null);
        setField(term715715, term715715.getClass(), "errors", null);
        setField(term715715, term715715.getClass(), "start", null);
        setField(term715715, term715715.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "popStackToClose", argTypes, term715509, args);
        assertTrue(recursiveEquals(term715509, term715715));
    }

};


