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

public class HtmlTreeBuilder_removeFromStack_1302793563243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term210974;
     Object term212464;

    public HtmlTreeBuilder_removeFromStack_1302793563243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term211026 = new ArrayList();
        term210974 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term210974, term210974.getClass(), "stack", term211026);
        ArrayList term212465 = new ArrayList();
        term212464 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term212464, term212464.getClass(), "state", null);
        setField(term212464, term212464.getClass(), "originalState", null);
        setBooleanField(term212464, term212464.getClass(), "baseUriSetFromDoc", false);
        setField(term212464, term212464.getClass(), "headElement", null);
        setField(term212464, term212464.getClass(), "formElement", null);
        setField(term212464, term212464.getClass(), "contextElement", null);
        setField(term212464, term212464.getClass(), "formattingElements", null);
        setField(term212464, term212464.getClass(), "pendingTableCharacters", null);
        setField(term212464, term212464.getClass(), "emptyEnd", null);
        setBooleanField(term212464, term212464.getClass(), "framesetOk", false);
        setBooleanField(term212464, term212464.getClass(), "fosterInserts", false);
        setBooleanField(term212464, term212464.getClass(), "fragmentParsing", false);
        setField(term212464, term212464.getClass(), "specificScopeTarget", null);
        setField(term212464, term212464.getClass(), "reader", null);
        setField(term212464, term212464.getClass(), "tokeniser", null);
        setField(term212464, term212464.getClass(), "doc", null);
        setField(term212464, term212464.getClass(), "stack", term212465);
        setField(term212464, term212464.getClass(), "baseUri", null);
        setField(term212464, term212464.getClass(), "currentToken", null);
        setField(term212464, term212464.getClass(), "errors", null);
        setField(term212464, term212464.getClass(), "settings", null);
        setField(term212464, term212464.getClass(), "start", null);
        setField(term212464, term212464.getClass(), "end", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "removeFromStack", argTypes, term210974, args);
        assertTrue(recursiveEquals(term210974, term212464));
        assertTrue(recursiveEquals(retValue, false));
    }

};


