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

public class HtmlTreeBuilder_removeFromStack_1302793563212 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term441995;
     Object term442200;

    public HtmlTreeBuilder_removeFromStack_1302793563212() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term442047 = new ArrayList();
        term441995 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term441995, term441995.getClass(), "stack", term442047);
        ArrayList term442201 = new ArrayList();
        term442200 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term442200, term442200.getClass(), "state", null);
        setField(term442200, term442200.getClass(), "originalState", null);
        setBooleanField(term442200, term442200.getClass(), "baseUriSetFromDoc", false);
        setField(term442200, term442200.getClass(), "headElement", null);
        setField(term442200, term442200.getClass(), "formElement", null);
        setField(term442200, term442200.getClass(), "contextElement", null);
        setField(term442200, term442200.getClass(), "formattingElements", null);
        setField(term442200, term442200.getClass(), "pendingTableCharacters", null);
        setField(term442200, term442200.getClass(), "emptyEnd", null);
        setBooleanField(term442200, term442200.getClass(), "framesetOk", false);
        setBooleanField(term442200, term442200.getClass(), "fosterInserts", false);
        setBooleanField(term442200, term442200.getClass(), "fragmentParsing", false);
        setField(term442200, term442200.getClass(), "specificScopeTarget", null);
        setField(term442200, term442200.getClass(), "parser", null);
        setField(term442200, term442200.getClass(), "reader", null);
        setField(term442200, term442200.getClass(), "tokeniser", null);
        setField(term442200, term442200.getClass(), "doc", null);
        setField(term442200, term442200.getClass(), "stack", term442201);
        setField(term442200, term442200.getClass(), "baseUri", null);
        setField(term442200, term442200.getClass(), "currentToken", null);
        setField(term442200, term442200.getClass(), "settings", null);
        setField(term442200, term442200.getClass(), "start", null);
        setField(term442200, term442200.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "removeFromStack", argTypes, term441995, args);
        assertTrue(recursiveEquals(term441995, term442200));
        assertTrue(recursiveEquals(retValue, false));
    }

};


