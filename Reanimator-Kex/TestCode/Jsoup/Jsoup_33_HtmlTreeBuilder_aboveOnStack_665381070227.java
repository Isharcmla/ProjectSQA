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

public class HtmlTreeBuilder_aboveOnStack_665381070227 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term423847;
     Object term423981;
     Object term424010;
     Object term424012;

    public HtmlTreeBuilder_aboveOnStack_665381070227() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term423847 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term423929 = newInstance(Class.forName("org.jsoup.helper.DescendableLinkedList"));
        setField(term423847, term423847.getClass(), "stack", term423929);
        term423981 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        term424010 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term424011 = newInstance(Class.forName("org.jsoup.helper.DescendableLinkedList"));
        setField(term424010, term424010.getClass(), "state", null);
        setField(term424010, term424010.getClass(), "originalState", null);
        setBooleanField(term424010, term424010.getClass(), "baseUriSetFromDoc", false);
        setField(term424010, term424010.getClass(), "headElement", null);
        setField(term424010, term424010.getClass(), "formElement", null);
        setField(term424010, term424010.getClass(), "contextElement", null);
        setField(term424010, term424010.getClass(), "formattingElements", null);
        setField(term424010, term424010.getClass(), "pendingTableCharacters", null);
        setBooleanField(term424010, term424010.getClass(), "framesetOk", false);
        setBooleanField(term424010, term424010.getClass(), "fosterInserts", false);
        setBooleanField(term424010, term424010.getClass(), "fragmentParsing", false);
        setField(term424010, term424010.getClass(), "reader", null);
        setField(term424010, term424010.getClass(), "tokeniser", null);
        setField(term424010, term424010.getClass(), "doc", null);
        setIntField(term424011, term424011.getClass(), "size", 0);
        setField(term424011, term424011.getClass(), "first", null);
        setField(term424011, term424011.getClass(), "last", null);
        setIntField(term424011, term424011.getClass(), "modCount", 0);
        setField(term424010, term424010.getClass(), "stack", term424011);
        setField(term424010, term424010.getClass(), "baseUri", null);
        setField(term424010, term424010.getClass(), "currentToken", null);
        setField(term424010, term424010.getClass(), "errors", null);
        term424012 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        setField(term424012, term424012.getClass(), "tag", null);
        setField(term424012, term424012.getClass(), "classNames", null);
        setField(term424012, term424012.getClass(), "parentNode", null);
        setField(term424012, term424012.getClass(), "childNodes", null);
        setField(term424012, term424012.getClass(), "attributes", null);
        setField(term424012, term424012.getClass(), "baseUri", null);
        setIntField(term424012, term424012.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = term423981;
        Object retValue = callMethod(klass, "aboveOnStack", argTypes, term423847, args);
        assertTrue(recursiveEquals(term423847, term424010));
        assertTrue(recursiveEquals(term423981, term424012));
        assertTrue(recursiveEquals(retValue, null));
    }

};


