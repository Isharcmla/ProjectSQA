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
import java.util.LinkedHashMap;
import java.lang.Object;

public class Element_init_97793489097 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term23;
     Object term56;
     Object term8647;
     Object term8658;
     Object term8660;

    public Element_init_97793489097() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term23 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term23, term23.getClass(), "tagName", "sjlJAEtRrb");
        setBooleanField(term23, term23.getClass(), "isBlock", false);
        setBooleanField(term23, term23.getClass(), "formatAsBlock", false);
        setBooleanField(term23, term23.getClass(), "canContainInline", false);
        setBooleanField(term23, term23.getClass(), "empty", false);
        setBooleanField(term23, term23.getClass(), "selfClosing", true);
        setBooleanField(term23, term23.getClass(), "preserveWhitespace", true);
        setBooleanField(term23, term23.getClass(), "formList", true);
        setBooleanField(term23, term23.getClass(), "formSubmit", true);
        LinkedHashMap term57 = new LinkedHashMap();
        term56 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term56, term56.getClass(), "attributes", term57);
        LinkedHashMap term8653 = new LinkedHashMap();
        term8647 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term8648 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term8651 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        Object term8652 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term8648, term8648.getClass(), "tagName", "sjlJAEtRrb");
        setBooleanField(term8648, term8648.getClass(), "isBlock", false);
        setBooleanField(term8648, term8648.getClass(), "formatAsBlock", false);
        setBooleanField(term8648, term8648.getClass(), "canContainInline", false);
        setBooleanField(term8648, term8648.getClass(), "empty", false);
        setBooleanField(term8648, term8648.getClass(), "selfClosing", true);
        setBooleanField(term8648, term8648.getClass(), "preserveWhitespace", true);
        setBooleanField(term8648, term8648.getClass(), "formList", true);
        setBooleanField(term8648, term8648.getClass(), "formSubmit", true);
        setField(term8647, term8647.getClass(), "tag", term8648);
        setField(term8647, term8647.getClass(), "parentNode", null);
        setIntField(term8651, term8651.getClass(), "modCount", 0);
        setField(term8647, term8647.getClass(), "childNodes", term8651);
        setField(term8652, term8652.getClass(), "attributes", term8653);
        setField(term8647, term8647.getClass(), "attributes", term8652);
        setField(term8647, term8647.getClass(), "baseUri", "MuLcgQHgqz");
        setIntField(term8647, term8647.getClass(), "siblingIndex", 0);
        LinkedHashMap term8659 = new LinkedHashMap();
        term8658 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term8658, term8658.getClass(), "attributes", term8659);
        term8660 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term8660, term8660.getClass(), "tagName", "sjlJAEtRrb");
        setBooleanField(term8660, term8660.getClass(), "isBlock", false);
        setBooleanField(term8660, term8660.getClass(), "formatAsBlock", false);
        setBooleanField(term8660, term8660.getClass(), "canContainInline", false);
        setBooleanField(term8660, term8660.getClass(), "empty", false);
        setBooleanField(term8660, term8660.getClass(), "selfClosing", true);
        setBooleanField(term8660, term8660.getClass(), "preserveWhitespace", true);
        setBooleanField(term8660, term8660.getClass(), "formList", true);
        setBooleanField(term8660, term8660.getClass(), "formSubmit", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.jsoup.parser.Tag");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("org.jsoup.nodes.Attributes");
        Object[] args = new Object[3];
        args[0] = term23;
        args[1] = "MuLcgQHgqz";
        args[2] = term56;
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term8647));
        assertTrue(recursiveEquals(term23, "MuLcgQHgqz"));
        assertTrue(recursiveEquals(term56, term8660));
    }

};


