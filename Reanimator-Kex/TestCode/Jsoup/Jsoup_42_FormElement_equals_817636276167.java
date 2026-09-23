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

public class FormElement_equals_817636276167 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term71290;
     Object term71462;
     Object term71686;
     Object term71691;

    public FormElement_equals_817636276167() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term71290 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term71348 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term71394 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term71290, term71290.getClass(), "childNodes", null);
        setField(term71348, term71348.getClass(), "attributes", null);
        setField(term71290, term71290.getClass(), "attributes", term71348);
        setField(term71394, term71394.getClass(), "tagName", "");
        setBooleanField(term71394, term71394.getClass(), "canContainBlock", false);
        setBooleanField(term71394, term71394.getClass(), "canContainInline", true);
        setField(term71290, term71290.getClass(), "tag", term71394);
        term71462 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term71520 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term71566 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term71462, term71462.getClass(), "childNodes", null);
        setField(term71520, term71520.getClass(), "attributes", null);
        setField(term71462, term71462.getClass(), "attributes", term71520);
        setField(term71566, term71566.getClass(), "tagName", "");
        setBooleanField(term71566, term71566.getClass(), "canContainBlock", false);
        setBooleanField(term71566, term71566.getClass(), "canContainInline", false);
        setField(term71462, term71462.getClass(), "tag", term71566);
        term71686 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term71687 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term71690 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term71686, term71686.getClass(), "elements", null);
        setField(term71687, term71687.getClass(), "tagName", "");
        setBooleanField(term71687, term71687.getClass(), "isBlock", false);
        setBooleanField(term71687, term71687.getClass(), "formatAsBlock", false);
        setBooleanField(term71687, term71687.getClass(), "canContainBlock", false);
        setBooleanField(term71687, term71687.getClass(), "canContainInline", true);
        setBooleanField(term71687, term71687.getClass(), "empty", false);
        setBooleanField(term71687, term71687.getClass(), "selfClosing", false);
        setBooleanField(term71687, term71687.getClass(), "preserveWhitespace", false);
        setBooleanField(term71687, term71687.getClass(), "formList", false);
        setBooleanField(term71687, term71687.getClass(), "formSubmit", false);
        setField(term71686, term71686.getClass(), "tag", term71687);
        setField(term71686, term71686.getClass(), "parentNode", null);
        setField(term71686, term71686.getClass(), "childNodes", null);
        setField(term71690, term71690.getClass(), "attributes", null);
        setField(term71686, term71686.getClass(), "attributes", term71690);
        setField(term71686, term71686.getClass(), "baseUri", null);
        setIntField(term71686, term71686.getClass(), "siblingIndex", 0);
        term71691 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term71692 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term71695 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term71691, term71691.getClass(), "elements", null);
        setField(term71692, term71692.getClass(), "tagName", "");
        setBooleanField(term71692, term71692.getClass(), "isBlock", false);
        setBooleanField(term71692, term71692.getClass(), "formatAsBlock", false);
        setBooleanField(term71692, term71692.getClass(), "canContainBlock", false);
        setBooleanField(term71692, term71692.getClass(), "canContainInline", false);
        setBooleanField(term71692, term71692.getClass(), "empty", false);
        setBooleanField(term71692, term71692.getClass(), "selfClosing", false);
        setBooleanField(term71692, term71692.getClass(), "preserveWhitespace", false);
        setBooleanField(term71692, term71692.getClass(), "formList", false);
        setBooleanField(term71692, term71692.getClass(), "formSubmit", false);
        setField(term71691, term71691.getClass(), "tag", term71692);
        setField(term71691, term71691.getClass(), "parentNode", null);
        setField(term71691, term71691.getClass(), "childNodes", null);
        setField(term71695, term71695.getClass(), "attributes", null);
        setField(term71691, term71691.getClass(), "attributes", term71695);
        setField(term71691, term71691.getClass(), "baseUri", null);
        setIntField(term71691, term71691.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term71462;
        callMethod(klass, "equals", argTypes, term71290, args);
        assertTrue(recursiveEquals(term71290, term71686));
        assertTrue(recursiveEquals(term71462, term71691));
    }

};


