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

public class XmlTreeBuilder_popStackToClose_55105062189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term216659;
     Object term216841;
     Object term216904;
     Object term216908;

    public XmlTreeBuilder_popStackToClose_55105062189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term216777 = new ArrayList();
        term216659 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term216725 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term216725, term216725.getClass(), "preserveTagCase", true);
        setField(term216659, term216659.getClass(), "settings", term216725);
        setField(term216659, term216659.getClass(), "stack", term216777);
        term216841 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term216841, term216841.getClass(), "tagName", "");
        ArrayList term216905 = new ArrayList();
        term216904 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term216907 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setField(term216904, term216904.getClass(), "parser", null);
        setField(term216904, term216904.getClass(), "reader", null);
        setField(term216904, term216904.getClass(), "tokeniser", null);
        setField(term216904, term216904.getClass(), "doc", null);
        setField(term216904, term216904.getClass(), "stack", term216905);
        setField(term216904, term216904.getClass(), "baseUri", null);
        setField(term216904, term216904.getClass(), "currentToken", null);
        setBooleanField(term216907, term216907.getClass(), "preserveTagCase", true);
        setBooleanField(term216907, term216907.getClass(), "preserveAttributeCase", false);
        setField(term216904, term216904.getClass(), "settings", term216907);
        setField(term216904, term216904.getClass(), "start", null);
        setField(term216904, term216904.getClass(), "end", null);
        term216908 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term216908, term216908.getClass(), "tagName", "");
        setField(term216908, term216908.getClass(), "normalName", null);
        setField(term216908, term216908.getClass(), "pendingAttributeName", null);
        setField(term216908, term216908.getClass(), "pendingAttributeValue", null);
        setField(term216908, term216908.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term216908, term216908.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term216908, term216908.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term216908, term216908.getClass(), "selfClosing", false);
        setField(term216908, term216908.getClass(), "attributes", null);
        setField(term216908, term216908.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$EndTag");
        Object[] args = new Object[1];
        args[0] = term216841;
        callMethod(klass, "popStackToClose", argTypes, term216659, args);
        assertTrue(recursiveEquals(term216659, term216904));
        assertTrue(recursiveEquals(term216841, term216908));
    }

};


