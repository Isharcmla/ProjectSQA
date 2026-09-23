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

public class XmlTreeBuilder_popStackToClose_55105062125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term33107;
     Object term33253;
     Object term33350;
     Object term33352;

    public XmlTreeBuilder_popStackToClose_55105062125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term33107 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term33189 = newInstance(Class.forName("org.jsoup.helper.DescendableLinkedList"));
        setField(term33107, term33107.getClass(), "stack", term33189);
        term33253 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term33253, term33253.getClass(), "tagName", "         ");
        term33350 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term33351 = newInstance(Class.forName("org.jsoup.helper.DescendableLinkedList"));
        setField(term33350, term33350.getClass(), "reader", null);
        setField(term33350, term33350.getClass(), "tokeniser", null);
        setField(term33350, term33350.getClass(), "doc", null);
        setIntField(term33351, term33351.getClass(), "size", 0);
        setField(term33351, term33351.getClass(), "first", null);
        setField(term33351, term33351.getClass(), "last", null);
        setIntField(term33351, term33351.getClass(), "modCount", 0);
        setField(term33350, term33350.getClass(), "stack", term33351);
        setField(term33350, term33350.getClass(), "baseUri", null);
        setField(term33350, term33350.getClass(), "currentToken", null);
        setField(term33350, term33350.getClass(), "errors", null);
        term33352 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term33352, term33352.getClass(), "tagName", "         ");
        setField(term33352, term33352.getClass(), "pendingAttributeName", null);
        setField(term33352, term33352.getClass(), "pendingAttributeValue", null);
        setBooleanField(term33352, term33352.getClass(), "selfClosing", false);
        setField(term33352, term33352.getClass(), "attributes", null);
        setField(term33352, term33352.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$EndTag");
        Object[] args = new Object[1];
        args[0] = term33253;
        callMethod(klass, "popStackToClose", argTypes, term33107, args);
        assertTrue(recursiveEquals(term33107, term33350));
        assertTrue(recursiveEquals(term33253, term33352));
    }

};


