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

public class Element_getElementsByTag_957731678134 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3142;
     Object term21252;
     Object term21248;

    public Element_getElementsByTag_957731678134() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3165 = new ArrayList();
        LinkedHashMap term3170 = new LinkedHashMap();
        term3142 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term3143 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3169 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3143, term3143.getClass(), "tagName", "GZdcJyZntS");
        setBooleanField(term3143, term3143.getClass(), "isBlock", true);
        setBooleanField(term3143, term3143.getClass(), "formatAsBlock", false);
        setBooleanField(term3143, term3143.getClass(), "canContainBlock", true);
        setBooleanField(term3143, term3143.getClass(), "canContainInline", true);
        setBooleanField(term3143, term3143.getClass(), "empty", true);
        setBooleanField(term3143, term3143.getClass(), "selfClosing", false);
        setBooleanField(term3143, term3143.getClass(), "preserveWhitespace", false);
        setBooleanField(term3143, term3143.getClass(), "formList", true);
        setBooleanField(term3143, term3143.getClass(), "formSubmit", false);
        setField(term3142, term3142.getClass(), "tag", term3143);
        setField(term3142, term3142.getClass(), "parentNode", null);
        setField(term3142, term3142.getClass(), "childNodes", term3165);
        setField(term3169, term3169.getClass(), "attributes", term3170);
        setField(term3142, term3142.getClass(), "attributes", term3169);
        setField(term3142, term3142.getClass(), "baseUri", "NzBMMhkhpT");
        setIntField(term3142, term3142.getClass(), "siblingIndex", -602026508);
        ArrayList term21256 = new ArrayList();
        LinkedHashMap term21259 = new LinkedHashMap();
        term21252 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term21253 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term21258 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term21253, term21253.getClass(), "tagName", "GZdcJyZntS");
        setBooleanField(term21253, term21253.getClass(), "isBlock", true);
        setBooleanField(term21253, term21253.getClass(), "formatAsBlock", false);
        setBooleanField(term21253, term21253.getClass(), "canContainBlock", true);
        setBooleanField(term21253, term21253.getClass(), "canContainInline", true);
        setBooleanField(term21253, term21253.getClass(), "empty", true);
        setBooleanField(term21253, term21253.getClass(), "selfClosing", false);
        setBooleanField(term21253, term21253.getClass(), "preserveWhitespace", false);
        setBooleanField(term21253, term21253.getClass(), "formList", true);
        setBooleanField(term21253, term21253.getClass(), "formSubmit", false);
        setField(term21252, term21252.getClass(), "tag", term21253);
        setField(term21252, term21252.getClass(), "parentNode", null);
        setField(term21252, term21252.getClass(), "childNodes", term21256);
        setField(term21258, term21258.getClass(), "attributes", term21259);
        setField(term21252, term21252.getClass(), "attributes", term21258);
        setField(term21252, term21252.getClass(), "baseUri", "NzBMMhkhpT");
        setIntField(term21252, term21252.getClass(), "siblingIndex", -602026508);
        term21248 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term21249 = (Object[]) newArray("java.lang.Object", 0);
        setField(term21248, term21248.getClass(), "elementData", term21249);
        setIntField(term21248, term21248.getClass(), "size", 0);
        setIntField(term21248, term21248.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "qCpEbQDHdF";
        Object retValue = callMethod(klass, "getElementsByTag", argTypes, term3142, args);
        assertTrue(recursiveEquals(term3142, term21252));
        assertTrue(recursiveEquals(retValue, term21248));
    }

};


