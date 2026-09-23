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

public class XmlTreeBuilder_popStackToClose_55105062175 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66849;
     Object term66995;
     Object term67092;
     Object term67094;

    public XmlTreeBuilder_popStackToClose_55105062175() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66849 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term66931 = newInstance(Class.forName("org.jsoup.helper.DescendableLinkedList"));
        setField(term66849, term66849.getClass(), "stack", term66931);
        term66995 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term66995, term66995.getClass(), "tagName", "         ");
        term67092 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term67093 = newInstance(Class.forName("org.jsoup.helper.DescendableLinkedList"));
        setField(term67092, term67092.getClass(), "reader", null);
        setField(term67092, term67092.getClass(), "tokeniser", null);
        setField(term67092, term67092.getClass(), "doc", null);
        setIntField(term67093, term67093.getClass(), "size", 0);
        setField(term67093, term67093.getClass(), "first", null);
        setField(term67093, term67093.getClass(), "last", null);
        setIntField(term67093, term67093.getClass(), "modCount", 0);
        setField(term67092, term67092.getClass(), "stack", term67093);
        setField(term67092, term67092.getClass(), "baseUri", null);
        setField(term67092, term67092.getClass(), "currentToken", null);
        setField(term67092, term67092.getClass(), "errors", null);
        term67094 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term67094, term67094.getClass(), "tagName", "         ");
        setField(term67094, term67094.getClass(), "pendingAttributeName", null);
        setField(term67094, term67094.getClass(), "pendingAttributeValue", null);
        setBooleanField(term67094, term67094.getClass(), "selfClosing", false);
        setField(term67094, term67094.getClass(), "attributes", null);
        setField(term67094, term67094.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$EndTag");
        Object[] args = new Object[1];
        args[0] = term66995;
        callMethod(klass, "popStackToClose", argTypes, term66849, args);
        assertTrue(recursiveEquals(term66849, term67092));
        assertTrue(recursiveEquals(term66995, term67094));
    }

};


