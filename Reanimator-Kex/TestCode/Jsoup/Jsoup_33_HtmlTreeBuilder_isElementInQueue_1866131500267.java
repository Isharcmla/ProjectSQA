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

public class HtmlTreeBuilder_isElementInQueue_1866131500267 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term442052;
     Object term442134;
     Object term442161;
     Object term442162;

    public HtmlTreeBuilder_isElementInQueue_1866131500267() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term442052 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        term442134 = newInstance(Class.forName("org.jsoup.helper.DescendableLinkedList"));
        term442161 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term442161, term442161.getClass(), "state", null);
        setField(term442161, term442161.getClass(), "originalState", null);
        setBooleanField(term442161, term442161.getClass(), "baseUriSetFromDoc", false);
        setField(term442161, term442161.getClass(), "headElement", null);
        setField(term442161, term442161.getClass(), "formElement", null);
        setField(term442161, term442161.getClass(), "contextElement", null);
        setField(term442161, term442161.getClass(), "formattingElements", null);
        setField(term442161, term442161.getClass(), "pendingTableCharacters", null);
        setBooleanField(term442161, term442161.getClass(), "framesetOk", false);
        setBooleanField(term442161, term442161.getClass(), "fosterInserts", false);
        setBooleanField(term442161, term442161.getClass(), "fragmentParsing", false);
        setField(term442161, term442161.getClass(), "reader", null);
        setField(term442161, term442161.getClass(), "tokeniser", null);
        setField(term442161, term442161.getClass(), "doc", null);
        setField(term442161, term442161.getClass(), "stack", null);
        setField(term442161, term442161.getClass(), "baseUri", null);
        setField(term442161, term442161.getClass(), "currentToken", null);
        setField(term442161, term442161.getClass(), "errors", null);
        term442162 = newInstance(Class.forName("org.jsoup.helper.DescendableLinkedList"));
        setIntField(term442162, term442162.getClass(), "size", 0);
        setField(term442162, term442162.getClass(), "first", null);
        setField(term442162, term442162.getClass(), "last", null);
        setIntField(term442162, term442162.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.helper.DescendableLinkedList");
        argTypes[1] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[2];
        args[0] = term442134;
        args[1] = null;
        Object retValue = callMethod(klass, "isElementInQueue", argTypes, term442052, args);
        assertTrue(recursiveEquals(term442052, term442161));
        assertTrue(recursiveEquals(term442134, term442162));
        assertTrue(recursiveEquals(retValue, false));
    }

};


