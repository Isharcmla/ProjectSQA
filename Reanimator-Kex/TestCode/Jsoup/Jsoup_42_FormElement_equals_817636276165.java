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

public class FormElement_equals_817636276165 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term70490;
     Object term70662;
     Object term70857;
     Object term70862;

    public FormElement_equals_817636276165() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term70490 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term70691 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term70594 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term70490, term70490.getClass(), "childNodes", null);
        setField(term70490, term70490.getClass(), "attributes", term70691);
        setField(term70594, term70594.getClass(), "tagName", "");
        setBooleanField(term70594, term70594.getClass(), "canContainBlock", true);
        setBooleanField(term70594, term70594.getClass(), "canContainInline", true);
        setBooleanField(term70594, term70594.getClass(), "empty", true);
        setBooleanField(term70594, term70594.getClass(), "formatAsBlock", true);
        setBooleanField(term70594, term70594.getClass(), "isBlock", true);
        setBooleanField(term70594, term70594.getClass(), "preserveWhitespace", true);
        setBooleanField(term70594, term70594.getClass(), "selfClosing", false);
        setField(term70490, term70490.getClass(), "tag", term70594);
        term70662 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term70737 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term70662, term70662.getClass(), "childNodes", null);
        setField(term70662, term70662.getClass(), "attributes", term70691);
        setField(term70737, term70737.getClass(), "tagName", "");
        setBooleanField(term70737, term70737.getClass(), "canContainBlock", true);
        setBooleanField(term70737, term70737.getClass(), "canContainInline", true);
        setBooleanField(term70737, term70737.getClass(), "empty", true);
        setBooleanField(term70737, term70737.getClass(), "formatAsBlock", true);
        setBooleanField(term70737, term70737.getClass(), "isBlock", true);
        setBooleanField(term70737, term70737.getClass(), "preserveWhitespace", true);
        setBooleanField(term70737, term70737.getClass(), "selfClosing", true);
        setField(term70662, term70662.getClass(), "tag", term70737);
        term70857 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term70858 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term70861 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term70857, term70857.getClass(), "elements", null);
        setField(term70858, term70858.getClass(), "tagName", "");
        setBooleanField(term70858, term70858.getClass(), "isBlock", true);
        setBooleanField(term70858, term70858.getClass(), "formatAsBlock", true);
        setBooleanField(term70858, term70858.getClass(), "canContainBlock", true);
        setBooleanField(term70858, term70858.getClass(), "canContainInline", true);
        setBooleanField(term70858, term70858.getClass(), "empty", true);
        setBooleanField(term70858, term70858.getClass(), "selfClosing", false);
        setBooleanField(term70858, term70858.getClass(), "preserveWhitespace", true);
        setBooleanField(term70858, term70858.getClass(), "formList", false);
        setBooleanField(term70858, term70858.getClass(), "formSubmit", false);
        setField(term70857, term70857.getClass(), "tag", term70858);
        setField(term70857, term70857.getClass(), "parentNode", null);
        setField(term70857, term70857.getClass(), "childNodes", null);
        setField(term70861, term70861.getClass(), "attributes", null);
        setField(term70857, term70857.getClass(), "attributes", term70861);
        setField(term70857, term70857.getClass(), "baseUri", null);
        setIntField(term70857, term70857.getClass(), "siblingIndex", 0);
        term70862 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term70863 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term70866 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term70862, term70862.getClass(), "elements", null);
        setField(term70863, term70863.getClass(), "tagName", "");
        setBooleanField(term70863, term70863.getClass(), "isBlock", true);
        setBooleanField(term70863, term70863.getClass(), "formatAsBlock", true);
        setBooleanField(term70863, term70863.getClass(), "canContainBlock", true);
        setBooleanField(term70863, term70863.getClass(), "canContainInline", true);
        setBooleanField(term70863, term70863.getClass(), "empty", true);
        setBooleanField(term70863, term70863.getClass(), "selfClosing", true);
        setBooleanField(term70863, term70863.getClass(), "preserveWhitespace", true);
        setBooleanField(term70863, term70863.getClass(), "formList", false);
        setBooleanField(term70863, term70863.getClass(), "formSubmit", false);
        setField(term70862, term70862.getClass(), "tag", term70863);
        setField(term70862, term70862.getClass(), "parentNode", null);
        setField(term70862, term70862.getClass(), "childNodes", null);
        setField(term70866, term70866.getClass(), "attributes", null);
        setField(term70862, term70862.getClass(), "attributes", term70866);
        setField(term70862, term70862.getClass(), "baseUri", null);
        setIntField(term70862, term70862.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term70662;
        callMethod(klass, "equals", argTypes, term70490, args);
        assertTrue(recursiveEquals(term70490, term70857));
        assertTrue(recursiveEquals(term70662, term70862));
    }

};


