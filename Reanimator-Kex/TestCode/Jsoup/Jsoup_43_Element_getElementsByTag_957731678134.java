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
     Object term21110;
     Object term21106;

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
        ArrayList term21114 = new ArrayList();
        LinkedHashMap term21117 = new LinkedHashMap();
        term21110 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term21111 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term21116 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term21111, term21111.getClass(), "tagName", "GZdcJyZntS");
        setBooleanField(term21111, term21111.getClass(), "isBlock", true);
        setBooleanField(term21111, term21111.getClass(), "formatAsBlock", false);
        setBooleanField(term21111, term21111.getClass(), "canContainBlock", true);
        setBooleanField(term21111, term21111.getClass(), "canContainInline", true);
        setBooleanField(term21111, term21111.getClass(), "empty", true);
        setBooleanField(term21111, term21111.getClass(), "selfClosing", false);
        setBooleanField(term21111, term21111.getClass(), "preserveWhitespace", false);
        setBooleanField(term21111, term21111.getClass(), "formList", true);
        setBooleanField(term21111, term21111.getClass(), "formSubmit", false);
        setField(term21110, term21110.getClass(), "tag", term21111);
        setField(term21110, term21110.getClass(), "parentNode", null);
        setField(term21110, term21110.getClass(), "childNodes", term21114);
        setField(term21116, term21116.getClass(), "attributes", term21117);
        setField(term21110, term21110.getClass(), "attributes", term21116);
        setField(term21110, term21110.getClass(), "baseUri", "NzBMMhkhpT");
        setIntField(term21110, term21110.getClass(), "siblingIndex", -602026508);
        term21106 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term21107 = (Object[]) newArray("java.lang.Object", 0);
        setField(term21106, term21106.getClass(), "elementData", term21107);
        setIntField(term21106, term21106.getClass(), "size", 0);
        setIntField(term21106, term21106.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "qCpEbQDHdF";
        Object retValue = callMethod(klass, "getElementsByTag", argTypes, term3142, args);
        assertTrue(recursiveEquals(term3142, term21110));
        assertTrue(recursiveEquals(retValue, term21106));
    }

};


