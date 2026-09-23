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
import java.lang.Object;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Element_getElementsMatchingOwnText_210255518568 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term5609;

    public Element_getElementsMatchingOwnText_210255518568() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term5631 = new ArrayList();
        ((ArrayList) term5631).add((Object)null);
        ((ArrayList) term5631).add((Object)null);
        ((ArrayList) term5631).add((Object)null);
        ((ArrayList) term5631).add((Object)null);
        LinkedHashMap term5636 = new LinkedHashMap();
        term5609 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term5610 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term5635 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term5610, term5610.getClass(), "tagName", "sUEeHQTWkA");
        setBooleanField(term5610, term5610.getClass(), "isBlock", true);
        setBooleanField(term5610, term5610.getClass(), "formatAsBlock", false);
        setBooleanField(term5610, term5610.getClass(), "canContainInline", false);
        setBooleanField(term5610, term5610.getClass(), "empty", false);
        setBooleanField(term5610, term5610.getClass(), "selfClosing", false);
        setBooleanField(term5610, term5610.getClass(), "preserveWhitespace", true);
        setBooleanField(term5610, term5610.getClass(), "formList", false);
        setBooleanField(term5610, term5610.getClass(), "formSubmit", false);
        setField(term5609, term5609.getClass(), "tag", term5610);
        setField(term5609, term5609.getClass(), "parentNode", null);
        setField(term5609, term5609.getClass(), "childNodes", term5631);
        setField(term5635, term5635.getClass(), "attributes", term5636);
        setField(term5609, term5609.getClass(), "attributes", term5635);
        setField(term5609, term5609.getClass(), "baseUri", "JOqQxuzRuZ");
        setIntField(term5609, term5609.getClass(), "siblingIndex", -227365013);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "RSaoipUlsg";
        callMethod(klass, "getElementsMatchingOwnText", argTypes, term5609, args);
    }

};


