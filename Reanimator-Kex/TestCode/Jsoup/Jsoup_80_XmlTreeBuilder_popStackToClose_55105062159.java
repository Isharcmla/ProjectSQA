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
import java.util.ArrayList;

public class XmlTreeBuilder_popStackToClose_55105062159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term198830;
     Object term199012;
     Object term199348;
     Object term199352;

    public XmlTreeBuilder_popStackToClose_55105062159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term198948 = new ArrayList();
        term198830 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term198896 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term198896, term198896.getClass(), "preserveTagCase", false);
        setField(term198830, term198830.getClass(), "settings", term198896);
        setField(term198830, term198830.getClass(), "stack", term198948);
        term199012 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term199012, term199012.getClass(), "tagName", "");
        ArrayList term199349 = new ArrayList();
        term199348 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term199351 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setField(term199348, term199348.getClass(), "reader", null);
        setField(term199348, term199348.getClass(), "tokeniser", null);
        setField(term199348, term199348.getClass(), "doc", null);
        setField(term199348, term199348.getClass(), "stack", term199349);
        setField(term199348, term199348.getClass(), "baseUri", null);
        setField(term199348, term199348.getClass(), "currentToken", null);
        setField(term199348, term199348.getClass(), "errors", null);
        setBooleanField(term199351, term199351.getClass(), "preserveTagCase", false);
        setBooleanField(term199351, term199351.getClass(), "preserveAttributeCase", false);
        setField(term199348, term199348.getClass(), "settings", term199351);
        setField(term199348, term199348.getClass(), "start", null);
        setField(term199348, term199348.getClass(), "end", null);
        term199352 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term199352, term199352.getClass(), "tagName", "");
        setField(term199352, term199352.getClass(), "normalName", null);
        setField(term199352, term199352.getClass(), "pendingAttributeName", null);
        setField(term199352, term199352.getClass(), "pendingAttributeValue", null);
        setField(term199352, term199352.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term199352, term199352.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term199352, term199352.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term199352, term199352.getClass(), "selfClosing", false);
        setField(term199352, term199352.getClass(), "attributes", null);
        setField(term199352, term199352.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$EndTag");
        Object[] args = new Object[1];
        args[0] = term199012;
        callMethod(klass, "popStackToClose", argTypes, term198830, args);
        assertTrue(recursiveEquals(term198830, term199348));
        assertTrue(recursiveEquals(term199012, term199352));
    }

};


