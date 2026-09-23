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

public class XmlTreeBuilder_popStackToClose_551050621751 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term580408;
     Object term580788;
     Object term580905;
     Object term580909;

    public XmlTreeBuilder_popStackToClose_551050621751() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term580586 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term580632 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term580632, term580632.getClass(), "tagName", "");
        setField(term580586, term580586.getClass(), "tag", term580632);
        Object term580724 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        ArrayList term580526 = new ArrayList();
        ((ArrayList) term580526).add((Object)null);
        ((ArrayList) term580526).add((Object)null);
        ((ArrayList) term580526).add(term580586);
        ((ArrayList) term580526).add(term580724);
        term580408 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term580474 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term580474, term580474.getClass(), "preserveTagCase", false);
        setField(term580408, term580408.getClass(), "settings", term580474);
        setField(term580408, term580408.getClass(), "stack", term580526);
        term580788 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term580788, term580788.getClass(), "tagName", "");
        ArrayList term580906 = new ArrayList();
        ((ArrayList) term580906).add((Object)null);
        ((ArrayList) term580906).add((Object)null);
        term580905 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term580908 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setField(term580905, term580905.getClass(), "parser", null);
        setField(term580905, term580905.getClass(), "reader", null);
        setField(term580905, term580905.getClass(), "tokeniser", null);
        setField(term580905, term580905.getClass(), "doc", null);
        setField(term580905, term580905.getClass(), "stack", term580906);
        setField(term580905, term580905.getClass(), "baseUri", null);
        setField(term580905, term580905.getClass(), "currentToken", null);
        setBooleanField(term580908, term580908.getClass(), "preserveTagCase", false);
        setBooleanField(term580908, term580908.getClass(), "preserveAttributeCase", false);
        setField(term580905, term580905.getClass(), "settings", term580908);
        setField(term580905, term580905.getClass(), "start", null);
        setField(term580905, term580905.getClass(), "end", null);
        term580909 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term580909, term580909.getClass(), "tagName", "");
        setField(term580909, term580909.getClass(), "normalName", null);
        setField(term580909, term580909.getClass(), "pendingAttributeName", null);
        setField(term580909, term580909.getClass(), "pendingAttributeValue", null);
        setField(term580909, term580909.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term580909, term580909.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term580909, term580909.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term580909, term580909.getClass(), "selfClosing", false);
        setField(term580909, term580909.getClass(), "attributes", null);
        setField(term580909, term580909.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$EndTag");
        Object[] args = new Object[1];
        args[0] = term580788;
        callMethod(klass, "popStackToClose", argTypes, term580408, args);
        assertTrue(recursiveEquals(term580408, term580905));
        assertTrue(recursiveEquals(term580788, term580909));
    }

};


