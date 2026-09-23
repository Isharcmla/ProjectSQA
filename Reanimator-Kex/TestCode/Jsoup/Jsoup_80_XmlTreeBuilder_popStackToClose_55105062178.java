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

public class XmlTreeBuilder_popStackToClose_55105062178 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term205868;
     Object term206050;
     Object term206888;
     Object term206892;

    public XmlTreeBuilder_popStackToClose_55105062178() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term205986 = new ArrayList();
        term205868 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term205934 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term205934, term205934.getClass(), "preserveTagCase", true);
        setField(term205868, term205868.getClass(), "settings", term205934);
        setField(term205868, term205868.getClass(), "stack", term205986);
        term206050 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term206050, term206050.getClass(), "tagName", "");
        ArrayList term206889 = new ArrayList();
        term206888 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term206891 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setField(term206888, term206888.getClass(), "reader", null);
        setField(term206888, term206888.getClass(), "tokeniser", null);
        setField(term206888, term206888.getClass(), "doc", null);
        setField(term206888, term206888.getClass(), "stack", term206889);
        setField(term206888, term206888.getClass(), "baseUri", null);
        setField(term206888, term206888.getClass(), "currentToken", null);
        setField(term206888, term206888.getClass(), "errors", null);
        setBooleanField(term206891, term206891.getClass(), "preserveTagCase", true);
        setBooleanField(term206891, term206891.getClass(), "preserveAttributeCase", false);
        setField(term206888, term206888.getClass(), "settings", term206891);
        setField(term206888, term206888.getClass(), "start", null);
        setField(term206888, term206888.getClass(), "end", null);
        term206892 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        setField(term206892, term206892.getClass(), "tagName", "");
        setField(term206892, term206892.getClass(), "normalName", null);
        setField(term206892, term206892.getClass(), "pendingAttributeName", null);
        setField(term206892, term206892.getClass(), "pendingAttributeValue", null);
        setField(term206892, term206892.getClass(), "pendingAttributeValueS", null);
        setBooleanField(term206892, term206892.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term206892, term206892.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term206892, term206892.getClass(), "selfClosing", false);
        setField(term206892, term206892.getClass(), "attributes", null);
        setField(term206892, term206892.getClass(), "type", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$EndTag");
        Object[] args = new Object[1];
        args[0] = term206050;
        callMethod(klass, "popStackToClose", argTypes, term205868, args);
        assertTrue(recursiveEquals(term205868, term206888));
        assertTrue(recursiveEquals(term206050, term206892));
    }

};


