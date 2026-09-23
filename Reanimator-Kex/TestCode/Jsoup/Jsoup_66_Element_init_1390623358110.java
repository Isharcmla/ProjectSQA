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

public class Element_init_1390623358110 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80;
     Object term9674;
     Object term9681;

    public Element_init_1390623358110() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term80 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term80, term80.getClass(), "tagName", "xxtlPwDYFs");
        setBooleanField(term80, term80.getClass(), "isBlock", false);
        setBooleanField(term80, term80.getClass(), "formatAsBlock", true);
        setBooleanField(term80, term80.getClass(), "canContainInline", false);
        setBooleanField(term80, term80.getClass(), "empty", true);
        setBooleanField(term80, term80.getClass(), "selfClosing", false);
        setBooleanField(term80, term80.getClass(), "preserveWhitespace", true);
        setBooleanField(term80, term80.getClass(), "formList", false);
        setBooleanField(term80, term80.getClass(), "formSubmit", false);
        term9674 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term9675 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term9678 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setField(term9675, term9675.getClass(), "tagName", "xxtlPwDYFs");
        setBooleanField(term9675, term9675.getClass(), "isBlock", false);
        setBooleanField(term9675, term9675.getClass(), "formatAsBlock", true);
        setBooleanField(term9675, term9675.getClass(), "canContainInline", false);
        setBooleanField(term9675, term9675.getClass(), "empty", true);
        setBooleanField(term9675, term9675.getClass(), "selfClosing", false);
        setBooleanField(term9675, term9675.getClass(), "preserveWhitespace", true);
        setBooleanField(term9675, term9675.getClass(), "formList", false);
        setBooleanField(term9675, term9675.getClass(), "formSubmit", false);
        setField(term9674, term9674.getClass(), "tag", term9675);
        setField(term9674, term9674.getClass(), "shadowChildrenRef", null);
        setIntField(term9678, term9678.getClass(), "modCount", 0);
        setField(term9674, term9674.getClass(), "childNodes", term9678);
        setField(term9674, term9674.getClass(), "attributes", null);
        setField(term9674, term9674.getClass(), "baseUri", "jJCZpVmanW");
        setField(term9674, term9674.getClass(), "parentNode", null);
        setIntField(term9674, term9674.getClass(), "siblingIndex", 0);
        term9681 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term9681, term9681.getClass(), "tagName", "xxtlPwDYFs");
        setBooleanField(term9681, term9681.getClass(), "isBlock", false);
        setBooleanField(term9681, term9681.getClass(), "formatAsBlock", true);
        setBooleanField(term9681, term9681.getClass(), "canContainInline", false);
        setBooleanField(term9681, term9681.getClass(), "empty", true);
        setBooleanField(term9681, term9681.getClass(), "selfClosing", false);
        setBooleanField(term9681, term9681.getClass(), "preserveWhitespace", true);
        setBooleanField(term9681, term9681.getClass(), "formList", false);
        setBooleanField(term9681, term9681.getClass(), "formSubmit", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.parser.Tag");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = term80;
        args[1] = "jJCZpVmanW";
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term9674));
        assertTrue(recursiveEquals(term80, term9681));
    }

};


