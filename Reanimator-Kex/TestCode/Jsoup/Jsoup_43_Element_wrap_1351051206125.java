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
import java.lang.NoClassDefFoundError;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Element_wrap_1351051206125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2422;

    public Element_wrap_1351051206125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2445 = new ArrayList();
        ((ArrayList) term2445).add((Object)null);
        ((ArrayList) term2445).add((Object)null);
        ((ArrayList) term2445).add((Object)null);
        ((ArrayList) term2445).add((Object)null);
        ((ArrayList) term2445).add((Object)null);
        ((ArrayList) term2445).add((Object)null);
        LinkedHashMap term2450 = new LinkedHashMap();
        term2422 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term2423 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term2449 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term2423, term2423.getClass(), "tagName", "DSNsTGYXDF");
        setBooleanField(term2423, term2423.getClass(), "isBlock", true);
        setBooleanField(term2423, term2423.getClass(), "formatAsBlock", true);
        setBooleanField(term2423, term2423.getClass(), "canContainBlock", true);
        setBooleanField(term2423, term2423.getClass(), "canContainInline", false);
        setBooleanField(term2423, term2423.getClass(), "empty", false);
        setBooleanField(term2423, term2423.getClass(), "selfClosing", false);
        setBooleanField(term2423, term2423.getClass(), "preserveWhitespace", true);
        setBooleanField(term2423, term2423.getClass(), "formList", true);
        setBooleanField(term2423, term2423.getClass(), "formSubmit", false);
        setField(term2422, term2422.getClass(), "tag", term2423);
        setField(term2422, term2422.getClass(), "parentNode", null);
        setField(term2422, term2422.getClass(), "childNodes", term2445);
        setField(term2449, term2449.getClass(), "attributes", term2450);
        setField(term2422, term2422.getClass(), "attributes", term2449);
        setField(term2422, term2422.getClass(), "baseUri", "vwbEQQNQrx");
        setIntField(term2422, term2422.getClass(), "siblingIndex", -73683645);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "xtftXXMbem";
        try {
            callMethod(klass, "wrap", argTypes, term2422, args);
            assertTrue(false);
        }
        catch (NoClassDefFoundError e) {
        }

    }

};


