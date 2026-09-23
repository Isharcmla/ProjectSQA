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

public class HtmlTreeBuilder_clearStackToContext_518032978233 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term609990;
     Object term610053;

    public HtmlTreeBuilder_clearStackToContext_518032978233() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term610042 = new ArrayList();
        term609990 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term609990, term609990.getClass(), "stack", term610042);
        ArrayList term610054 = new ArrayList();
        term610053 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term610053, term610053.getClass(), "state", null);
        setField(term610053, term610053.getClass(), "originalState", null);
        setBooleanField(term610053, term610053.getClass(), "baseUriSetFromDoc", false);
        setField(term610053, term610053.getClass(), "headElement", null);
        setField(term610053, term610053.getClass(), "formElement", null);
        setField(term610053, term610053.getClass(), "contextElement", null);
        setField(term610053, term610053.getClass(), "formattingElements", null);
        setField(term610053, term610053.getClass(), "pendingTableCharacters", null);
        setField(term610053, term610053.getClass(), "emptyEnd", null);
        setBooleanField(term610053, term610053.getClass(), "framesetOk", false);
        setBooleanField(term610053, term610053.getClass(), "fosterInserts", false);
        setBooleanField(term610053, term610053.getClass(), "fragmentParsing", false);
        setField(term610053, term610053.getClass(), "specificScopeTarget", null);
        setField(term610053, term610053.getClass(), "reader", null);
        setField(term610053, term610053.getClass(), "tokeniser", null);
        setField(term610053, term610053.getClass(), "doc", null);
        setField(term610053, term610053.getClass(), "stack", term610054);
        setField(term610053, term610053.getClass(), "baseUri", null);
        setField(term610053, term610053.getClass(), "currentToken", null);
        setField(term610053, term610053.getClass(), "errors", null);
        setField(term610053, term610053.getClass(), "start", null);
        setField(term610053, term610053.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "clearStackToContext", argTypes, term609990, args);
        assertTrue(recursiveEquals(term609990, term610053));
    }

};


