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

public class Element_init_97793489093 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term35;
     Object term8420;
     Object term8432;
     Object term8434;

    public Element_init_97793489093() {
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
        ArrayList term8424 = new ArrayList();
        LinkedHashMap term8427 = new LinkedHashMap();
        term8420 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term8421 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term8426 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term8421, term8421.getClass(), "tagName", "PAEBtnZtTD");
        setBooleanField(term8421, term8421.getClass(), "isBlock", false);
        setBooleanField(term8421, term8421.getClass(), "formatAsBlock", false);
        setBooleanField(term8421, term8421.getClass(), "canContainBlock", false);
        setBooleanField(term8421, term8421.getClass(), "canContainInline", false);
        setBooleanField(term8421, term8421.getClass(), "empty", true);
        setBooleanField(term8421, term8421.getClass(), "selfClosing", true);
        setBooleanField(term8421, term8421.getClass(), "preserveWhitespace", true);
        setBooleanField(term8421, term8421.getClass(), "formList", true);
        setBooleanField(term8421, term8421.getClass(), "formSubmit", false);
        setField(term8420, term8420.getClass(), "tag", term8421);
        setField(term8420, term8420.getClass(), "parentNode", null);
        setField(term8420, term8420.getClass(), "childNodes", term8424);
        setField(term8426, term8426.getClass(), "attributes", term8427);
        setField(term8420, term8420.getClass(), "attributes", term8426);
        setField(term8420, term8420.getClass(), "baseUri", "sjlJAEtRrb");
        setIntField(term8420, term8420.getClass(), "siblingIndex", 0);
        LinkedHashMap term8433 = new LinkedHashMap();
        term8432 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term8432, term8432.getClass(), "attributes", term8433);
        term8434 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term8434, term8434.getClass(), "tagName", "PAEBtnZtTD");
        setBooleanField(term8434, term8434.getClass(), "isBlock", false);
        setBooleanField(term8434, term8434.getClass(), "formatAsBlock", false);
        setBooleanField(term8434, term8434.getClass(), "canContainBlock", false);
        setBooleanField(term8434, term8434.getClass(), "canContainInline", false);
        setBooleanField(term8434, term8434.getClass(), "empty", true);
        setBooleanField(term8434, term8434.getClass(), "selfClosing", true);
        setBooleanField(term8434, term8434.getClass(), "preserveWhitespace", true);
        setBooleanField(term8434, term8434.getClass(), "formList", true);
        setBooleanField(term8434, term8434.getClass(), "formSubmit", false);
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
        assertTrue(recursiveEquals(instance, term8420));
        assertTrue(recursiveEquals(term1, "sjlJAEtRrb"));
        assertTrue(recursiveEquals(term35, term8434));
    }

};


