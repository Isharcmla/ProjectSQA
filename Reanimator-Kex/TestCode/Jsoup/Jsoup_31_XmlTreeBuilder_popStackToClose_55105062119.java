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

public class XmlTreeBuilder_popStackToClose_55105062119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term31466;
     Object term31612;
     Object term31997;
     Object term31999;

    public XmlTreeBuilder_popStackToClose_55105062119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term31466 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term31548 = newInstance(Class.forName("org.jsoup.helper.DescendableLinkedList"));
        setField(term31466, term31466.getClass(), "stack", term31548);
        term31612 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term31612, term31612.getClass(), "tagName", "                                                                                                         ");
        term31997 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term31998 = newInstance(Class.forName("org.jsoup.helper.DescendableLinkedList"));
        setField(term31997, term31997.getClass(), "reader", null);
        setField(term31997, term31997.getClass(), "tokeniser", null);
        setField(term31997, term31997.getClass(), "doc", null);
        setIntField(term31998, term31998.getClass(), "size", 0);
        setField(term31998, term31998.getClass(), "first", null);
        setField(term31998, term31998.getClass(), "last", null);
        setIntField(term31998, term31998.getClass(), "modCount", 0);
        setField(term31997, term31997.getClass(), "stack", term31998);
        setField(term31997, term31997.getClass(), "baseUri", null);
        setField(term31997, term31997.getClass(), "currentToken", null);
        setField(term31997, term31997.getClass(), "errors", null);
        term31999 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term31999, term31999.getClass(), "tagName", "                                                                                                         ");
        setField(term31999, term31999.getClass(), "pendingAttributeName", null);
        setField(term31999, term31999.getClass(), "pendingAttributeValue", null);
        setBooleanField(term31999, term31999.getClass(), "selfClosing", false);
        setField(term31999, term31999.getClass(), "attributes", null);
        setField(term31999, term31999.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$EndTag");
        Object[] args = new Object[1];
        args[0] = term31612;
        callMethod(klass, "popStackToClose", argTypes, term31466, args);
        assertTrue(recursiveEquals(term31466, term31997));
        assertTrue(recursiveEquals(term31612, term31999));
    }

};


