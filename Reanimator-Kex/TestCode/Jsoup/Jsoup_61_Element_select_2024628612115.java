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

public class Element_select_2024628612115 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1313;
     Object term12512;
     Object term12508;

    public Element_select_2024628612115() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term1335 = new ArrayList();
        LinkedHashMap term1340 = new LinkedHashMap();
        term1313 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term1314 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term1339 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1314, term1314.getClass(), "tagName", "GVizqqzXpy");
        setBooleanField(term1314, term1314.getClass(), "isBlock", true);
        setBooleanField(term1314, term1314.getClass(), "formatAsBlock", false);
        setBooleanField(term1314, term1314.getClass(), "canContainInline", false);
        setBooleanField(term1314, term1314.getClass(), "empty", false);
        setBooleanField(term1314, term1314.getClass(), "selfClosing", true);
        setBooleanField(term1314, term1314.getClass(), "preserveWhitespace", true);
        setBooleanField(term1314, term1314.getClass(), "formList", false);
        setBooleanField(term1314, term1314.getClass(), "formSubmit", true);
        setField(term1313, term1313.getClass(), "tag", term1314);
        setField(term1313, term1313.getClass(), "parentNode", null);
        setField(term1313, term1313.getClass(), "childNodes", term1335);
        setField(term1339, term1339.getClass(), "attributes", term1340);
        setField(term1313, term1313.getClass(), "attributes", term1339);
        setField(term1313, term1313.getClass(), "baseUri", "XqgfKFvPSD");
        setIntField(term1313, term1313.getClass(), "siblingIndex", -1456670397);
        ArrayList term12516 = new ArrayList();
        LinkedHashMap term12519 = new LinkedHashMap();
        term12512 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term12513 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term12518 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term12513, term12513.getClass(), "tagName", "GVizqqzXpy");
        setBooleanField(term12513, term12513.getClass(), "isBlock", true);
        setBooleanField(term12513, term12513.getClass(), "formatAsBlock", false);
        setBooleanField(term12513, term12513.getClass(), "canContainInline", false);
        setBooleanField(term12513, term12513.getClass(), "empty", false);
        setBooleanField(term12513, term12513.getClass(), "selfClosing", true);
        setBooleanField(term12513, term12513.getClass(), "preserveWhitespace", true);
        setBooleanField(term12513, term12513.getClass(), "formList", false);
        setBooleanField(term12513, term12513.getClass(), "formSubmit", true);
        setField(term12512, term12512.getClass(), "tag", term12513);
        setField(term12512, term12512.getClass(), "parentNode", null);
        setField(term12512, term12512.getClass(), "childNodes", term12516);
        setField(term12518, term12518.getClass(), "attributes", term12519);
        setField(term12512, term12512.getClass(), "attributes", term12518);
        setField(term12512, term12512.getClass(), "baseUri", "XqgfKFvPSD");
        setIntField(term12512, term12512.getClass(), "siblingIndex", -1456670397);
        term12508 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term12509 = (Object[]) newArray("java.lang.Object", 0);
        setField(term12508, term12508.getClass(), "elementData", term12509);
        setIntField(term12508, term12508.getClass(), "size", 0);
        setIntField(term12508, term12508.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "JiVRgTZvKc";
        Object retValue = callMethod(klass, "select", argTypes, term1313, args);
        assertTrue(recursiveEquals(term1313, term12512));
        assertTrue(recursiveEquals(retValue, term12508));
    }

};


