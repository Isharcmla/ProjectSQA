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

public class FormElement_equals_817636276131 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term56405;
     Object term56577;
     Object term56735;
     Object term56740;

    public FormElement_equals_817636276131() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term56405 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term56606 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term56509 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term56405, term56405.getClass(), "childNodes", null);
        setField(term56405, term56405.getClass(), "attributes", term56606);
        setField(term56509, term56509.getClass(), "tagName", "byte");
        setField(term56405, term56405.getClass(), "tag", term56509);
        term56577 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term56652 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term56577, term56577.getClass(), "childNodes", null);
        setField(term56577, term56577.getClass(), "attributes", term56606);
        setField(term56652, term56652.getClass(), "tagName", null);
        setField(term56577, term56577.getClass(), "tag", term56652);
        term56735 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term56736 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term56739 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term56735, term56735.getClass(), "elements", null);
        setField(term56736, term56736.getClass(), "tagName", "byte");
        setBooleanField(term56736, term56736.getClass(), "isBlock", false);
        setBooleanField(term56736, term56736.getClass(), "formatAsBlock", false);
        setBooleanField(term56736, term56736.getClass(), "canContainBlock", false);
        setBooleanField(term56736, term56736.getClass(), "canContainInline", false);
        setBooleanField(term56736, term56736.getClass(), "empty", false);
        setBooleanField(term56736, term56736.getClass(), "selfClosing", false);
        setBooleanField(term56736, term56736.getClass(), "preserveWhitespace", false);
        setBooleanField(term56736, term56736.getClass(), "formList", false);
        setBooleanField(term56736, term56736.getClass(), "formSubmit", false);
        setField(term56735, term56735.getClass(), "tag", term56736);
        setField(term56735, term56735.getClass(), "parentNode", null);
        setField(term56735, term56735.getClass(), "childNodes", null);
        setField(term56739, term56739.getClass(), "attributes", null);
        setField(term56735, term56735.getClass(), "attributes", term56739);
        setField(term56735, term56735.getClass(), "baseUri", null);
        setIntField(term56735, term56735.getClass(), "siblingIndex", 0);
        term56740 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term56741 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term56742 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term56740, term56740.getClass(), "elements", null);
        setField(term56741, term56741.getClass(), "tagName", null);
        setBooleanField(term56741, term56741.getClass(), "isBlock", false);
        setBooleanField(term56741, term56741.getClass(), "formatAsBlock", false);
        setBooleanField(term56741, term56741.getClass(), "canContainBlock", false);
        setBooleanField(term56741, term56741.getClass(), "canContainInline", false);
        setBooleanField(term56741, term56741.getClass(), "empty", false);
        setBooleanField(term56741, term56741.getClass(), "selfClosing", false);
        setBooleanField(term56741, term56741.getClass(), "preserveWhitespace", false);
        setBooleanField(term56741, term56741.getClass(), "formList", false);
        setBooleanField(term56741, term56741.getClass(), "formSubmit", false);
        setField(term56740, term56740.getClass(), "tag", term56741);
        setField(term56740, term56740.getClass(), "parentNode", null);
        setField(term56740, term56740.getClass(), "childNodes", null);
        setField(term56742, term56742.getClass(), "attributes", null);
        setField(term56740, term56740.getClass(), "attributes", term56742);
        setField(term56740, term56740.getClass(), "baseUri", null);
        setIntField(term56740, term56740.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term56577;
        callMethod(klass, "equals", argTypes, term56405, args);
        assertTrue(recursiveEquals(term56405, term56735));
        assertTrue(recursiveEquals(term56577, term56740));
    }

};


