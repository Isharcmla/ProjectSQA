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

public class HtmlTreeBuilder_getFromStack_640208782223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term422005;
     Object term422113;

    public HtmlTreeBuilder_getFromStack_640208782223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term422005 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term422087 = newInstance(Class.forName("org.jsoup.helper.DescendableLinkedList"));
        setField(term422005, term422005.getClass(), "stack", term422087);
        term422113 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term422114 = newInstance(Class.forName("org.jsoup.helper.DescendableLinkedList"));
        setField(term422113, term422113.getClass(), "state", null);
        setField(term422113, term422113.getClass(), "originalState", null);
        setBooleanField(term422113, term422113.getClass(), "baseUriSetFromDoc", false);
        setField(term422113, term422113.getClass(), "headElement", null);
        setField(term422113, term422113.getClass(), "formElement", null);
        setField(term422113, term422113.getClass(), "contextElement", null);
        setField(term422113, term422113.getClass(), "formattingElements", null);
        setField(term422113, term422113.getClass(), "pendingTableCharacters", null);
        setBooleanField(term422113, term422113.getClass(), "framesetOk", false);
        setBooleanField(term422113, term422113.getClass(), "fosterInserts", false);
        setBooleanField(term422113, term422113.getClass(), "fragmentParsing", false);
        setField(term422113, term422113.getClass(), "reader", null);
        setField(term422113, term422113.getClass(), "tokeniser", null);
        setField(term422113, term422113.getClass(), "doc", null);
        setIntField(term422114, term422114.getClass(), "size", 0);
        setField(term422114, term422114.getClass(), "first", null);
        setField(term422114, term422114.getClass(), "last", null);
        setIntField(term422114, term422114.getClass(), "modCount", 0);
        setField(term422113, term422113.getClass(), "stack", term422114);
        setField(term422113, term422113.getClass(), "baseUri", null);
        setField(term422113, term422113.getClass(), "currentToken", null);
        setField(term422113, term422113.getClass(), "errors", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = null;
        Object retValue = callMethod(klass, "getFromStack", argTypes, term422005, args);
        assertTrue(recursiveEquals(term422005, term422113));
        assertTrue(recursiveEquals(retValue, null));
    }

};


