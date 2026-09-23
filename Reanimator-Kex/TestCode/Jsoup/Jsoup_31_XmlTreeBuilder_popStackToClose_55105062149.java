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

public class XmlTreeBuilder_popStackToClose_55105062149 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45164;
     Object term45310;
     Object term45407;
     Object term45409;

    public XmlTreeBuilder_popStackToClose_55105062149() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term45164 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term45246 = newInstance(Class.forName("org.jsoup.helper.DescendableLinkedList"));
        setField(term45164, term45164.getClass(), "stack", term45246);
        term45310 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term45310, term45310.getClass(), "tagName", "         ");
        term45407 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term45408 = newInstance(Class.forName("org.jsoup.helper.DescendableLinkedList"));
        setField(term45407, term45407.getClass(), "reader", null);
        setField(term45407, term45407.getClass(), "tokeniser", null);
        setField(term45407, term45407.getClass(), "doc", null);
        setIntField(term45408, term45408.getClass(), "size", 0);
        setField(term45408, term45408.getClass(), "first", null);
        setField(term45408, term45408.getClass(), "last", null);
        setIntField(term45408, term45408.getClass(), "modCount", 0);
        setField(term45407, term45407.getClass(), "stack", term45408);
        setField(term45407, term45407.getClass(), "baseUri", null);
        setField(term45407, term45407.getClass(), "currentToken", null);
        setField(term45407, term45407.getClass(), "errors", null);
        term45409 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term45409, term45409.getClass(), "tagName", "         ");
        setField(term45409, term45409.getClass(), "pendingAttributeName", null);
        setField(term45409, term45409.getClass(), "pendingAttributeValue", null);
        setBooleanField(term45409, term45409.getClass(), "selfClosing", false);
        setField(term45409, term45409.getClass(), "attributes", null);
        setField(term45409, term45409.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$EndTag");
        Object[] args = new Object[1];
        args[0] = term45310;
        callMethod(klass, "popStackToClose", argTypes, term45164, args);
        assertTrue(recursiveEquals(term45164, term45407));
        assertTrue(recursiveEquals(term45310, term45409));
    }

};


