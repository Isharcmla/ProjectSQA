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

public class FormElement_equals_817636276161 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term68662;
     Object term68834;
     Object term69060;
     Object term69065;

    public FormElement_equals_817636276161() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term68662 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term68720 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term68766 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term68662, term68662.getClass(), "childNodes", null);
        setField(term68720, term68720.getClass(), "attributes", null);
        setField(term68662, term68662.getClass(), "attributes", term68720);
        setField(term68766, term68766.getClass(), "tagName", "");
        setBooleanField(term68766, term68766.getClass(), "canContainBlock", true);
        setBooleanField(term68766, term68766.getClass(), "canContainInline", true);
        setBooleanField(term68766, term68766.getClass(), "empty", true);
        setBooleanField(term68766, term68766.getClass(), "formatAsBlock", false);
        setField(term68662, term68662.getClass(), "tag", term68766);
        term68834 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term68892 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term68938 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term68834, term68834.getClass(), "childNodes", null);
        setField(term68892, term68892.getClass(), "attributes", null);
        setField(term68834, term68834.getClass(), "attributes", term68892);
        setField(term68938, term68938.getClass(), "tagName", "");
        setBooleanField(term68938, term68938.getClass(), "canContainBlock", true);
        setBooleanField(term68938, term68938.getClass(), "canContainInline", true);
        setBooleanField(term68938, term68938.getClass(), "empty", true);
        setBooleanField(term68938, term68938.getClass(), "formatAsBlock", true);
        setField(term68834, term68834.getClass(), "tag", term68938);
        term69060 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term69061 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term69064 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term69060, term69060.getClass(), "elements", null);
        setField(term69061, term69061.getClass(), "tagName", "");
        setBooleanField(term69061, term69061.getClass(), "isBlock", false);
        setBooleanField(term69061, term69061.getClass(), "formatAsBlock", false);
        setBooleanField(term69061, term69061.getClass(), "canContainBlock", true);
        setBooleanField(term69061, term69061.getClass(), "canContainInline", true);
        setBooleanField(term69061, term69061.getClass(), "empty", true);
        setBooleanField(term69061, term69061.getClass(), "selfClosing", false);
        setBooleanField(term69061, term69061.getClass(), "preserveWhitespace", false);
        setBooleanField(term69061, term69061.getClass(), "formList", false);
        setBooleanField(term69061, term69061.getClass(), "formSubmit", false);
        setField(term69060, term69060.getClass(), "tag", term69061);
        setField(term69060, term69060.getClass(), "parentNode", null);
        setField(term69060, term69060.getClass(), "childNodes", null);
        setField(term69064, term69064.getClass(), "attributes", null);
        setField(term69060, term69060.getClass(), "attributes", term69064);
        setField(term69060, term69060.getClass(), "baseUri", null);
        setIntField(term69060, term69060.getClass(), "siblingIndex", 0);
        term69065 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term69066 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term69069 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term69065, term69065.getClass(), "elements", null);
        setField(term69066, term69066.getClass(), "tagName", "");
        setBooleanField(term69066, term69066.getClass(), "isBlock", false);
        setBooleanField(term69066, term69066.getClass(), "formatAsBlock", true);
        setBooleanField(term69066, term69066.getClass(), "canContainBlock", true);
        setBooleanField(term69066, term69066.getClass(), "canContainInline", true);
        setBooleanField(term69066, term69066.getClass(), "empty", true);
        setBooleanField(term69066, term69066.getClass(), "selfClosing", false);
        setBooleanField(term69066, term69066.getClass(), "preserveWhitespace", false);
        setBooleanField(term69066, term69066.getClass(), "formList", false);
        setBooleanField(term69066, term69066.getClass(), "formSubmit", false);
        setField(term69065, term69065.getClass(), "tag", term69066);
        setField(term69065, term69065.getClass(), "parentNode", null);
        setField(term69065, term69065.getClass(), "childNodes", null);
        setField(term69069, term69069.getClass(), "attributes", null);
        setField(term69065, term69065.getClass(), "attributes", term69069);
        setField(term69065, term69065.getClass(), "baseUri", null);
        setIntField(term69065, term69065.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term68834;
        callMethod(klass, "equals", argTypes, term68662, args);
        assertTrue(recursiveEquals(term68662, term69060));
        assertTrue(recursiveEquals(term68834, term69065));
    }

};


