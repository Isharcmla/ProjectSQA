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

public class HtmlTreeBuilder_popStackToClose_1309371195271 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term329235;
     Object term329298;

    public HtmlTreeBuilder_popStackToClose_1309371195271() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term329287 = new ArrayList();
        term329235 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term329235, term329235.getClass(), "stack", term329287);
        ArrayList term329299 = new ArrayList();
        term329298 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term329298, term329298.getClass(), "state", null);
        setField(term329298, term329298.getClass(), "originalState", null);
        setBooleanField(term329298, term329298.getClass(), "baseUriSetFromDoc", false);
        setField(term329298, term329298.getClass(), "headElement", null);
        setField(term329298, term329298.getClass(), "formElement", null);
        setField(term329298, term329298.getClass(), "contextElement", null);
        setField(term329298, term329298.getClass(), "formattingElements", null);
        setField(term329298, term329298.getClass(), "pendingTableCharacters", null);
        setField(term329298, term329298.getClass(), "emptyEnd", null);
        setBooleanField(term329298, term329298.getClass(), "framesetOk", false);
        setBooleanField(term329298, term329298.getClass(), "fosterInserts", false);
        setBooleanField(term329298, term329298.getClass(), "fragmentParsing", false);
        setField(term329298, term329298.getClass(), "specificScopeTarget", null);
        setField(term329298, term329298.getClass(), "parser", null);
        setField(term329298, term329298.getClass(), "reader", null);
        setField(term329298, term329298.getClass(), "tokeniser", null);
        setField(term329298, term329298.getClass(), "doc", null);
        setField(term329298, term329298.getClass(), "stack", term329299);
        setField(term329298, term329298.getClass(), "baseUri", null);
        setField(term329298, term329298.getClass(), "currentToken", null);
        setField(term329298, term329298.getClass(), "settings", null);
        setField(term329298, term329298.getClass(), "start", null);
        setField(term329298, term329298.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "popStackToClose", argTypes, term329235, args);
        assertTrue(recursiveEquals(term329235, term329298));
    }

};


