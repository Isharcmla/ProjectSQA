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

public class Element_dataNodes_1579701889114 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1242;
     Object term11429;
     Object term11378;

    public Element_dataNodes_1579701889114() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1264 = new ArrayList();
        ((ArrayList) term1264).add((Object)null);
        LinkedHashMap term1269 = new LinkedHashMap();
        term1242 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term1243 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1268 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1243, term1243.getClass(), "tagName", "TimdotUuNC");
        setBooleanField(term1243, term1243.getClass(), "isBlock", false);
        setBooleanField(term1243, term1243.getClass(), "formatAsBlock", true);
        setBooleanField(term1243, term1243.getClass(), "canContainInline", true);
        setBooleanField(term1243, term1243.getClass(), "empty", true);
        setBooleanField(term1243, term1243.getClass(), "selfClosing", false);
        setBooleanField(term1243, term1243.getClass(), "preserveWhitespace", true);
        setBooleanField(term1243, term1243.getClass(), "formList", false);
        setBooleanField(term1243, term1243.getClass(), "formSubmit", false);
        setField(term1242, term1242.getClass(), "tag", term1243);
        setField(term1242, term1242.getClass(), "parentNode", null);
        setField(term1242, term1242.getClass(), "childNodes", term1264);
        setField(term1268, term1268.getClass(), "attributes", term1269);
        setField(term1242, term1242.getClass(), "attributes", term1268);
        setField(term1242, term1242.getClass(), "baseUri", "xOcJIiQQDu");
        setIntField(term1242, term1242.getClass(), "siblingIndex", -1685132342);
        ArrayList term11433 = new ArrayList();
        ((ArrayList) term11433).add((Object)null);
        LinkedHashMap term11436 = new LinkedHashMap();
        term11429 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term11430 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term11435 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term11430, term11430.getClass(), "tagName", "TimdotUuNC");
        setBooleanField(term11430, term11430.getClass(), "isBlock", false);
        setBooleanField(term11430, term11430.getClass(), "formatAsBlock", true);
        setBooleanField(term11430, term11430.getClass(), "canContainInline", true);
        setBooleanField(term11430, term11430.getClass(), "empty", true);
        setBooleanField(term11430, term11430.getClass(), "selfClosing", false);
        setBooleanField(term11430, term11430.getClass(), "preserveWhitespace", true);
        setBooleanField(term11430, term11430.getClass(), "formList", false);
        setBooleanField(term11430, term11430.getClass(), "formSubmit", false);
        setField(term11429, term11429.getClass(), "tag", term11430);
        setField(term11429, term11429.getClass(), "parentNode", null);
        setField(term11429, term11429.getClass(), "childNodes", term11433);
        setField(term11435, term11435.getClass(), "attributes", term11436);
        setField(term11429, term11429.getClass(), "attributes", term11435);
        setField(term11429, term11429.getClass(), "baseUri", "xOcJIiQQDu");
        setIntField(term11429, term11429.getClass(), "siblingIndex", -1685132342);
        ArrayList term11379 = new ArrayList();
        term11378 = newInstance(Class.forName("java.util.Collections$UnmodifiableRandomAccessList"));
        setField(term11378, term11378.getClass(), "list", term11379);
        setField(term11378, term11378.getClass(), "c", term11379);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "dataNodes", argTypes, term1242, args);
        assertTrue(recursiveEquals(term1242, term11429));
        assertTrue(recursiveEquals(retValue, term11378));
    }

};


