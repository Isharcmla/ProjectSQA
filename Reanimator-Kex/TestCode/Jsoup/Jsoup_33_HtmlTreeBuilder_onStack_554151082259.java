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

public class HtmlTreeBuilder_onStack_554151082259 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term439123;
     Object term439257;
     Object term439290;
     Object term439292;

    public HtmlTreeBuilder_onStack_554151082259() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term439123 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term439205 = newInstance(Class.forName("org.jsoup.helper.DescendableLinkedList"));
        setField(term439123, term439123.getClass(), "stack", term439205);
        term439257 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        term439290 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term439291 = newInstance(Class.forName("org.jsoup.helper.DescendableLinkedList"));
        setField(term439290, term439290.getClass(), "state", null);
        setField(term439290, term439290.getClass(), "originalState", null);
        setBooleanField(term439290, term439290.getClass(), "baseUriSetFromDoc", false);
        setField(term439290, term439290.getClass(), "headElement", null);
        setField(term439290, term439290.getClass(), "formElement", null);
        setField(term439290, term439290.getClass(), "contextElement", null);
        setField(term439290, term439290.getClass(), "formattingElements", null);
        setField(term439290, term439290.getClass(), "pendingTableCharacters", null);
        setBooleanField(term439290, term439290.getClass(), "framesetOk", false);
        setBooleanField(term439290, term439290.getClass(), "fosterInserts", false);
        setBooleanField(term439290, term439290.getClass(), "fragmentParsing", false);
        setField(term439290, term439290.getClass(), "reader", null);
        setField(term439290, term439290.getClass(), "tokeniser", null);
        setField(term439290, term439290.getClass(), "doc", null);
        setIntField(term439291, term439291.getClass(), "size", 0);
        setField(term439291, term439291.getClass(), "first", null);
        setField(term439291, term439291.getClass(), "last", null);
        setIntField(term439291, term439291.getClass(), "modCount", 0);
        setField(term439290, term439290.getClass(), "stack", term439291);
        setField(term439290, term439290.getClass(), "baseUri", null);
        setField(term439290, term439290.getClass(), "currentToken", null);
        setField(term439290, term439290.getClass(), "errors", null);
        term439292 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        setField(term439292, term439292.getClass(), "tag", null);
        setField(term439292, term439292.getClass(), "classNames", null);
        setField(term439292, term439292.getClass(), "parentNode", null);
        setField(term439292, term439292.getClass(), "childNodes", null);
        setField(term439292, term439292.getClass(), "attributes", null);
        setField(term439292, term439292.getClass(), "baseUri", null);
        setIntField(term439292, term439292.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = term439257;
        callMethod(klass, "onStack", argTypes, term439123, args);
        assertTrue(recursiveEquals(term439123, term439290));
        assertTrue(recursiveEquals(term439257, term439292));
    }

};


