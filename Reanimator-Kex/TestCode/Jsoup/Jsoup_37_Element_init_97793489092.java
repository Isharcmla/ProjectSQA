package org.jsoup.nodes;

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
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.nodes.EqualityUtils.*;
import java.util.LinkedHashMap;
import java.lang.Object;
import java.util.ArrayList;

public class Element_init_97793489092 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term35;
     Object term9084;
     Object term9096;
     Object term9098;

    public Element_init_97793489092() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term1, term1.getClass(), "tagName", "PAEBtnZtTD");
        setBooleanField(term1, term1.getClass(), "isBlock", false);
        setBooleanField(term1, term1.getClass(), "formatAsBlock", false);
        setBooleanField(term1, term1.getClass(), "canContainBlock", false);
        setBooleanField(term1, term1.getClass(), "canContainInline", false);
        setBooleanField(term1, term1.getClass(), "empty", true);
        setBooleanField(term1, term1.getClass(), "selfClosing", true);
        setBooleanField(term1, term1.getClass(), "preserveWhitespace", true);
        setBooleanField(term1, term1.getClass(), "formList", true);
        setBooleanField(term1, term1.getClass(), "formSubmit", false);
        LinkedHashMap term36 = new LinkedHashMap();
        term35 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term35, term35.getClass(), "attributes", term36);
        ArrayList term9088 = new ArrayList();
        LinkedHashMap term9091 = new LinkedHashMap();
        term9084 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term9085 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term9090 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term9085, term9085.getClass(), "tagName", "PAEBtnZtTD");
        setBooleanField(term9085, term9085.getClass(), "isBlock", false);
        setBooleanField(term9085, term9085.getClass(), "formatAsBlock", false);
        setBooleanField(term9085, term9085.getClass(), "canContainBlock", false);
        setBooleanField(term9085, term9085.getClass(), "canContainInline", false);
        setBooleanField(term9085, term9085.getClass(), "empty", true);
        setBooleanField(term9085, term9085.getClass(), "selfClosing", true);
        setBooleanField(term9085, term9085.getClass(), "preserveWhitespace", true);
        setBooleanField(term9085, term9085.getClass(), "formList", true);
        setBooleanField(term9085, term9085.getClass(), "formSubmit", false);
        setField(term9084, term9084.getClass(), "tag", term9085);
        setField(term9084, term9084.getClass(), "classNames", null);
        setField(term9084, term9084.getClass(), "parentNode", null);
        setField(term9084, term9084.getClass(), "childNodes", term9088);
        setField(term9090, term9090.getClass(), "attributes", term9091);
        setField(term9084, term9084.getClass(), "attributes", term9090);
        setField(term9084, term9084.getClass(), "baseUri", "sjlJAEtRrb");
        setIntField(term9084, term9084.getClass(), "siblingIndex", 0);
        LinkedHashMap term9097 = new LinkedHashMap();
        term9096 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term9096, term9096.getClass(), "attributes", term9097);
        term9098 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term9098, term9098.getClass(), "tagName", "PAEBtnZtTD");
        setBooleanField(term9098, term9098.getClass(), "isBlock", false);
        setBooleanField(term9098, term9098.getClass(), "formatAsBlock", false);
        setBooleanField(term9098, term9098.getClass(), "canContainBlock", false);
        setBooleanField(term9098, term9098.getClass(), "canContainInline", false);
        setBooleanField(term9098, term9098.getClass(), "empty", true);
        setBooleanField(term9098, term9098.getClass(), "selfClosing", true);
        setBooleanField(term9098, term9098.getClass(), "preserveWhitespace", true);
        setBooleanField(term9098, term9098.getClass(), "formList", true);
        setBooleanField(term9098, term9098.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.jsoup.parser.Tag");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("org.jsoup.nodes.Attributes");
        Object[] args = new Object[3];
        args[0] = term1;
        args[1] = "sjlJAEtRrb";
        args[2] = term35;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term9084));
        assertTrue(recursiveEquals(term1, "sjlJAEtRrb"));
        assertTrue(recursiveEquals(term35, term9098));
    }

};


