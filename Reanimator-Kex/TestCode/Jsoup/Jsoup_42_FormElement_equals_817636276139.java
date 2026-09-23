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

public class FormElement_equals_817636276139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term59402;
     Object term59574;
     Object term59768;
     Object term59773;

    public FormElement_equals_817636276139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term59402 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term59603 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term59506 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term59402, term59402.getClass(), "childNodes", null);
        setField(term59402, term59402.getClass(), "attributes", term59603);
        setField(term59506, term59506.getClass(), "tagName", "");
        setBooleanField(term59506, term59506.getClass(), "canContainBlock", true);
        setBooleanField(term59506, term59506.getClass(), "canContainInline", false);
        setBooleanField(term59506, term59506.getClass(), "empty", true);
        setBooleanField(term59506, term59506.getClass(), "formatAsBlock", true);
        setBooleanField(term59506, term59506.getClass(), "isBlock", false);
        setBooleanField(term59506, term59506.getClass(), "preserveWhitespace", true);
        setField(term59402, term59402.getClass(), "tag", term59506);
        term59574 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term59649 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term59574, term59574.getClass(), "childNodes", null);
        setField(term59574, term59574.getClass(), "attributes", term59603);
        setField(term59649, term59649.getClass(), "tagName", "");
        setBooleanField(term59649, term59649.getClass(), "canContainBlock", true);
        setBooleanField(term59649, term59649.getClass(), "canContainInline", false);
        setBooleanField(term59649, term59649.getClass(), "empty", true);
        setBooleanField(term59649, term59649.getClass(), "formatAsBlock", true);
        setBooleanField(term59649, term59649.getClass(), "isBlock", false);
        setBooleanField(term59649, term59649.getClass(), "preserveWhitespace", false);
        setField(term59574, term59574.getClass(), "tag", term59649);
        term59768 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term59769 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term59772 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term59768, term59768.getClass(), "elements", null);
        setField(term59769, term59769.getClass(), "tagName", "");
        setBooleanField(term59769, term59769.getClass(), "isBlock", false);
        setBooleanField(term59769, term59769.getClass(), "formatAsBlock", true);
        setBooleanField(term59769, term59769.getClass(), "canContainBlock", true);
        setBooleanField(term59769, term59769.getClass(), "canContainInline", false);
        setBooleanField(term59769, term59769.getClass(), "empty", true);
        setBooleanField(term59769, term59769.getClass(), "selfClosing", false);
        setBooleanField(term59769, term59769.getClass(), "preserveWhitespace", true);
        setBooleanField(term59769, term59769.getClass(), "formList", false);
        setBooleanField(term59769, term59769.getClass(), "formSubmit", false);
        setField(term59768, term59768.getClass(), "tag", term59769);
        setField(term59768, term59768.getClass(), "parentNode", null);
        setField(term59768, term59768.getClass(), "childNodes", null);
        setField(term59772, term59772.getClass(), "attributes", null);
        setField(term59768, term59768.getClass(), "attributes", term59772);
        setField(term59768, term59768.getClass(), "baseUri", null);
        setIntField(term59768, term59768.getClass(), "siblingIndex", 0);
        term59773 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term59774 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term59777 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term59773, term59773.getClass(), "elements", null);
        setField(term59774, term59774.getClass(), "tagName", "");
        setBooleanField(term59774, term59774.getClass(), "isBlock", false);
        setBooleanField(term59774, term59774.getClass(), "formatAsBlock", true);
        setBooleanField(term59774, term59774.getClass(), "canContainBlock", true);
        setBooleanField(term59774, term59774.getClass(), "canContainInline", false);
        setBooleanField(term59774, term59774.getClass(), "empty", true);
        setBooleanField(term59774, term59774.getClass(), "selfClosing", false);
        setBooleanField(term59774, term59774.getClass(), "preserveWhitespace", false);
        setBooleanField(term59774, term59774.getClass(), "formList", false);
        setBooleanField(term59774, term59774.getClass(), "formSubmit", false);
        setField(term59773, term59773.getClass(), "tag", term59774);
        setField(term59773, term59773.getClass(), "parentNode", null);
        setField(term59773, term59773.getClass(), "childNodes", null);
        setField(term59777, term59777.getClass(), "attributes", null);
        setField(term59773, term59773.getClass(), "attributes", term59777);
        setField(term59773, term59773.getClass(), "baseUri", null);
        setIntField(term59773, term59773.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term59574;
        callMethod(klass, "equals", argTypes, term59402, args);
        assertTrue(recursiveEquals(term59402, term59768));
        assertTrue(recursiveEquals(term59574, term59773));
    }

};


