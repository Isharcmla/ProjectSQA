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
import java.lang.Boolean;

public class Element_attr_450999413106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term717;
     Object term780;
     Object term10061;
     Object term10015;

    public Element_attr_450999413106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term739 = new ArrayList();
        ((ArrayList) term739).add((Object)null);
        ((ArrayList) term739).add((Object)null);
        ((ArrayList) term739).add((Object)null);
        ((ArrayList) term739).add((Object)null);
        ((ArrayList) term739).add((Object)null);
        ((ArrayList) term739).add((Object)null);
        LinkedHashMap term744 = new LinkedHashMap();
        term717 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term718 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term743 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term718, term718.getClass(), "tagName", "tShwQLRGNe");
        setBooleanField(term718, term718.getClass(), "isBlock", false);
        setBooleanField(term718, term718.getClass(), "formatAsBlock", false);
        setBooleanField(term718, term718.getClass(), "canContainInline", false);
        setBooleanField(term718, term718.getClass(), "empty", false);
        setBooleanField(term718, term718.getClass(), "selfClosing", true);
        setBooleanField(term718, term718.getClass(), "preserveWhitespace", false);
        setBooleanField(term718, term718.getClass(), "formList", false);
        setBooleanField(term718, term718.getClass(), "formSubmit", true);
        setField(term717, term717.getClass(), "tag", term718);
        setField(term717, term717.getClass(), "parentNode", null);
        setField(term717, term717.getClass(), "childNodes", term739);
        setField(term743, term743.getClass(), "attributes", term744);
        setField(term717, term717.getClass(), "attributes", term743);
        setField(term717, term717.getClass(), "baseUri", "nGKItKLYNC");
        setIntField(term717, term717.getClass(), "siblingIndex", -2038273078);
        term780 = new Boolean(false);
        ArrayList term10065 = new ArrayList();
        ((ArrayList) term10065).add((Object)null);
        ((ArrayList) term10065).add((Object)null);
        ((ArrayList) term10065).add((Object)null);
        ((ArrayList) term10065).add((Object)null);
        ((ArrayList) term10065).add((Object)null);
        ((ArrayList) term10065).add((Object)null);
        LinkedHashMap term10068 = new LinkedHashMap();
        term10061 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term10062 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term10067 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term10062, term10062.getClass(), "tagName", "tShwQLRGNe");
        setBooleanField(term10062, term10062.getClass(), "isBlock", false);
        setBooleanField(term10062, term10062.getClass(), "formatAsBlock", false);
        setBooleanField(term10062, term10062.getClass(), "canContainInline", false);
        setBooleanField(term10062, term10062.getClass(), "empty", false);
        setBooleanField(term10062, term10062.getClass(), "selfClosing", true);
        setBooleanField(term10062, term10062.getClass(), "preserveWhitespace", false);
        setBooleanField(term10062, term10062.getClass(), "formList", false);
        setBooleanField(term10062, term10062.getClass(), "formSubmit", true);
        setField(term10061, term10061.getClass(), "tag", term10062);
        setField(term10061, term10061.getClass(), "parentNode", null);
        setField(term10061, term10061.getClass(), "childNodes", term10065);
        setField(term10067, term10067.getClass(), "attributes", term10068);
        setField(term10061, term10061.getClass(), "attributes", term10067);
        setField(term10061, term10061.getClass(), "baseUri", "nGKItKLYNC");
        setIntField(term10061, term10061.getClass(), "siblingIndex", -2038273078);
        ArrayList term10037 = new ArrayList();
        ((ArrayList) term10037).add((Object)null);
        ((ArrayList) term10037).add((Object)null);
        ((ArrayList) term10037).add((Object)null);
        ((ArrayList) term10037).add((Object)null);
        ((ArrayList) term10037).add((Object)null);
        ((ArrayList) term10037).add((Object)null);
        LinkedHashMap term10042 = new LinkedHashMap();
        term10015 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term10016 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term10041 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term10016, term10016.getClass(), "tagName", "tShwQLRGNe");
        setBooleanField(term10016, term10016.getClass(), "isBlock", false);
        setBooleanField(term10016, term10016.getClass(), "formatAsBlock", false);
        setBooleanField(term10016, term10016.getClass(), "canContainInline", false);
        setBooleanField(term10016, term10016.getClass(), "empty", false);
        setBooleanField(term10016, term10016.getClass(), "selfClosing", true);
        setBooleanField(term10016, term10016.getClass(), "preserveWhitespace", false);
        setBooleanField(term10016, term10016.getClass(), "formList", false);
        setBooleanField(term10016, term10016.getClass(), "formSubmit", true);
        setField(term10015, term10015.getClass(), "tag", term10016);
        setField(term10015, term10015.getClass(), "parentNode", null);
        setField(term10015, term10015.getClass(), "childNodes", term10037);
        setField(term10041, term10041.getClass(), "attributes", term10042);
        setField(term10015, term10015.getClass(), "attributes", term10041);
        setField(term10015, term10015.getClass(), "baseUri", "nGKItKLYNC");
        setIntField(term10015, term10015.getClass(), "siblingIndex", -2038273078);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = "UiUYnPrcCi";
        args[1] = term780;
        Object retValue = callMethod(klass, "attr", argTypes, term717, args);
        assertTrue(recursiveEquals(term717, term10061));
        assertTrue(recursiveEquals(term780, false));
        assertTrue(recursiveEquals(retValue, term10015));
    }

};


