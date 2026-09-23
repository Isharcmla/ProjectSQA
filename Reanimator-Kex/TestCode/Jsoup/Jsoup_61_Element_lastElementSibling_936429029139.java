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
import java.lang.NullPointerException;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Element_lastElementSibling_936429029139 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3192;

    public Element_lastElementSibling_936429029139() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3214 = new ArrayList();
        ((ArrayList) term3214).add((Object)null);
        ((ArrayList) term3214).add((Object)null);
        ((ArrayList) term3214).add((Object)null);
        ((ArrayList) term3214).add((Object)null);
        LinkedHashMap term3219 = new LinkedHashMap();
        term3192 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term3193 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3218 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3193, term3193.getClass(), "tagName", "wKWbJssZuG");
        setBooleanField(term3193, term3193.getClass(), "isBlock", true);
        setBooleanField(term3193, term3193.getClass(), "formatAsBlock", false);
        setBooleanField(term3193, term3193.getClass(), "canContainInline", true);
        setBooleanField(term3193, term3193.getClass(), "empty", false);
        setBooleanField(term3193, term3193.getClass(), "selfClosing", false);
        setBooleanField(term3193, term3193.getClass(), "preserveWhitespace", false);
        setBooleanField(term3193, term3193.getClass(), "formList", true);
        setBooleanField(term3193, term3193.getClass(), "formSubmit", true);
        setField(term3192, term3192.getClass(), "tag", term3193);
        setField(term3192, term3192.getClass(), "parentNode", null);
        setField(term3192, term3192.getClass(), "childNodes", term3214);
        setField(term3218, term3218.getClass(), "attributes", term3219);
        setField(term3192, term3192.getClass(), "attributes", term3218);
        setField(term3192, term3192.getClass(), "baseUri", "TwfWVQGiIj");
        setIntField(term3192, term3192.getClass(), "siblingIndex", -602026508);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "lastElementSibling", argTypes, term3192, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


