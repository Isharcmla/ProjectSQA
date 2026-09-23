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
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Element_isBlock_161055638199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term444;
     Object term9355;

    public Element_isBlock_161055638199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term467 = new ArrayList();
        ((ArrayList) term467).add((Object)null);
        LinkedHashMap term472 = new LinkedHashMap();
        term444 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term445 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term471 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term445, term445.getClass(), "tagName", "IoAlmYsBwc");
        setBooleanField(term445, term445.getClass(), "isBlock", true);
        setBooleanField(term445, term445.getClass(), "formatAsBlock", false);
        setBooleanField(term445, term445.getClass(), "canContainBlock", false);
        setBooleanField(term445, term445.getClass(), "canContainInline", true);
        setBooleanField(term445, term445.getClass(), "empty", false);
        setBooleanField(term445, term445.getClass(), "selfClosing", false);
        setBooleanField(term445, term445.getClass(), "preserveWhitespace", false);
        setBooleanField(term445, term445.getClass(), "formList", false);
        setBooleanField(term445, term445.getClass(), "formSubmit", true);
        setField(term444, term444.getClass(), "tag", term445);
        setField(term444, term444.getClass(), "parentNode", null);
        setField(term444, term444.getClass(), "childNodes", term467);
        setField(term471, term471.getClass(), "attributes", term472);
        setField(term444, term444.getClass(), "attributes", term471);
        setField(term444, term444.getClass(), "baseUri", "AijpHYOFuy");
        setIntField(term444, term444.getClass(), "siblingIndex", -1922583790);
        ArrayList term9359 = new ArrayList();
        ((ArrayList) term9359).add((Object)null);
        LinkedHashMap term9362 = new LinkedHashMap();
        term9355 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term9356 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term9361 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term9356, term9356.getClass(), "tagName", "IoAlmYsBwc");
        setBooleanField(term9356, term9356.getClass(), "isBlock", true);
        setBooleanField(term9356, term9356.getClass(), "formatAsBlock", false);
        setBooleanField(term9356, term9356.getClass(), "canContainBlock", false);
        setBooleanField(term9356, term9356.getClass(), "canContainInline", true);
        setBooleanField(term9356, term9356.getClass(), "empty", false);
        setBooleanField(term9356, term9356.getClass(), "selfClosing", false);
        setBooleanField(term9356, term9356.getClass(), "preserveWhitespace", false);
        setBooleanField(term9356, term9356.getClass(), "formList", false);
        setBooleanField(term9356, term9356.getClass(), "formSubmit", true);
        setField(term9355, term9355.getClass(), "tag", term9356);
        setField(term9355, term9355.getClass(), "parentNode", null);
        setField(term9355, term9355.getClass(), "childNodes", term9359);
        setField(term9361, term9361.getClass(), "attributes", term9362);
        setField(term9355, term9355.getClass(), "attributes", term9361);
        setField(term9355, term9355.getClass(), "baseUri", "AijpHYOFuy");
        setIntField(term9355, term9355.getClass(), "siblingIndex", -1922583790);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "isBlock", argTypes, term444, args);
        assertTrue(recursiveEquals(term444, term9355));
    }

};


