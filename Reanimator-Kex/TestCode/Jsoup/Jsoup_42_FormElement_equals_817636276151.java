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
import java.lang.Object;

public class FormElement_equals_817636276151 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term64412;
     Object term64584;
     Object term64815;
     Object term64820;

    public FormElement_equals_817636276151() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term64412 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term64470 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term64516 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term64412, term64412.getClass(), "childNodes", null);
        setField(term64470, term64470.getClass(), "attributes", null);
        setField(term64412, term64412.getClass(), "attributes", term64470);
        setField(term64516, term64516.getClass(), "tagName", "");
        setBooleanField(term64516, term64516.getClass(), "canContainBlock", true);
        setBooleanField(term64516, term64516.getClass(), "canContainInline", true);
        setBooleanField(term64516, term64516.getClass(), "empty", true);
        setBooleanField(term64516, term64516.getClass(), "formatAsBlock", true);
        setBooleanField(term64516, term64516.getClass(), "isBlock", true);
        setBooleanField(term64516, term64516.getClass(), "preserveWhitespace", true);
        setBooleanField(term64516, term64516.getClass(), "selfClosing", true);
        setBooleanField(term64516, term64516.getClass(), "formList", true);
        setBooleanField(term64516, term64516.getClass(), "formSubmit", false);
        setField(term64412, term64412.getClass(), "tag", term64516);
        term64584 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term64642 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term64688 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term64584, term64584.getClass(), "childNodes", null);
        setField(term64642, term64642.getClass(), "attributes", null);
        setField(term64584, term64584.getClass(), "attributes", term64642);
        setField(term64688, term64688.getClass(), "tagName", "");
        setBooleanField(term64688, term64688.getClass(), "canContainBlock", true);
        setBooleanField(term64688, term64688.getClass(), "canContainInline", true);
        setBooleanField(term64688, term64688.getClass(), "empty", true);
        setBooleanField(term64688, term64688.getClass(), "formatAsBlock", true);
        setBooleanField(term64688, term64688.getClass(), "isBlock", true);
        setBooleanField(term64688, term64688.getClass(), "preserveWhitespace", true);
        setBooleanField(term64688, term64688.getClass(), "selfClosing", true);
        setBooleanField(term64688, term64688.getClass(), "formList", true);
        setBooleanField(term64688, term64688.getClass(), "formSubmit", true);
        setField(term64584, term64584.getClass(), "tag", term64688);
        term64815 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term64816 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term64819 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term64815, term64815.getClass(), "elements", null);
        setField(term64816, term64816.getClass(), "tagName", "");
        setBooleanField(term64816, term64816.getClass(), "isBlock", true);
        setBooleanField(term64816, term64816.getClass(), "formatAsBlock", true);
        setBooleanField(term64816, term64816.getClass(), "canContainBlock", true);
        setBooleanField(term64816, term64816.getClass(), "canContainInline", true);
        setBooleanField(term64816, term64816.getClass(), "empty", true);
        setBooleanField(term64816, term64816.getClass(), "selfClosing", true);
        setBooleanField(term64816, term64816.getClass(), "preserveWhitespace", true);
        setBooleanField(term64816, term64816.getClass(), "formList", true);
        setBooleanField(term64816, term64816.getClass(), "formSubmit", false);
        setField(term64815, term64815.getClass(), "tag", term64816);
        setField(term64815, term64815.getClass(), "parentNode", null);
        setField(term64815, term64815.getClass(), "childNodes", null);
        setField(term64819, term64819.getClass(), "attributes", null);
        setField(term64815, term64815.getClass(), "attributes", term64819);
        setField(term64815, term64815.getClass(), "baseUri", null);
        setIntField(term64815, term64815.getClass(), "siblingIndex", 0);
        term64820 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term64821 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term64824 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term64820, term64820.getClass(), "elements", null);
        setField(term64821, term64821.getClass(), "tagName", "");
        setBooleanField(term64821, term64821.getClass(), "isBlock", true);
        setBooleanField(term64821, term64821.getClass(), "formatAsBlock", true);
        setBooleanField(term64821, term64821.getClass(), "canContainBlock", true);
        setBooleanField(term64821, term64821.getClass(), "canContainInline", true);
        setBooleanField(term64821, term64821.getClass(), "empty", true);
        setBooleanField(term64821, term64821.getClass(), "selfClosing", true);
        setBooleanField(term64821, term64821.getClass(), "preserveWhitespace", true);
        setBooleanField(term64821, term64821.getClass(), "formList", true);
        setBooleanField(term64821, term64821.getClass(), "formSubmit", true);
        setField(term64820, term64820.getClass(), "tag", term64821);
        setField(term64820, term64820.getClass(), "parentNode", null);
        setField(term64820, term64820.getClass(), "childNodes", null);
        setField(term64824, term64824.getClass(), "attributes", null);
        setField(term64820, term64820.getClass(), "attributes", term64824);
        setField(term64820, term64820.getClass(), "baseUri", null);
        setIntField(term64820, term64820.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term64584;
        callMethod(klass, "equals", argTypes, term64412, args);
        assertTrue(recursiveEquals(term64412, term64815));
        assertTrue(recursiveEquals(term64584, term64820));
    }

};


