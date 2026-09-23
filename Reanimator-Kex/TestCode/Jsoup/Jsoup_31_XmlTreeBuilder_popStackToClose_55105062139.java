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

public class XmlTreeBuilder_popStackToClose_55105062139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term42078;
     Object term42224;
     Object term43017;
     Object term43019;

    public XmlTreeBuilder_popStackToClose_55105062139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term42078 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term42160 = newInstance(Class.forName("org.jsoup.helper.DescendableLinkedList"));
        setField(term42078, term42078.getClass(), "stack", term42160);
        term42224 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term42224, term42224.getClass(), "tagName", "                                                                                                                                                                                                                                                 ");
        term43017 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term43018 = newInstance(Class.forName("org.jsoup.helper.DescendableLinkedList"));
        setField(term43017, term43017.getClass(), "reader", null);
        setField(term43017, term43017.getClass(), "tokeniser", null);
        setField(term43017, term43017.getClass(), "doc", null);
        setIntField(term43018, term43018.getClass(), "size", 0);
        setField(term43018, term43018.getClass(), "first", null);
        setField(term43018, term43018.getClass(), "last", null);
        setIntField(term43018, term43018.getClass(), "modCount", 0);
        setField(term43017, term43017.getClass(), "stack", term43018);
        setField(term43017, term43017.getClass(), "baseUri", null);
        setField(term43017, term43017.getClass(), "currentToken", null);
        setField(term43017, term43017.getClass(), "errors", null);
        term43019 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term43019, term43019.getClass(), "tagName", "                                                                                                                                                                                                                                                 ");
        setField(term43019, term43019.getClass(), "pendingAttributeName", null);
        setField(term43019, term43019.getClass(), "pendingAttributeValue", null);
        setBooleanField(term43019, term43019.getClass(), "selfClosing", false);
        setField(term43019, term43019.getClass(), "attributes", null);
        setField(term43019, term43019.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$EndTag");
        Object[] args = new Object[1];
        args[0] = term42224;
        callMethod(klass, "popStackToClose", argTypes, term42078, args);
        assertTrue(recursiveEquals(term42078, term43017));
        assertTrue(recursiveEquals(term42224, term43019));
    }

};


