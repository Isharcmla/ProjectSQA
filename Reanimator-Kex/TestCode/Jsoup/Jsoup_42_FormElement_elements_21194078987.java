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

public class FormElement_elements_21194078987 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term80;
     Object term733;
     Object term682;

    public FormElement_elements_21194078987() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term107 = new ArrayList();
        ((ArrayList) term107).add((Object)null);
        ((ArrayList) term107).add((Object)null);
        ((ArrayList) term107).add((Object)null);
        ((ArrayList) term107).add((Object)null);
        LinkedHashMap term112 = new LinkedHashMap();
        term80 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term81 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term82 = (Object[]) newArray("java.lang.Object", 0);
        Object term85 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term111 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term81, term81.getClass(), "elementData", term82);
        setIntField(term81, term81.getClass(), "size", 0);
        setIntField(term81, term81.getClass(), "modCount", 0);
        setField(term80, term80.getClass(), "elements", term81);
        setField(term85, term85.getClass(), "tagName", "EGtDIRbSSb");
        setBooleanField(term85, term85.getClass(), "isBlock", true);
        setBooleanField(term85, term85.getClass(), "formatAsBlock", false);
        setBooleanField(term85, term85.getClass(), "canContainBlock", true);
        setBooleanField(term85, term85.getClass(), "canContainInline", false);
        setBooleanField(term85, term85.getClass(), "empty", true);
        setBooleanField(term85, term85.getClass(), "selfClosing", false);
        setBooleanField(term85, term85.getClass(), "preserveWhitespace", false);
        setBooleanField(term85, term85.getClass(), "formList", true);
        setBooleanField(term85, term85.getClass(), "formSubmit", true);
        setField(term80, term80.getClass(), "tag", term85);
        setField(term80, term80.getClass(), "parentNode", null);
        setField(term80, term80.getClass(), "childNodes", term107);
        setField(term111, term111.getClass(), "attributes", term112);
        setField(term80, term80.getClass(), "attributes", term111);
        setField(term80, term80.getClass(), "baseUri", "RMFIsYGgne");
        setIntField(term80, term80.getClass(), "siblingIndex", 568599855);
        ArrayList term739 = new ArrayList();
        ((ArrayList) term739).add((Object)null);
        ((ArrayList) term739).add((Object)null);
        ((ArrayList) term739).add((Object)null);
        ((ArrayList) term739).add((Object)null);
        LinkedHashMap term742 = new LinkedHashMap();
        term733 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term734 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term735 = (Object[]) newArray("java.lang.Object", 0);
        Object term736 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term741 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term734, term734.getClass(), "elementData", term735);
        setIntField(term734, term734.getClass(), "size", 0);
        setIntField(term734, term734.getClass(), "modCount", 0);
        setField(term733, term733.getClass(), "elements", term734);
        setField(term736, term736.getClass(), "tagName", "EGtDIRbSSb");
        setBooleanField(term736, term736.getClass(), "isBlock", true);
        setBooleanField(term736, term736.getClass(), "formatAsBlock", false);
        setBooleanField(term736, term736.getClass(), "canContainBlock", true);
        setBooleanField(term736, term736.getClass(), "canContainInline", false);
        setBooleanField(term736, term736.getClass(), "empty", true);
        setBooleanField(term736, term736.getClass(), "selfClosing", false);
        setBooleanField(term736, term736.getClass(), "preserveWhitespace", false);
        setBooleanField(term736, term736.getClass(), "formList", true);
        setBooleanField(term736, term736.getClass(), "formSubmit", true);
        setField(term733, term733.getClass(), "tag", term736);
        setField(term733, term733.getClass(), "parentNode", null);
        setField(term733, term733.getClass(), "childNodes", term739);
        setField(term741, term741.getClass(), "attributes", term742);
        setField(term733, term733.getClass(), "attributes", term741);
        setField(term733, term733.getClass(), "baseUri", "RMFIsYGgne");
        setIntField(term733, term733.getClass(), "siblingIndex", 568599855);
        term682 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term683 = (Object[]) newArray("java.lang.Object", 0);
        setField(term682, term682.getClass(), "elementData", term683);
        setIntField(term682, term682.getClass(), "size", 0);
        setIntField(term682, term682.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.FormElement");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "elements", argTypes, term80, args);
        assertTrue(recursiveEquals(term80, term733));
        assertTrue(recursiveEquals(retValue, term682));
    }

};


