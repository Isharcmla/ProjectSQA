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

public class FormElement_equals_817636276137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term58545;
     Object term58717;
     Object term58948;
     Object term58953;

    public FormElement_equals_817636276137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term58545 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term58603 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term58649 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term58545, term58545.getClass(), "childNodes", null);
        setField(term58603, term58603.getClass(), "attributes", null);
        setField(term58545, term58545.getClass(), "attributes", term58603);
        setField(term58649, term58649.getClass(), "tagName", "");
        setField(term58545, term58545.getClass(), "tag", term58649);
        term58717 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term58775 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term58821 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term58717, term58717.getClass(), "childNodes", null);
        setField(term58775, term58775.getClass(), "attributes", null);
        setField(term58717, term58717.getClass(), "attributes", term58775);
        setField(term58821, term58821.getClass(), "tagName", "");
        setField(term58717, term58717.getClass(), "tag", term58821);
        term58948 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term58949 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term58952 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term58948, term58948.getClass(), "elements", null);
        setField(term58949, term58949.getClass(), "tagName", "");
        setBooleanField(term58949, term58949.getClass(), "isBlock", false);
        setBooleanField(term58949, term58949.getClass(), "formatAsBlock", false);
        setBooleanField(term58949, term58949.getClass(), "canContainBlock", false);
        setBooleanField(term58949, term58949.getClass(), "canContainInline", false);
        setBooleanField(term58949, term58949.getClass(), "empty", false);
        setBooleanField(term58949, term58949.getClass(), "selfClosing", false);
        setBooleanField(term58949, term58949.getClass(), "preserveWhitespace", false);
        setBooleanField(term58949, term58949.getClass(), "formList", false);
        setBooleanField(term58949, term58949.getClass(), "formSubmit", false);
        setField(term58948, term58948.getClass(), "tag", term58949);
        setField(term58948, term58948.getClass(), "parentNode", null);
        setField(term58948, term58948.getClass(), "childNodes", null);
        setField(term58952, term58952.getClass(), "attributes", null);
        setField(term58948, term58948.getClass(), "attributes", term58952);
        setField(term58948, term58948.getClass(), "baseUri", null);
        setIntField(term58948, term58948.getClass(), "siblingIndex", 0);
        term58953 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term58954 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term58957 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term58953, term58953.getClass(), "elements", null);
        setField(term58954, term58954.getClass(), "tagName", "");
        setBooleanField(term58954, term58954.getClass(), "isBlock", false);
        setBooleanField(term58954, term58954.getClass(), "formatAsBlock", false);
        setBooleanField(term58954, term58954.getClass(), "canContainBlock", false);
        setBooleanField(term58954, term58954.getClass(), "canContainInline", false);
        setBooleanField(term58954, term58954.getClass(), "empty", false);
        setBooleanField(term58954, term58954.getClass(), "selfClosing", false);
        setBooleanField(term58954, term58954.getClass(), "preserveWhitespace", false);
        setBooleanField(term58954, term58954.getClass(), "formList", false);
        setBooleanField(term58954, term58954.getClass(), "formSubmit", false);
        setField(term58953, term58953.getClass(), "tag", term58954);
        setField(term58953, term58953.getClass(), "parentNode", null);
        setField(term58953, term58953.getClass(), "childNodes", null);
        setField(term58957, term58957.getClass(), "attributes", null);
        setField(term58953, term58953.getClass(), "attributes", term58957);
        setField(term58953, term58953.getClass(), "baseUri", null);
        setIntField(term58953, term58953.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term58717;
        callMethod(klass, "equals", argTypes, term58545, args);
        assertTrue(recursiveEquals(term58545, term58948));
        assertTrue(recursiveEquals(term58717, term58953));
    }

};


