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
import java.lang.IllegalArgumentException;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Element_appendChild_1453226710111 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1306;

    public Element_appendChild_1453226710111() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1329 = new ArrayList();
        LinkedHashMap term1334 = new LinkedHashMap();
        term1306 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term1307 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1333 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1307, term1307.getClass(), "tagName", "xOcJIiQQDu");
        setBooleanField(term1307, term1307.getClass(), "isBlock", false);
        setBooleanField(term1307, term1307.getClass(), "formatAsBlock", false);
        setBooleanField(term1307, term1307.getClass(), "canContainBlock", true);
        setBooleanField(term1307, term1307.getClass(), "canContainInline", true);
        setBooleanField(term1307, term1307.getClass(), "empty", false);
        setBooleanField(term1307, term1307.getClass(), "selfClosing", true);
        setBooleanField(term1307, term1307.getClass(), "preserveWhitespace", true);
        setBooleanField(term1307, term1307.getClass(), "formList", false);
        setBooleanField(term1307, term1307.getClass(), "formSubmit", false);
        setField(term1306, term1306.getClass(), "tag", term1307);
        setField(term1306, term1306.getClass(), "parentNode", null);
        setField(term1306, term1306.getClass(), "childNodes", term1329);
        setField(term1333, term1333.getClass(), "attributes", term1334);
        setField(term1306, term1306.getClass(), "attributes", term1333);
        setField(term1306, term1306.getClass(), "baseUri", "DfISiziTgG");
        setIntField(term1306, term1306.getClass(), "siblingIndex", -1456670397);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Node");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "appendChild", argTypes, term1306, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};


