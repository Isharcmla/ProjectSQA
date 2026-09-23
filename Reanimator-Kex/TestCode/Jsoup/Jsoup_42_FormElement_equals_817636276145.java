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

public class FormElement_equals_817636276145 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61734;
     Object term61906;
     Object term62102;
     Object term62107;

    public FormElement_equals_817636276145() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61734 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term61935 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term61838 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term61734, term61734.getClass(), "childNodes", null);
        setField(term61734, term61734.getClass(), "attributes", term61935);
        setField(term61838, term61838.getClass(), "tagName", "");
        setBooleanField(term61838, term61838.getClass(), "canContainBlock", false);
        setBooleanField(term61838, term61838.getClass(), "canContainInline", false);
        setBooleanField(term61838, term61838.getClass(), "empty", true);
        setBooleanField(term61838, term61838.getClass(), "formatAsBlock", false);
        setBooleanField(term61838, term61838.getClass(), "isBlock", false);
        setBooleanField(term61838, term61838.getClass(), "preserveWhitespace", false);
        setBooleanField(term61838, term61838.getClass(), "selfClosing", true);
        setBooleanField(term61838, term61838.getClass(), "formList", true);
        setField(term61734, term61734.getClass(), "tag", term61838);
        term61906 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term61981 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term61906, term61906.getClass(), "childNodes", null);
        setField(term61906, term61906.getClass(), "attributes", term61935);
        setField(term61981, term61981.getClass(), "tagName", "");
        setBooleanField(term61981, term61981.getClass(), "canContainBlock", false);
        setBooleanField(term61981, term61981.getClass(), "canContainInline", false);
        setBooleanField(term61981, term61981.getClass(), "empty", true);
        setBooleanField(term61981, term61981.getClass(), "formatAsBlock", false);
        setBooleanField(term61981, term61981.getClass(), "isBlock", false);
        setBooleanField(term61981, term61981.getClass(), "preserveWhitespace", false);
        setBooleanField(term61981, term61981.getClass(), "selfClosing", true);
        setBooleanField(term61981, term61981.getClass(), "formList", false);
        setField(term61906, term61906.getClass(), "tag", term61981);
        term62102 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term62103 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term62106 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term62102, term62102.getClass(), "elements", null);
        setField(term62103, term62103.getClass(), "tagName", "");
        setBooleanField(term62103, term62103.getClass(), "isBlock", false);
        setBooleanField(term62103, term62103.getClass(), "formatAsBlock", false);
        setBooleanField(term62103, term62103.getClass(), "canContainBlock", false);
        setBooleanField(term62103, term62103.getClass(), "canContainInline", false);
        setBooleanField(term62103, term62103.getClass(), "empty", true);
        setBooleanField(term62103, term62103.getClass(), "selfClosing", true);
        setBooleanField(term62103, term62103.getClass(), "preserveWhitespace", false);
        setBooleanField(term62103, term62103.getClass(), "formList", true);
        setBooleanField(term62103, term62103.getClass(), "formSubmit", false);
        setField(term62102, term62102.getClass(), "tag", term62103);
        setField(term62102, term62102.getClass(), "parentNode", null);
        setField(term62102, term62102.getClass(), "childNodes", null);
        setField(term62106, term62106.getClass(), "attributes", null);
        setField(term62102, term62102.getClass(), "attributes", term62106);
        setField(term62102, term62102.getClass(), "baseUri", null);
        setIntField(term62102, term62102.getClass(), "siblingIndex", 0);
        term62107 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term62108 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term62111 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term62107, term62107.getClass(), "elements", null);
        setField(term62108, term62108.getClass(), "tagName", "");
        setBooleanField(term62108, term62108.getClass(), "isBlock", false);
        setBooleanField(term62108, term62108.getClass(), "formatAsBlock", false);
        setBooleanField(term62108, term62108.getClass(), "canContainBlock", false);
        setBooleanField(term62108, term62108.getClass(), "canContainInline", false);
        setBooleanField(term62108, term62108.getClass(), "empty", true);
        setBooleanField(term62108, term62108.getClass(), "selfClosing", true);
        setBooleanField(term62108, term62108.getClass(), "preserveWhitespace", false);
        setBooleanField(term62108, term62108.getClass(), "formList", false);
        setBooleanField(term62108, term62108.getClass(), "formSubmit", false);
        setField(term62107, term62107.getClass(), "tag", term62108);
        setField(term62107, term62107.getClass(), "parentNode", null);
        setField(term62107, term62107.getClass(), "childNodes", null);
        setField(term62111, term62111.getClass(), "attributes", null);
        setField(term62107, term62107.getClass(), "attributes", term62111);
        setField(term62107, term62107.getClass(), "baseUri", null);
        setIntField(term62107, term62107.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term61906;
        callMethod(klass, "equals", argTypes, term61734, args);
        assertTrue(recursiveEquals(term61734, term62102));
        assertTrue(recursiveEquals(term61906, term62107));
    }

};


