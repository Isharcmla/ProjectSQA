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

public class FormElement_init_3636430786 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1;
     Object term35;
     Object term603;
     Object term617;
     Object term619;

    public FormElement_init_3636430786() {
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
        ArrayList term609 = new ArrayList();
        LinkedHashMap term612 = new LinkedHashMap();
        term603 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term604 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term605 = (Object[]) newArray("java.lang.Object", 0);
        Object term606 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term611 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term604, term604.getClass(), "elementData", term605);
        setIntField(term604, term604.getClass(), "size", 0);
        setIntField(term604, term604.getClass(), "modCount", 0);
        setField(term603, term603.getClass(), "elements", term604);
        setField(term606, term606.getClass(), "tagName", "PAEBtnZtTD");
        setBooleanField(term606, term606.getClass(), "isBlock", false);
        setBooleanField(term606, term606.getClass(), "formatAsBlock", false);
        setBooleanField(term606, term606.getClass(), "canContainBlock", false);
        setBooleanField(term606, term606.getClass(), "canContainInline", false);
        setBooleanField(term606, term606.getClass(), "empty", true);
        setBooleanField(term606, term606.getClass(), "selfClosing", true);
        setBooleanField(term606, term606.getClass(), "preserveWhitespace", true);
        setBooleanField(term606, term606.getClass(), "formList", true);
        setBooleanField(term606, term606.getClass(), "formSubmit", false);
        setField(term603, term603.getClass(), "tag", term606);
        setField(term603, term603.getClass(), "parentNode", null);
        setField(term603, term603.getClass(), "childNodes", term609);
        setField(term611, term611.getClass(), "attributes", term612);
        setField(term603, term603.getClass(), "attributes", term611);
        setField(term603, term603.getClass(), "baseUri", "sjlJAEtRrb");
        setIntField(term603, term603.getClass(), "siblingIndex", 0);
        LinkedHashMap term618 = new LinkedHashMap();
        term617 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term617, term617.getClass(), "attributes", term618);
        term619 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term619, term619.getClass(), "tagName", "PAEBtnZtTD");
        setBooleanField(term619, term619.getClass(), "isBlock", false);
        setBooleanField(term619, term619.getClass(), "formatAsBlock", false);
        setBooleanField(term619, term619.getClass(), "canContainBlock", false);
        setBooleanField(term619, term619.getClass(), "canContainInline", false);
        setBooleanField(term619, term619.getClass(), "empty", true);
        setBooleanField(term619, term619.getClass(), "selfClosing", true);
        setBooleanField(term619, term619.getClass(), "preserveWhitespace", true);
        setBooleanField(term619, term619.getClass(), "formList", true);
        setBooleanField(term619, term619.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.jsoup.parser.Tag");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("org.jsoup.nodes.Attributes");
        Object[] args = new Object[3];
        args[0] = term1;
        args[1] = "sjlJAEtRrb";
        args[2] = term35;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term603));
        assertTrue(recursiveEquals(term1, "sjlJAEtRrb"));
        assertTrue(recursiveEquals(term35, term619));
    }

};


