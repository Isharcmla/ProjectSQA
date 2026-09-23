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

public class HtmlTreeBuilder_clearStackToContext_518032978310 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term232785;
     Object term233099;

    public HtmlTreeBuilder_clearStackToContext_518032978310() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term232837 = new ArrayList();
        term232785 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term232785, term232785.getClass(), "stack", term232837);
        ArrayList term233100 = new ArrayList();
        term233099 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term233099, term233099.getClass(), "state", null);
        setField(term233099, term233099.getClass(), "originalState", null);
        setBooleanField(term233099, term233099.getClass(), "baseUriSetFromDoc", false);
        setField(term233099, term233099.getClass(), "headElement", null);
        setField(term233099, term233099.getClass(), "formElement", null);
        setField(term233099, term233099.getClass(), "contextElement", null);
        setField(term233099, term233099.getClass(), "formattingElements", null);
        setField(term233099, term233099.getClass(), "pendingTableCharacters", null);
        setField(term233099, term233099.getClass(), "emptyEnd", null);
        setBooleanField(term233099, term233099.getClass(), "framesetOk", false);
        setBooleanField(term233099, term233099.getClass(), "fosterInserts", false);
        setBooleanField(term233099, term233099.getClass(), "fragmentParsing", false);
        setField(term233099, term233099.getClass(), "specificScopeTarget", null);
        setField(term233099, term233099.getClass(), "reader", null);
        setField(term233099, term233099.getClass(), "tokeniser", null);
        setField(term233099, term233099.getClass(), "doc", null);
        setField(term233099, term233099.getClass(), "stack", term233100);
        setField(term233099, term233099.getClass(), "baseUri", null);
        setField(term233099, term233099.getClass(), "currentToken", null);
        setField(term233099, term233099.getClass(), "errors", null);
        setField(term233099, term233099.getClass(), "settings", null);
        setField(term233099, term233099.getClass(), "start", null);
        setField(term233099, term233099.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "clearStackToContext", argTypes, term232785, args);
        assertTrue(recursiveEquals(term232785, term233099));
    }

};


