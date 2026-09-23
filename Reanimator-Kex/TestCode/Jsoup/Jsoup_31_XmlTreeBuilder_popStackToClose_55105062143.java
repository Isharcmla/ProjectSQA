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

public class XmlTreeBuilder_popStackToClose_55105062143 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term43878;
     Object term44024;
     Object term44121;
     Object term44123;

    public XmlTreeBuilder_popStackToClose_55105062143() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term43878 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term43960 = newInstance(Class.forName("org.jsoup.helper.DescendableLinkedList"));
        setField(term43878, term43878.getClass(), "stack", term43960);
        term44024 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term44024, term44024.getClass(), "tagName", "         ");
        term44121 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term44122 = newInstance(Class.forName("org.jsoup.helper.DescendableLinkedList"));
        setField(term44121, term44121.getClass(), "reader", null);
        setField(term44121, term44121.getClass(), "tokeniser", null);
        setField(term44121, term44121.getClass(), "doc", null);
        setIntField(term44122, term44122.getClass(), "size", 0);
        setField(term44122, term44122.getClass(), "first", null);
        setField(term44122, term44122.getClass(), "last", null);
        setIntField(term44122, term44122.getClass(), "modCount", 0);
        setField(term44121, term44121.getClass(), "stack", term44122);
        setField(term44121, term44121.getClass(), "baseUri", null);
        setField(term44121, term44121.getClass(), "currentToken", null);
        setField(term44121, term44121.getClass(), "errors", null);
        term44123 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term44123, term44123.getClass(), "tagName", "         ");
        setField(term44123, term44123.getClass(), "pendingAttributeName", null);
        setField(term44123, term44123.getClass(), "pendingAttributeValue", null);
        setBooleanField(term44123, term44123.getClass(), "selfClosing", false);
        setField(term44123, term44123.getClass(), "attributes", null);
        setField(term44123, term44123.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$EndTag");
        Object[] args = new Object[1];
        args[0] = term44024;
        callMethod(klass, "popStackToClose", argTypes, term43878, args);
        assertTrue(recursiveEquals(term43878, term44121));
        assertTrue(recursiveEquals(term44024, term44123));
    }

};


