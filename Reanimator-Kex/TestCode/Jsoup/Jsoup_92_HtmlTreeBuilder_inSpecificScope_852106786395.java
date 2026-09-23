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
import java.lang.Object;
import java.util.ArrayList;

public class HtmlTreeBuilder_inSpecificScope_852106786395 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term362848;
     Object term362916;

    public HtmlTreeBuilder_inSpecificScope_852106786395() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term362900 = new ArrayList();
        term362848 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object[] term362762 = (Object[]) newArray("java.lang.String", 12);
        setField(term362848, term362848.getClass(), "specificScopeTarget", term362762);
        setField(term362848, term362848.getClass(), "stack", term362900);
        ArrayList term362918 = new ArrayList();
        term362916 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object[] term362917 = (Object[]) newArray("java.lang.String", 12);
        setField(term362916, term362916.getClass(), "state", null);
        setField(term362916, term362916.getClass(), "originalState", null);
        setBooleanField(term362916, term362916.getClass(), "baseUriSetFromDoc", false);
        setField(term362916, term362916.getClass(), "headElement", null);
        setField(term362916, term362916.getClass(), "formElement", null);
        setField(term362916, term362916.getClass(), "contextElement", null);
        setField(term362916, term362916.getClass(), "formattingElements", null);
        setField(term362916, term362916.getClass(), "pendingTableCharacters", null);
        setField(term362916, term362916.getClass(), "emptyEnd", null);
        setBooleanField(term362916, term362916.getClass(), "framesetOk", false);
        setBooleanField(term362916, term362916.getClass(), "fosterInserts", false);
        setBooleanField(term362916, term362916.getClass(), "fragmentParsing", false);
        setField(term362916, term362916.getClass(), "specificScopeTarget", term362917);
        setField(term362916, term362916.getClass(), "parser", null);
        setField(term362916, term362916.getClass(), "reader", null);
        setField(term362916, term362916.getClass(), "tokeniser", null);
        setField(term362916, term362916.getClass(), "doc", null);
        setField(term362916, term362916.getClass(), "stack", term362918);
        setField(term362916, term362916.getClass(), "baseUri", null);
        setField(term362916, term362916.getClass(), "currentToken", null);
        setField(term362916, term362916.getClass(), "settings", null);
        setField(term362916, term362916.getClass(), "start", null);
        setField(term362916, term362916.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        callMethod(klass, "inSpecificScope", argTypes, term362848, args);
        assertTrue(recursiveEquals(term362848, term362916));
    }

};


