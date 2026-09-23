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

public class FormElement_equals_81763627683 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term40337;
     Object term40471;
     Object term40580;
     Object term40583;

    public FormElement_equals_81763627683() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term40337 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term40395 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term40441 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term40337, term40337.getClass(), "childNodes", null);
        setField(term40395, term40395.getClass(), "attributes", null);
        setField(term40337, term40337.getClass(), "attributes", term40395);
        setField(term40337, term40337.getClass(), "tag", term40441);
        term40471 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term40529 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term40471, term40471.getClass(), "childNodes", null);
        setField(term40529, term40529.getClass(), "attributes", null);
        setField(term40471, term40471.getClass(), "attributes", term40529);
        setField(term40471, term40471.getClass(), "tag", null);
        term40580 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term40581 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term40582 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term40580, term40580.getClass(), "elements", null);
        setField(term40581, term40581.getClass(), "tagName", null);
        setBooleanField(term40581, term40581.getClass(), "isBlock", false);
        setBooleanField(term40581, term40581.getClass(), "formatAsBlock", false);
        setBooleanField(term40581, term40581.getClass(), "canContainBlock", false);
        setBooleanField(term40581, term40581.getClass(), "canContainInline", false);
        setBooleanField(term40581, term40581.getClass(), "empty", false);
        setBooleanField(term40581, term40581.getClass(), "selfClosing", false);
        setBooleanField(term40581, term40581.getClass(), "preserveWhitespace", false);
        setBooleanField(term40581, term40581.getClass(), "formList", false);
        setBooleanField(term40581, term40581.getClass(), "formSubmit", false);
        setField(term40580, term40580.getClass(), "tag", term40581);
        setField(term40580, term40580.getClass(), "parentNode", null);
        setField(term40580, term40580.getClass(), "childNodes", null);
        setField(term40582, term40582.getClass(), "attributes", null);
        setField(term40580, term40580.getClass(), "attributes", term40582);
        setField(term40580, term40580.getClass(), "baseUri", null);
        setIntField(term40580, term40580.getClass(), "siblingIndex", 0);
        term40583 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term40584 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term40583, term40583.getClass(), "elements", null);
        setField(term40583, term40583.getClass(), "tag", null);
        setField(term40583, term40583.getClass(), "parentNode", null);
        setField(term40583, term40583.getClass(), "childNodes", null);
        setField(term40584, term40584.getClass(), "attributes", null);
        setField(term40583, term40583.getClass(), "attributes", term40584);
        setField(term40583, term40583.getClass(), "baseUri", null);
        setIntField(term40583, term40583.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term40471;
        callMethod(klass, "equals", argTypes, term40337, args);
        assertTrue(recursiveEquals(term40337, term40580));
        assertTrue(recursiveEquals(term40471, term40583));
    }

};


