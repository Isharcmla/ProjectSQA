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

public class HtmlTreeBuilder_onStack_554151082183 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term410197;
     Object term410331;
     Object term410364;
     Object term410366;

    public HtmlTreeBuilder_onStack_554151082183() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term410197 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term410279 = newInstance(Class.forName("org.jsoup.helper.DescendableLinkedList"));
        setField(term410197, term410197.getClass(), "stack", term410279);
        term410331 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        term410364 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term410365 = newInstance(Class.forName("org.jsoup.helper.DescendableLinkedList"));
        setField(term410364, term410364.getClass(), "state", null);
        setField(term410364, term410364.getClass(), "originalState", null);
        setBooleanField(term410364, term410364.getClass(), "baseUriSetFromDoc", false);
        setField(term410364, term410364.getClass(), "headElement", null);
        setField(term410364, term410364.getClass(), "formElement", null);
        setField(term410364, term410364.getClass(), "contextElement", null);
        setField(term410364, term410364.getClass(), "formattingElements", null);
        setField(term410364, term410364.getClass(), "pendingTableCharacters", null);
        setBooleanField(term410364, term410364.getClass(), "framesetOk", false);
        setBooleanField(term410364, term410364.getClass(), "fosterInserts", false);
        setBooleanField(term410364, term410364.getClass(), "fragmentParsing", false);
        setField(term410364, term410364.getClass(), "reader", null);
        setField(term410364, term410364.getClass(), "tokeniser", null);
        setField(term410364, term410364.getClass(), "doc", null);
        setIntField(term410365, term410365.getClass(), "size", 0);
        setField(term410365, term410365.getClass(), "first", null);
        setField(term410365, term410365.getClass(), "last", null);
        setIntField(term410365, term410365.getClass(), "modCount", 0);
        setField(term410364, term410364.getClass(), "stack", term410365);
        setField(term410364, term410364.getClass(), "baseUri", null);
        setField(term410364, term410364.getClass(), "currentToken", null);
        setField(term410364, term410364.getClass(), "errors", null);
        term410366 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        setField(term410366, term410366.getClass(), "tag", null);
        setField(term410366, term410366.getClass(), "classNames", null);
        setField(term410366, term410366.getClass(), "parentNode", null);
        setField(term410366, term410366.getClass(), "childNodes", null);
        setField(term410366, term410366.getClass(), "attributes", null);
        setField(term410366, term410366.getClass(), "baseUri", null);
        setIntField(term410366, term410366.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = term410331;
        callMethod(klass, "onStack", argTypes, term410197, args);
        assertTrue(recursiveEquals(term410197, term410364));
        assertTrue(recursiveEquals(term410331, term410366));
    }

};


