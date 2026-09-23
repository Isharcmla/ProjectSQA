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

public class Element_attr_298745360105 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term602;
     Object term9873;
     Object term9822;

    public Element_attr_298745360105() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term624 = new ArrayList();
        ((ArrayList) term624).add((Object)null);
        ((ArrayList) term624).add((Object)null);
        LinkedHashMap term629 = new LinkedHashMap();
        term602 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term603 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term628 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term603, term603.getClass(), "tagName", "aKnKipADSo");
        setBooleanField(term603, term603.getClass(), "isBlock", false);
        setBooleanField(term603, term603.getClass(), "formatAsBlock", false);
        setBooleanField(term603, term603.getClass(), "canContainInline", true);
        setBooleanField(term603, term603.getClass(), "empty", true);
        setBooleanField(term603, term603.getClass(), "selfClosing", true);
        setBooleanField(term603, term603.getClass(), "preserveWhitespace", false);
        setBooleanField(term603, term603.getClass(), "formList", false);
        setBooleanField(term603, term603.getClass(), "formSubmit", false);
        setField(term602, term602.getClass(), "tag", term603);
        setField(term602, term602.getClass(), "parentNode", null);
        setField(term602, term602.getClass(), "childNodes", term624);
        setField(term628, term628.getClass(), "attributes", term629);
        setField(term602, term602.getClass(), "attributes", term628);
        setField(term602, term602.getClass(), "baseUri", "hxCBltsObl");
        setIntField(term602, term602.getClass(), "siblingIndex", -1955890973);
        ArrayList term9877 = new ArrayList();
        ((ArrayList) term9877).add((Object)null);
        ((ArrayList) term9877).add((Object)null);
        LinkedHashMap term9880 = new LinkedHashMap();
        term9873 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term9874 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term9879 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term9874, term9874.getClass(), "tagName", "aKnKipADSo");
        setBooleanField(term9874, term9874.getClass(), "isBlock", false);
        setBooleanField(term9874, term9874.getClass(), "formatAsBlock", false);
        setBooleanField(term9874, term9874.getClass(), "canContainInline", true);
        setBooleanField(term9874, term9874.getClass(), "empty", true);
        setBooleanField(term9874, term9874.getClass(), "selfClosing", true);
        setBooleanField(term9874, term9874.getClass(), "preserveWhitespace", false);
        setBooleanField(term9874, term9874.getClass(), "formList", false);
        setBooleanField(term9874, term9874.getClass(), "formSubmit", false);
        setField(term9873, term9873.getClass(), "tag", term9874);
        setField(term9873, term9873.getClass(), "parentNode", null);
        setField(term9873, term9873.getClass(), "childNodes", term9877);
        setField(term9879, term9879.getClass(), "attributes", term9880);
        setField(term9873, term9873.getClass(), "attributes", term9879);
        setField(term9873, term9873.getClass(), "baseUri", "hxCBltsObl");
        setIntField(term9873, term9873.getClass(), "siblingIndex", -1955890973);
        ArrayList term9844 = new ArrayList();
        ((ArrayList) term9844).add((Object)null);
        ((ArrayList) term9844).add((Object)null);
        LinkedHashMap term9849 = new LinkedHashMap();
        term9822 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term9823 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term9848 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term9823, term9823.getClass(), "tagName", "aKnKipADSo");
        setBooleanField(term9823, term9823.getClass(), "isBlock", false);
        setBooleanField(term9823, term9823.getClass(), "formatAsBlock", false);
        setBooleanField(term9823, term9823.getClass(), "canContainInline", true);
        setBooleanField(term9823, term9823.getClass(), "empty", true);
        setBooleanField(term9823, term9823.getClass(), "selfClosing", true);
        setBooleanField(term9823, term9823.getClass(), "preserveWhitespace", false);
        setBooleanField(term9823, term9823.getClass(), "formList", false);
        setBooleanField(term9823, term9823.getClass(), "formSubmit", false);
        setField(term9822, term9822.getClass(), "tag", term9823);
        setField(term9822, term9822.getClass(), "parentNode", null);
        setField(term9822, term9822.getClass(), "childNodes", term9844);
        setField(term9848, term9848.getClass(), "attributes", term9849);
        setField(term9822, term9822.getClass(), "attributes", term9848);
        setField(term9822, term9822.getClass(), "baseUri", "hxCBltsObl");
        setIntField(term9822, term9822.getClass(), "siblingIndex", -1955890973);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "BndsHwAFMv";
        args[1] = "GzFkzHGYFt";
        Object retValue = callMethod(klass, "attr", argTypes, term602, args);
        assertTrue(recursiveEquals(term602, term9873));
        assertTrue(recursiveEquals(retValue, term9822));
    }

};


