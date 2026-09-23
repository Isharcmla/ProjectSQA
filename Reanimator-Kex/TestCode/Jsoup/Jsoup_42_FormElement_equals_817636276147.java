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

public class FormElement_equals_817636276147 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term62582;
     Object term62754;
     Object term62981;
     Object term62986;

    public FormElement_equals_817636276147() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term62582 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term62640 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term62686 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term62582, term62582.getClass(), "childNodes", null);
        setField(term62640, term62640.getClass(), "attributes", null);
        setField(term62582, term62582.getClass(), "attributes", term62640);
        setField(term62686, term62686.getClass(), "tagName", "");
        setBooleanField(term62686, term62686.getClass(), "canContainBlock", false);
        setBooleanField(term62686, term62686.getClass(), "canContainInline", false);
        setBooleanField(term62686, term62686.getClass(), "empty", false);
        setBooleanField(term62686, term62686.getClass(), "formatAsBlock", true);
        setBooleanField(term62686, term62686.getClass(), "isBlock", false);
        setField(term62582, term62582.getClass(), "tag", term62686);
        term62754 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term62812 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term62858 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term62754, term62754.getClass(), "childNodes", null);
        setField(term62812, term62812.getClass(), "attributes", null);
        setField(term62754, term62754.getClass(), "attributes", term62812);
        setField(term62858, term62858.getClass(), "tagName", "");
        setBooleanField(term62858, term62858.getClass(), "canContainBlock", false);
        setBooleanField(term62858, term62858.getClass(), "canContainInline", false);
        setBooleanField(term62858, term62858.getClass(), "empty", false);
        setBooleanField(term62858, term62858.getClass(), "formatAsBlock", true);
        setBooleanField(term62858, term62858.getClass(), "isBlock", true);
        setField(term62754, term62754.getClass(), "tag", term62858);
        term62981 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term62982 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term62985 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term62981, term62981.getClass(), "elements", null);
        setField(term62982, term62982.getClass(), "tagName", "");
        setBooleanField(term62982, term62982.getClass(), "isBlock", false);
        setBooleanField(term62982, term62982.getClass(), "formatAsBlock", true);
        setBooleanField(term62982, term62982.getClass(), "canContainBlock", false);
        setBooleanField(term62982, term62982.getClass(), "canContainInline", false);
        setBooleanField(term62982, term62982.getClass(), "empty", false);
        setBooleanField(term62982, term62982.getClass(), "selfClosing", false);
        setBooleanField(term62982, term62982.getClass(), "preserveWhitespace", false);
        setBooleanField(term62982, term62982.getClass(), "formList", false);
        setBooleanField(term62982, term62982.getClass(), "formSubmit", false);
        setField(term62981, term62981.getClass(), "tag", term62982);
        setField(term62981, term62981.getClass(), "parentNode", null);
        setField(term62981, term62981.getClass(), "childNodes", null);
        setField(term62985, term62985.getClass(), "attributes", null);
        setField(term62981, term62981.getClass(), "attributes", term62985);
        setField(term62981, term62981.getClass(), "baseUri", null);
        setIntField(term62981, term62981.getClass(), "siblingIndex", 0);
        term62986 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term62987 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term62990 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term62986, term62986.getClass(), "elements", null);
        setField(term62987, term62987.getClass(), "tagName", "");
        setBooleanField(term62987, term62987.getClass(), "isBlock", true);
        setBooleanField(term62987, term62987.getClass(), "formatAsBlock", true);
        setBooleanField(term62987, term62987.getClass(), "canContainBlock", false);
        setBooleanField(term62987, term62987.getClass(), "canContainInline", false);
        setBooleanField(term62987, term62987.getClass(), "empty", false);
        setBooleanField(term62987, term62987.getClass(), "selfClosing", false);
        setBooleanField(term62987, term62987.getClass(), "preserveWhitespace", false);
        setBooleanField(term62987, term62987.getClass(), "formList", false);
        setBooleanField(term62987, term62987.getClass(), "formSubmit", false);
        setField(term62986, term62986.getClass(), "tag", term62987);
        setField(term62986, term62986.getClass(), "parentNode", null);
        setField(term62986, term62986.getClass(), "childNodes", null);
        setField(term62990, term62990.getClass(), "attributes", null);
        setField(term62986, term62986.getClass(), "attributes", term62990);
        setField(term62986, term62986.getClass(), "baseUri", null);
        setIntField(term62986, term62986.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term62754;
        callMethod(klass, "equals", argTypes, term62582, args);
        assertTrue(recursiveEquals(term62582, term62981));
        assertTrue(recursiveEquals(term62754, term62986));
    }

};


