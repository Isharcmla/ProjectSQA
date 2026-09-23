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
     Object term19177;

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
        ArrayList term19181 = new ArrayList();
        ((ArrayList) term19181).add((Object)null);
        ((ArrayList) term19181).add((Object)null);
        ((ArrayList) term19181).add((Object)null);
        ((ArrayList) term19181).add((Object)null);
        ((ArrayList) term19181).add((Object)null);
        ((ArrayList) term19181).add((Object)null);
        LinkedHashMap term19184 = new LinkedHashMap();
        term19177 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term19178 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term19183 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term19178, term19178.getClass(), "tagName", "cudZvLMQon");
        setBooleanField(term19178, term19178.getClass(), "isBlock", false);
        setBooleanField(term19178, term19178.getClass(), "formatAsBlock", false);
        setBooleanField(term19178, term19178.getClass(), "canContainBlock", false);
        setBooleanField(term19178, term19178.getClass(), "canContainInline", true);
        setBooleanField(term19178, term19178.getClass(), "empty", true);
        setBooleanField(term19178, term19178.getClass(), "selfClosing", true);
        setBooleanField(term19178, term19178.getClass(), "preserveWhitespace", true);
        setBooleanField(term19178, term19178.getClass(), "formList", false);
        setBooleanField(term19178, term19178.getClass(), "formSubmit", true);
        setField(term19177, term19177.getClass(), "tag", term19178);
        setField(term19177, term19177.getClass(), "parentNode", null);
        setField(term19177, term19177.getClass(), "childNodes", term19181);
        setField(term19183, term19183.getClass(), "attributes", term19184);
        setField(term19177, term19177.getClass(), "attributes", term19183);
        setField(term19177, term19177.getClass(), "baseUri", "igCAtimmYB");
        setIntField(term19177, term19177.getClass(), "siblingIndex", -226514366);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "cssSelector", argTypes, term2516, args);
        assertTrue(recursiveEquals(term2516, term19177));
        assertTrue(recursiveEquals(retValue, "cudZvLMQon"));
    }

};


