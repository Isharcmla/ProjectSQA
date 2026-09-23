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
import java.util.ArrayList;

public class XmlTreeBuilder_popStackToClose_55105062130 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term176438;
     Object term176554;
     Object term178456;
     Object term178459;

    public XmlTreeBuilder_popStackToClose_55105062130() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term176490 = new ArrayList();
        term176438 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term176438, term176438.getClass(), "stack", term176490);
        term176554 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term176554, term176554.getClass(), "tagName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        ArrayList term178457 = new ArrayList();
        term178456 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term178456, term178456.getClass(), "reader", null);
        setField(term178456, term178456.getClass(), "tokeniser", null);
        setField(term178456, term178456.getClass(), "doc", null);
        setField(term178456, term178456.getClass(), "stack", term178457);
        setField(term178456, term178456.getClass(), "baseUri", null);
        setField(term178456, term178456.getClass(), "currentToken", null);
        setField(term178456, term178456.getClass(), "errors", null);
        setField(term178456, term178456.getClass(), "settings", null);
        setField(term178456, term178456.getClass(), "start", null);
        setField(term178456, term178456.getClass(), "end", null);
        term178459 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term178459, term178459.getClass(), "tagName", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        setField(term178459, term178459.getClass(), "normalName", null);
        setField(term178459, term178459.getClass(), "pendingAttributeName", null);
        setField(term178459, term178459.getClass(), "pendingAttributeValue", null);
        setField(term178459, term178459.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term178459, term178459.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term178459, term178459.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term178459, term178459.getClass(), "selfClosing", false);
        setField(term178459, term178459.getClass(), "attributes", null);
        setField(term178459, term178459.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$EndTag");
        Object[] args = new Object[1];
        args[0] = term176554;
        callMethod(klass, "popStackToClose", argTypes, term176438, args);
        assertTrue(recursiveEquals(term176438, term178456));
        assertTrue(recursiveEquals(term176554, term178459));
    }

};


