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

public class Element_cssSelector_1341485919126 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2516;
     Object term19356;

    public Element_cssSelector_1341485919126() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term2539 = new ArrayList();
        ((ArrayList) term2539).add((Object)null);
        ((ArrayList) term2539).add((Object)null);
        ((ArrayList) term2539).add((Object)null);
        ((ArrayList) term2539).add((Object)null);
        ((ArrayList) term2539).add((Object)null);
        ((ArrayList) term2539).add((Object)null);
        LinkedHashMap term2544 = new LinkedHashMap();
        term2516 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term2517 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term2543 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term2517, term2517.getClass(), "tagName", "cudZvLMQon");
        setBooleanField(term2517, term2517.getClass(), "isBlock", false);
        setBooleanField(term2517, term2517.getClass(), "formatAsBlock", false);
        setBooleanField(term2517, term2517.getClass(), "canContainBlock", false);
        setBooleanField(term2517, term2517.getClass(), "canContainInline", true);
        setBooleanField(term2517, term2517.getClass(), "empty", true);
        setBooleanField(term2517, term2517.getClass(), "selfClosing", true);
        setBooleanField(term2517, term2517.getClass(), "preserveWhitespace", true);
        setBooleanField(term2517, term2517.getClass(), "formList", false);
        setBooleanField(term2517, term2517.getClass(), "formSubmit", true);
        setField(term2516, term2516.getClass(), "tag", term2517);
        setField(term2516, term2516.getClass(), "parentNode", null);
        setField(term2516, term2516.getClass(), "childNodes", term2539);
        setField(term2543, term2543.getClass(), "attributes", term2544);
        setField(term2516, term2516.getClass(), "attributes", term2543);
        setField(term2516, term2516.getClass(), "baseUri", "igCAtimmYB");
        setIntField(term2516, term2516.getClass(), "siblingIndex", -226514366);
        ArrayList term19360 = new ArrayList();
        ((ArrayList) term19360).add((Object)null);
        ((ArrayList) term19360).add((Object)null);
        ((ArrayList) term19360).add((Object)null);
        ((ArrayList) term19360).add((Object)null);
        ((ArrayList) term19360).add((Object)null);
        ((ArrayList) term19360).add((Object)null);
        LinkedHashMap term19363 = new LinkedHashMap();
        term19356 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term19357 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term19362 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term19357, term19357.getClass(), "tagName", "cudZvLMQon");
        setBooleanField(term19357, term19357.getClass(), "isBlock", false);
        setBooleanField(term19357, term19357.getClass(), "formatAsBlock", false);
        setBooleanField(term19357, term19357.getClass(), "canContainBlock", false);
        setBooleanField(term19357, term19357.getClass(), "canContainInline", true);
        setBooleanField(term19357, term19357.getClass(), "empty", true);
        setBooleanField(term19357, term19357.getClass(), "selfClosing", true);
        setBooleanField(term19357, term19357.getClass(), "preserveWhitespace", true);
        setBooleanField(term19357, term19357.getClass(), "formList", false);
        setBooleanField(term19357, term19357.getClass(), "formSubmit", true);
        setField(term19356, term19356.getClass(), "tag", term19357);
        setField(term19356, term19356.getClass(), "parentNode", null);
        setField(term19356, term19356.getClass(), "childNodes", term19360);
        setField(term19362, term19362.getClass(), "attributes", term19363);
        setField(term19356, term19356.getClass(), "attributes", term19362);
        setField(term19356, term19356.getClass(), "baseUri", "igCAtimmYB");
        setIntField(term19356, term19356.getClass(), "siblingIndex", -226514366);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "cssSelector", argTypes, term2516, args);
        assertTrue(recursiveEquals(term2516, term19356));
        assertTrue(recursiveEquals(retValue, "cudZvLMQon"));
    }

};


