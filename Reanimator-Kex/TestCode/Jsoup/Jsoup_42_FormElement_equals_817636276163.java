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

public class FormElement_equals_817636276163 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term69565;
     Object term69737;
     Object term69996;
     Object term70001;

    public FormElement_equals_817636276163() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term69565 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term69623 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term69669 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term69565, term69565.getClass(), "childNodes", null);
        setField(term69623, term69623.getClass(), "attributes", null);
        setField(term69565, term69565.getClass(), "attributes", term69623);
        setField(term69669, term69669.getClass(), "tagName", "byte[]");
        setBooleanField(term69669, term69669.getClass(), "canContainBlock", true);
        setField(term69565, term69565.getClass(), "tag", term69669);
        term69737 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term69795 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term69841 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term69737, term69737.getClass(), "childNodes", null);
        setField(term69795, term69795.getClass(), "attributes", null);
        setField(term69737, term69737.getClass(), "attributes", term69795);
        setField(term69841, term69841.getClass(), "tagName", "byte[]");
        setBooleanField(term69841, term69841.getClass(), "canContainBlock", false);
        setField(term69737, term69737.getClass(), "tag", term69841);
        term69996 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term69997 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term70000 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term69996, term69996.getClass(), "elements", null);
        setField(term69997, term69997.getClass(), "tagName", "byte[]");
        setBooleanField(term69997, term69997.getClass(), "isBlock", false);
        setBooleanField(term69997, term69997.getClass(), "formatAsBlock", false);
        setBooleanField(term69997, term69997.getClass(), "canContainBlock", true);
        setBooleanField(term69997, term69997.getClass(), "canContainInline", false);
        setBooleanField(term69997, term69997.getClass(), "empty", false);
        setBooleanField(term69997, term69997.getClass(), "selfClosing", false);
        setBooleanField(term69997, term69997.getClass(), "preserveWhitespace", false);
        setBooleanField(term69997, term69997.getClass(), "formList", false);
        setBooleanField(term69997, term69997.getClass(), "formSubmit", false);
        setField(term69996, term69996.getClass(), "tag", term69997);
        setField(term69996, term69996.getClass(), "parentNode", null);
        setField(term69996, term69996.getClass(), "childNodes", null);
        setField(term70000, term70000.getClass(), "attributes", null);
        setField(term69996, term69996.getClass(), "attributes", term70000);
        setField(term69996, term69996.getClass(), "baseUri", null);
        setIntField(term69996, term69996.getClass(), "siblingIndex", 0);
        term70001 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term70002 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term70005 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term70001, term70001.getClass(), "elements", null);
        setField(term70002, term70002.getClass(), "tagName", "byte[]");
        setBooleanField(term70002, term70002.getClass(), "isBlock", false);
        setBooleanField(term70002, term70002.getClass(), "formatAsBlock", false);
        setBooleanField(term70002, term70002.getClass(), "canContainBlock", false);
        setBooleanField(term70002, term70002.getClass(), "canContainInline", false);
        setBooleanField(term70002, term70002.getClass(), "empty", false);
        setBooleanField(term70002, term70002.getClass(), "selfClosing", false);
        setBooleanField(term70002, term70002.getClass(), "preserveWhitespace", false);
        setBooleanField(term70002, term70002.getClass(), "formList", false);
        setBooleanField(term70002, term70002.getClass(), "formSubmit", false);
        setField(term70001, term70001.getClass(), "tag", term70002);
        setField(term70001, term70001.getClass(), "parentNode", null);
        setField(term70001, term70001.getClass(), "childNodes", null);
        setField(term70005, term70005.getClass(), "attributes", null);
        setField(term70001, term70001.getClass(), "attributes", term70005);
        setField(term70001, term70001.getClass(), "baseUri", null);
        setIntField(term70001, term70001.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term69737;
        callMethod(klass, "equals", argTypes, term69565, args);
        assertTrue(recursiveEquals(term69565, term69996));
        assertTrue(recursiveEquals(term69737, term70001));
    }

};


