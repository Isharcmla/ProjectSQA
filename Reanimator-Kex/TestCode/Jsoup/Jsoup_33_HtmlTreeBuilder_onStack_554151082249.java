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

public class HtmlTreeBuilder_onStack_554151082249 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term437245;
     Object term437379;
     Object term437412;
     Object term437414;

    public HtmlTreeBuilder_onStack_554151082249() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term437245 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term437327 = newInstance(Class.forName("org.jsoup.helper.DescendableLinkedList"));
        setField(term437245, term437245.getClass(), "stack", term437327);
        term437379 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        term437412 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term437413 = newInstance(Class.forName("org.jsoup.helper.DescendableLinkedList"));
        setField(term437412, term437412.getClass(), "state", null);
        setField(term437412, term437412.getClass(), "originalState", null);
        setBooleanField(term437412, term437412.getClass(), "baseUriSetFromDoc", false);
        setField(term437412, term437412.getClass(), "headElement", null);
        setField(term437412, term437412.getClass(), "formElement", null);
        setField(term437412, term437412.getClass(), "contextElement", null);
        setField(term437412, term437412.getClass(), "formattingElements", null);
        setField(term437412, term437412.getClass(), "pendingTableCharacters", null);
        setBooleanField(term437412, term437412.getClass(), "framesetOk", false);
        setBooleanField(term437412, term437412.getClass(), "fosterInserts", false);
        setBooleanField(term437412, term437412.getClass(), "fragmentParsing", false);
        setField(term437412, term437412.getClass(), "reader", null);
        setField(term437412, term437412.getClass(), "tokeniser", null);
        setField(term437412, term437412.getClass(), "doc", null);
        setIntField(term437413, term437413.getClass(), "size", 0);
        setField(term437413, term437413.getClass(), "first", null);
        setField(term437413, term437413.getClass(), "last", null);
        setIntField(term437413, term437413.getClass(), "modCount", 0);
        setField(term437412, term437412.getClass(), "stack", term437413);
        setField(term437412, term437412.getClass(), "baseUri", null);
        setField(term437412, term437412.getClass(), "currentToken", null);
        setField(term437412, term437412.getClass(), "errors", null);
        term437414 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        setField(term437414, term437414.getClass(), "tag", null);
        setField(term437414, term437414.getClass(), "classNames", null);
        setField(term437414, term437414.getClass(), "parentNode", null);
        setField(term437414, term437414.getClass(), "childNodes", null);
        setField(term437414, term437414.getClass(), "attributes", null);
        setField(term437414, term437414.getClass(), "baseUri", null);
        setIntField(term437414, term437414.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[1];
        args[0] = term437379;
        callMethod(klass, "onStack", argTypes, term437245, args);
        assertTrue(recursiveEquals(term437245, term437412));
        assertTrue(recursiveEquals(term437379, term437414));
    }

};


