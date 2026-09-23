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

public class FormElement_equals_817636276159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term67836;
     Object term68008;
     Object term68205;
     Object term68210;

    public FormElement_equals_817636276159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term67836 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term68037 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term67940 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term67836, term67836.getClass(), "childNodes", null);
        setField(term67836, term67836.getClass(), "attributes", term68037);
        setField(term67940, term67940.getClass(), "tagName", "");
        setBooleanField(term67940, term67940.getClass(), "canContainBlock", true);
        setBooleanField(term67940, term67940.getClass(), "canContainInline", true);
        setBooleanField(term67940, term67940.getClass(), "empty", true);
        setBooleanField(term67940, term67940.getClass(), "formatAsBlock", true);
        setBooleanField(term67940, term67940.getClass(), "isBlock", false);
        setBooleanField(term67940, term67940.getClass(), "preserveWhitespace", true);
        setBooleanField(term67940, term67940.getClass(), "selfClosing", true);
        setBooleanField(term67940, term67940.getClass(), "formList", true);
        setBooleanField(term67940, term67940.getClass(), "formSubmit", false);
        setField(term67836, term67836.getClass(), "tag", term67940);
        term68008 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term68083 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term68008, term68008.getClass(), "childNodes", null);
        setField(term68008, term68008.getClass(), "attributes", term68037);
        setField(term68083, term68083.getClass(), "tagName", "");
        setBooleanField(term68083, term68083.getClass(), "canContainBlock", true);
        setBooleanField(term68083, term68083.getClass(), "canContainInline", true);
        setBooleanField(term68083, term68083.getClass(), "empty", true);
        setBooleanField(term68083, term68083.getClass(), "formatAsBlock", true);
        setBooleanField(term68083, term68083.getClass(), "isBlock", false);
        setBooleanField(term68083, term68083.getClass(), "preserveWhitespace", true);
        setBooleanField(term68083, term68083.getClass(), "selfClosing", true);
        setBooleanField(term68083, term68083.getClass(), "formList", true);
        setBooleanField(term68083, term68083.getClass(), "formSubmit", true);
        setField(term68008, term68008.getClass(), "tag", term68083);
        term68205 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term68206 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term68209 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term68205, term68205.getClass(), "elements", null);
        setField(term68206, term68206.getClass(), "tagName", "");
        setBooleanField(term68206, term68206.getClass(), "isBlock", false);
        setBooleanField(term68206, term68206.getClass(), "formatAsBlock", true);
        setBooleanField(term68206, term68206.getClass(), "canContainBlock", true);
        setBooleanField(term68206, term68206.getClass(), "canContainInline", true);
        setBooleanField(term68206, term68206.getClass(), "empty", true);
        setBooleanField(term68206, term68206.getClass(), "selfClosing", true);
        setBooleanField(term68206, term68206.getClass(), "preserveWhitespace", true);
        setBooleanField(term68206, term68206.getClass(), "formList", true);
        setBooleanField(term68206, term68206.getClass(), "formSubmit", false);
        setField(term68205, term68205.getClass(), "tag", term68206);
        setField(term68205, term68205.getClass(), "parentNode", null);
        setField(term68205, term68205.getClass(), "childNodes", null);
        setField(term68209, term68209.getClass(), "attributes", null);
        setField(term68205, term68205.getClass(), "attributes", term68209);
        setField(term68205, term68205.getClass(), "baseUri", null);
        setIntField(term68205, term68205.getClass(), "siblingIndex", 0);
        term68210 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term68211 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term68214 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term68210, term68210.getClass(), "elements", null);
        setField(term68211, term68211.getClass(), "tagName", "");
        setBooleanField(term68211, term68211.getClass(), "isBlock", false);
        setBooleanField(term68211, term68211.getClass(), "formatAsBlock", true);
        setBooleanField(term68211, term68211.getClass(), "canContainBlock", true);
        setBooleanField(term68211, term68211.getClass(), "canContainInline", true);
        setBooleanField(term68211, term68211.getClass(), "empty", true);
        setBooleanField(term68211, term68211.getClass(), "selfClosing", true);
        setBooleanField(term68211, term68211.getClass(), "preserveWhitespace", true);
        setBooleanField(term68211, term68211.getClass(), "formList", true);
        setBooleanField(term68211, term68211.getClass(), "formSubmit", true);
        setField(term68210, term68210.getClass(), "tag", term68211);
        setField(term68210, term68210.getClass(), "parentNode", null);
        setField(term68210, term68210.getClass(), "childNodes", null);
        setField(term68214, term68214.getClass(), "attributes", null);
        setField(term68210, term68210.getClass(), "attributes", term68214);
        setField(term68210, term68210.getClass(), "baseUri", null);
        setIntField(term68210, term68210.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term68008;
        callMethod(klass, "equals", argTypes, term67836, args);
        assertTrue(recursiveEquals(term67836, term68205));
        assertTrue(recursiveEquals(term68008, term68210));
    }

};


