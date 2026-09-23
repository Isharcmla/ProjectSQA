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

public class FormElement_equals_817636276157 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term66934;
     Object term67106;
     Object term67372;
     Object term67377;

    public FormElement_equals_817636276157() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term66934 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term66992 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term67038 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term66934, term66934.getClass(), "childNodes", null);
        setField(term66992, term66992.getClass(), "attributes", null);
        setField(term66934, term66934.getClass(), "attributes", term66992);
        setField(term67038, term67038.getClass(), "tagName", "byte[]");
        setBooleanField(term67038, term67038.getClass(), "canContainBlock", false);
        setBooleanField(term67038, term67038.getClass(), "canContainInline", false);
        setBooleanField(term67038, term67038.getClass(), "empty", true);
        setBooleanField(term67038, term67038.getClass(), "formatAsBlock", true);
        setBooleanField(term67038, term67038.getClass(), "isBlock", true);
        setBooleanField(term67038, term67038.getClass(), "preserveWhitespace", true);
        setBooleanField(term67038, term67038.getClass(), "selfClosing", true);
        setBooleanField(term67038, term67038.getClass(), "formList", true);
        setField(term66934, term66934.getClass(), "tag", term67038);
        term67106 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term67164 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term67210 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term67106, term67106.getClass(), "childNodes", null);
        setField(term67164, term67164.getClass(), "attributes", null);
        setField(term67106, term67106.getClass(), "attributes", term67164);
        setField(term67210, term67210.getClass(), "tagName", "byte[]");
        setBooleanField(term67210, term67210.getClass(), "canContainBlock", false);
        setBooleanField(term67210, term67210.getClass(), "canContainInline", false);
        setBooleanField(term67210, term67210.getClass(), "empty", true);
        setBooleanField(term67210, term67210.getClass(), "formatAsBlock", true);
        setBooleanField(term67210, term67210.getClass(), "isBlock", true);
        setBooleanField(term67210, term67210.getClass(), "preserveWhitespace", true);
        setBooleanField(term67210, term67210.getClass(), "selfClosing", true);
        setBooleanField(term67210, term67210.getClass(), "formList", false);
        setField(term67106, term67106.getClass(), "tag", term67210);
        term67372 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term67373 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term67376 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term67372, term67372.getClass(), "elements", null);
        setField(term67373, term67373.getClass(), "tagName", "byte[]");
        setBooleanField(term67373, term67373.getClass(), "isBlock", true);
        setBooleanField(term67373, term67373.getClass(), "formatAsBlock", true);
        setBooleanField(term67373, term67373.getClass(), "canContainBlock", false);
        setBooleanField(term67373, term67373.getClass(), "canContainInline", false);
        setBooleanField(term67373, term67373.getClass(), "empty", true);
        setBooleanField(term67373, term67373.getClass(), "selfClosing", true);
        setBooleanField(term67373, term67373.getClass(), "preserveWhitespace", true);
        setBooleanField(term67373, term67373.getClass(), "formList", true);
        setBooleanField(term67373, term67373.getClass(), "formSubmit", false);
        setField(term67372, term67372.getClass(), "tag", term67373);
        setField(term67372, term67372.getClass(), "parentNode", null);
        setField(term67372, term67372.getClass(), "childNodes", null);
        setField(term67376, term67376.getClass(), "attributes", null);
        setField(term67372, term67372.getClass(), "attributes", term67376);
        setField(term67372, term67372.getClass(), "baseUri", null);
        setIntField(term67372, term67372.getClass(), "siblingIndex", 0);
        term67377 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term67378 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term67381 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term67377, term67377.getClass(), "elements", null);
        setField(term67378, term67378.getClass(), "tagName", "byte[]");
        setBooleanField(term67378, term67378.getClass(), "isBlock", true);
        setBooleanField(term67378, term67378.getClass(), "formatAsBlock", true);
        setBooleanField(term67378, term67378.getClass(), "canContainBlock", false);
        setBooleanField(term67378, term67378.getClass(), "canContainInline", false);
        setBooleanField(term67378, term67378.getClass(), "empty", true);
        setBooleanField(term67378, term67378.getClass(), "selfClosing", true);
        setBooleanField(term67378, term67378.getClass(), "preserveWhitespace", true);
        setBooleanField(term67378, term67378.getClass(), "formList", false);
        setBooleanField(term67378, term67378.getClass(), "formSubmit", false);
        setField(term67377, term67377.getClass(), "tag", term67378);
        setField(term67377, term67377.getClass(), "parentNode", null);
        setField(term67377, term67377.getClass(), "childNodes", null);
        setField(term67381, term67381.getClass(), "attributes", null);
        setField(term67377, term67377.getClass(), "attributes", term67381);
        setField(term67377, term67377.getClass(), "baseUri", null);
        setIntField(term67377, term67377.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term67106;
        callMethod(klass, "equals", argTypes, term66934, args);
        assertTrue(recursiveEquals(term66934, term67372));
        assertTrue(recursiveEquals(term67106, term67377));
    }

};


