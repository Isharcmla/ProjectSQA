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

public class Element_getElementById_402338892135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3236;
     Object term21717;

    public Element_getElementById_402338892135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3259 = new ArrayList();
        ((ArrayList) term3259).add((Object)null);
        LinkedHashMap term3264 = new LinkedHashMap();
        term3236 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term3237 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3263 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3237, term3237.getClass(), "tagName", "AHbZyFOmlo");
        setBooleanField(term3237, term3237.getClass(), "isBlock", false);
        setBooleanField(term3237, term3237.getClass(), "formatAsBlock", false);
        setBooleanField(term3237, term3237.getClass(), "canContainBlock", false);
        setBooleanField(term3237, term3237.getClass(), "canContainInline", true);
        setBooleanField(term3237, term3237.getClass(), "empty", true);
        setBooleanField(term3237, term3237.getClass(), "selfClosing", false);
        setBooleanField(term3237, term3237.getClass(), "preserveWhitespace", false);
        setBooleanField(term3237, term3237.getClass(), "formList", false);
        setBooleanField(term3237, term3237.getClass(), "formSubmit", false);
        setField(term3236, term3236.getClass(), "tag", term3237);
        setField(term3236, term3236.getClass(), "parentNode", null);
        setField(term3236, term3236.getClass(), "childNodes", term3259);
        setField(term3263, term3263.getClass(), "attributes", term3264);
        setField(term3236, term3236.getClass(), "attributes", term3263);
        setField(term3236, term3236.getClass(), "baseUri", "aSkmSwTnEw");
        setIntField(term3236, term3236.getClass(), "siblingIndex", -157887805);
        ArrayList term21721 = new ArrayList();
        ((ArrayList) term21721).add((Object)null);
        LinkedHashMap term21724 = new LinkedHashMap();
        term21717 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term21718 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term21723 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term21718, term21718.getClass(), "tagName", "AHbZyFOmlo");
        setBooleanField(term21718, term21718.getClass(), "isBlock", false);
        setBooleanField(term21718, term21718.getClass(), "formatAsBlock", false);
        setBooleanField(term21718, term21718.getClass(), "canContainBlock", false);
        setBooleanField(term21718, term21718.getClass(), "canContainInline", true);
        setBooleanField(term21718, term21718.getClass(), "empty", true);
        setBooleanField(term21718, term21718.getClass(), "selfClosing", false);
        setBooleanField(term21718, term21718.getClass(), "preserveWhitespace", false);
        setBooleanField(term21718, term21718.getClass(), "formList", false);
        setBooleanField(term21718, term21718.getClass(), "formSubmit", false);
        setField(term21717, term21717.getClass(), "tag", term21718);
        setField(term21717, term21717.getClass(), "parentNode", null);
        setField(term21717, term21717.getClass(), "childNodes", term21721);
        setField(term21723, term21723.getClass(), "attributes", term21724);
        setField(term21717, term21717.getClass(), "attributes", term21723);
        setField(term21717, term21717.getClass(), "baseUri", "aSkmSwTnEw");
        setIntField(term21717, term21717.getClass(), "siblingIndex", -157887805);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xvkbvaEGYd";
        Object retValue = callMethod(klass, "getElementById", argTypes, term3236, args);
        assertTrue(recursiveEquals(term3236, term21717));
        assertTrue(recursiveEquals(retValue, null));
    }

};


