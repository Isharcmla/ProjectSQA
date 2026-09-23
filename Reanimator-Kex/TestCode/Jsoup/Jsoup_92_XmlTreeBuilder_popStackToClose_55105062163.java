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

public class XmlTreeBuilder_popStackToClose_55105062163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term201575;
     Object term201757;
     Object term201825;
     Object term201829;

    public XmlTreeBuilder_popStackToClose_55105062163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term201693 = new ArrayList();
        term201575 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term201641 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term201641, term201641.getClass(), "preserveTagCase", false);
        setField(term201575, term201575.getClass(), "settings", term201641);
        setField(term201575, term201575.getClass(), "stack", term201693);
        term201757 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term201757, term201757.getClass(), "tagName", "");
        ArrayList term201826 = new ArrayList();
        term201825 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term201828 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setField(term201825, term201825.getClass(), "parser", null);
        setField(term201825, term201825.getClass(), "reader", null);
        setField(term201825, term201825.getClass(), "tokeniser", null);
        setField(term201825, term201825.getClass(), "doc", null);
        setField(term201825, term201825.getClass(), "stack", term201826);
        setField(term201825, term201825.getClass(), "baseUri", null);
        setField(term201825, term201825.getClass(), "currentToken", null);
        setBooleanField(term201828, term201828.getClass(), "preserveTagCase", false);
        setBooleanField(term201828, term201828.getClass(), "preserveAttributeCase", false);
        setField(term201825, term201825.getClass(), "settings", term201828);
        setField(term201825, term201825.getClass(), "start", null);
        setField(term201825, term201825.getClass(), "end", null);
        term201829 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term201829, term201829.getClass(), "tagName", "");
        setField(term201829, term201829.getClass(), "normalName", null);
        setField(term201829, term201829.getClass(), "pendingAttributeName", null);
        setField(term201829, term201829.getClass(), "pendingAttributeValue", null);
        setField(term201829, term201829.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term201829, term201829.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term201829, term201829.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term201829, term201829.getClass(), "selfClosing", false);
        setField(term201829, term201829.getClass(), "attributes", null);
        setField(term201829, term201829.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$EndTag");
        Object[] args = new Object[1];
        args[0] = term201757;
        callMethod(klass, "popStackToClose", argTypes, term201575, args);
        assertTrue(recursiveEquals(term201575, term201825));
        assertTrue(recursiveEquals(term201757, term201829));
    }

};


