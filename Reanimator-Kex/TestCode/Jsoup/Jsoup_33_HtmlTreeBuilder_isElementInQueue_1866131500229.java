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

public class HtmlTreeBuilder_isElementInQueue_1866131500229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term424112;
     Object term424194;
     Object term424221;
     Object term424222;

    public HtmlTreeBuilder_isElementInQueue_1866131500229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term424112 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        term424194 = newInstance(Class.forName("org.jsoup.helper.DescendableLinkedList"));
        term424221 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term424221, term424221.getClass(), "state", null);
        setField(term424221, term424221.getClass(), "originalState", null);
        setBooleanField(term424221, term424221.getClass(), "baseUriSetFromDoc", false);
        setField(term424221, term424221.getClass(), "headElement", null);
        setField(term424221, term424221.getClass(), "formElement", null);
        setField(term424221, term424221.getClass(), "contextElement", null);
        setField(term424221, term424221.getClass(), "formattingElements", null);
        setField(term424221, term424221.getClass(), "pendingTableCharacters", null);
        setBooleanField(term424221, term424221.getClass(), "framesetOk", false);
        setBooleanField(term424221, term424221.getClass(), "fosterInserts", false);
        setBooleanField(term424221, term424221.getClass(), "fragmentParsing", false);
        setField(term424221, term424221.getClass(), "reader", null);
        setField(term424221, term424221.getClass(), "tokeniser", null);
        setField(term424221, term424221.getClass(), "doc", null);
        setField(term424221, term424221.getClass(), "stack", null);
        setField(term424221, term424221.getClass(), "baseUri", null);
        setField(term424221, term424221.getClass(), "currentToken", null);
        setField(term424221, term424221.getClass(), "errors", null);
        term424222 = newInstance(Class.forName("org.jsoup.helper.DescendableLinkedList"));
        setIntField(term424222, term424222.getClass(), "size", 0);
        setField(term424222, term424222.getClass(), "first", null);
        setField(term424222, term424222.getClass(), "last", null);
        setIntField(term424222, term424222.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.helper.DescendableLinkedList");
        argTypes[1] = Class.forName("org.jsoup.nodes.Element");
        Object[] args = new Object[2];
        args[0] = term424194;
        args[1] = null;
        Object retValue = callMethod(klass, "isElementInQueue", argTypes, term424112, args);
        assertTrue(recursiveEquals(term424112, term424221));
        assertTrue(recursiveEquals(term424194, term424222));
        assertTrue(recursiveEquals(retValue, false));
    }

};


