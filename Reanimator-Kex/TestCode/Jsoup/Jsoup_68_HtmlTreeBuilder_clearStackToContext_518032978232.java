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

public class HtmlTreeBuilder_clearStackToContext_518032978232 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term251894;
     Object term251957;

    public HtmlTreeBuilder_clearStackToContext_518032978232() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term251946 = new ArrayList();
        term251894 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term251894, term251894.getClass(), "stack", term251946);
        ArrayList term251958 = new ArrayList();
        term251957 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term251957, term251957.getClass(), "state", null);
        setField(term251957, term251957.getClass(), "originalState", null);
        setBooleanField(term251957, term251957.getClass(), "baseUriSetFromDoc", false);
        setField(term251957, term251957.getClass(), "headElement", null);
        setField(term251957, term251957.getClass(), "formElement", null);
        setField(term251957, term251957.getClass(), "contextElement", null);
        setField(term251957, term251957.getClass(), "formattingElements", null);
        setField(term251957, term251957.getClass(), "pendingTableCharacters", null);
        setField(term251957, term251957.getClass(), "emptyEnd", null);
        setBooleanField(term251957, term251957.getClass(), "framesetOk", false);
        setBooleanField(term251957, term251957.getClass(), "fosterInserts", false);
        setBooleanField(term251957, term251957.getClass(), "fragmentParsing", false);
        setField(term251957, term251957.getClass(), "specificScopeTarget", null);
        setField(term251957, term251957.getClass(), "reader", null);
        setField(term251957, term251957.getClass(), "tokeniser", null);
        setField(term251957, term251957.getClass(), "doc", null);
        setField(term251957, term251957.getClass(), "stack", term251958);
        setField(term251957, term251957.getClass(), "baseUri", null);
        setField(term251957, term251957.getClass(), "currentToken", null);
        setField(term251957, term251957.getClass(), "errors", null);
        setField(term251957, term251957.getClass(), "settings", null);
        setField(term251957, term251957.getClass(), "start", null);
        setField(term251957, term251957.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "clearStackToContext", argTypes, term251894, args);
        assertTrue(recursiveEquals(term251894, term251957));
    }

};


