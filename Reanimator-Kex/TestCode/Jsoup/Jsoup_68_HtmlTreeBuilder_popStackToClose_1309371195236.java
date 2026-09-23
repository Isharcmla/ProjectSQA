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

public class HtmlTreeBuilder_popStackToClose_1309371195236 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term252208;
     Object term252271;

    public HtmlTreeBuilder_popStackToClose_1309371195236() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term252260 = new ArrayList();
        term252208 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term252208, term252208.getClass(), "stack", term252260);
        ArrayList term252272 = new ArrayList();
        term252271 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term252271, term252271.getClass(), "state", null);
        setField(term252271, term252271.getClass(), "originalState", null);
        setBooleanField(term252271, term252271.getClass(), "baseUriSetFromDoc", false);
        setField(term252271, term252271.getClass(), "headElement", null);
        setField(term252271, term252271.getClass(), "formElement", null);
        setField(term252271, term252271.getClass(), "contextElement", null);
        setField(term252271, term252271.getClass(), "formattingElements", null);
        setField(term252271, term252271.getClass(), "pendingTableCharacters", null);
        setField(term252271, term252271.getClass(), "emptyEnd", null);
        setBooleanField(term252271, term252271.getClass(), "framesetOk", false);
        setBooleanField(term252271, term252271.getClass(), "fosterInserts", false);
        setBooleanField(term252271, term252271.getClass(), "fragmentParsing", false);
        setField(term252271, term252271.getClass(), "specificScopeTarget", null);
        setField(term252271, term252271.getClass(), "reader", null);
        setField(term252271, term252271.getClass(), "tokeniser", null);
        setField(term252271, term252271.getClass(), "doc", null);
        setField(term252271, term252271.getClass(), "stack", term252272);
        setField(term252271, term252271.getClass(), "baseUri", null);
        setField(term252271, term252271.getClass(), "currentToken", null);
        setField(term252271, term252271.getClass(), "errors", null);
        setField(term252271, term252271.getClass(), "settings", null);
        setField(term252271, term252271.getClass(), "start", null);
        setField(term252271, term252271.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "popStackToClose", argTypes, term252208, args);
        assertTrue(recursiveEquals(term252208, term252271));
    }

};


